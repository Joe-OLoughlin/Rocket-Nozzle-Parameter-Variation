// Simcenter STAR-CCM+ macro: Final_Macro.java
// Written by Simcenter STAR-CCM+ 19.02.012
package macro;

import java.util.*;

import star.common.*;
import star.base.neo.*;
import star.amr.*;
import star.vis.*;
import star.kwturb.*;
import star.species.*;
import star.meshing.*;

public class Final_Macro extends StarMacro {

  public void execute() {
    execute0();
    execute1();
  }

  private void execute0() {

    Simulation simulation_0 = 
      getActiveSimulation();

    AutoMeshOperation autoMeshOperation_0 = 
      ((AutoMeshOperation) simulation_0.get(MeshOperationManager.class).getObject("Automated Mesh"));

    SurfaceCustomMeshControl surfaceCustomMeshControl_0 = 
      ((SurfaceCustomMeshControl) autoMeshOperation_0.getCustomMeshControls().getObject("Surface Control"));

    surfaceCustomMeshControl_0.getGeometryObjects().setQuery(null);

    CadPart cadPart_0 = 
      ((CadPart) simulation_0.get(SimulationPartManager.class).getPart("Nozzle"));

    PartSurface partSurface_0 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("Freestream"));

    PartSurface partSurface_1 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("Inlet"));

    PartSurface partSurface_2 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("Symmetry"));

    surfaceCustomMeshControl_0.getGeometryObjects().setObjects(partSurface_0, partSurface_1, partSurface_2);

    Scene scene_0 = 
      simulation_0.getSceneManager().getScene("Vector Scene 1");

    CurrentView currentView_0 = 
      scene_0.getCurrentView();

    currentView_0.setInput(new DoubleVector(new double[] {16.006887489625587, -2.3835526109246175, -2.2040672940315034}), new DoubleVector(new double[] {22.381055324350847, 14.761790235521293, 69.14468800651903}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {10.648630161539351, -2.119466959520661, -3.7887971832122744}), new DoubleVector(new double[] {15.420278381934542, 10.715391927566568, 49.62227859715398}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {2.821500279868273, 0.10241095042479476, -0.6038889736475319}), new DoubleVector(new double[] {3.8173464564960384, 2.781054588828659, 10.543038282663984}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {1.6728312529010982, 0.09340965150399083, -0.37270114568212076}), new DoubleVector(new double[] {2.262191616723476, 1.6786809778709868, 6.224258563022923}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {1.2371310222501526, 0.048232910577424626, -0.7666224531261143}), new DoubleVector(new double[] {1.7001785371896359, 1.293745831429847, 4.416464138344091}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {2.5296145980898355, -0.46890819147453655, -2.6203288558940336}), new DoubleVector(new double[] {3.465590545682359, 2.048695507329321, 7.85644561624507}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    SurfaceCustomMeshControl surfaceCustomMeshControl_1 = 
      ((SurfaceCustomMeshControl) autoMeshOperation_0.getCustomMeshControls().getObject("Surface Control 2"));

    surfaceCustomMeshControl_1.getGeometryObjects().setQuery(null);

    PartSurface partSurface_3 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("Convergent"));

    PartSurface partSurface_4 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("Divergent"));

    PartSurface partSurface_5 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("FlowStab"));

    PartSurface partSurface_6 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("Wall"));

    surfaceCustomMeshControl_1.getGeometryObjects().setObjects(partSurface_3, partSurface_4, partSurface_5, partSurface_6);

    MeshPipelineController meshPipelineController_0 = 
      simulation_0.get(MeshPipelineController.class);

    meshPipelineController_0.generateVolumeMesh();

    currentView_0.setInput(new DoubleVector(new double[] {7.311724196407448, -1.941571497141179, -4.310236948600409}), new DoubleVector(new double[] {9.210676350257387, 3.166261646094117, 16.94553730547243}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {25.438075045737516, -1.983515808366013, -6.509989352368585}), new DoubleVector(new double[] {31.42668865259129, 14.12475685195445, 60.52309447972254}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    UserFieldFunction userFieldFunction_0 = 
      simulation_0.getFieldFunctionManager().createFieldFunction();

    UserFieldFunction userFieldFunction_1 = 
      ((UserFieldFunction) simulation_0.getFieldFunctionManager().getFunction("Methalox Inlet"));

    userFieldFunction_0.copyProperties(userFieldFunction_1);

    userFieldFunction_0.setPresentationName("Methalox Inlet copy");

    simulation_0.getFieldFunctionManager().getGroupsManager().groupObjects("", new ArrayList<>(Arrays.<ClientServerObject>asList(userFieldFunction_0)));

    userFieldFunction_0.setPresentationName("Mars");

    Units units_0 = 
      simulation_0.getUnitsManager().getPreferredUnits(Dimensions.Builder().length(1).build());

    userFieldFunction_0.setDefinition("(($$Position[0] > -2.2007383216932266 && $$Position[0] < -0.7388313921205055) &&  ($$Position[1] > -0.625 && $$Position[1] < 0.625) &&  ($$Position[2] > -0.6211526079148225 && $$Position[2] < 0.0)) ? 0.0 : 1.0 ");

    SceneUpdate sceneUpdate_0 = 
      scene_0.getSceneUpdate();

    HardcopyProperties hardcopyProperties_0 = 
      sceneUpdate_0.getHardcopyProperties();

    hardcopyProperties_0.setCurrentResolutionWidth(1274);

    hardcopyProperties_0.setCurrentResolutionWidth(1269);

    hardcopyProperties_0.setCurrentResolutionWidth(1268);

    hardcopyProperties_0.setCurrentResolutionWidth(1266);

    hardcopyProperties_0.setCurrentResolutionWidth(1265);

    hardcopyProperties_0.setCurrentResolutionWidth(1266);

    hardcopyProperties_0.setCurrentResolutionWidth(1268);

    hardcopyProperties_0.setCurrentResolutionWidth(1271);

    hardcopyProperties_0.setCurrentResolutionWidth(1276);

    hardcopyProperties_0.setCurrentResolutionWidth(1278);

    hardcopyProperties_0.setCurrentResolutionWidth(1280);

    hardcopyProperties_0.setCurrentResolutionWidth(1288);

    hardcopyProperties_0.setCurrentResolutionWidth(1294);

    hardcopyProperties_0.setCurrentResolutionWidth(1295);

    Region region_0 = 
      simulation_0.getRegionManager().getRegion("Nozzle");

    MassFractionProfile massFractionProfile_0 = 
      region_0.get(RegionInitialConditionManager.class).get(MassFractionProfile.class);

    ScalarProfile scalarProfile_0 = 
      massFractionProfile_0.getMethod(CompositeArrayProfileMethod.class).getProfile(1);

    scalarProfile_0.setMethod(FunctionScalarProfileMethod.class);

    scalarProfile_0.getMethod(FunctionScalarProfileMethod.class).setFieldFunction(userFieldFunction_0);

    Units units_1 = 
      simulation_0.getUnitsManager().getPreferredUnits(Dimensions.Builder().velocity(1).build());

    Units units_2 = 
      simulation_0.getUnitsManager().getPreferredUnits(Dimensions.Builder().build());

    UserFieldFunction userFieldFunction_2 = 
      ((UserFieldFunction) simulation_0.getFieldFunctionManager().getFunction("UserFieldFunction_5"));

    userFieldFunction_2.setDefinition("(($$Position[0] > 1.5 && $$Position[0] < 15) &&  ($$Position[1] > -3 && $$Position[1] < 3) &&  ($$Position[2] > -3 && $$Position[2] < 0.0001)) ? mag(grad(${MachNumber}))*${AdaptionCellSize} : 0");

    PhysicsContinuum physicsContinuum_0 = 
      ((PhysicsContinuum) simulation_0.getContinuumManager().getContinuum("Physics 1"));

    AmrModel amrModel_0 = 
      physicsContinuum_0.getModelManager().getModel(AmrModel.class);

    UserDefinedAmrCriterion userDefinedAmrCriterion_0 = 
      ((UserDefinedAmrCriterion) amrModel_0.getCriterionManager().getObject("User-Defined Mesh Adaption 1"));

    AmrRequestProfile amrRequestProfile_0 = 
      userDefinedAmrCriterion_0.getAmrRequestProfile();

    amrRequestProfile_0.getMethod(AmrFunctionProfileMethod.class).getRange().setArray(new DoubleVector(new double[] {0.0, 0.6}));

    Scene scene_1 = 
      simulation_0.getSceneManager().getScene("AMR");

    PartDisplayer partDisplayer_0 = 
      ((PartDisplayer) scene_1.getDisplayerManager().getObject("Outline 1"));

    partDisplayer_0.setMesh(true);

    ScalarDisplayer scalarDisplayer_0 = 
      ((ScalarDisplayer) scene_1.getDisplayerManager().getObject("Scalar 1"));

    scalarDisplayer_0.getScalarDisplayQuantity().getMaximumValue().setValueAndUnits(0.6, units_2);

    VectorDisplayer vectorDisplayer_0 = 
      ((VectorDisplayer) scene_0.getDisplayerManager().getObject("Vector 1"));

    Legend legend_0 = 
      vectorDisplayer_0.getLegend();

    legend_0.setLevels(512);

    Scene scene_2 = 
      simulation_0.getSceneManager().getScene("Mach Number");

    PartDisplayer partDisplayer_1 = 
      ((PartDisplayer) scene_2.getDisplayerManager().getObject("Section Surface 1"));

    simulation_0.deleteObjects(new ArrayList<>(Arrays.<ClientServerObject>asList(partDisplayer_1)));

    PartDisplayer partDisplayer_2 = 
      ((PartDisplayer) scene_2.getDisplayerManager().getObject("Section Surface 2"));

    simulation_0.deleteObjects(new ArrayList<>(Arrays.<ClientServerObject>asList(partDisplayer_2)));

    scene_2.openInteractive();

    SceneUpdate sceneUpdate_1 = 
      scene_2.getSceneUpdate();

    HardcopyProperties hardcopyProperties_1 = 
      sceneUpdate_1.getHardcopyProperties();

    hardcopyProperties_1.setCurrentResolutionHeight(471);

    hardcopyProperties_0.setCurrentResolutionWidth(1297);

    hardcopyProperties_0.setCurrentResolutionHeight(484);

    hardcopyProperties_1.setCurrentResolutionWidth(1295);

    hardcopyProperties_1.setCurrentResolutionHeight(483);

    CurrentView currentView_1 = 
      scene_2.getCurrentView();

    currentView_1.setInput(new DoubleVector(new double[] {21.113658557220415, 2.20366037087248, 2.919657577957197}), new DoubleVector(new double[] {81.6007039578111, 5.765953018606298, -27.50714748896661}), new DoubleVector(new double[] {-0.005752511575124337, 0.9944563557510666, 0.10499269077861186}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.425291456976886, -0.20481684345686912, 2.313225232991341}), new DoubleVector(new double[] {27.240994314243018, 1.2566662766282624, -10.169820490868185}), new DoubleVector(new double[] {-0.005752511575124337, 0.9944563557510666, 0.10499269077861186}), 42.8050596437871, 0, 30.0);

    ScalarDisplayer scalarDisplayer_1 = 
      ((ScalarDisplayer) scene_2.getDisplayerManager().getObject("Scalar 1"));

    scalarDisplayer_1.getInputParts().setQuery(null);

    Boundary boundary_0 = 
      region_0.getBoundaryManager().getBoundary("Convergent");

    Boundary boundary_1 = 
      region_0.getBoundaryManager().getBoundary("Divergent");

    Boundary boundary_2 = 
      region_0.getBoundaryManager().getBoundary("FlowStab");

    Boundary boundary_3 = 
      region_0.getBoundaryManager().getBoundary("Inlet");

    Boundary boundary_4 = 
      region_0.getBoundaryManager().getBoundary("Symmetry");

    Boundary boundary_5 = 
      region_0.getBoundaryManager().getBoundary("Throat");

    ConstrainedPlaneSection constrainedPlaneSection_0 = 
      ((ConstrainedPlaneSection) simulation_0.getPartManager().getObject("Nozzle Exit"));

    scalarDisplayer_1.getInputParts().setObjects(boundary_0, boundary_1, boundary_2, boundary_3, boundary_4, boundary_5, constrainedPlaneSection_0);

    currentView_1.setInput(new DoubleVector(new double[] {2.57088390064589, -0.5170087958118768, 2.2306898168695475}), new DoubleVector(new double[] {20.325506377595044, 17.67141910851964, -6.2035028252432864}), new DoubleVector(new double[] {-0.5672375723600064, 0.7302608773205024, 0.38073690070475924}), 42.8050596437871, 0, 30.0);

    FvRepresentation fvRepresentation_0 = 
      ((FvRepresentation) simulation_0.getRepresentationManager().getObject("Volume Mesh"));

    simulation_0.getDataSourceManager().getPartExtents(new ArrayList<>(Arrays.<NamedObject>asList(region_0)), fvRepresentation_0);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    currentView_1.setInput(new DoubleVector(new double[] {6.049121964513237, 3.183970975739251, -6.258835737088915}), new DoubleVector(new double[] {1.0141006353048616, -1.4178285076731079, -31.47483828719091}), new DoubleVector(new double[] {-0.39507666697884936, 0.9144244261724267, -0.08799088605183053}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.803263515694767, -0.6648977690542017, 0.19343630119711186}), new DoubleVector(new double[] {3.5776104529289303, -1.7850935462517095, -5.944784122409878}), new DoubleVector(new double[] {-0.39507666697884936, 0.9144244261724267, -0.08799088605183053}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.78345087764135, -0.6560263443869052, 0.45735161617154746}), new DoubleVector(new double[] {5.785005234111142, -0.5695393248166107, -5.683546163297687}), new DoubleVector(new double[] {-0.3944809917995951, 0.9174644726246758, -0.05141681223518397}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.134197402156594, -0.7686199531821608, 0.9989164694857996}), new DoubleVector(new double[] {9.370564274608313, 0.17242412451042566, -1.36405110267403}), new DoubleVector(new double[] {-0.26726509659241005, 0.9385241946956572, -0.21849875083033996}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.4792651076603, 1.300299521084494, 5.722057232470903}), new DoubleVector(new double[] {20.062468784160934, 3.9210932484594867, -0.8587722290902302}), new DoubleVector(new double[] {-0.26726509659241005, 0.9385241946956572, -0.21849875083033996}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.266151700458052, 2.145009550637005, 2.1655680038087755}), new DoubleVector(new double[] {18.791318119096722, 4.395946883233667, -3.4865497343227108}), new DoubleVector(new double[] {-0.26726509659241005, 0.9385241946956572, -0.21849875083033996}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.604442097689845, 2.266262591127318, 1.9723091866986109}), new DoubleVector(new double[] {19.1930640353463, 1.0305229532810276, -1.3592405866965114}), new DoubleVector(new double[] {0.009312945531022855, 0.9485036293229859, -0.31662933251163233}), 42.8050596437871, 0, 30.0);

    scene_2.getCreatorGroup().setQuery(null);

    scene_2.getCreatorGroup().setObjects(region_0);

    constrainedPlaneSection_0.setBatched(true);

    LabCoordinateSystem labCoordinateSystem_0 = 
      simulation_0.getCoordinateSystemManager().getLabCoordinateSystem();

    constrainedPlaneSection_0.setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_0.getInputParts().setQuery(null);

    constrainedPlaneSection_0.getInputParts().setObjects(region_0);

    constrainedPlaneSection_0.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_0.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_0.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_0.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_0.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_0.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.898256759967302, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_0.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.898256759967302, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_0.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_0.getNormalCoordinate().setValue(new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_0.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_0.setLoop(new DoubleVector(new double[] {4.898256759967302, 1.716331667131238, -0.007088038573035665, 4.898256759967302, 1.6841780538475186, -0.19403843523848952, 4.898256759967302, 1.6627392580246063, -0.40608481008624897, 4.898256759967302, 1.5207743329269028, -0.7936843777047208, 4.898256759967302, 0.9645202321916265, -1.4211866746718695, 4.898256759967302, 0.49280835103634607, -1.64347318689864, 4.898256759967302, -0.00793387928288436, -1.7143846799349833, 4.898256759967302, -0.7978293739399283, -1.5068720190811304, 4.898256759967302, -1.3029303039953057, -1.0892680984256817, 4.898256759967302, -1.569735717734941, -0.6877513385989975, 4.898256759967302, -1.721460866989284, -0.01526305179263332}));

    SingleValue singleValue_0 = 
      constrainedPlaneSection_0.getSingleValue();

    singleValue_0.getValueQuantity().setValue(0.0);

    singleValue_0.getValueQuantity().setUnits(units_0);

    RangeMultiValue rangeMultiValue_0 = 
      constrainedPlaneSection_0.getRangeMultiValue();

    rangeMultiValue_0.setNValues(2);

    rangeMultiValue_0.getStartQuantity().setValue(0.0);

    rangeMultiValue_0.getStartQuantity().setUnits(units_0);

    rangeMultiValue_0.getEndQuantity().setValue(1.0);

    rangeMultiValue_0.getEndQuantity().setUnits(units_0);

    DeltaMultiValue deltaMultiValue_0 = 
      constrainedPlaneSection_0.getDeltaMultiValue();

    deltaMultiValue_0.setNValues(2);

    deltaMultiValue_0.getStartQuantity().setValue(0.0);

    deltaMultiValue_0.getStartQuantity().setUnits(units_0);

    deltaMultiValue_0.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_0.getDeltaQuantity().setUnits(units_0);

    MultiValue multiValue_0 = 
      constrainedPlaneSection_0.getArbitraryMultiValue();

    multiValue_0.getValueQuantities().setUnits(units_0);

    multiValue_0.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_0.setValueMode(ValueMode.SINGLE);

    constrainedPlaneSection_0.setBatched(false);

    scalarDisplayer_1.getVisibleParts().addParts();

    scalarDisplayer_1.getHiddenParts().addParts();

    currentView_1.setInput(new DoubleVector(new double[] {6.5846555786083725, 1.7611585729454533, 0.8091569444627049}), new DoubleVector(new double[] {13.923558621151981, 1.040748234713452, -1.1330668262915564}), new DoubleVector(new double[] {0.009312945531022855, 0.9485036293229859, -0.31662933251163233}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {7.147455356180394, 2.706742999685728, 2.2045031207647865}), new DoubleVector(new double[] {21.103742827120733, 1.3367489121335867, -1.4889961829329743}), new DoubleVector(new double[] {0.009312945531022855, 0.9485036293229859, -0.31662933251163233}), 42.8050596437871, 0, 30.0);

    scene_2.getCreatorGroup().setQuery(null);

    scene_2.getCreatorGroup().setObjects(region_0);

    constrainedPlaneSection_0.setBatched(true);

    constrainedPlaneSection_0.setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_0.getInputParts().setQuery(null);

    constrainedPlaneSection_0.getInputParts().setObjects(region_0);

    constrainedPlaneSection_0.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_0.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_0.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_0.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_0.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_0.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.898256759967302, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_0.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.898256759967302, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_0.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_0.getNormalCoordinate().setValue(new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_0.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_0.setLoop(new DoubleVector(new double[] {4.898256759967303, 1.5092963659960783, -0.012066015144577058, 4.898256759967303, 1.505991182704674, -0.22646264831445517, 4.898256759967303, 1.4310203913400281, -0.5471172629383202, 4.898256759967303, 1.2625502690707973, -0.8512161536716044, 4.898256759967303, 0.8045289575819414, -1.2976141357135327, 4.898256759967303, 0.2372533949242912, -1.540794664394156, 4.898256759967303, -0.7334841625496344, -1.4083077028996962, 4.898256759967303, -1.2141831452788099, -0.9632218078630923, 4.898256759967303, -1.554695894812189, -0.04096466238505925}));

    singleValue_0.getValueQuantity().setValue(0.0);

    singleValue_0.getValueQuantity().setUnits(units_0);

    rangeMultiValue_0.setNValues(2);

    rangeMultiValue_0.getStartQuantity().setValue(0.0);

    rangeMultiValue_0.getStartQuantity().setUnits(units_0);

    rangeMultiValue_0.getEndQuantity().setValue(1.0);

    rangeMultiValue_0.getEndQuantity().setUnits(units_0);

    deltaMultiValue_0.setNValues(2);

    deltaMultiValue_0.getStartQuantity().setValue(0.0);

    deltaMultiValue_0.getStartQuantity().setUnits(units_0);

    deltaMultiValue_0.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_0.getDeltaQuantity().setUnits(units_0);

    multiValue_0.getValueQuantities().setUnits(units_0);

    multiValue_0.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_0.setValueMode(ValueMode.SINGLE);

    constrainedPlaneSection_0.setBatched(false);

    scalarDisplayer_1.getVisibleParts().addParts();

    scalarDisplayer_1.getHiddenParts().addParts();

    currentView_1.setInput(new DoubleVector(new double[] {6.793909585697127, 1.9084927144085837, 0.7642147259918872}), new DoubleVector(new double[] {14.344779075480648, 1.1672750676367751, -1.2341054763469228}), new DoubleVector(new double[] {0.009312945531022855, 0.9485036293229859, -0.31662933251163233}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.318048529361237, 1.6237574132735204, 0.12745274051298683}), new DoubleVector(new double[] {10.737632796035612, 1.0917535821834579, -1.306827741095955}), new DoubleVector(new double[] {0.009312945531022855, 0.9485036293229859, -0.31662933251163233}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.847433105049968, 1.4927043049485296, -0.18842631791994435}), new DoubleVector(new double[] {7.995792063892181, 1.1836512585644807, -1.0216322580015744}), new DoubleVector(new double[] {0.009312945531022855, 0.9485036293229859, -0.31662933251163233}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.841545020939881, 2.669985755922772, 1.760571475401725}), new DoubleVector(new double[] {12.14010725354699, 1.7572089656816452, -0.7002715821116656}), new DoubleVector(new double[] {0.009312945531022855, 0.9485036293229859, -0.31662933251163233}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.9745846751535767, 0.6945561543873057, 1.2770415692439474}), new DoubleVector(new double[] {11.851798353766267, -0.17685970595230305, -1.0722925648517474}), new DoubleVector(new double[] {0.009312945531022855, 0.9485036293229859, -0.31662933251163233}), 42.8050596437871, 0, 30.0);

    scene_2.getCreatorGroup().setQuery(null);

    scene_2.getCreatorGroup().setObjects(region_0);

    constrainedPlaneSection_0.setBatched(true);

    constrainedPlaneSection_0.setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_0.getInputParts().setQuery(null);

    constrainedPlaneSection_0.getInputParts().setObjects(region_0);

    constrainedPlaneSection_0.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_0.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_0.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_0.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_0.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_0.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.898256759967302, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_0.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.898256759967302, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_0.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_0.getNormalCoordinate().setValue(new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_0.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_0.setLoop(new DoubleVector(new double[] {4.898256759967302, 1.5623849296061731, -0.013451709030616321, 4.898256759967302, 1.5478188150257588, -0.23640718984683173, 4.898256759967302, 1.4055805866579856, -0.579075553916388, 4.898256759967302, 1.298712193277851, -0.8597931631945214, 4.898256759967302, 1.0885374545630317, -1.1135183598994214, 4.898256759967302, 0.7826787830283548, -1.3369713652244675, 4.898256759967303, 0.2372533949242912, -1.540794664394156, 4.898256759967303, -0.24778637288362426, -1.5238207540049586, 4.898256759967303, -0.7143161570008865, -1.3712568667765557, 4.898256759967302, -0.9581194870326911, -1.2061608438303932, 4.898256759967303, -1.2141831452788099, -0.9632218078630923, 4.898256759967302, -1.4242517362384113, -0.589884319132369, 4.898256759967303, -1.554695894812189, -0.04096466238505925}));

    singleValue_0.getValueQuantity().setValue(0.0);

    singleValue_0.getValueQuantity().setUnits(units_0);

    rangeMultiValue_0.setNValues(2);

    rangeMultiValue_0.getStartQuantity().setValue(0.0);

    rangeMultiValue_0.getStartQuantity().setUnits(units_0);

    rangeMultiValue_0.getEndQuantity().setValue(1.0);

    rangeMultiValue_0.getEndQuantity().setUnits(units_0);

    deltaMultiValue_0.setNValues(2);

    deltaMultiValue_0.getStartQuantity().setValue(0.0);

    deltaMultiValue_0.getStartQuantity().setUnits(units_0);

    deltaMultiValue_0.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_0.getDeltaQuantity().setUnits(units_0);

    multiValue_0.getValueQuantities().setUnits(units_0);

    multiValue_0.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_0.setValueMode(ValueMode.SINGLE);

    constrainedPlaneSection_0.setBatched(false);

    scalarDisplayer_1.getVisibleParts().addParts();

    scalarDisplayer_1.getHiddenParts().addParts();

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    simulation_0.getDataSourceManager().getPartExtents(new ArrayList<>(Arrays.<NamedObject>asList(region_0)), fvRepresentation_0);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    currentView_1.setInput(new DoubleVector(new double[] {2.9034102609831347, 0.706573023544768, 1.2917295432886537}), new DoubleVector(new double[] {11.782212039260324, -1.4196403518242728, -0.023372333769116516}), new DoubleVector(new double[] {0.1689098990464931, 0.9215599352820051, -0.34956649108178584}), 42.8050596437871, 0, 30.0);

    scene_2.getCreatorGroup().setQuery(null);

    scene_2.getCreatorGroup().setObjects(region_0);

    constrainedPlaneSection_0.setBatched(true);

    constrainedPlaneSection_0.setCoordinateSystem(labCoordinateSystem_0);
  }

  private void execute1() {

    Simulation simulation_0 = 
      getActiveSimulation();

    ConstrainedPlaneSection constrainedPlaneSection_0 = 
      ((ConstrainedPlaneSection) simulation_0.getPartManager().getObject("Nozzle Exit"));

    constrainedPlaneSection_0.getInputParts().setQuery(null);

    Region region_0 = 
      simulation_0.getRegionManager().getRegion("Nozzle");

    constrainedPlaneSection_0.getInputParts().setObjects(region_0);

    LabCoordinateSystem labCoordinateSystem_0 = 
      simulation_0.getCoordinateSystemManager().getLabCoordinateSystem();

    constrainedPlaneSection_0.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    Units units_0 = 
      ((Units) simulation_0.getUnitsManager().getObject("m"));

    constrainedPlaneSection_0.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_0.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_0.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_0.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_0.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.898256759967302, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_0.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.898256759967302, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_0.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_0.getNormalCoordinate().setValue(new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_0.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_0.setLoop(new DoubleVector(new double[] {4.898256759967302, 1.5623849296061731, -0.013451709030616321, 4.898256759967302, 1.5478188150257588, -0.23640718984683173, 4.898256759967302, 1.4055805866579856, -0.579075553916388, 4.898256759967302, 1.298712193277851, -0.8597931631945214, 4.898256759967302, 1.0885374545630317, -1.1135183598994214, 4.898256759967302, 0.7826787830283548, -1.3369713652244675, 4.898256759967303, 0.2372533949242912, -1.540794664394156, 4.898256759967303, -0.24778637288362426, -1.5238207540049586, 4.898256759967303, -0.7143161570008865, -1.3712568667765557, 4.898256759967302, -0.9581194870326911, -1.2061608438303932, 4.898256759967303, -1.2141831452788099, -0.9632218078630923, 4.898256759967302, -1.4242517362384113, -0.589884319132369, 4.898256759967303, -1.558294859067097, 0.006444463953193452}));

    SingleValue singleValue_0 = 
      constrainedPlaneSection_0.getSingleValue();

    singleValue_0.getValueQuantity().setValue(0.0);

    singleValue_0.getValueQuantity().setUnits(units_0);

    RangeMultiValue rangeMultiValue_0 = 
      constrainedPlaneSection_0.getRangeMultiValue();

    rangeMultiValue_0.setNValues(2);

    rangeMultiValue_0.getStartQuantity().setValue(0.0);

    rangeMultiValue_0.getStartQuantity().setUnits(units_0);

    rangeMultiValue_0.getEndQuantity().setValue(1.0);

    rangeMultiValue_0.getEndQuantity().setUnits(units_0);

    DeltaMultiValue deltaMultiValue_0 = 
      constrainedPlaneSection_0.getDeltaMultiValue();

    deltaMultiValue_0.setNValues(2);

    deltaMultiValue_0.getStartQuantity().setValue(0.0);

    deltaMultiValue_0.getStartQuantity().setUnits(units_0);

    deltaMultiValue_0.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_0.getDeltaQuantity().setUnits(units_0);

    MultiValue multiValue_0 = 
      constrainedPlaneSection_0.getArbitraryMultiValue();

    multiValue_0.getValueQuantities().setUnits(units_0);

    multiValue_0.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_0.setValueMode(ValueMode.SINGLE);

    constrainedPlaneSection_0.setBatched(false);

    Scene scene_2 = 
      simulation_0.getSceneManager().getScene("Mach Number");

    ScalarDisplayer scalarDisplayer_1 = 
      ((ScalarDisplayer) scene_2.getDisplayerManager().getObject("Scalar 1"));

    scalarDisplayer_1.getVisibleParts().addParts();

    scalarDisplayer_1.getHiddenParts().addParts();

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    CurrentView currentView_1 = 
      scene_2.getCurrentView();

    currentView_1.setInput(new DoubleVector(new double[] {0.8050584498796629, 0.5219214453024881, 1.081946045608464}), new DoubleVector(new double[] {8.863774051267898, 3.653279248884028, 3.722693965203671}), new DoubleVector(new double[] {-0.22363083179201174, 0.8970250223110195, -0.38122875077836427}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.8050584498796629, 0.5219214453024881, 1.081946045608464}), new DoubleVector(new double[] {8.863774051267898, 3.653279248884028, 3.722693965203671}), new DoubleVector(new double[] {-0.22363083179201174, 0.8970250223110195, -0.38122875077836427}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.1010727524958608, 0.5891062730028543, 1.3889419056749452}), new DoubleVector(new double[] {7.044154067163434, 1.71603608166747, 8.526780561493872}), new DoubleVector(new double[] {0.047243793404633166, 0.9798560016095866, -0.1940366978035874}), 42.8050596437871, 0, 30.0);

    XYPlot xYPlot_0 = 
      simulation_0.getPlotManager().create("star.common.XYPlot");

    xYPlot_0.openInteractive();

    PlotUpdate plotUpdate_0 = 
      xYPlot_0.getPlotUpdate();

    HardcopyProperties hardcopyProperties_2 = 
      plotUpdate_0.getHardcopyProperties();

    hardcopyProperties_2.setCurrentResolutionWidth(25);

    hardcopyProperties_2.setCurrentResolutionHeight(25);

    SceneUpdate sceneUpdate_1 = 
      scene_2.getSceneUpdate();

    HardcopyProperties hardcopyProperties_1 = 
      sceneUpdate_1.getHardcopyProperties();

    hardcopyProperties_1.setCurrentResolutionWidth(1297);

    hardcopyProperties_1.setCurrentResolutionHeight(484);

    hardcopyProperties_2.setCurrentResolutionWidth(1295);

    hardcopyProperties_2.setCurrentResolutionHeight(483);

    xYPlot_0.setPresentationName("Isp vs Thrust");

    AxisType axisType_0 = 
      xYPlot_0.getXAxisType();

    axisType_0.setMode(AxisTypeMode.SCALAR);

    FieldFunctionUnits fieldFunctionUnits_0 = 
      axisType_0.getScalarFunction();

    PrimitiveFieldFunction primitiveFieldFunction_0 = 
      ((PrimitiveFieldFunction) simulation_0.getFieldFunctionManager().getFunction("Thrust1Report"));

    fieldFunctionUnits_0.setFieldFunction(primitiveFieldFunction_0);

    YAxisType yAxisType_0 = 
      ((YAxisType) xYPlot_0.getYAxes().getAxisType("Y Type 1"));

    FieldFunctionUnits fieldFunctionUnits_1 = 
      yAxisType_0.getScalarFunction();

    UserFieldFunction userFieldFunction_3 = 
      ((UserFieldFunction) simulation_0.getFieldFunctionManager().getFunction("UserFieldFunction_4"));

    fieldFunctionUnits_1.setFieldFunction(userFieldFunction_3);

    MonitorPlot monitorPlot_0 = 
      ((MonitorPlot) simulation_0.getPlotManager().getPlot("Thrust 1 Monitor Plot"));

    monitorPlot_0.setPresentationName("Thrust");

    MonitorPlot monitorPlot_1 = 
      ((MonitorPlot) simulation_0.getPlotManager().getPlot("Mass Flow Averaged 1 Monitor Plot"));

    monitorPlot_1.setPresentationName("Mass Flow Averaged ");

    Scene scene_1 = 
      simulation_0.getSceneManager().getScene("AMR");

    scene_1.openInteractive();

    SceneUpdate sceneUpdate_2 = 
      scene_1.getSceneUpdate();

    HardcopyProperties hardcopyProperties_3 = 
      sceneUpdate_2.getHardcopyProperties();

    hardcopyProperties_3.setCurrentResolutionWidth(1069);

    hardcopyProperties_3.setCurrentResolutionHeight(471);

    hardcopyProperties_2.setCurrentResolutionWidth(1297);

    hardcopyProperties_2.setCurrentResolutionHeight(484);

    hardcopyProperties_3.setCurrentResolutionWidth(1295);

    hardcopyProperties_3.setCurrentResolutionHeight(483);

    ReportAnnotation reportAnnotation_0 = 
      ((ReportAnnotation) simulation_0.getAnnotationManager().getObject("Element Count 1"));

    scene_1.getAnnotationPropManager().getAnnotationGroup().addObjects(reportAnnotation_0);

    Boundary boundary_6 = 
      region_0.getBoundaryManager().getBoundary("Freestream");

    boundary_6.getConditions().get(KwTurbSpecOption.class).setSelected(KwTurbSpecOption.Type.K_OMEGA);

    Boundary boundary_3 = 
      region_0.getBoundaryManager().getBoundary("Inlet");

    boundary_3.getConditions().get(KwTurbSpecOption.class).setSelected(KwTurbSpecOption.Type.K_OMEGA);

    Boundary boundary_4 = 
      region_0.getBoundaryManager().getBoundary("Symmetry");

    SymmetryBoundary symmetryBoundary_0 = 
      ((SymmetryBoundary) simulation_0.get(ConditionTypeManager.class).get(SymmetryBoundary.class));

    boundary_4.setBoundaryType(symmetryBoundary_0);

    CurrentView currentView_2 = 
      scene_1.getCurrentView();

    currentView_2.setInput(new DoubleVector(new double[] {14.593972951264286, -1.2329730826750338, -1.3473849441009813}), new DoubleVector(new double[] {-5.366172800201063, 1.8472904945132331, 59.826911059930566}), new DoubleVector(new double[] {0.0035851845761220445, 0.9987863828742242, -0.04912135825274983}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.515771658646756, -6.911622509940131, -24.78333223731267}), new DoubleVector(new double[] {61.3622992398271, 10.79206440207959, -0.18167302729420065}), new DoubleVector(new double[] {-0.130877745751904, 0.9230220836447881, -0.3618027760686365}), 42.8050596437871, 0, 30.0);

    hardcopyProperties_2.setCurrentResolutionWidth(1295);

    hardcopyProperties_2.setCurrentResolutionHeight(483);

    xYPlot_0.closeInteractive();

    scene_1.closeInteractive();

    hardcopyProperties_1.setCurrentResolutionWidth(1295);

    hardcopyProperties_1.setCurrentResolutionHeight(483);

    Scene scene_0 = 
      simulation_0.getSceneManager().getScene("Vector Scene 1");

    scene_0.closeInteractive();

    Solution solution_0 = 
      simulation_0.getSolution();

    solution_0.initializeSolution();

    currentView_1.setInput(new DoubleVector(new double[] {1.4579368374797128, 0.36299858880161917, -0.2615730288801674}), new DoubleVector(new double[] {8.07415772361586, 1.6175694321947152, 7.6847286782740305}), new DoubleVector(new double[] {0.047243793404633166, 0.9798560016095866, -0.1940366978035874}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.156113975851653, 0.6260663852288779, 3.7384442019250343}), new DoubleVector(new double[] {-1.3620058398733246, 0.5388362880586313, 13.541875310911989}), new DoubleVector(new double[] {0.08818083944771396, 0.9952807669061401, 0.040501044197996494}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.298952862563772, 1.6283329069323402, 0.5298755944279634}), new DoubleVector(new double[] {-4.984866151462561, 1.3981450574211323, 26.39973929989568}), new DoubleVector(new double[] {0.08818083944771396, 0.9952807669061401, 0.040501044197996494}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.723724387883262, 3.168259598058198, 0.9389825354735208}), new DoubleVector(new double[] {-10.727938837160117, 2.7603484816379122, 46.78243173640173}), new DoubleVector(new double[] {0.08818083944771396, 0.9952807669061401, 0.040501044197996494}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {12.719532985745293, -1.9935220306267172, 3.6420160384245883}), new DoubleVector(new double[] {-3.6563416986964135, -2.3995540064527794, 49.27427637269788}), new DoubleVector(new double[] {0.08818083944771396, 0.9952807669061401, 0.040501044197996494}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {13.710644381325233, -2.1152099918230842, 2.8278805910055014}), new DoubleVector(new double[] {24.380004740250563, -7.873893396345934, 53.3033849553469}), new DoubleVector(new double[] {0.08439255248549128, 0.9918627314802148, 0.09532166063230643}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {32.191037569310325, 0.3611296602025753, -3.266130810655632}), new DoubleVector(new double[] {43.35405963962843, -5.664002848035078, 49.54482976002428}), new DoubleVector(new double[] {0.08439255248549128, 0.9918627314802148, 0.09532166063230643}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {36.85295990707533, 3.533726124687316, -3.79486544104239}), new DoubleVector(new double[] {52.989045023593214, -5.175568757899185, 72.54307866456102}), new DoubleVector(new double[] {0.08439255248549128, 0.9918627314802148, 0.09532166063230643}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {37.46318966137789, 3.1700014268671044, 0.3746341737397356}), new DoubleVector(new double[] {36.48212242425575, 1.5217755246216456, 77.02528956769206}), new DoubleVector(new double[] {0.07726776086715915, 0.9967582111519483, 0.02242234670708561}), 42.8050596437871, 0, 30.0);

    AmrSolver amrSolver_0 = 
      ((AmrSolver) simulation_0.getSolverManager().getSolver(AmrSolver.class));

    AmrStarUpdate amrStarUpdate_0 = 
      amrSolver_0.getAmrTrigger();

    IterationUpdateFrequency iterationUpdateFrequency_0 = 
      amrStarUpdate_0.getIterationUpdateFrequency();

    IntegerValue integerValue_0 = 
      iterationUpdateFrequency_0.getIterationFrequencyQuantity();

    integerValue_0.getQuantity().setValue(500.0);

    currentView_1.setInput(new DoubleVector(new double[] {40.51725593918023, -2.4337119206605777, 0.4649699871645842}), new DoubleVector(new double[] {39.53838550429339, -4.0782471213829155, 76.9439895087372}), new DoubleVector(new double[] {0.07726776086715915, 0.9967582111519483, 0.02242234670708561}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {40.49846676648205, -2.3416618853613596, -0.3909151223798489}), new DoubleVector(new double[] {44.80198256466521, -16.984880730359357, 74.57413784725419}), new DoubleVector(new double[] {0.08087213992654811, 0.9791000150093543, 0.18660883578354917}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {39.30125879147654, -4.095844253343718, -6.654145440067261}), new DoubleVector(new double[] {58.80855295043976, 42.6037540073065, 50.03815994025452}), new DoubleVector(new double[] {-0.06554731312823392, 0.781142544838551, -0.620902467691125}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {31.387014835321384, -18.814870797543556, -11.081088806651389}), new DoubleVector(new double[] {69.7948554206671, 40.77835011576941, -41.61060605695525}), new DoubleVector(new double[] {-0.5364255224658793, -0.08445640725989094, -0.8397111253997274}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.799228909485517, -0.4908810632781053, -1.068889376846696}), new DoubleVector(new double[] {7.8116158997911125, 2.631518442881966, -2.6684899375265565}), new DoubleVector(new double[] {-0.5364255224658793, -0.08445640725989094, -0.8397111253997274}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.376724869726401, 0.037913677051185424, -0.9320860681052363}), new DoubleVector(new double[] {6.445220264796422, 1.695780434276796, -1.7814087089648383}), new DoubleVector(new double[] {-0.5364255224658793, -0.08445640725989094, -0.8397111253997274}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.8942578365358695, -0.004100985079122155, -0.2429472631851307}), new DoubleVector(new double[] {5.567021796141203, -1.2178098852980135, -1.7542436106513797}), new DoubleVector(new double[] {-0.9439377185608488, -0.17355065556114596, -0.2808233491584636}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.550877018417013, -0.5465577280228616, 0.6446488477913884}), new DoubleVector(new double[] {5.369717338785806, -2.0237976581652406, -1.1947933037433274}), new DoubleVector(new double[] {-0.9439377185608488, -0.17355065556114596, -0.2808233491584636}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.666122467512027, -0.6408578741501358, 0.35475705424467674}), new DoubleVector(new double[] {5.003775439296704, -2.4219693728834466, -0.08391352843218064}), new DoubleVector(new double[] {-0.961179100110312, -0.12115907965352828, -0.24790162348959527}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.7199087555680554, -0.5250609036880096, -0.42871632630276063}), new DoubleVector(new double[] {5.042459111356321, -2.226506457620108, -0.8477659551817768}), new DoubleVector(new double[] {-0.961179100110312, -0.12115907965352828, -0.24790162348959527}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.496286738081, 0.5993888777336833, -0.23096842891740121}), new DoubleVector(new double[] {5.120531210143448, -1.8701594704343663, 0.34304652657560664}), new DoubleVector(new double[] {-0.9235531928594196, -0.2913940465221331, -0.2492769736874376}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.00988946169684, -1.4387116557436452, 0.23386831351793494}), new DoubleVector(new double[] {5.112043316731193, -1.9472277596207657, 0.20370040941177792}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.047424468496215, -1.2655930528900756, -0.11731862633907454}), new DoubleVector(new double[] {5.177433272075036, -1.9127695127837883, -0.15571260685016866}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.840686462984189, -0.02331735176762939, -0.4631151840576608}), new DoubleVector(new double[] {5.031239306297373, -0.9718786119544505, -0.5193889282281037}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.7245889245958, 1.1242354582410947, -0.7050411375396719}), new DoubleVector(new double[] {4.976759103734732, -0.13105340938511786, -0.779511609360216}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.814367079361274, 1.0368615853484986, -0.871268179206449}), new DoubleVector(new double[] {4.939638614167298, 0.4132669810641699, -0.9082631574966792}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.858503985690009, 1.0280286231002522, -0.9662486256665669}), new DoubleVector(new double[] {4.917866436771172, 0.7325257041919344, -0.9837794445585283}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.879419390971923, 1.023841386930052, -1.011256959757679}), new DoubleVector(new double[] {4.907549287947241, 0.8838123531990904, -1.0195642334692983}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.8872067775005155, 1.0222855881256507, -1.0280160665491427}), new DoubleVector(new double[] {4.903707593749716, 0.9401454595224397, -1.0328890597622893}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.876252384380983, 1.1520049312187401, -1.045746201934308}), new DoubleVector(new double[] {4.901686679756421, 1.025394449560187, -1.0532574151296967}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.8873151671557045, 1.1511096145284996, -1.06327823742449}), new DoubleVector(new double[] {4.9008201130448175, 1.0838827588773472, -1.0672664952577806}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.892731813527398, 1.1504362610724128, -1.0727154626886692}), new DoubleVector(new double[] {4.899885690552548, 1.1148246664710901, -1.0748281335811125}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.8955909322619355, 1.1501635278142837, -1.0777214518586427}), new DoubleVector(new double[] {4.899389526688979, 1.131254339927052, -1.0788432463555284}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.891980925838215, 1.150028616276609, -1.0712578656251934}), new DoubleVector(new double[] {4.900033032070443, 1.109945687562468, -1.073635800051502}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.884137122163366, 1.1502278538862487, -1.0573606023743067}), new DoubleVector(new double[] {4.901413737226484, 1.0642258427323217, -1.0624627031841847}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.86730748932837, 1.1506552226834312, -1.0275426574603181}), new DoubleVector(new double[] {4.904376176591484, 0.9661293972357574, -1.0384897196374443}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.831197623442476, 1.15157294437585, -0.9635651352204482}), new DoubleVector(new double[] {4.910732395898865, 0.7556533523186407, -0.9870532100244908}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.7391882621823775, 1.1539210152602004, -0.8005507731060769}), new DoubleVector(new double[] {4.926927949129386, 0.21936348811363376, -0.8559937406850284}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.556295023050806, 1.158628821919344, -0.476528124687153}), new DoubleVector(new double[] {4.959119511750524, -0.8466086649182176, -0.5954895730104914}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.484250889445066, 1.1605353500276427, -0.3489067175313775}), new DoubleVector(new double[] {4.9717983556596375, -1.266448319763363, -0.4928884126226468}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.979823538052842, -3.2807510006946634, 0.093328048315767}), new DoubleVector(new double[] {5.041971506372348, -3.590120066630386, 0.07497461517294583}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.938725462130106, -3.278739397856661, 0.1658551032248387}), new DoubleVector(new double[] {5.049171399358137, -3.8285330171905865, 0.13323839539635982}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.8488933401288685, -3.274353219707299, 0.32438786138070586}), new DoubleVector(new double[] {5.064909299449117, -4.34966842902427, 0.2605943927546012}), new DoubleVector(new double[] {-0.9498046046541435, -0.17543591818272034, -0.2590240367018302}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.885684336227204, -3.4477433058208393, 0.29165206617858525}), new DoubleVector(new double[] {5.103752964288212, -4.371125294824379, -0.13635060977698496}), new DoubleVector(new double[] {-0.9630710732956523, -0.11448507453326369, -0.24369504609328915}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.6945911785709233, 2.0285725391667393, 0.1040686960393883}), new DoubleVector(new double[] {4.966633040742381, -3.357715966573936, -2.392564248267369}), new DoubleVector(new double[] {-0.9630710732956523, -0.11448507453326369, -0.24369504609328915}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.356501345321772, -1.0323546518149778, -1.2108590525732925}), new DoubleVector(new double[] {6.048195651386789, 1.2731404481635806, -0.005497488106940729}), new DoubleVector(new double[] {0.9659930967123733, -0.2414562530854939, -0.09249981054085951}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.660525210491024, -0.822392509292119, -1.2130628157174561}), new DoubleVector(new double[] {5.352218788293648, 1.4831001633057816, -0.00770252033701424}), new DoubleVector(new double[] {0.9659930967123733, -0.2414562530854939, -0.09249981054085951}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.9058390075692895, -0.06250539460674387, -0.8364223077553895}), new DoubleVector(new double[] {6.053739618809617, 1.4457945704322783, -0.876107319224951}), new DoubleVector(new double[] {0.7797198692106126, -0.5982697980006233, -0.1846893996920823}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.124816536783228, -0.21451681527534738, -1.2658032861431334}), new DoubleVector(new double[] {11.985824607850027, 8.800600114177978, -1.5030008111961415}), new DoubleVector(new double[] {0.7797198692106126, -0.5982697980006233, -0.1846893996920823}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.336188666906249, -0.4279008059028726, -1.7442057985082222}), new DoubleVector(new double[] {18.61101615757655, 17.014743308070084, -2.2031407237666674}), new DoubleVector(new double[] {0.7797198692106126, -0.5982697980006233, -0.1846893996920823}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.475238130606505, -0.08086494671401101, -0.8063756134793549}), new DoubleVector(new double[] {-13.418473843234969, -10.862945730165192, 7.631609224178624}), new DoubleVector(new double[] {0.1985643546080497, 0.37810215489526733, 0.9042184235807179}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.28760358413302756, -5.39871686541722, 1.9826730101237082}), new DoubleVector(new double[] {3.8829728234257486, -23.82128711769246, 6.286816942719283}), new DoubleVector(new double[] {0.14513310912762376, 0.2518695108884318, 0.9568166648422946}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.365953802206068, -6.082261894240519, 1.9011382203029443}), new DoubleVector(new double[] {2.720442073136213, 2.9084373966408386, 17.806782815642663}), new DoubleVector(new double[] {-0.26065384511898815, 0.856476872899296, -0.4455411756656161}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.29657241348910235, -6.061815482813022, 1.6777278782388503}), new DoubleVector(new double[] {-0.0362381480031031, 9.093809156727009, 13.548398857292414}), new DoubleVector(new double[] {-0.2839786702278294, 0.5873635445268341, -0.7578655430989563}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.8992326421936936, -1.723890637088906, -2.3948044279322342}), new DoubleVector(new double[] {1.5815643187449244, 12.742182339907941, 8.935773938392298}), new DoubleVector(new double[] {-0.2839786702278294, 0.5873635445268341, -0.7578655430989563}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.1097820619274295, 1.5568973377320972, 1.0630234207141922}), new DoubleVector(new double[] {6.941159695683208, 0.3440980975676708, 15.213587378626574}), new DoubleVector(new double[] {-0.11191847872068743, 0.9861095483118771, 0.1227282072270379}), 42.8050596437871, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.1502819650989466, 0.40549726041356027, -0.006472381895825517}), new DoubleVector(new double[] {8.168655565557565, -0.8542427456198991, 14.691781818280466}), new DoubleVector(new double[] {-0.11191847872068743, 0.9861095483118771, 0.1227282072270379}), 42.8050596437871, 0, 30.0);
  }
}
