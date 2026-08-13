clear; clc; close all;

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Nozzle Generation Script
% Joe O'Loughlin
% 20259301
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%% ============================
% Variable Parameters 
%% ============================

expansion_ratio = 250;      % A, set within 150 to 350

div_start_deg = 35;         % B, set within 30 to 40 degrees

L_div  = 4.5;               % C, set within 3.5 to 5.5 m

div_exit_deg  = 4;          % D, set within 0 to 8 degrees

r_th = 0.1;                 % E, Desired throat radius (minimum)

%% ============================
% Fixed Geometric Parameters 
%% ============================

r_inlet = 2.6 * r_th;        % Inlet radius
r_C_end  = 2 * r_th;         % Radius at end of convergent (x = 0)
r_D_start  = 2 * r_th;       % Radius at start of divergent (x = L_th)

L_conv = 0.5;                % Length of convergent section (m)
L_th   = 0.40;               % Length of throat section (m)


convergent_exit_angle_deg = 30;  % Convergent exit angle (deg)
slope_conv_exit = -tan(deg2rad(convergent_exit_angle_deg));

% Location within throat where r = r_th (Adjust based on th-div transition)
x_throat_min = 0.19;  % (m)


% Compute exit radius from area ratio 
r_exit = r_th * sqrt(expansion_ratio);

% Divergent slopes (radians)
slope_div_start = tan(deg2rad(div_start_deg))
slope_div_exit  = tan(deg2rad(div_exit_deg))

%% ============================
% Convergent Section (4th-deg poly)
%% ============================

[x_conv, y_conv, convPoly] = convergent_4th_poly(-L_conv, 0, r_inlet, r_C_end, slope_conv_exit);
Lc = L_conv;
curv_conv_exit = 6*convPoly.a3*Lc + 12*convPoly.a4*Lc^2;  % curvature at x = 0
% 4th deg poly as 4 conditions to satisfy

%% ============================
% Throat Section (7th-deg poly)
%% ============================

[x_throat, y_throat, throatCoef] = constrained_throat_poly(0, L_th, r_C_end, slope_conv_exit, curv_conv_exit, r_D_start, slope_div_start, r_th, x_throat_min); 
% 7th deg poly as 7 conditions to satisfy

%% ============================
% Divergent Section (Blend Function without inflection point)
%% ============================

% Normalising slopes for the blend
%   s0   = slope at x=0 normalized by (r_exit - r_D)
%   t_exit = slope at x=L_div normalized by (r_exit - r_D)
s0 = slope_div_start / (r_exit - r_D_start);
t_exit = slope_div_exit  / (r_exit - r_D_start);

% Blend Parameters:
%   f(0)=0, f(L_div)=1, f'(0)= s0, and f'(L_div)= t_exit
A_blend = 1 - t_exit*L_div;
n_val   = 1 + (s0*L_div - 1) / (1 - t_exit*L_div);

% Evaluating the blend function over [0, L_div]
n_div = 200;
x_div_local = linspace(0, L_div, n_div);
f_div = A_blend*(1 - (1 - x_div_local/L_div).^n_val) + (1 - A_blend)*(x_div_local/L_div);
% Map it to the radius profile
y_div_local = r_D_start + (r_exit - r_D_start) * f_div;
% Shift x-value to follow the throat
x_div = x_div_local + L_th;
y_div = y_div_local;

%% ============================
% Inflection Point Check and Warning Display
%% ============================

% For f(x)= A_blend*(1 - (1 - x/L_div).^n_val) + (1-A_blend)*(x/L_div),
% the second derivative is:
%   f''(x) = -A_blend*n_val*(n_val-1)/L_div^2 * (1 - x/L_div).^(n_val-2)
% which is always greater than 0 if A_blend is greater than 0 and n_val is greater than 1
f2 = -A_blend * n_val * (n_val-1) / L_div^2 * (1 - x_div_local/L_div).^(n_val-2);
if any(diff(sign(f2)) == 0)
    warning('Inflection point detected in the divergent blend function.');
else disp("No Inflection Point Detected");
end

%% ============================
% Plot Nozzle Geometry
%% ============================

figure('Name','Nozzle Geometry','Color','w');
hold on; grid on; box on;
plot(x_conv,   y_conv,   'b-', 'LineWidth',2, 'DisplayName','Convergent');
plot(x_throat, y_throat, 'r-', 'LineWidth',2, 'DisplayName','Throat');
plot(x_div,    y_div,    'm-', 'LineWidth',2, 'DisplayName','Divergent');
legend('Location','best');
xlabel('x [m]'); ylabel('Radius [m]');
title({'Nozzle Geometry', ...
       ['ER = ' num2str(expansion_ratio) ', Div Start = ' num2str(div_start_deg) 'deg, Exit = ' num2str(div_exit_deg) 'deg, Div Length = ' num2str(L_div) 'm']});
axis equal;

%% ============================
% Create TXT Files of Nozzle Geometry
%% ============================

path_downloads = fullfile(getenv('USERPROFILE'), 'Downloads');
if ~exist(path_downloads, 'dir')
    mkdir(path_downloads);
end

z_conv   = zeros(size(x_conv));
z_throat = zeros(size(x_throat));
z_div    = zeros(size(x_div));

data_conv   = [x_conv(:),   y_conv(:),   z_conv(:)];
data_throat = [x_throat(:), y_throat(:), z_throat(:)];
data_div    = [x_div(:),    y_div(:),    z_div(:)];

save(fullfile(path_downloads, 'convergent_section.txt'), 'data_conv', '-ascii', '-double', '-tabs');
save(fullfile(path_downloads, 'throat_section.txt'), 'data_throat', '-ascii', '-double', '-tabs');
save(fullfile(path_downloads, 'divergent_section.txt'), 'data_div', '-ascii', '-double', '-tabs');

disp('Geometry saved to the Downloads folder.');
function [xvals, yvals, polyStruct] = convergent_4th_poly(xA, xB, r_in, rC, slope_exit)
    % 4th-deg poly for the convergent section.
    L = xB - xA;
    a0 = r_in;
    a1 = 0;
    a2 = 0;
    % For x = xB:
    RHS1 = rC - a0;
    RHS2 = slope_exit - a1;
    A = [L^3, L^4; 3*L^2, 4*L^3];
    sol = A \ [RHS1; RHS2];
    a3 = sol(1);
    a4 = sol(2);
    npts = 100;
    xvals = linspace(xA, xB, npts);
    X = xvals - xA;
    yvals = a0 + a1*X + a2*X.^2 + a3*X.^3 + a4*X.^4;
    
    polyStruct.a0 = a0;
    polyStruct.a1 = a1;
    polyStruct.a2 = a2;
    polyStruct.a3 = a3;
    polyStruct.a4 = a4;
end

function [xvals, yvals, coef] = constrained_throat_poly(xA, xB, rA, slopeA, curvA, rB, slopeB, r_min, x_min)
    % 7th-deg polyn for the throat with these contraints:
    %  at x = xA:    r = rA,    r' = slopeA,   r'' = curvA.
    %  at x = x_min: r = r_min, r' = 0.
    %  at x = xB:    r = rB,    r' = slopeB,   r'' = 0.

    L = xB - xA;
    c0 = rA;
    c1 = slopeA;
    c2 = curvA/2;
    
    M = [ L^3,      L^4,       L^5,        L^6,         L^7;
          3*L^2,    4*L^3,     5*L^4,      6*L^5,       7*L^6;
          6*L,     12*L^2,    20*L^3,     30*L^4,      42*L^5;
          x_min^3,  x_min^4,   x_min^5,    x_min^6,     x_min^7;
          3*x_min^2,4*x_min^3, 5*x_min^4,  6*x_min^5,   7*x_min^6];
      
    b = [ rB - (c0 + c1*L + c2*L^2);
          slopeB - (c1 + 2*c2*L);
          -2*c2;
          r_min - (c0 + c1*x_min + c2*x_min^2);
          - (c1 + 2*c2*x_min)];
      
    sol = M \ b;
    c3 = sol(1);
    c4 = sol(2);
    c5 = sol(3);
    c6 = sol(4);
    c7 = sol(5);
    
    npts = 100;
    xvals = linspace(xA, xB, npts);
    yvals = c0 + c1*xvals + c2*xvals.^2 + c3*xvals.^3 + c4*xvals.^4 + c5*xvals.^5 + c6*xvals.^6 + c7*xvals.^7;
    coef = [c0, c1, c2, c3, c4, c5, c6, c7];
end