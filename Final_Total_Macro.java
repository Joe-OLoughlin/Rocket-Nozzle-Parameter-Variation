// Simcenter STAR-CCM+ macro: Final_Total_Macro.java
// Written by Simcenter STAR-CCM+ 19.02.012
package macro;

import java.util.*;

import star.base.neo.*;
import star.realgas.*;
import star.resurfacer.*;
import star.turbulence.*;
import star.kwturb.*;
import star.flow.*;
import star.energy.*;
import star.metrics.*;
import star.meshing.*;
import star.common.*;
import star.material.*;
import star.base.report.*;
import star.coupledflow.*;
import star.amr.*;
import star.prismmesher.*;
import star.vis.*;
import star.species.*;
import star.walldistance.*;

public class Final_Total_Macro extends StarMacro {

  public void execute() {
    execute0();
    execute1();
    execute2();
    execute3();
    execute4();
    execute5();
  }

  private void execute0() {

    Simulation simulation_0 = 
      getActiveSimulation();

    PartImportManager partImportManager_0 = 
      simulation_0.get(PartImportManager.class);

    partImportManager_0.importCadPart(resolvePath("C:\\Users\\joe_o\\OneDrive - University of Limerick\\1 Thesis\\Nozzle Optimisation\\Optimisation of Base Model\\Parasolid\\Nozzle.x_t"), "SharpEdges", 30.0, 4, true, 1.0E-6, true, false, false, false, true, NeoProperty.fromString("{\'NX\': 1, \'STEP\': 1, \'SE\': 0, \'CGR\': 0, \'SW\': 1, \'RHINO\': 1, \'IFC\': 1, \'ACIS\': 1, \'JT\': 1, \'IGES\': 0, \'CATIAV5\': 1, \'CATIAV4\': 1, \'3DXML\': 1, \'CREO\': 1, \'INV\': 1}"), true, false);

    simulation_0.getSceneManager().createGeometryScene("Geometry Scene", "Outline", "Surface", 1, null);

    Scene scene_0 = 
      simulation_0.getSceneManager().getScene("Geometry Scene 1");

    scene_0.initializeAndWait();

    SceneUpdate sceneUpdate_0 = 
      scene_0.getSceneUpdate();

    HardcopyProperties hardcopyProperties_0 = 
      sceneUpdate_0.getHardcopyProperties();

    hardcopyProperties_0.setCurrentResolutionWidth(193);

    hardcopyProperties_0.setCurrentResolutionHeight(648);

    scene_0.resetCamera();

    hardcopyProperties_0.setCurrentResolutionWidth(195);

    hardcopyProperties_0.setCurrentResolutionWidth(202);

    hardcopyProperties_0.setCurrentResolutionWidth(214);

    hardcopyProperties_0.setCurrentResolutionWidth(221);

    hardcopyProperties_0.setCurrentResolutionWidth(231);

    hardcopyProperties_0.setCurrentResolutionWidth(257);

    hardcopyProperties_0.setCurrentResolutionWidth(296);

    hardcopyProperties_0.setCurrentResolutionWidth(323);

    hardcopyProperties_0.setCurrentResolutionWidth(339);

    hardcopyProperties_0.setCurrentResolutionWidth(354);

    hardcopyProperties_0.setCurrentResolutionWidth(373);

    hardcopyProperties_0.setCurrentResolutionWidth(388);

    hardcopyProperties_0.setCurrentResolutionWidth(406);

    hardcopyProperties_0.setCurrentResolutionWidth(411);

    hardcopyProperties_0.setCurrentResolutionWidth(415);

    hardcopyProperties_0.setCurrentResolutionWidth(425);

    hardcopyProperties_0.setCurrentResolutionWidth(432);

    hardcopyProperties_0.setCurrentResolutionWidth(434);

    hardcopyProperties_0.setCurrentResolutionWidth(435);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    PartDisplayer partDisplayer_0 = 
      ((PartDisplayer) scene_0.getDisplayerManager().getObject("Outline 1"));

    CadPart cadPart_0 = 
      ((CadPart) simulation_0.get(SimulationPartManager.class).getPart("Nozzle"));

    PartSurface partSurface_0 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("ColoredFace1"));

    partDisplayer_0.getHiddenParts().addObjects(partSurface_0);

    PartDisplayer partDisplayer_1 = 
      ((PartDisplayer) scene_0.getDisplayerManager().getObject("Surface 1"));

    partDisplayer_1.getHiddenParts().addObjects(partSurface_0);

    CurrentView currentView_0 = 
      scene_0.getCurrentView();

    currentView_0.setInput(new DoubleVector(new double[] {25.339498522283698, 0.0, -0.08436295385450876}), new DoubleVector(new double[] {25.339498522283698, 0.0, 236.0779840176404}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.80925321792367, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {25.339498522283698, 0.0, -0.08436295385450876}), new DoubleVector(new double[] {25.339498522283698, 0.0, 236.0779840176404}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.80925321792367, 0, 30.0);

    cadPart_0.splitPartSurfaceByPatch(partSurface_0, new IntVector(new int[] {11}), "Symmetry");

    currentView_0.setInput(new DoubleVector(new double[] {25.339498522283698, 0.0, -0.08436295385450876}), new DoubleVector(new double[] {25.339498522283698, 0.0, 236.0779840176404}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.80925321792367, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {25.339498522283698, 0.0, -0.08436295385450876}), new DoubleVector(new double[] {25.339498522283698, 0.0, 236.0779840176404}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.80925321792367, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {25.339498522283698, 0.0, -0.08436295385450876}), new DoubleVector(new double[] {25.339498522283698, 0.0, 236.0779840176404}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.80925321792367, 0, 30.0);

    cadPart_0.splitPartSurfaceByPatch(partSurface_0, new IntVector(new int[] {4, 5, 6}), "Freestream");

    currentView_0.setInput(new DoubleVector(new double[] {16.434280843205265, -2.3070512121964866, -3.91185050930207}), new DoubleVector(new double[] {16.434280843205265, -2.3070512121964866, 124.49196489667509}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.80925321792367, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {3.540463055652386, 0.3930962719885637, -12.518082202782715}), new DoubleVector(new double[] {3.540463055652386, 0.3930962719885637, 32.642112436215214}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.80925321792367, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.857781056588137, 0.30815647254589623, -0.3774271455867648}), new DoubleVector(new double[] {0.857781056588137, 0.30815647254589623, 15.524131492558944}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.80925321792367, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-1.3419374491506455, 0.4684144601517575, 2.140392528472635}), new DoubleVector(new double[] {-17.06342907181345, 1.613785835187848, 4.233811577181545}), new DoubleVector(new double[] {0.06292874186625878, 0.9954153981485611, -0.07202887320979141}), 42.80925321792367, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-1.3419374491506455, 0.4684144601517575, 2.140392528472635}), new DoubleVector(new double[] {-17.06342907181345, 1.613785835187848, 4.233811577181545}), new DoubleVector(new double[] {0.06292874186625878, 0.9954153981485611, -0.07202887320979141}), 42.80925321792367, 0, 30.0);

    cadPart_0.splitPartSurfaceByPatch(partSurface_0, new IntVector(new int[] {3}), "Inlet");

    currentView_0.setInput(new DoubleVector(new double[] {-0.8742559567612009, 0.4257631013855223, 2.0360946656350043}), new DoubleVector(new double[] {-14.499873573296929, 2.7655951193363935, 10.449308499319457}), new DoubleVector(new double[] {0.11416167892842938, 0.989353227124516, -0.09026241212460596}), 42.80925321792367, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.8742559567612009, 0.4257631013855223, 2.0360946656350043}), new DoubleVector(new double[] {-14.499873573296929, 2.7655951193363935, 10.449308499319457}), new DoubleVector(new double[] {0.11416167892842938, 0.989353227124516, -0.09026241212460596}), 42.80925321792367, 0, 30.0);

    cadPart_0.splitPartSurfaceByPatch(partSurface_0, new IntVector(new int[] {2}), "FlowStab");

    currentView_0.setInput(new DoubleVector(new double[] {-0.8742559567612009, 0.4257631013855223, 2.0360946656350043}), new DoubleVector(new double[] {-14.499873573296929, 2.7655951193363935, 10.449308499319457}), new DoubleVector(new double[] {0.11416167892842938, 0.989353227124516, -0.09026241212460596}), 42.80925321792367, 0, 30.0);

    cadPart_0.splitPartSurfaceByPatch(partSurface_0, new IntVector(new int[] {1}), "Convergent");

    currentView_0.setInput(new DoubleVector(new double[] {-0.8742559567612009, 0.4257631013855223, 2.0360946656350043}), new DoubleVector(new double[] {-14.499873573296929, 2.7655951193363935, 10.449308499319457}), new DoubleVector(new double[] {0.11416167892842938, 0.989353227124516, -0.09026241212460596}), 42.80925321792367, 0, 30.0);

    cadPart_0.splitPartSurfaceByPatch(partSurface_0, new IntVector(new int[] {10}), "Throat");

    currentView_0.setInput(new DoubleVector(new double[] {-0.8742559567612009, 0.4257631013855223, 2.0360946656350043}), new DoubleVector(new double[] {-14.499873573296929, 2.7655951193363935, 10.449308499319457}), new DoubleVector(new double[] {0.11416167892842938, 0.989353227124516, -0.09026241212460596}), 42.80925321792367, 0, 30.0);

    cadPart_0.splitPartSurfaceByPatch(partSurface_0, new IntVector(new int[] {9}), "Divergent");

    partDisplayer_0.getVisibleParts().addParts(partSurface_0);

    partDisplayer_0.getHiddenParts().addParts();

    partDisplayer_1.getVisibleParts().addParts(partSurface_0);

    partDisplayer_1.getHiddenParts().addParts();

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    partSurface_0.setPresentationName("Wall");

    simulation_0.getRegionManager().newRegionsFromParts(new ArrayList<>(Arrays.<GeometryPart>asList(cadPart_0)), "OneRegionPerPart", null, "OneBoundaryPerPartSurface", null, RegionManager.CreateInterfaceMode.BOUNDARY, "OneEdgeBoundaryPerPart", null);

    Region region_0 = 
      simulation_0.getRegionManager().getRegion("Nozzle");

    Boundary boundary_0 = 
      region_0.getBoundaryManager().getBoundary("Inlet");

    StagnationBoundary stagnationBoundary_0 = 
      ((StagnationBoundary) simulation_0.get(ConditionTypeManager.class).get(StagnationBoundary.class));

    boundary_0.setBoundaryType(stagnationBoundary_0);

    Boundary boundary_1 = 
      region_0.getBoundaryManager().getBoundary("Freestream");

    FreeStreamBoundary freeStreamBoundary_0 = 
      ((FreeStreamBoundary) simulation_0.get(ConditionTypeManager.class).get(FreeStreamBoundary.class));

    boundary_1.setBoundaryType(freeStreamBoundary_0);

    AutoMeshOperation autoMeshOperation_0 = 
      simulation_0.get(MeshOperationManager.class).createAutoMeshOperation(new StringVector(new String[] {"star.resurfacer.ResurfacerAutoMesher", "star.dualmesher.DualAutoMesher", "star.prismmesher.PrismAutoMesher", "star.resurfacer.AutomaticSurfaceRepairAutoMesher"}), new ArrayList<>(Arrays.<GeometryPart>asList(cadPart_0)));

    Units units_0 = 
      ((Units) simulation_0.getUnitsManager().getObject("m"));

    autoMeshOperation_0.getDefaultValues().get(BaseSize.class).setValueAndUnits(0.8, units_0);

    PartsTargetSurfaceSize partsTargetSurfaceSize_0 = 
      autoMeshOperation_0.getDefaultValues().get(PartsTargetSurfaceSize.class);

    Units units_1 = 
      ((Units) simulation_0.getUnitsManager().getObject(""));

    partsTargetSurfaceSize_0.getRelativeSizeScalar().setValueAndUnits(80.0, units_1);

    NumPrismLayers numPrismLayers_0 = 
      autoMeshOperation_0.getDefaultValues().get(NumPrismLayers.class);

    IntegerValue integerValue_0 = 
      numPrismLayers_0.getNumLayersValue();

    integerValue_0.getQuantity().setValue(15.0);

    PrismThickness prismThickness_0 = 
      autoMeshOperation_0.getDefaultValues().get(PrismThickness.class);

    prismThickness_0.getRelativeSizeScalar().setValueAndUnits(2.0, units_1);

    SurfaceCustomMeshControl surfaceCustomMeshControl_0 = 
      autoMeshOperation_0.getCustomMeshControls().createSurfaceControl();

    surfaceCustomMeshControl_0.getGeometryObjects().setQuery(null);

    PartSurface partSurface_1 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("Freestream"));

    PartSurface partSurface_2 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("Inlet"));

    PartSurface partSurface_3 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("Symmetry"));

    surfaceCustomMeshControl_0.getGeometryObjects().setObjects(partSurface_1, partSurface_2, partSurface_3, partSurface_0);

    PartsCustomizePrismMesh partsCustomizePrismMesh_0 = 
      surfaceCustomMeshControl_0.getCustomConditions().get(PartsCustomizePrismMesh.class);

    partsCustomizePrismMesh_0.getCustomPrismOptions().setSelected(PartsCustomPrismsOption.Type.DISABLE);

    SurfaceCustomMeshControl surfaceCustomMeshControl_1 = 
      autoMeshOperation_0.getCustomMeshControls().createSurfaceControl();

    surfaceCustomMeshControl_1.getCustomConditions().get(PartsTargetSurfaceSizeOption.class).setSelected(PartsTargetSurfaceSizeOption.Type.CUSTOM);

    surfaceCustomMeshControl_1.getCustomConditions().get(PartsMinimumSurfaceSizeOption.class).setSelected(PartsMinimumSurfaceSizeOption.Type.CUSTOM);

    PartsCustomizePrismMesh partsCustomizePrismMesh_1 = 
      surfaceCustomMeshControl_1.getCustomConditions().get(PartsCustomizePrismMesh.class);

    partsCustomizePrismMesh_1.getCustomPrismOptions().setSelected(PartsCustomPrismsOption.Type.CUSTOMIZE);

    PartsCustomizePrismMeshControls partsCustomizePrismMeshControls_0 = 
      partsCustomizePrismMesh_1.getCustomPrismControls();

    partsCustomizePrismMeshControls_0.setCustomizeNumLayers(true);

    partsCustomizePrismMeshControls_0.setCustomizeTotalThickness(true);

    PartsTargetSurfaceSize partsTargetSurfaceSize_1 = 
      surfaceCustomMeshControl_1.getCustomValues().get(PartsTargetSurfaceSize.class);

    partsTargetSurfaceSize_1.getRelativeSizeScalar().setValueAndUnits(15.0, units_1);

    PartsMinimumSurfaceSize partsMinimumSurfaceSize_0 = 
      surfaceCustomMeshControl_1.getCustomValues().get(PartsMinimumSurfaceSize.class);

    partsMinimumSurfaceSize_0.getRelativeSizeScalar().setValueAndUnits(3.0, units_1);

    partsCustomizePrismMesh_1.getCustomPrismOptions().setSelected(PartsCustomPrismsOption.Type.PARENT);

    surfaceCustomMeshControl_1.getGeometryObjects().setQuery(null);

    PartSurface partSurface_4 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("Convergent"));

    PartSurface partSurface_5 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("Divergent"));

    PartSurface partSurface_6 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("FlowStab"));

    surfaceCustomMeshControl_1.getGeometryObjects().setObjects(partSurface_4, partSurface_5, partSurface_6);

    SurfaceCustomMeshControl surfaceCustomMeshControl_2 = 
      autoMeshOperation_0.getCustomMeshControls().createSurfaceControl();

    surfaceCustomMeshControl_2.getGeometryObjects().setQuery(null);

    PartSurface partSurface_7 = 
      ((PartSurface) cadPart_0.getPartSurfaceManager().getPartSurface("Throat"));

    surfaceCustomMeshControl_2.getGeometryObjects().setObjects(partSurface_7);

    PartsCustomizePrismMesh partsCustomizePrismMesh_2 = 
      surfaceCustomMeshControl_2.getCustomConditions().get(PartsCustomizePrismMesh.class);

    partsCustomizePrismMesh_2.getCustomPrismOptions().setSelected(PartsCustomPrismsOption.Type.CUSTOMIZE);

    PartsCustomizePrismMeshControls partsCustomizePrismMeshControls_1 = 
      partsCustomizePrismMesh_2.getCustomPrismControls();

    partsCustomizePrismMeshControls_1.setCustomizeNumLayers(true);

    partsCustomizePrismMeshControls_1.setCustomizeTotalThickness(true);

    surfaceCustomMeshControl_2.getCustomConditions().get(PartsTargetSurfaceSizeOption.class).setSelected(PartsTargetSurfaceSizeOption.Type.CUSTOM);

    surfaceCustomMeshControl_2.getCustomConditions().get(PartsMinimumSurfaceSizeOption.class).setSelected(PartsMinimumSurfaceSizeOption.Type.CUSTOM);

    PartsTargetSurfaceSize partsTargetSurfaceSize_2 = 
      surfaceCustomMeshControl_2.getCustomValues().get(PartsTargetSurfaceSize.class);

    partsTargetSurfaceSize_2.getRelativeSizeScalar().setValueAndUnits(10.0, units_1);

    PartsMinimumSurfaceSize partsMinimumSurfaceSize_1 = 
      surfaceCustomMeshControl_2.getCustomValues().get(PartsMinimumSurfaceSize.class);

    partsMinimumSurfaceSize_1.getRelativeSizeScalar().setValueAndUnits(1.0, units_1);

    NumPrismLayers numPrismLayers_1 = 
      surfaceCustomMeshControl_2.getCustomValues().get(CustomPrismValuesManager.class).get(NumPrismLayers.class);

    IntegerValue integerValue_1 = 
      numPrismLayers_1.getNumLayersValue();

    integerValue_1.getQuantity().setValue(20.0);

    PrismThickness prismThickness_1 = 
      surfaceCustomMeshControl_2.getCustomValues().get(CustomPrismValuesManager.class).get(PrismThickness.class);

    prismThickness_1.getRelativeSizeScalar().setValueAndUnits(1.0, units_1);

    MeshPipelineController meshPipelineController_0 = 
      simulation_0.get(MeshPipelineController.class);

    meshPipelineController_0.generateVolumeMesh();

    hardcopyProperties_0.setCurrentResolutionWidth(469);

    hardcopyProperties_0.setCurrentResolutionWidth(589);

    hardcopyProperties_0.setCurrentResolutionWidth(624);

    hardcopyProperties_0.setCurrentResolutionWidth(629);

    hardcopyProperties_0.setCurrentResolutionWidth(717);

    hardcopyProperties_0.setCurrentResolutionWidth(749);

    hardcopyProperties_0.setCurrentResolutionWidth(800);

    hardcopyProperties_0.setCurrentResolutionWidth(815);

    hardcopyProperties_0.setCurrentResolutionWidth(833);

    hardcopyProperties_0.setCurrentResolutionWidth(836);

    simulation_0.getSceneManager().createGeometryScene("Mesh Scene", "Outline", "Mesh", 3, null);

    currentView_0.setInput(new DoubleVector(new double[] {9.479976788611271, 0.5113915323432203, -0.4991062721672961}), new DoubleVector(new double[] {7.734525514383433, 3.875216400417993, 46.886290149561866}), new DoubleVector(new double[] {0.1005495195213166, 0.9926893312346634, -0.06676590280159472}), 42.80925321792367, 0, 30.0);

    Scene scene_1 = 
      simulation_0.getSceneManager().getScene("Mesh Scene 1");

    scene_1.initializeAndWait();

    SceneUpdate sceneUpdate_1 = 
      scene_1.getSceneUpdate();

    HardcopyProperties hardcopyProperties_1 = 
      sceneUpdate_1.getHardcopyProperties();

    hardcopyProperties_1.setCurrentResolutionWidth(25);

    hardcopyProperties_1.setCurrentResolutionHeight(25);

    hardcopyProperties_0.setCurrentResolutionWidth(838);

    hardcopyProperties_0.setCurrentResolutionHeight(649);

    hardcopyProperties_1.setCurrentResolutionWidth(836);

    hardcopyProperties_1.setCurrentResolutionHeight(648);

    scene_1.resetCamera();

    CurrentView currentView_1 = 
      scene_1.getCurrentView();

    currentView_1.setInput(new DoubleVector(new double[] {17.49573417886773, 1.1667373891452975, -2.108307354809284}), new DoubleVector(new double[] {17.49573417886773, 1.1667373891452975, 84.21759260860897}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.392640715160869, -0.0799331822236489, -0.4470159929862305}), new DoubleVector(new double[] {5.392640715160869, -0.0799331822236489, 21.406980787836257}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    SurfaceGrowthRate surfaceGrowthRate_0 = 
      autoMeshOperation_0.getDefaultValues().get(SurfaceGrowthRate.class);

    surfaceGrowthRate_0.setGrowthRateOption(SurfaceGrowthRate.GrowthRateOption.USER_SPECIFIED);

    surfaceGrowthRate_0.getGrowthRateScalar().setValueAndUnits(1.07, units_1);

    currentView_1.setInput(new DoubleVector(new double[] {3.2695158403320046, 0.13801655612658378, -0.31593281268091644}), new DoubleVector(new double[] {3.2695158403320046, 0.13801655612658378, 11.376546055132083}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.3646640969766943, 0.14413818416884483, -2.098793885484131}), new DoubleVector(new double[] {1.3646640969766943, 0.14413818416884483, 4.489358598541494}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.5260770506192566, 0.08202360615453098, -0.0414157507383035}), new DoubleVector(new double[] {0.5260770506192566, 0.08202360615453098, 1.267739535498751}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.34335552367914873, 0.064706860137331, -0.019513049375766922}), new DoubleVector(new double[] {0.34335552367914873, 0.064706860137331, 0.5457002178994808}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.5106697878075369, 0.06847887169933477, -0.02980117579904107}), new DoubleVector(new double[] {0.5106697878075369, 0.06847887169933477, 1.2867764391332877}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.786317002700632, 0.07453705224644007, -0.05821508632403383}), new DoubleVector(new double[] {0.786317002700632, 0.07453705224644007, 2.507686069706501}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.0491158552893334, 0.0803128512044375, -0.08538582428524988}), new DoubleVector(new double[] {1.0491158552893334, 0.0803128512044375, 3.671687128645204}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.5690773855829778, 0.05179571439019641, -0.061346459981757695}), new DoubleVector(new double[] {0.5690773855829778, 0.05179571439019641, 1.7559938660568661}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.38937283800289035, 0.017847406411104993, -0.018650468356252947}), new DoubleVector(new double[] {0.38937283800289035, 0.017847406411104993, 0.8398743159511678}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.2315647211851173, 0.18644100134345573, -0.0937785902569237}), new DoubleVector(new double[] {1.2315647211851173, 0.18644100134345573, 5.136774479976}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    meshPipelineController_0.generateVolumeMesh();

    currentView_1.setInput(new DoubleVector(new double[] {2.971357850491973, 0.3931490959145576, -0.08412003425094028}), new DoubleVector(new double[] {2.971357850491973, 0.3931490959145576, 25.965792484404457}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.016497112238017, 0.4191615518360067, -0.047870621981086714}), new DoubleVector(new double[] {3.016497112238017, 0.4191615518360067, 26.890905940570097}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.159545568744033, 2.2304098149072704, -0.13271409362145903}), new DoubleVector(new double[] {6.159545568744033, 2.2304098149072704, 91.30658993764416}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {8.227177107614725, 3.4219262949344493, -0.1943054411406422}), new DoubleVector(new double[] {8.227177107614725, 3.4219262949344493, 133.6819785685714}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {28.679943082096933, 3.2008153114265334, -4.210645187185946E-6}), new DoubleVector(new double[] {28.679943082096933, 3.2008153114265334, 133.6819785685714}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {14.872921602552902, 1.7526208280035636, -1.0727181377052304}), new DoubleVector(new double[] {14.872921602552902, 1.7526208280035636, 57.54570609876016}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {9.191872337648142, 1.1581855324879384, -0.8188976179608822}), new DoubleVector(new double[] {9.191872337648142, 1.1581855324879384, 30.58214668568572}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.700087724270357, 0.6615931146348026, -0.39787046278507}), new DoubleVector(new double[] {5.700087724270357, 0.6615931146348026, 14.627345529339053}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.8936136013350704, 0.3349775917069898, -3.1839482730333657E-6}), new DoubleVector(new double[] {2.8936136013350704, 0.3349775917069898, 14.627345529339053}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.3257723357131468, 0.01714822868197637, -0.0073658776223670674}), new DoubleVector(new double[] {0.3257723357131468, 0.01714822868197637, 0.9448165242801845}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.5387656843503, 0.1262394500936741, -0.125049236143834}), new DoubleVector(new double[] {2.5387656843503, 0.1262394500936741, 19.789303643380098}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.957558834851254, 0.19617995751273518, -0.2013921951813451}), new DoubleVector(new double[] {3.957558834851254, 0.19617995751273518, 31.87087147355256}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.282632285408627, 1.4964737597422313, -0.055949246422443366}), new DoubleVector(new double[] {4.282632285408627, 1.4964737597422313, 62.107314958912475}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.916108454520585, 4.030378436190068, -0.10902823878987533}), new DoubleVector(new double[] {4.916108454520585, 4.030378436190068, 121.02958730639062}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.091105911279426, 0.7669886476162214, -0.020881120452063584}), new DoubleVector(new double[] {2.091105911279426, 0.7669886476162214, 19.704684086740805}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.9851177120382548, 0.5329313742919682, -0.018671944171726906}), new DoubleVector(new double[] {1.9851177120382548, 0.5329313742919682, 14.364713935035217}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.028421665348622, 0.3428565879375156, -3.4531952923799736E-6}), new DoubleVector(new double[] {4.028421665348622, 0.3428565879375156, 14.364713935035217}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.926679053388634, 0.7094922565252761, -0.08927127343570973}), new DoubleVector(new double[] {4.926679053388634, 0.7094922565252761, 25.447967773630918}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.883375065773576, 1.5081436901517837, -0.17396582248257175}), new DoubleVector(new double[] {6.883375065773576, 1.5081436901517837, 49.590890369068894}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    PhysicsContinuum physicsContinuum_0 = 
      ((PhysicsContinuum) simulation_0.getContinuumManager().getContinuum("Physics 1"));

    physicsContinuum_0.enable(SteadyModel.class);

    physicsContinuum_0.enable(SingleComponentGasModel.class);

    physicsContinuum_0.enable(CoupledFlowModel.class);

    physicsContinuum_0.enable(RealGasModel.class);

    physicsContinuum_0.enable(CoupledEnergyModel.class);

    RealGasModel realGasModel_0 = 
      physicsContinuum_0.getModelManager().getModel(RealGasModel.class);

    physicsContinuum_0.disableModel(realGasModel_0);

    SteadyModel steadyModel_0 = 
      physicsContinuum_0.getModelManager().getModel(SteadyModel.class);

    physicsContinuum_0.disableModel(steadyModel_0);

    GradientsModel gradientsModel_0 = 
      physicsContinuum_0.getModelManager().getModel(GradientsModel.class);

    physicsContinuum_0.disableModel(gradientsModel_0);

    CoupledEnergyModel coupledEnergyModel_0 = 
      physicsContinuum_0.getModelManager().getModel(CoupledEnergyModel.class);

    physicsContinuum_0.disableModel(coupledEnergyModel_0);

    CoupledFlowModel coupledFlowModel_0 = 
      physicsContinuum_0.getModelManager().getModel(CoupledFlowModel.class);

    physicsContinuum_0.disableModel(coupledFlowModel_0);

    SingleComponentGasModel singleComponentGasModel_0 = 
      physicsContinuum_0.getModelManager().getModel(SingleComponentGasModel.class);

    physicsContinuum_0.disableModel(singleComponentGasModel_0);

    physicsContinuum_0.enable(MultiComponentGasModel.class);

    physicsContinuum_0.enable(SteadyModel.class);

    physicsContinuum_0.enable(NonReactingModel.class);

    physicsContinuum_0.enable(CoupledSpeciesModel.class);

    physicsContinuum_0.enable(CoupledFlowModel.class);

    physicsContinuum_0.enable(TurbulentModel.class);

    physicsContinuum_0.enable(RansTurbulenceModel.class);

    physicsContinuum_0.enable(KOmegaTurbulence.class);

    physicsContinuum_0.enable(SstKwTurbModel.class);

    physicsContinuum_0.enable(KwAllYplusWallTreatment.class);

    physicsContinuum_0.enable(RealGasModel.class);

    physicsContinuum_0.enable(CoupledEnergyModel.class);

    physicsContinuum_0.enable(RedlichKwongEosModel.class);

    physicsContinuum_0.enable(AmrModel.class);

    star.material.MaterialDataBase materialMaterialDataBase_0 = 
      simulation_0.get(MaterialDataBaseManager.class).getMatlDataBase("Standard");

    star.material.DataBaseMaterialManager materialDataBaseMaterialManager_0 = 
      materialMaterialDataBase_0.getFolder("Gases");

    star.material.DataBaseGas materialDataBaseGas_0 = 
      materialDataBaseMaterialManager_0.addGas();

    materialDataBaseGas_0.setTitle("");

    hardcopyProperties_1.setCurrentResolutionWidth(1397);

    hardcopyProperties_1.setCurrentResolutionHeight(649);

    materialDataBaseGas_0.setTitle("Methalox");

    materialDataBaseGas_0.setSymbol("CH4O2");

    star.material.DataBaseGas materialDataBaseGas_1 = 
      materialDataBaseMaterialManager_0.addGas();

    materialDataBaseGas_1.setTitle("Mars");

    materialDataBaseGas_1.setSymbol("Mars");

    MultiComponentGasModel multiComponentGasModel_0 = 
      physicsContinuum_0.getModelManager().getModel(MultiComponentGasModel.class);

    GasMixture gasMixture_0 = 
      ((GasMixture) multiComponentGasModel_0.getMixture());

    gasMixture_0.getComponents().addComponents(new ArrayList<>(Arrays.<DataBaseMaterial>asList(materialDataBaseGas_0, materialDataBaseGas_1)));

    coupledFlowModel_0.getUpwindOption().setSelected(FlowUpwindOption.Type.MUSCL_3RD_ORDER);

    coupledFlowModel_0.setPositivityRate(0.05);

    coupledFlowModel_0.setUnsteadyPreconditioningEnabled(false);

    coupledFlowModel_0.getCoupledInviscidFluxOption().setSelected(CoupledInviscidFluxOption.Type.AUSM_SCHEME);

    Units units_2 = 
      ((Units) simulation_0.getUnitsManager().getObject("Pa"));

    physicsContinuum_0.getReferenceValues().get(MinimumAllowableAbsolutePressure.class).setValueAndUnits(0.0, units_2);

    physicsContinuum_0.getReferenceValues().get(ReferencePressure.class).setValueAndUnits(0.0, units_2);

    physicsContinuum_0.getReferenceValues().get(ReferencePressure.class).setValueAndUnits(0.001, units_2);

    physicsContinuum_0.getReferenceValues().get(MinimumAllowableAbsolutePressure.class).setValueAndUnits(10.0, units_2);

    Units units_3 = 
      ((Units) simulation_0.getUnitsManager().getObject("K"));

    physicsContinuum_0.getReferenceValues().get(MaximumAllowableTemperature.class).setValueAndUnits(10000.0, units_3);

    InitialPressureProfile initialPressureProfile_0 = 
      physicsContinuum_0.getInitialConditions().get(InitialPressureProfile.class);

    initialPressureProfile_0.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValueAndUnits(500.0, units_2);
  }

  private void execute1() {

    Simulation simulation_0 = 
      getActiveSimulation();

    PhysicsContinuum physicsContinuum_0 = 
      ((PhysicsContinuum) simulation_0.getContinuumManager().getContinuum("Physics 1"));

    MassFractionProfile massFractionProfile_0 = 
      physicsContinuum_0.getInitialConditions().get(MassFractionProfile.class);

    massFractionProfile_0.getMethod(ConstantArrayProfileMethod.class).getQuantity().setArray(new DoubleVector(new double[] {0.0, 1.0}));

    StaticTemperatureProfile staticTemperatureProfile_0 = 
      physicsContinuum_0.getInitialConditions().get(StaticTemperatureProfile.class);

    Units units_3 = 
      ((Units) simulation_0.getUnitsManager().getObject("K"));

    staticTemperatureProfile_0.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValueAndUnits(200.0, units_3);

    VelocityProfile velocityProfile_0 = 
      physicsContinuum_0.getInitialConditions().get(VelocityProfile.class);

    Units units_4 = 
      ((Units) simulation_0.getUnitsManager().getObject("m/s"));

    velocityProfile_0.getMethod(ConstantVectorProfileMethod.class).getQuantity().setComponentsAndUnits(20.0, 0.0, 0.0, units_4);

    Region region_0 = 
      simulation_0.getRegionManager().getRegion("Nozzle");

    Boundary boundary_1 = 
      region_0.getBoundaryManager().getBoundary("Freestream");

    MachNumberProfile machNumberProfile_0 = 
      boundary_1.getValues().get(MachNumberProfile.class);

    Units units_1 = 
      ((Units) simulation_0.getUnitsManager().getObject(""));

    machNumberProfile_0.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValueAndUnits(0.05, units_1);

    StaticPressureProfile staticPressureProfile_0 = 
      boundary_1.getValues().get(StaticPressureProfile.class);

    Units units_2 = 
      ((Units) simulation_0.getUnitsManager().getObject("Pa"));

    staticPressureProfile_0.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValueAndUnits(500.0, units_2);

    MassFractionProfile massFractionProfile_1 = 
      boundary_1.getValues().get(MassFractionProfile.class);

    massFractionProfile_1.getMethod(ConstantArrayProfileMethod.class).getQuantity().setArray(new DoubleVector(new double[] {0.0, 1.0}));

    StaticTemperatureProfile staticTemperatureProfile_1 = 
      boundary_1.getValues().get(StaticTemperatureProfile.class);

    staticTemperatureProfile_1.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValueAndUnits(200.0, units_3);

    Boundary boundary_0 = 
      region_0.getBoundaryManager().getBoundary("Inlet");

    MassFractionProfile massFractionProfile_2 = 
      boundary_0.getValues().get(MassFractionProfile.class);

    massFractionProfile_2.getMethod(ConstantArrayProfileMethod.class).getQuantity().setArray(new DoubleVector(new double[] {1.0, 0.0}));

    SupersonicPressureProfile supersonicPressureProfile_0 = 
      boundary_0.getValues().get(SupersonicPressureProfile.class);

    supersonicPressureProfile_0.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValueAndUnits(5.0, units_2);

    TotalPressureProfile totalPressureProfile_0 = 
      boundary_0.getValues().get(TotalPressureProfile.class);

    totalPressureProfile_0.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValueAndUnits(9000000.0, units_2);

    Units units_5 = 
      ((Units) simulation_0.getUnitsManager().getObject("bar"));

    totalPressureProfile_0.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValueAndUnits(90.0, units_5);

    TotalTemperatureProfile totalTemperatureProfile_0 = 
      boundary_0.getValues().get(TotalTemperatureProfile.class);

    totalTemperatureProfile_0.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValueAndUnits(3500.0, units_3);

    region_0.getConditions().get(InitialConditionOption.class).setSelected(InitialConditionOption.Type.REGION);

    InitialPressureProfile initialPressureProfile_1 = 
      region_0.get(RegionInitialConditionManager.class).get(InitialPressureProfile.class);

    initialPressureProfile_1.setMethod(FunctionScalarProfileMethod.class);

    MassFractionProfile massFractionProfile_3 = 
      region_0.get(RegionInitialConditionManager.class).get(MassFractionProfile.class);

    massFractionProfile_3.setMethod(CompositeArrayProfileMethod.class);

    StaticTemperatureProfile staticTemperatureProfile_2 = 
      region_0.get(RegionInitialConditionManager.class).get(StaticTemperatureProfile.class);

    staticTemperatureProfile_2.setMethod(FunctionScalarProfileMethod.class);

    VelocityProfile velocityProfile_1 = 
      region_0.get(RegionInitialConditionManager.class).get(VelocityProfile.class);

    velocityProfile_1.getMethod(ConstantVectorProfileMethod.class).getQuantity().setComponentsAndUnits(20.0, 0.0, 0.0, units_4);

    UserFieldFunction userFieldFunction_0 = 
      simulation_0.getFieldFunctionManager().createFieldFunction();

    userFieldFunction_0.getTypeOption().setSelected(FieldFunctionTypeOption.Type.SCALAR);

    userFieldFunction_0.setPresentationName("Pressure Inlet");

    UserFieldFunction userFieldFunction_1 = 
      simulation_0.getFieldFunctionManager().createFieldFunction();

    userFieldFunction_1.getTypeOption().setSelected(FieldFunctionTypeOption.Type.SCALAR);

    userFieldFunction_1.setPresentationName("Temperature Inlet");

    UserFieldFunction userFieldFunction_2 = 
      simulation_0.getFieldFunctionManager().createFieldFunction();

    userFieldFunction_2.getTypeOption().setSelected(FieldFunctionTypeOption.Type.SCALAR);

    userFieldFunction_2.setPresentationName("Methalox Inlet");

    UserFieldFunction userFieldFunction_3 = 
      simulation_0.getFieldFunctionManager().createFieldFunction();

    userFieldFunction_3.getTypeOption().setSelected(FieldFunctionTypeOption.Type.SCALAR);

    userFieldFunction_3.setPresentationName("Isp");

    UserFieldFunction userFieldFunction_4 = 
      simulation_0.getFieldFunctionManager().createFieldFunction();

    userFieldFunction_4.getTypeOption().setSelected(FieldFunctionTypeOption.Type.SCALAR);

    userFieldFunction_4.setPresentationName("Adaptive Mesh");

    MultiComponentGasModel multiComponentGasModel_0 = 
      physicsContinuum_0.getModelManager().getModel(MultiComponentGasModel.class);

    GasMixture gasMixture_0 = 
      ((GasMixture) multiComponentGasModel_0.getMixture());

    GasComponent gasComponent_0 = 
      ((GasComponent) gasMixture_0.getComponents().getComponent("Mars"));

    ConstantMaterialPropertyMethod constantMaterialPropertyMethod_0 = 
      ((ConstantMaterialPropertyMethod) gasComponent_0.getMaterialProperties().getMaterialProperty(CriticalPressureProperty.class).getMethod());

    Units units_6 = 
      ((Units) simulation_0.getUnitsManager().getObject("MPa"));

    constantMaterialPropertyMethod_0.getQuantity().setValueAndUnits(7.38, units_6);

    ConstantMaterialPropertyMethod constantMaterialPropertyMethod_1 = 
      ((ConstantMaterialPropertyMethod) gasComponent_0.getMaterialProperties().getMaterialProperty(CriticalTemperatureProperty.class).getMethod());

    constantMaterialPropertyMethod_1.getQuantity().setValueAndUnits(304.0, units_3);

    ConstantMaterialPropertyMethod constantMaterialPropertyMethod_2 = 
      ((ConstantMaterialPropertyMethod) gasComponent_0.getMaterialProperties().getMaterialProperty(DynamicViscosityProperty.class).getMethod());

    Units units_7 = 
      ((Units) simulation_0.getUnitsManager().getObject("Pa-s"));

    constantMaterialPropertyMethod_2.getQuantity().setValueAndUnits(1.35E-5, units_7);

    ConstantMaterialPropertyMethod constantMaterialPropertyMethod_3 = 
      ((ConstantMaterialPropertyMethod) gasComponent_0.getMaterialProperties().getMaterialProperty(MolecularWeightProperty.class).getMethod());

    Units units_8 = 
      ((Units) simulation_0.getUnitsManager().getObject("kg/kmol"));

    constantMaterialPropertyMethod_3.getQuantity().setValueAndUnits(43.0, units_8);

    ConstantSpecificHeat constantSpecificHeat_0 = 
      ((ConstantSpecificHeat) gasComponent_0.getMaterialProperties().getMaterialProperty(SpecificHeatProperty.class).getMethod());

    Units units_9 = 
      ((Units) simulation_0.getUnitsManager().getObject("J/kg-K"));

    constantSpecificHeat_0.getQuantity().setValueAndUnits(730.0, units_9);

    constantMaterialPropertyMethod_2.getQuantity().setValueAndUnits(1.3E-5, units_7);

    GasComponent gasComponent_1 = 
      ((GasComponent) gasMixture_0.getComponents().getComponent("CH4O2"));

    ConstantMaterialPropertyMethod constantMaterialPropertyMethod_4 = 
      ((ConstantMaterialPropertyMethod) gasComponent_1.getMaterialProperties().getMaterialProperty(CriticalPressureProperty.class).getMethod());

    constantMaterialPropertyMethod_4.getQuantity().setValueAndUnits(8.0, units_6);

    ConstantMaterialPropertyMethod constantMaterialPropertyMethod_5 = 
      ((ConstantMaterialPropertyMethod) gasComponent_1.getMaterialProperties().getMaterialProperty(CriticalTemperatureProperty.class).getMethod());

    constantMaterialPropertyMethod_5.getQuantity().setValueAndUnits(1500.0, units_3);

    ConstantMaterialPropertyMethod constantMaterialPropertyMethod_6 = 
      ((ConstantMaterialPropertyMethod) gasComponent_1.getMaterialProperties().getMaterialProperty(DynamicViscosityProperty.class).getMethod());

    constantMaterialPropertyMethod_6.getQuantity().setValueAndUnits(4.0E-5, units_7);

    ConstantMaterialPropertyMethod constantMaterialPropertyMethod_7 = 
      ((ConstantMaterialPropertyMethod) gasComponent_1.getMaterialProperties().getMaterialProperty(MolecularWeightProperty.class).getMethod());

    constantMaterialPropertyMethod_7.getQuantity().setValueAndUnits(22.1, units_8);

    ConstantSpecificHeat constantSpecificHeat_1 = 
      ((ConstantSpecificHeat) gasComponent_1.getMaterialProperties().getMaterialProperty(SpecificHeatProperty.class).getMethod());

    constantSpecificHeat_1.getQuantity().setValueAndUnits(2800.0, units_9);

    userFieldFunction_2.setDefinition("(($$Position[0] > -2.2007383216932266 && $$Position[0] < -0.7388313921205055) &&  ($$Position[1] > -0.625 && $$Position[1] < 0.625) &&  ($$Position[2] > -0.6211526079148225 && $$Position[2] < 0.0)) ? 1.0 : 0.0 ");

    userFieldFunction_2.setSyncName(true);

    userFieldFunction_0.setDefinition("(($$Position[0] > -2.2007383216932266 && $$Position[0] < -0.7388313921205055) &&  ($$Position[1] > -0.625 && $$Position[1] < 0.625) &&  ($$Position[2] > -0.625 && $$Position[2] < -0.0001)) ? 9000000 : 500.0 ");

    userFieldFunction_0.setSyncName(true);

    userFieldFunction_1.setDefinition("(($$Position[0] > -2.2007383216932266 && $$Position[0] < -0.7388313921205055) &&  ($$Position[1] > -0.625 && $$Position[1] < 0.625) &&  ($$Position[2] > -0.625 && $$Position[2] < -0.0001)) ? 3500.0 : 200.0 ");

    userFieldFunction_1.setIgnoreBoundaryValues(true);

    userFieldFunction_1.setIgnoreBoundaryValues(false);

    userFieldFunction_1.setSyncName(true);

    Units units_0 = 
      simulation_0.getUnitsManager().getPreferredUnits(Dimensions.Builder().length(1).build());

    userFieldFunction_4.setDefinition("abs(div($${Velocity}))*${AdaptionCellSize}");

    userFieldFunction_4.setDefinition("(($$Position[0] > 2.5 && $$Position[0] < 7) &&  ($$Position[1] > -3.5 && $$Position[1] < 3.5) &&  ($$Position[2] > -3.5 && $$Position[2] < 0.0001)) ? abs(div($${Velocity}))*${AdaptionCellSize} : 0");

    initialPressureProfile_1.getMethod(FunctionScalarProfileMethod.class).setFieldFunction(userFieldFunction_0);

    staticTemperatureProfile_2.getMethod(FunctionScalarProfileMethod.class).setFieldFunction(userFieldFunction_1);

    ScalarProfile scalarProfile_0 = 
      massFractionProfile_3.getMethod(CompositeArrayProfileMethod.class).getProfile(0);

    scalarProfile_0.setMethod(FunctionScalarProfileMethod.class);

    scalarProfile_0.getMethod(FunctionScalarProfileMethod.class).setFieldFunction(userFieldFunction_2);

    AmrModel amrModel_0 = 
      physicsContinuum_0.getModelManager().getModel(AmrModel.class);

    UserDefinedAmrCriterion userDefinedAmrCriterion_0 = 
      amrModel_0.getCriterionManager().create("star.amr.UserDefinedAmrCriterion");

    AmrRequestProfile amrRequestProfile_0 = 
      userDefinedAmrCriterion_0.getAmrRequestProfile();

    amrRequestProfile_0.getMethod(AmrFunctionProfileMethod.class).setFieldFunction(userFieldFunction_4);

    userDefinedAmrCriterion_0.setMaxRefinementLevel(3);

    Scene scene_1 = 
      simulation_0.getSceneManager().getScene("Mesh Scene 1");

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_1.getCreatorGroup().setQuery(null);

    scene_1.getCreatorGroup().setObjects(region_0);

    CurrentView currentView_1 = 
      scene_1.getCurrentView();

    currentView_1.setInput(new DoubleVector(new double[] {6.894698938275582, 1.4837685747661062, -0.7224248513401176}), new DoubleVector(new double[] {4.84466224931028, 5.896559413725383, 48.80398742141942}), new DoubleVector(new double[] {0.0018308011119858667, 0.9960591230301323, -0.08867283459849755}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.418854233942272, 0.559037580588869, -1.286056449895753}), new DoubleVector(new double[] {4.421210580663788, 2.706507817306996, 22.81581018474987}), new DoubleVector(new double[] {0.0018308011119858667, 0.9960591230301323, -0.08867283459849755}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.0698951197832995, 0.3025081940764798, -1.403896016285005}), new DoubleVector(new double[] {4.482601947335061, 1.5666816330752509, 12.784398242160165}), new DoubleVector(new double[] {0.0018308011119858667, 0.9960591230301323, -0.08867283459849755}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.824246143690286, 0.28035074809468774, 0.017026127869685936}), new DoubleVector(new double[] {4.481388575555693, 1.0183661913674682, 8.300051188674843}), new DoubleVector(new double[] {0.0018308011119858667, 0.9960591230301323, -0.08867283459849755}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.823004754904301, 0.28402527365802355, 0.04131988799956343}), new DoubleVector(new double[] {4.326686769220798, 2.0331015044810634, 8.16306964375072}), new DoubleVector(new double[] {0.008039983774624976, 0.9776567337419733, -0.2100539683745085}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.823735279597124, 0.2823444677999447, 0.028632707605846384}), new DoubleVector(new double[] {4.3756846099724465, 0.6790208515011666, 8.330137510661192}), new DoubleVector(new double[] {-0.0012900187210341865, 0.9988561587286917, -0.04779864037275946}), 42.805059643573344, 0, 30.0);

    scene_1.getCreatorGroup().setQuery(null);

    scene_1.getCreatorGroup().setObjects(region_0);

    PartDisplayer partDisplayer_2 = 
      scene_1.getDisplayerManager().createPartDisplayer("Section Surface", -1, 1);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    PlaneSection planeSection_0 = 
      (PlaneSection) simulation_0.getPartManager().createImplicitPart(new ArrayList<>(Collections.<NamedObject>emptyList()), new DoubleVector(new double[] {0.0, 0.0, 1.0}), new DoubleVector(new double[] {0.0, 0.0, 0.0}), 0, 1, new DoubleVector(new double[] {0.0}), null);

    LabCoordinateSystem labCoordinateSystem_0 = 
      simulation_0.getCoordinateSystemManager().getLabCoordinateSystem();

    planeSection_0.setCoordinateSystem(labCoordinateSystem_0);

    planeSection_0.getInputParts().setQuery(null);

    planeSection_0.getInputParts().setObjects(region_0);

    planeSection_0.getOriginCoordinate().setUnits0(units_0);

    planeSection_0.getOriginCoordinate().setUnits1(units_0);

    planeSection_0.getOriginCoordinate().setUnits2(units_0);

    planeSection_0.getOriginCoordinate().setDefinition("");

    planeSection_0.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.393610823233956, 0.0, 0.0}));

    planeSection_0.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.393610823233956, 0.0, 0.0}));

    planeSection_0.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    planeSection_0.getOrientationCoordinate().setUnits0(units_0);

    planeSection_0.getOrientationCoordinate().setUnits1(units_0);

    planeSection_0.getOrientationCoordinate().setUnits2(units_0);

    planeSection_0.getOrientationCoordinate().setDefinition("");

    planeSection_0.getOrientationCoordinate().setValue(new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    planeSection_0.getOrientationCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    planeSection_0.getOrientationCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    SingleValue singleValue_0 = 
      planeSection_0.getSingleValue();

    singleValue_0.getValueQuantity().setValue(0.0);

    singleValue_0.getValueQuantity().setUnits(units_0);

    RangeMultiValue rangeMultiValue_0 = 
      planeSection_0.getRangeMultiValue();

    rangeMultiValue_0.setNValues(2);

    rangeMultiValue_0.getStartQuantity().setValue(0.0);

    rangeMultiValue_0.getStartQuantity().setUnits(units_0);

    rangeMultiValue_0.getEndQuantity().setValue(1.0);

    rangeMultiValue_0.getEndQuantity().setUnits(units_0);

    DeltaMultiValue deltaMultiValue_0 = 
      planeSection_0.getDeltaMultiValue();

    deltaMultiValue_0.setNValues(2);

    deltaMultiValue_0.getStartQuantity().setValue(0.0);

    deltaMultiValue_0.getStartQuantity().setUnits(units_0);

    deltaMultiValue_0.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_0.getDeltaQuantity().setUnits(units_0);

    MultiValue multiValue_0 = 
      planeSection_0.getArbitraryMultiValue();

    multiValue_0.getValueQuantities().setUnits(units_0);

    multiValue_0.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    planeSection_0.setValueMode(ValueMode.SINGLE);

    partDisplayer_2.getVisibleParts().addParts(planeSection_0);

    partDisplayer_2.getHiddenParts().addParts();

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    SceneUpdate sceneUpdate_1 = 
      scene_1.getSceneUpdate();

    HardcopyProperties hardcopyProperties_1 = 
      sceneUpdate_1.getHardcopyProperties();

    hardcopyProperties_1.setCurrentResolutionWidth(886);

    FvRepresentation fvRepresentation_0 = 
      ((FvRepresentation) simulation_0.getRepresentationManager().getObject("Volume Mesh"));

    simulation_0.getDataSourceManager().getPartExtents(new ArrayList<>(Arrays.<NamedObject>asList(region_0)), fvRepresentation_0);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_1.getCreatorGroup().setQuery(null);

    scene_1.getCreatorGroup().setObjects(region_0);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    currentView_1.setInput(new DoubleVector(new double[] {6.698432100961438, 0.24970399681372368, -2.086480298858561}), new DoubleVector(new double[] {5.756699103402598, 1.0834562155006815, 15.361994912615216}), new DoubleVector(new double[] {-0.0012900187210341865, 0.9988561587286917, -0.04779864037275946}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {10.638016030368789, 0.18135349450205585, -6.526438508580327}), new DoubleVector(new double[] {8.659038977341858, 1.9334175221710987, 30.140145484255065}), new DoubleVector(new double[] {-0.0012900187210341865, 0.9988561587286917, -0.04779864037275946}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {15.45319152227275, 0.09781228464406144, -11.953188420771127}), new DoubleVector(new double[] {12.206438353889531, 2.972286965562615, 48.20281367659509}), new DoubleVector(new double[] {-0.0012900187210341865, 0.9988561587286917, -0.04779864037275946}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {14.909709344754855, -0.11906971564491275, -16.470739920950468}), new DoubleVector(new double[] {32.331935070030255, 2.66331950910139, 41.20311009386148}), new DoubleVector(new double[] {-0.001290018721034269, 0.9988561587286927, -0.047798640372760014}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.127039926015165, -0.23274727388780336, -10.568840140121182}), new DoubleVector(new double[] {20.82024379827578, 2.4332146596261177, 44.6916846387941}), new DoubleVector(new double[] {-0.001290018721034269, 0.9988561587286927, -0.047798640372760014}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.0901988905077844, -0.38665312217909253, -12.609746596035627}), new DoubleVector(new double[] {37.805494161579155, 4.578321991628629, 33.32165120279621}), new DoubleVector(new double[] {-0.02289327952586824, 0.9956494297643045, -0.09032226061490449}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.584468245960461, -0.2875830231140166, -11.903605185775554}), new DoubleVector(new double[] {34.61349896773252, 7.951446330157889, 36.13959243738607}), new DoubleVector(new double[] {-0.054005749533751986, 0.989400747410725, -0.1347944362368784}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.054020515623755, 0.10050178449566971, -6.828345205488821}), new DoubleVector(new double[] {4.631610834738888, -0.055904838810494795, 50.94685798595116}), new DoubleVector(new double[] {-0.014267602812334015, 0.9998948255663905, 0.002602559428116828}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.007320795486787, -0.111740374158693, -6.8371820171547455}), new DoubleVector(new double[] {4.805242260404033, -0.18656446732043228, 20.802166590049257}), new DoubleVector(new double[] {-0.014267602812334015, 0.9998948255663905, 0.002602559428116828}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.984970138646259, -0.21327861436477732, -6.840045391654001}), new DoubleVector(new double[] {4.888305815452879, -0.24907074004045066, 6.3812446653386194}), new DoubleVector(new double[] {-0.014267602812334015, 0.9998948255663905, 0.002602559428116828}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.982922487619561, -0.21376820391370954, -6.86084609858466}), new DoubleVector(new double[] {7.575642256241892, 0.4180989972629772, 6.088103140248813}), new DoubleVector(new double[] {-0.01880540530506965, 0.9988111662778776, -0.04497344605399545}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {14.828984406161334, 0.0957022776923977, -18.21153717321438}), new DoubleVector(new double[] {30.3810918687935, 3.8858791929685372, 59.46112630846778}), new DoubleVector(new double[] {-0.01880540530506965, 0.9988111662778776, -0.04497344605399545}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.5589489076004135, -1.4931083882256857, -14.462074719508543}), new DoubleVector(new double[] {9.540495185817944, -0.27906445550170944, 10.417509517940466}), new DoubleVector(new double[] {-0.01880540530506965, 0.9988111662778776, -0.04497344605399545}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.642289080550048, -1.4744131003450387, -14.038725204550985}), new DoubleVector(new double[] {9.855601958464383, 0.22023057848307204, 10.12917629999147}), new DoubleVector(new double[] {-0.02296955929357082, 0.9976210015675764, -0.06499797363921712}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.152128766367607, -1.575744969319917, -15.42079958607091}), new DoubleVector(new double[] {14.56650673030397, 0.11066200229973955, 6.782682447692828}), new DoubleVector(new double[] {-0.022969559293571074, 0.9976210015675769, -0.06499797363921805}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.2663786254490623, -1.527264183249683, -12.48071340410312}), new DoubleVector(new double[] {11.072253223759738, 0.06060744409893637, 8.425437805588256}), new DoubleVector(new double[] {-0.022969559293571074, 0.9976210015675769, -0.06499797363921805}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.8268781347427523, -1.586657433545768, -13.236995769746711}), new DoubleVector(new double[] {14.138067239401897, -0.050533571346855766, 5.636166112813475}), new DoubleVector(new double[] {-0.022969559293570006, 0.9976210015675798, -0.06499797363921658}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-1.5780341478293614, -0.9983223904486822, -11.591065165873053}), new DoubleVector(new double[] {11.734262399733428, 0.5379292717128736, 7.283666895657015}), new DoubleVector(new double[] {-0.022969559293570006, 0.9976210015675798, -0.06499797363921658}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-0.7799855018824364, -1.0546405352427664, -12.1493428334433}), new DoubleVector(new double[] {12.532311045697782, 0.48161112692080055, 6.725389228111474}), new DoubleVector(new double[] {-0.022969559293570006, 0.9976210015675798, -0.06499797363921658}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-0.44105204287883604, -1.030820562203992, -11.903517428704113}), new DoubleVector(new double[] {21.66164863930497, -0.07813447936298124, -5.092068925196116}), new DoubleVector(new double[] {-0.022969559293568496, 0.9976210015675827, -0.06499797363921692}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-2.61811927705038, -0.2827302303244026, -4.945510135957058}), new DoubleVector(new double[] {19.485087196480034, 0.6699776534894242, 1.8660942386257204}), new DoubleVector(new double[] {-0.022969559293568496, 0.9976210015675827, -0.06499797363921692}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-2.259970448704221, -0.2706057484708544, -4.866707934444197}), new DoubleVector(new double[] {20.673303558056865, 0.30131508936791196, -1.7690971189354814}), new DoubleVector(new double[] {-0.016303565076879453, 0.9978466667646154, -0.06353127885213314}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-3.514307683240185, -0.2653120699449223, -3.4162360971135906}), new DoubleVector(new double[] {8.198085327472791, 0.026777128562409734, -1.8342362808301769}), new DoubleVector(new double[] {-0.016303565076879453, 0.9978466667646154, -0.06353127885213314}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-3.976675916321474, -0.24908796350428414, -2.908743943130269}), new DoubleVector(new double[] {4.035760088344308, -0.049270043412850004, -1.8264994969466568}), new DoubleVector(new double[] {-0.016303565076879453, 0.9978466667646154, -0.06353127885213314}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-4.037249027656622, -0.256040969484024, -3.0286850568010992}), new DoubleVector(new double[] {4.851943508229328, -0.03435808018809605, -1.8280165900055663}), new DoubleVector(new double[] {-0.016303565076879453, 0.9978466667646154, -0.06353127885213314}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-4.104389555732075, -0.26375324811459055, -3.1617416142223416}), new DoubleVector(new double[] {5.75743121977974, -0.01781449558917029, -1.8296996787434425}), new DoubleVector(new double[] {-0.016303565076879453, 0.9978466667646154, -0.06353127885213314}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-4.179143978739318, -0.27231623419137174, -3.3093966599335554}), new DoubleVector(new double[] {6.762021678051064, 5.39731665029252E-4, -1.8315669761843139}), new DoubleVector(new double[] {-0.016303565076879453, 0.9978466667646154, -0.06353127885213314}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-5.374441944775665, -0.2902466769174813, -5.07172757223771}), new DoubleVector(new double[] {15.764048168637789, 0.2369149910042344, -2.2165392733698965}), new DoubleVector(new double[] {-0.016303565076879453, 0.9978466667646154, -0.06353127885213314}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-5.434676976525272, -0.3503113459822276, -4.6130779824794566}), new DoubleVector(new double[] {15.70360004007425, 0.17684500763031752, -1.7579184667237029}), new DoubleVector(new double[] {-0.016303565076879453, 0.9978466667646154, -0.06353127885213314}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.584301836883564, -0.42108391671232825, -3.2802716128839893}), new DoubleVector(new double[] {4.208510790341124, -0.15192764889904645, -1.8224800601386644}), new DoubleVector(new double[] {-0.016303565076879453, 0.9978466667646154, -0.06353127885213314}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.656184085184929, -0.4188548914260659, -3.4321232241220687}), new DoubleVector(new double[] {5.3065246142988, -0.12052320183770676, -1.8163131204545164}), new DoubleVector(new double[] {-0.016303565076879453, 0.9978466667646154, -0.06353127885213314}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.652805625823571, -0.41877014981160754, -3.4316592289688357}), new DoubleVector(new double[] {5.30122796694309, -0.1167813481362503, -1.7561828893716003}), new DoubleVector(new double[] {-0.01630356507687943, 0.9978466667646161, -0.06353127885213318}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.76798051817882, 0.7406182431698362, -4.6475328219701675}), new DoubleVector(new double[] {27.721829178788074, 1.611917141535033, 0.18655599466540723}), new DoubleVector(new double[] {-0.01630356507687943, 0.9978466667646161, -0.06353127885213318}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.459971191722065, 0.7381474725755173, -4.611002774989118}), new DoubleVector(new double[] {28.12036930119949, -1.3625436634511066, -1.6907765564738781}), new DoubleVector(new double[] {0.06512234628216765, 0.9963937859007076, -0.05439212657380294}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.595610001262826, 0.06702299632858175, -3.6772874817372303}), new DoubleVector(new double[] {28.13945338849702, 0.43961833169151954, -1.3214599986005775}), new DoubleVector(new double[] {-0.009662203277351995, 0.9980731458111601, -0.06129141406838797}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.4679101368055463, -0.0226308186341857, -3.6973529550328674}), new DoubleVector(new double[] {26.84291681704199, 3.331421414199995, -5.2138563379527065}), new DoubleVector(new double[] {-0.14579519047863923, 0.9872602048593996, -0.06372637079218368}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.4396480864310615, -0.13706374583879422, -3.319240196011361}), new DoubleVector(new double[] {15.913254133868692, 1.6527593240418827, -4.128491976210518}), new DoubleVector(new double[] {-0.14579519047863923, 0.9872602048593996, -0.06372637079218368}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.660826159387028, -0.1085695134505136, -3.3120482883370803}), new DoubleVector(new double[] {16.10337137613186, 1.3117438408947086, -1.6939709888097718}), new DoubleVector(new double[] {-0.10517710016208008, 0.992493343964364, -0.06240785037157778}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.234865594986772, -0.13948986510580086, -2.6878295474335694}), new DoubleVector(new double[] {9.427666439994038, 0.5674167675602525, -1.8824934772608388}), new DoubleVector(new double[] {-0.10517710016208008, 0.992493343964364, -0.06240785037157778}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.0469141694570374, -0.15714345959690346, -2.4278621376908003}), new DoubleVector(new double[] {6.8253542533530895, 0.27416450965432876, -1.9364989944692292}), new DoubleVector(new double[] {-0.10517710016208008, 0.992493343964364, -0.06240785037157778}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.069960140700672, -0.15480083800242622, -2.4243182682307656}), new DoubleVector(new double[] {6.8310121325920665, 0.18026963591224102, -1.7562842360374922}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.972641763378899, -0.16642786110281177, -2.737248932046681}), new DoubleVector(new double[] {9.199579341130875, 0.3883272791379226, -1.631226939463286}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.4973934504522983, -0.21859266872632488, -3.93554471110678}), new DoubleVector(new double[] {18.122906403773648, 1.1734774333932159, -1.1601578124943703}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.44452218909606955, -0.12392305928880853, -2.7248792819862713}), new DoubleVector(new double[] {11.089290964598508, 0.8244147265246693, -0.8341668371184549}), new DoubleVector(new double[] {-0.07831301365297749, 0.9952240393117735, -0.05827678327269759}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.3185574772293556, -0.01502960232861783, -2.37315287858447}), new DoubleVector(new double[] {10.24715324017277, 1.475341614520129, 3.6135544941991817}), new DoubleVector(new double[] {-0.11607367792018433, 0.9905193046419826, -0.07347386219405334}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.369699746264018, -0.007755929068590461, -2.33849129291129}), new DoubleVector(new double[] {10.281700339403663, 1.0405415641371845, 3.765853350337659}), new DoubleVector(new double[] {-0.08238742431120812, 0.9953127746819685, -0.050643784123158134}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.369699746264018, -0.007755929068590461, -2.33849129291129}), new DoubleVector(new double[] {10.281700339403663, 1.0405415641371845, 3.765853350337659}), new DoubleVector(new double[] {-0.08238742431120812, 0.9953127746819685, -0.050643784123158134}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.369699746264018, -0.007755929068590461, -2.33849129291129}), new DoubleVector(new double[] {10.281700339403663, 1.0405415641371845, 3.765853350337659}), new DoubleVector(new double[] {-0.08238742431120812, 0.9953127746819685, -0.050643784123158134}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.369699746264018, -0.007755929068590461, -2.33849129291129}), new DoubleVector(new double[] {10.281700339403663, 1.0405415641371845, 3.765853350337659}), new DoubleVector(new double[] {-0.08238742431120812, 0.9953127746819685, -0.050643784123158134}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.3378820486004424, -0.010671156784832991, -2.353479542918165}), new DoubleVector(new double[] {11.750834472294992, 0.708583402992351, 0.6203856163291408}), new DoubleVector(new double[] {-0.057747258389209875, 0.9975664877728212, -0.03906861427277319}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-0.8412835414714284, 0.9872018975356345, -2.0025327108242514}), new DoubleVector(new double[] {6.1107345389652306, 1.4673991077552295, -0.017085787161789753}), new DoubleVector(new double[] {-0.057747258389209875, 0.9975664877728212, -0.03906861427277319}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-0.8412835414714284, 0.9872018975356345, -2.0025327108242514}), new DoubleVector(new double[] {6.1107345389652306, 1.4673991077552295, -0.017085787161789753}), new DoubleVector(new double[] {-0.057747258389209875, 0.9975664877728212, -0.03906861427277319}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-0.8412835414714284, 0.9872018975356345, -2.0025327108242514}), new DoubleVector(new double[] {6.1107345389652306, 1.4673991077552295, -0.017085787161789753}), new DoubleVector(new double[] {-0.057747258389209875, 0.9975664877728212, -0.03906861427277319}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-0.8412835414714284, 0.9872018975356345, -2.0025327108242514}), new DoubleVector(new double[] {6.1107345389652306, 1.4673991077552295, -0.017085787161789753}), new DoubleVector(new double[] {-0.057747258389209875, 0.9975664877728212, -0.03906861427277319}), 42.805059643573344, 0, 30.0);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    currentView_1.setInput(new DoubleVector(new double[] {6.270389936381964, 1.4767861300440936, -0.003853846678062704}), new DoubleVector(new double[] {6.292445498139442, 1.4783095753377085, 0.0024450649091010738}), new DoubleVector(new double[] {-0.057747258389209875, 0.9975664877728212, -0.03906861427277319}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.283520089512983, 1.4776714268605353, -3.2812379872943723E-4}), new DoubleVector(new double[] {6.298470237945238, 1.4787040794639195, 0.003941532273749141}), new DoubleVector(new double[] {-0.057747258389209875, 0.9975664877728212, -0.03906861427277319}), 42.805059643573344, 0, 30.0);

    simulation_0.deleteObjects(new ArrayList<>(Arrays.<ClientServerObject>asList(planeSection_0)));

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_1.getCreatorGroup().setQuery(null);

    scene_1.getCreatorGroup().setObjects(region_0);
  }

  private void execute2() {

    Simulation simulation_0 = 
      getActiveSimulation();

    Scene scene_1 = 
      simulation_0.getSceneManager().getScene("Mesh Scene 1");

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    CurrentView currentView_1 = 
      scene_1.getCurrentView();

    currentView_1.setInput(new DoubleVector(new double[] {6.28329256203681, 1.478197335824676, -0.0013126215899406735}), new DoubleVector(new double[] {6.310321730509042, 1.480064323387819, 0.006406716704555851}), new DoubleVector(new double[] {-0.057747258389209875, 0.9975664877728212, -0.03906861427277319}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.282431989403492, 1.477412988388656, -3.277226143262278E-4}), new DoubleVector(new double[] {6.294459820531774, 1.4782437875732908, 0.0031073404185476224}), new DoubleVector(new double[] {-0.057747258389209875, 0.9975664877728212, -0.03906861427277319}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.282157970555176, 1.477163240635798, -1.4116251839189475E-5}), new DoubleVector(new double[] {6.289409155045481, 1.4776641021874717, 0.0020567704709237174}), new DoubleVector(new double[] {-0.057747258389209875, 0.9975664877728212, -0.03906861427277319}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.283835576460822, 1.4774717734777603, 0.0027974503661441835}), new DoubleVector(new double[] {6.282212865163499, 1.4780060589989084, 0.01015954634625935}), new DoubleVector(new double[] {-0.08910162970744563, 0.9918000241731644, -0.09161665587464721}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {13.6123619254022, 5.968351877441303, -2.3929249615469814}), new DoubleVector(new double[] {-4.440100296956258, 11.912212133047527, 79.50948107805512}), new DoubleVector(new double[] {-0.08910162970744563, 0.9918000241731644, -0.09161665587464721}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {13.535860596727685, 4.940790006727149, -15.385463739619375}), new DoubleVector(new double[] {32.55112144655929, 11.928238431656144, 66.2161562916231}), new DoubleVector(new double[] {-0.08894127887582147, 0.993953701259475, -0.06438546935911768}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {14.174978851223276, 5.627344372229265, -6.606116838382622}), new DoubleVector(new double[] {7.1844107063886895, 11.557080635364493, 76.97138525399183}), new DoubleVector(new double[] {-0.08992995084225607, 0.9928916484500822, -0.07796652088979968}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {13.669690010254785, 5.211950404930537, -13.408198438491365}), new DoubleVector(new double[] {32.94037085371068, 9.377590919563662, 68.32623311692006}), new DoubleVector(new double[] {-0.08639514629950934, 0.9957975814442362, -0.03038182821632763}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {13.356511582835184, 5.125050105913124, -14.646470060453117}), new DoubleVector(new double[] {35.20981466001027, 12.370428768623817, 66.21864116988193}), new DoubleVector(new double[] {-0.09474823617585637, 0.9934797790336812, -0.06340899299650346}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {13.64832507330577, 5.1927244132244, -13.520083224787705}), new DoubleVector(new double[] {33.87721737579791, 7.70662270667903, 68.05014191317196}), new DoubleVector(new double[] {-0.08106979757519486, 0.9966519441535371, -0.010610849926892646}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.935963354549468, 4.940129697773254, -21.674569795398973}), new DoubleVector(new double[] {86.27995811368369, 5.72018763340306, 3.0936207453617186}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {7.3377926680373236, 2.4413335580197573, -10.02348033623589}), new DoubleVector(new double[] {43.43550318697131, 2.7918053715358595, 1.1046067709406204}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-3.2747676189376804, 0.8767093491273097, -7.090181117413727}), new DoubleVector(new double[] {22.727916756495258, 1.129168793738478, 0.9258435165713024}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.844982553262419, 1.0683763431590414, -5.149909023479568}), new DoubleVector(new double[] {7.5444564837334696, 1.2080830647842298, -0.7139786355092146}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.338034377016211, 0.9581397058167778, -6.313655637502492}), new DoubleVector(new double[] {10.840597483101561, 1.134635610506226, -0.7096049672369165}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.411116265290929, 0.8958061021919607, -6.927445189900133}), new DoubleVector(new double[] {12.766840460849863, 1.091713404488894, -0.7070490244547921}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.096812052003138, 1.0432133249807098, -5.637826973703512}), new DoubleVector(new double[] {12.429810564899391, 1.2327968398909088, 0.38177798921731365}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.096812052003138, 1.0432133249807098, -5.637826973703512}), new DoubleVector(new double[] {12.429810564899391, 1.2327968398909088, 0.38177798921731365}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.096812052003138, 1.0432133249807098, -5.637826973703512}), new DoubleVector(new double[] {12.429810564899391, 1.2327968398909088, 0.38177798921731365}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    scene_1.getCreatorGroup().setQuery(null);

    Region region_0 = 
      simulation_0.getRegionManager().getRegion("Nozzle");

    scene_1.getCreatorGroup().setObjects(region_0);

    PartDisplayer partDisplayer_3 = 
      scene_1.getDisplayerManager().createPartDisplayer("Section Surface", -1, 1);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    Units units_0 = 
      ((Units) simulation_0.getUnitsManager().getObject("m"));

    ConstrainedPlaneSection constrainedPlaneSection_0 = 
      (ConstrainedPlaneSection) simulation_0.getPartManager().createConstrainedPlaneImplicitPart(new ArrayList<>(Collections.<NamedObject>emptyList()), new DoubleVector(new double[] {}), units_0, null);

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

    constrainedPlaneSection_0.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.4, 0.020003034198076336, -0.40822837102629284}));

    constrainedPlaneSection_0.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.4, 0.020003034198076336, -0.40822837102629284}));

    constrainedPlaneSection_0.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_0.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_0.getNormalCoordinate().setValue(new DoubleVector(new double[] {0.9953768849030292, 0.0047005835593083535, -0.09593102477793009}));

    constrainedPlaneSection_0.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.9953768849030292, 0.0047005835593083535, -0.09593102477793009}));

    constrainedPlaneSection_0.setLoop(new DoubleVector(new double[] {4.395555958766257, 1.5973128446147256, -0.3770520060278101}));

    SingleValue singleValue_1 = 
      constrainedPlaneSection_0.getSingleValue();

    singleValue_1.getValueQuantity().setValue(0.0);

    singleValue_1.getValueQuantity().setUnits(units_0);

    RangeMultiValue rangeMultiValue_1 = 
      constrainedPlaneSection_0.getRangeMultiValue();

    rangeMultiValue_1.setNValues(2);

    rangeMultiValue_1.getStartQuantity().setValue(0.0);

    rangeMultiValue_1.getStartQuantity().setUnits(units_0);

    rangeMultiValue_1.getEndQuantity().setValue(1.0);

    rangeMultiValue_1.getEndQuantity().setUnits(units_0);

    DeltaMultiValue deltaMultiValue_1 = 
      constrainedPlaneSection_0.getDeltaMultiValue();

    deltaMultiValue_1.setNValues(2);

    deltaMultiValue_1.getStartQuantity().setValue(0.0);

    deltaMultiValue_1.getStartQuantity().setUnits(units_0);

    deltaMultiValue_1.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_1.getDeltaQuantity().setUnits(units_0);

    MultiValue multiValue_1 = 
      constrainedPlaneSection_0.getArbitraryMultiValue();

    multiValue_1.getValueQuantities().setUnits(units_0);

    multiValue_1.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_0.setValueMode(ValueMode.SINGLE);

    partDisplayer_3.getVisibleParts().addParts(constrainedPlaneSection_0);

    partDisplayer_3.getHiddenParts().addParts();

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.566719878074446, 0.7116781238494256, -6.0486426915801506}), new DoubleVector(new double[] {12.594440405915371, 0.8977133736550951, -0.1417012914332434}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-8.064904143266993, 3.6918728052573986, -9.228417346967174}), new DoubleVector(new double[] {25.27716492291431, 4.015590161400372, 1.0501693990633312}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.897513401079279, -0.8587880175003382, -5.103454604129712}), new DoubleVector(new double[] {7.732656509209531, -0.707035069314041, -0.2850356584065127}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.560294182694702, -1.9425843596743917, -4.028486491919002}), new DoubleVector(new double[] {3.5499908711205466, -1.834714866138255, -0.6034432388415644}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.1369643727684915, -1.2227114655886668, -4.614576333468218}), new DoubleVector(new double[] {7.172434199351463, -1.0837818549346858, -0.20332056481398778}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.704655436664501, -0.24656538344673382, -6.30052907963734}), new DoubleVector(new double[] {12.240030550439739, -0.05292290121110277, -0.1520448738768862}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.856178211646334, -1.9195040821071399, -3.5057296910721267}), new DoubleVector(new double[] {3.806747228417727, -1.8062690161951798, 0.08967977827530853}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.3349061805094316, -1.1047155478068102, -4.278775486140972}), new DoubleVector(new double[] {7.586560555661459, -0.9598433818947085, 0.3211667046484169}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.3349061805094316, -1.1047155478068102, -4.278775486140972}), new DoubleVector(new double[] {7.586560555661459, -0.9598433818947085, 0.3211667046484169}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.3349061805094316, -1.1047155478068102, -4.278775486140972}), new DoubleVector(new double[] {7.586560555661459, -0.9598433818947085, 0.3211667046484169}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.3349061805094316, -1.1047155478068102, -4.278775486140972}), new DoubleVector(new double[] {7.586560555661459, -0.9598433818947085, 0.3211667046484169}), new DoubleVector(new double[] {-0.024773148939717625, 0.9984957680782275, 0.04891310889282137}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.738805290594884, -1.0989299071463776, -4.094972848823575}), new DoubleVector(new double[] {7.578421399798856, -0.9637666772870075, 0.39713327904559215}), new DoubleVector(new double[] {-0.024773148939717632, 0.9984957680782276, 0.04891310889282142}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.875838995671172, -1.1005498588946083, -4.131307513716863}), new DoubleVector(new double[] {7.680839596203296, -0.9094255845419408, -0.6602955181784231}), new DoubleVector(new double[] {-0.02477314893971757, 0.9984957680782306, 0.04891310889282102}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.4392516299286875, -0.5966153617451126, -5.149326193781727}), new DoubleVector(new double[] {10.906844628555767, -0.3557373130558813, -0.7747348484697335}), new DoubleVector(new double[] {-0.02477314893971757, 0.9984957680782306, 0.04891310889282102}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-8.064468235623622, -1.275411988423582, -4.1113552908219955}), new DoubleVector(new double[] {7.304832283391296, -1.0736182625770496, -0.44657516066825065}), new DoubleVector(new double[] {-0.02477314893971757, 0.9984957680782306, 0.04891310889282102}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.547181814401943, -0.21042679594052427, -5.885314369316234}), new DoubleVector(new double[] {14.301050176101457, 0.07643311229462685, -0.6756454986526113}), new DoubleVector(new double[] {-0.02477314893971757, 0.9984957680782306, 0.04891310889282102}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.940247608235914, -1.488352172205767, -3.4268040772057073}), new DoubleVector(new double[] {6.5797416185568345, -1.297709616827208, 0.03545940983860327}), new DoubleVector(new double[] {-0.02477314893971757, 0.9984957680782306, 0.04891310889282102}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.807446098356618, -1.1728257994554379, -3.3920970744212395}), new DoubleVector(new double[] {9.427889589852501, -0.9596613242836767, 0.47918747512040183}), new DoubleVector(new double[] {-0.02477314893971757, 0.9984957680782306, 0.04891310889282102}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.842052682604526, -1.6420717548733321, -3.0332914033607197}), new DoubleVector(new double[] {4.986931150171768, -1.4867611916085235, -0.21269297361207776}), new DoubleVector(new double[] {-0.02477314893971757, 0.9984957680782306, 0.04891310889282102}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.820737268590222, -1.4772989251156012, -3.39257324707516}), new DoubleVector(new double[] {2.8415844498651532, -1.3504359037645197, -1.0886112286906136}), new DoubleVector(new double[] {-0.02477314893971757, 0.9984957680782306, 0.04891310889282102}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.7346828597924215, -1.3405893707732777, -3.0182150928238385}), new DoubleVector(new double[] {10.100881942180504, -1.1195440900256148, 0.9961929337387585}), new DoubleVector(new double[] {-0.02477314893971757, 0.9984957680782306, 0.04891310889282102}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.453313908296649, -1.3352635757924434, -2.9670534407020432}), new DoubleVector(new double[] {10.70926706890675, -0.8839325273803489, -1.0812722277135505}), new DoubleVector(new double[] {-0.03150054861476775, 0.9983626736377452, 0.04774607129334442}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.453313908296649, -1.3352635757924434, -2.9670534407020432}), new DoubleVector(new double[] {10.70926706890675, -0.8839325273803489, -1.0812722277135505}), new DoubleVector(new double[] {-0.03150054861476775, 0.9983626736377452, 0.04774607129334442}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.001484659933993, -1.4604967254564951, -4.430469022396416}), new DoubleVector(new double[] {18.930880753466525, -0.7785432543916353, -1.5810859622436608}), new DoubleVector(new double[] {-0.03150054861476775, 0.9983626736377452, 0.04774607129334442}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.442479226803833, -1.1054100988245201, -4.005368181749372}), new DoubleVector(new double[] {16.30695841548846, -0.48086192599835736, -1.3958397323649272}), new DoubleVector(new double[] {-0.03150054861476775, 0.9983626736377452, 0.04774607129334442}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.372075181983103, -0.774335757054087, -3.5724550808973783}), new DoubleVector(new double[] {13.951098364110155, -0.21359199218478425, -1.229518425395103}), new DoubleVector(new double[] {-0.03150054861476775, 0.9983626736377452, 0.04774607129334442}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.372075181983103, -0.774335757054087, -3.5724550808973783}), new DoubleVector(new double[] {13.951098364110155, -0.21359199218478425, -1.229518425395103}), new DoubleVector(new double[] {-0.03150054861476775, 0.9983626736377452, 0.04774607129334442}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.372075181983103, -0.774335757054087, -3.5724550808973783}), new DoubleVector(new double[] {13.951098364110155, -0.21359199218478425, -1.229518425395103}), new DoubleVector(new double[] {-0.03150054861476775, 0.9983626736377452, 0.04774607129334442}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.372075181983103, -0.774335757054087, -3.5724550808973783}), new DoubleVector(new double[] {13.951098364110155, -0.21359199218478425, -1.229518425395103}), new DoubleVector(new double[] {-0.03150054861476775, 0.9983626736377452, 0.04774607129334442}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.372075181983103, -0.774335757054087, -3.5724550808973783}), new DoubleVector(new double[] {13.951098364110155, -0.21359199218478425, -1.229518425395103}), new DoubleVector(new double[] {-0.03150054861476775, 0.9983626736377452, 0.04774607129334442}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-7.372075181983103, -0.774335757054087, -3.5724550808973783}), new DoubleVector(new double[] {13.951098364110155, -0.21359199218478425, -1.229518425395103}), new DoubleVector(new double[] {-0.03150054861476775, 0.9983626736377452, 0.04774607129334442}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-6.830473820653364, -0.7635270932095843, -3.51280572112227}), new DoubleVector(new double[] {13.771099786600516, 0.9176436211223336, -1.2954638883909633}), new DoubleVector(new double[] {-0.08573582953906261, 0.9954386656061723, 0.04184770662225941}), 42.805059643573344, 0, 30.0);

    scene_1.getCreatorGroup().setQuery(null);

    scene_1.getCreatorGroup().setObjects(region_0);

    PartDisplayer partDisplayer_4 = 
      scene_1.getDisplayerManager().createPartDisplayer("Section Surface", -1, 1);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    ConstrainedPlaneSection constrainedPlaneSection_1 = 
      (ConstrainedPlaneSection) simulation_0.getPartManager().createConstrainedPlaneImplicitPart(new ArrayList<>(Collections.<NamedObject>emptyList()), new DoubleVector(new double[] {}), units_0, null);

    constrainedPlaneSection_1.setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_1.getInputParts().setQuery(null);

    constrainedPlaneSection_1.getInputParts().setObjects(region_0);

    constrainedPlaneSection_1.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_1.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_1.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_1.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_1.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_1.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.4, 0.020003034198076336, -0.40822837102629284}));

    constrainedPlaneSection_1.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.4, 0.020003034198076336, -0.40822837102629284}));

    constrainedPlaneSection_1.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_1.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_1.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_1.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_1.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_1.getNormalCoordinate().setValue(new DoubleVector(new double[] {0.9953768849030292, 0.0047005835593083535, -0.09593102477793009}));

    constrainedPlaneSection_1.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.9953768849030292, 0.0047005835593083535, -0.09593102477793009}));

    constrainedPlaneSection_1.setLoop(new DoubleVector(new double[] {4.349951198268741, 0.5344797803338714, -0.9023237852635875, 4.394308214668079, 1.4429119929980958, -0.3975641369344508, 4.396432770098661, 1.448999312749285, -0.37522154936800267, 4.370664802971767, 1.4734236514798817, -0.6413922721667621, 4.355880701468699, 1.1350135970495372, -0.8113735443998049, 4.3138130205359335, 0.4808567092423827, -1.279919735979018, 4.314860658020569, 0.052060971765972686, -1.2900603141722808, 4.331653085584497, -0.4308740440372588, -1.1394863171104865, 4.3562372525577295, 0.1309596021398144, -0.8568722451478588}));

    SingleValue singleValue_2 = 
      constrainedPlaneSection_1.getSingleValue();

    singleValue_2.getValueQuantity().setValue(0.0);

    singleValue_2.getValueQuantity().setUnits(units_0);

    RangeMultiValue rangeMultiValue_2 = 
      constrainedPlaneSection_1.getRangeMultiValue();

    rangeMultiValue_2.setNValues(2);

    rangeMultiValue_2.getStartQuantity().setValue(0.0);

    rangeMultiValue_2.getStartQuantity().setUnits(units_0);

    rangeMultiValue_2.getEndQuantity().setValue(1.0);

    rangeMultiValue_2.getEndQuantity().setUnits(units_0);

    DeltaMultiValue deltaMultiValue_2 = 
      constrainedPlaneSection_1.getDeltaMultiValue();

    deltaMultiValue_2.setNValues(2);

    deltaMultiValue_2.getStartQuantity().setValue(0.0);

    deltaMultiValue_2.getStartQuantity().setUnits(units_0);

    deltaMultiValue_2.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_2.getDeltaQuantity().setUnits(units_0);

    MultiValue multiValue_2 = 
      constrainedPlaneSection_1.getArbitraryMultiValue();

    multiValue_2.getValueQuantities().setUnits(units_0);

    multiValue_2.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_1.setValueMode(ValueMode.SINGLE);

    partDisplayer_4.getVisibleParts().addParts(constrainedPlaneSection_0, constrainedPlaneSection_1);

    partDisplayer_4.getHiddenParts().addParts();

    currentView_1.setInput(new DoubleVector(new double[] {-5.535182916683514, -0.601725192353635, -3.234107573286143}), new DoubleVector(new double[] {13.65558460859399, 2.874396452066155, 3.5736913195470486}), new DoubleVector(new double[] {-0.1848374535962513, 0.9825789474095769, 0.019332042200452735}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-4.3793751805570444, -0.4794696377450302, -3.0008985646297868}), new DoubleVector(new double[] {16.22805302181504, 0.2525632262460144, -1.7816010899581416}), new DoubleVector(new double[] {-0.038346172473847216, 0.9980683776282906, 0.04887826342187034}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {-4.085559080306774, -0.452341544564135, -2.9737740292626516}), new DoubleVector(new double[] {16.182240840383944, 2.5985171475207336, -0.41437061943876974}), new DoubleVector(new double[] {-0.15346138611476076, 0.987414595715213, 0.038236358880024454}), 42.805059643573344, 0, 30.0);

    scene_1.getCreatorGroup().setQuery(null);

    scene_1.getCreatorGroup().setObjects(region_0);

    PartDisplayer partDisplayer_5 = 
      scene_1.getDisplayerManager().createPartDisplayer("Section Surface", -1, 1);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    ConstrainedPlaneSection constrainedPlaneSection_2 = 
      (ConstrainedPlaneSection) simulation_0.getPartManager().createConstrainedPlaneImplicitPart(new ArrayList<>(Collections.<NamedObject>emptyList()), new DoubleVector(new double[] {}), units_0, null);

    constrainedPlaneSection_2.setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_2.getInputParts().setQuery(null);

    constrainedPlaneSection_2.getInputParts().setObjects(region_0);

    constrainedPlaneSection_2.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_2.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_2.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_2.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_2.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_2.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.4, 0.020003034198076336, -0.40822837102629284}));

    constrainedPlaneSection_2.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.4, 0.020003034198076336, -0.40822837102629284}));

    constrainedPlaneSection_2.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_2.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_2.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_2.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_2.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_2.getNormalCoordinate().setValue(new DoubleVector(new double[] {0.9953768849030292, 0.0047005835593083535, -0.09593102477793009}));

    constrainedPlaneSection_2.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.9953768849030292, 0.0047005835593083535, -0.09593102477793009}));

    constrainedPlaneSection_2.setLoop(new DoubleVector(new double[] {4.399915651938825, 1.332562613462763, -0.3447886456339466, 4.399544873458051, 1.5859187307251659, -0.3362214769606138, 4.397369766755592, 1.6431403009403238, -0.35598647129925753, 4.374038628518067, 1.5839686239194493, -0.6009689174546704, 4.325358550438926, 1.319480110092123, -1.1190315040893695, 4.297490940381296, 0.9365363461263119, -1.4269489282831513, 4.278997848464444, 0.5298833962096132, -1.6387584283086332, 4.277167928765602, 0.07114185096828546, -1.6802237701435432, 4.289269047418244, -0.7221631388465903, -1.5935346368322043, 4.338603076043231, -1.305763866232743, -1.1102427314717778, 4.3991030998099365, -1.6316410029799386, -0.498464502082826, 4.399794392838787, -1.3600334019845959, -0.47798300165074525, 4.399980143620681, 1.011256618460205, -0.35986335323320073}));

    SingleValue singleValue_3 = 
      constrainedPlaneSection_2.getSingleValue();

    singleValue_3.getValueQuantity().setValue(0.0);

    singleValue_3.getValueQuantity().setUnits(units_0);

    RangeMultiValue rangeMultiValue_3 = 
      constrainedPlaneSection_2.getRangeMultiValue();

    rangeMultiValue_3.setNValues(2);

    rangeMultiValue_3.getStartQuantity().setValue(0.0);

    rangeMultiValue_3.getStartQuantity().setUnits(units_0);

    rangeMultiValue_3.getEndQuantity().setValue(1.0);

    rangeMultiValue_3.getEndQuantity().setUnits(units_0);

    DeltaMultiValue deltaMultiValue_3 = 
      constrainedPlaneSection_2.getDeltaMultiValue();

    deltaMultiValue_3.setNValues(2);

    deltaMultiValue_3.getStartQuantity().setValue(0.0);

    deltaMultiValue_3.getStartQuantity().setUnits(units_0);

    deltaMultiValue_3.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_3.getDeltaQuantity().setUnits(units_0);

    MultiValue multiValue_3 = 
      constrainedPlaneSection_2.getArbitraryMultiValue();

    multiValue_3.getValueQuantities().setUnits(units_0);

    multiValue_3.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_2.setValueMode(ValueMode.SINGLE);

    partDisplayer_5.getVisibleParts().addParts(constrainedPlaneSection_0, constrainedPlaneSection_1, constrainedPlaneSection_2);

    partDisplayer_5.getHiddenParts().addParts();

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    currentView_1.setInput(new DoubleVector(new double[] {4.12189114223909, 1.4500700099972947, -2.436251710529755}), new DoubleVector(new double[] {23.418305467943686, 4.354708579650223, 4.8581479803920524E-4}), new DoubleVector(new double[] {-0.15346138611476076, 0.987414595715213, 0.038236358880024454}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.141273776192216, 1.1186443418167795, -2.1837060898160976}), new DoubleVector(new double[] {19.790937703429815, 3.4743471515666755, -0.20747762028792993}), new DoubleVector(new double[] {-0.15346138611476076, 0.987414595715213, 0.038236358880024454}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.222021357731121, 0.5472477670680369, -1.7369968839321435}), new DoubleVector(new double[] {13.459854489140941, 1.9377945267200214, -0.5704498631192112}), new DoubleVector(new double[] {-0.15346138611476076, 0.987414595715213, 0.038236358880024454}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.265627968482022, 1.009542673701119, -2.3359896841911567}), new DoubleVector(new double[] {19.01130370927081, 3.2291705159182094, -0.4739162021747631}), new DoubleVector(new double[] {-0.15346138611476076, 0.987414595715213, 0.038236358880024454}), 42.805059643573344, 0, 30.0);

    PartDisplayer partDisplayer_6 = 
      ((PartDisplayer) scene_1.getDisplayerManager().getObject("Mesh 1"));

    partDisplayer_6.getInputParts().setQuery(null);

    Boundary boundary_2 = 
      region_0.getBoundaryManager().getBoundary("Divergent");

    partDisplayer_6.getInputParts().setObjects(boundary_2);

    currentView_1.setInput(new DoubleVector(new double[] {4.512261634146863, 1.0270014240811274, -2.309475673300279}), new DoubleVector(new double[] {19.383008790184245, -0.09417433599113967, -1.2226788849307904}), new DoubleVector(new double[] {0.07064364280881517, 0.9956630730867959, 0.060535284109094284}), 42.805059643573344, 0, 30.0);

    simulation_0.deleteObjects(new ArrayList<>(Arrays.<ClientServerObject>asList(constrainedPlaneSection_1)));

    simulation_0.deleteObjects(new ArrayList<>(Arrays.<ClientServerObject>asList(constrainedPlaneSection_0)));

    FvRepresentation fvRepresentation_0 = 
      ((FvRepresentation) simulation_0.getRepresentationManager().getObject("Volume Mesh"));

    simulation_0.getDataSourceManager().getPartExtents(new ArrayList<>(Arrays.<NamedObject>asList(region_0)), fvRepresentation_0);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    currentView_1.setInput(new DoubleVector(new double[] {3.1246279094921885, 0.26437721608445575, -1.3332548739403538}), new DoubleVector(new double[] {11.984335984049602, -0.40359795895424333, -0.6857620358006732}), new DoubleVector(new double[] {0.07064364280881517, 0.9956630730867959, 0.060535284109094284}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.096423675448914, 0.6925324998823529, 0.20788632060123569}), new DoubleVector(new double[] {7.359194877658897, 3.7756401261690375, 8.253641787544796}), new DoubleVector(new double[] {-0.3324301833359034, 0.9081397215906992, -0.2545042618042789}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.093945579583264, 0.6902551246149762, 0.20250052345773006}), new DoubleVector(new double[] {6.937895091742341, 3.734422293322902, 8.41623941016949}), new DoubleVector(new double[] {-0.3340013696341838, 0.9057960364030869, -0.26072327383466143}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.15897145778465, 1.4440372513964261, 0.6194653482081777}), new DoubleVector(new double[] {4.444153554934557, 10.325222735578203, -0.5831151929799642}), new DoubleVector(new double[] {-0.4350544346284093, -0.15511493274213203, -0.8869424990103328}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.15897145778465, 1.4440372513964261, 0.6194653482081777}), new DoubleVector(new double[] {4.444153554934557, 10.325222735578203, -0.5831151929799642}), new DoubleVector(new double[] {-0.4350544346284093, -0.15511493274213203, -0.8869424990103328}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.150894237014545, 1.6083349420826514, 0.6473920698407263}), new DoubleVector(new double[] {5.314840510397721, 8.290126795790059, 6.583907933014285}), new DoubleVector(new double[] {-0.4615139574276546, 0.5955223411046034, -0.65753935878007}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.14240652725302, 1.382275076928117, 0.44845566214727806}), new DoubleVector(new double[] {7.123358789138191, 8.656142174250942, 5.740967490723722}), new DoubleVector(new double[] {-0.46071211311762655, 0.6008031078808425, -0.6532839921409178}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.131270029404695, 1.5126243085256699, 0.42477609374690894}), new DoubleVector(new double[] {4.571264511178727, 10.796594799499365, -0.6691594624860311}), new DoubleVector(new double[] {-0.5244877181512854, -0.13076959597186863, -0.8413156044422218}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.132417123479375, 1.5058581689621646, 0.4252560240101085}), new DoubleVector(new double[] {4.184348596995545, 10.748268641513885, -0.49606276343384165}), new DoubleVector(new double[] {-0.5239366572571422, -0.13753659144487787, -0.8405796007494509}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.111062598767141, 1.7610085772071877, 0.37851117403496903}), new DoubleVector(new double[] {4.570892104596846, 10.699987299393744, -2.1789553440600753}), new DoubleVector(new double[] {-0.5135419243829134, -0.2645666774133169, -0.8162592511596708}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.111062598767141, 1.7610085772071877, 0.37851117403496903}), new DoubleVector(new double[] {4.570892104596846, 10.699987299393744, -2.1789553440600753}), new DoubleVector(new double[] {-0.5135419243829134, -0.2645666774133169, -0.8162592511596708}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.70947463055352, 2.257035851039733, 0.013758318860735474}), new DoubleVector(new double[] {14.230170662744484, -0.6966189299276733, -2.0995040813580914}), new DoubleVector(new double[] {-0.2661796743821132, -0.08062954702104103, -0.960545291536636}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.782303918984997, 0.38483182464490095, -0.4712385557802674}), new DoubleVector(new double[] {4.444717257944525, -8.398486067904216, -1.2913401303892516}), new DoubleVector(new double[] {-0.40729191217932104, 0.19177031298946137, -0.8929375371936339}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.096353818157302, 1.8999578075741101, -0.11421311907132542}), new DoubleVector(new double[] {13.663112005257704, -2.4944074563407854, -2.2534882146263624}), new DoubleVector(new double[] {-0.3049446556238111, -0.062454164775283705, -0.9503200694023571}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.061638626795634, 0.10140160320096259, -0.2253626078389167}), new DoubleVector(new double[] {12.599315811444976, -4.276074982121214, -2.3564159176887602}), new DoubleVector(new double[] {-0.3049446556238111, -0.062454164775283705, -0.9503200694023571}), 42.805059643573344, 0, 30.0);
  }

  private void execute3() {

    Simulation simulation_0 = 
      getActiveSimulation();

    Scene scene_1 = 
      simulation_0.getSceneManager().getScene("Mesh Scene 1");

    CurrentView currentView_1 = 
      scene_1.getCurrentView();

    currentView_1.setInput(new DoubleVector(new double[] {5.266696047260494, 0.04734446124827074, -0.26817673913829626}), new DoubleVector(new double[] {14.145695054199654, 0.09706449297799066, -1.5647766611142528}), new DoubleVector(new double[] {-0.14312056929544853, -0.10511415526083363, -0.9841074722857063}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {7.22843987688884, 2.7798029447721984, -0.7071830222499815}), new DoubleVector(new double[] {4.528625309134446, 11.3368961576116, -0.7933837651175009}), new DoubleVector(new double[] {-0.0967660788353393, -0.04054828535549761, -0.9944808507667648}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.082383429950112, 1.7548967159345228, -0.3703727395502562}), new DoubleVector(new double[] {3.191278612257716, 10.91828656817177, -0.4626810728593237}), new DoubleVector(new double[] {-0.0967660788353393, -0.04054828535549761, -0.9944808507667648}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.11925469119201, 1.7664085794846147, -0.38240835254095434}), new DoubleVector(new double[] {3.2281498734996115, 10.929798431721865, -0.4747166858500219}), new DoubleVector(new double[] {-0.0967660788353393, -0.04054828535549761, -0.9944808507667648}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {7.335287557178, 1.1923320993558377, -0.9919074688922236}), new DoubleVector(new double[] {2.795035009077595, 15.582714582639449, -1.1368704404706502}), new DoubleVector(new double[] {-0.0967660788353393, -0.04054828535549761, -0.9944808507667648}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.629384318363888, 0.9652820936668771, -0.8780812114613121}), new DoubleVector(new double[] {1.17808326471506, 15.073731795886712, -1.0202041046904766}), new DoubleVector(new double[] {-0.0967660788353393, -0.04054828535549761, -0.9944808507667648}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.670029702926737, 0.8322221585478615, -0.8774312141947946}), new DoubleVector(new double[] {1.656140785292925, 15.133353852860145, -0.7640083486265258}), new DoubleVector(new double[] {-0.10261716578156058, -0.020914061423394123, -0.9945010403825449}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {7.872402161350288, -0.5578433622509493, -2.0935053454732584}), new DoubleVector(new double[] {0.7750477075014938, 24.72940369627997, -1.8929511456366084}), new DoubleVector(new double[] {-0.10261716578156058, -0.020914061423394123, -0.9945010403825449}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {7.274755914455019, -3.5038431616563246, -2.220537179759121}), new DoubleVector(new double[] {21.454726755868062, 18.132441251129883, -0.5750672165474326}), new DoubleVector(new double[] {-0.07976593694323511, 0.12746368623524165, -0.9886305700286255}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.815604480764118, -4.71354318920302, -2.0284019948818317}), new DoubleVector(new double[] {29.085208348189447, 0.08087653618680735, -5.266309362902857}), new DoubleVector(new double[] {-0.14762502823847792, 0.08161398895588218, -0.9856703342621961}), 42.805059643573344, 0, 30.0);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    currentView_1.setInput(new DoubleVector(new double[] {8.497254697051847, 0.6285125484211023, -3.663179259234843}), new DoubleVector(new double[] {3.1993772257062183, 24.230956851275145, -9.064705795277607}), new DoubleVector(new double[] {-0.3927796573202621, -0.2880370780877789, -0.8733606256537368}), 42.805059643573344, 0, 30.0);

    Units units_0 = 
      simulation_0.getUnitsManager().getPreferredUnits(Dimensions.Builder().length(1).build());

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    currentView_1.setInput(new DoubleVector(new double[] {10.009454518833493, -2.420078037115168, -0.22915306372210886}), new DoubleVector(new double[] {2.5412146444412467, -0.02844137945117886, -23.685794180379347}), new DoubleVector(new double[] {-0.04512683216173396, -0.995176910791971, -0.08710043194993346}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {9.726606898854218, -2.3275569617124328, -1.1098185479993836}), new DoubleVector(new double[] {3.1347199479181374, -0.6973487849191438, -23.72485506989768}), new DoubleVector(new double[] {-0.037188238730562394, -0.9974410228359851, -0.06106096023071491}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.222158813484401, 2.1741486970497097, -4.841950101862609}), new DoubleVector(new double[] {-2.123299039204271, 20.879440564420133, 4.48233987942623}), new DoubleVector(new double[] {-0.7522204579603272, -0.007169404261018552, -0.6588725083571084}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.851724240199571, 3.055451862425555, -4.41769321091195}), new DoubleVector(new double[] {23.743095651060127, 7.880192493896415, -15.272472261551277}), new DoubleVector(new double[] {-0.5480083590342886, 0.4592467091994887, -0.6991275266489541}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {7.955790394986828, 2.975548546567023, -4.3049566657507405}), new DoubleVector(new double[] {30.596362746556125, 1.0463516300467313, -0.796642289073065}), new DoubleVector(new double[] {0.17394556031129527, 0.5151471590664088, -0.8392653612261738}), 42.805059643573344, 0, 30.0);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    ConstrainedPlaneSection constrainedPlaneSection_2 = 
      ((ConstrainedPlaneSection) simulation_0.getPartManager().getObject("Constrained Plane Section 3"));

    simulation_0.deleteObjects(new ArrayList<>(Arrays.<ClientServerObject>asList(constrainedPlaneSection_2)));

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_1.getCreatorGroup().setQuery(null);

    Region region_0 = 
      simulation_0.getRegionManager().getRegion("Nozzle");

    scene_1.getCreatorGroup().setObjects(region_0);

    scene_1.getCreatorGroup().setQuery(null);

    scene_1.getCreatorGroup().setObjects(region_0);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_1.getCreatorGroup().setQuery(null);

    scene_1.getCreatorGroup().setObjects(region_0);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    currentView_1.setInput(new DoubleVector(new double[] {7.04571055637285, 4.094091192332139, -4.803913711670562}), new DoubleVector(new double[] {21.37780524273417, 24.898969456132996, -10.15647436804526}), new DoubleVector(new double[] {-0.5553376405385045, 0.17330333785727983, -0.8133671115117553}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.6199068586047005, -0.11461012821369465, -1.7021563443539813}), new DoubleVector(new double[] {15.411645451246434, 17.002614625536363, -6.105978496135576}), new DoubleVector(new double[] {-0.5553376405385045, 0.17330333785727983, -0.8133671115117553}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.8856061816794942, 0.4932968768824584, -1.8190861069873034}), new DoubleVector(new double[] {8.549971428477994, 21.02683690063928, -4.657316535573814}), new DoubleVector(new double[] {-0.6172881184516364, 0.03156365865721696, -0.7861037554107831}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {3.8233766780611176, 0.24277266507173995, -1.7512973136801073}), new DoubleVector(new double[] {8.99061536625582, 19.28940886387851, -9.622982041204903}), new DoubleVector(new double[] {-0.6570962983030344, -0.12869653738688652, -0.7427392920947514}), 42.805059643573344, 0, 30.0);

    scene_1.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    simulation_0.getSceneManager().createScalarScene("Scalar Scene", "Outline", "Scalar", null);

    Scene scene_2 = 
      simulation_0.getSceneManager().getScene("Scalar Scene 1");

    scene_2.initializeAndWait();

    ScalarDisplayer scalarDisplayer_0 = 
      ((ScalarDisplayer) scene_2.getDisplayerManager().getObject("Scalar 1"));

    Legend legend_0 = 
      scalarDisplayer_0.getLegend();

    BlueRedLookupTable blueRedLookupTable_0 = 
      ((BlueRedLookupTable) simulation_0.get(LookupTableManager.class).getObject("blue-red"));

    legend_0.setLookupTable(blueRedLookupTable_0);

    SceneUpdate sceneUpdate_2 = 
      scene_2.getSceneUpdate();

    HardcopyProperties hardcopyProperties_2 = 
      sceneUpdate_2.getHardcopyProperties();

    hardcopyProperties_2.setCurrentResolutionWidth(25);

    hardcopyProperties_2.setCurrentResolutionHeight(25);

    SceneUpdate sceneUpdate_1 = 
      scene_1.getSceneUpdate();

    HardcopyProperties hardcopyProperties_1 = 
      sceneUpdate_1.getHardcopyProperties();

    hardcopyProperties_1.setCurrentResolutionWidth(888);

    hardcopyProperties_1.setCurrentResolutionHeight(650);

    hardcopyProperties_2.setCurrentResolutionWidth(886);

    hardcopyProperties_2.setCurrentResolutionHeight(649);

    scene_2.resetCamera();

    legend_0.updateLayout(new DoubleVector(new double[] {0.73, 0.08}), 0.19999999999999996, 0.035, 0);

    Units units_1 = 
      ((Units) simulation_0.getUnitsManager().getObject(""));

    scalarDisplayer_0.getScalarDisplayQuantity().getMinimumValue().setValueAndUnits(0.0, units_1);

    PrimitiveFieldFunction primitiveFieldFunction_0 = 
      ((PrimitiveFieldFunction) simulation_0.getFieldFunctionManager().getFunction("MachNumber"));

    scalarDisplayer_0.getScalarDisplayQuantity().setFieldFunction(primitiveFieldFunction_0);

    scalarDisplayer_0.getScalarDisplayQuantity().getMaximumValue().setValueAndUnits(0.0, units_1);

    scalarDisplayer_0.getScalarDisplayQuantity().setClip(ClipMode.NONE);

    scalarDisplayer_0.getScalarDisplayQuantity().setAutoRange(AutoRangeMode.BOTH);

    legend_0.setLookupTable(blueRedLookupTable_0);

    LatestMeshProxyRepresentation latestMeshProxyRepresentation_0 = 
      ((LatestMeshProxyRepresentation) simulation_0.getRepresentationManager().getObject("Latest Surface/Volume"));

    scalarDisplayer_0.setRepresentation(latestMeshProxyRepresentation_0);

    scalarDisplayer_0.getInputParts().setQuery(null);

    Boundary boundary_3 = 
      region_0.getBoundaryManager().getBoundary("Convergent");

    Boundary boundary_2 = 
      region_0.getBoundaryManager().getBoundary("Divergent");

    Boundary boundary_4 = 
      region_0.getBoundaryManager().getBoundary("FlowStab");

    Boundary boundary_0 = 
      region_0.getBoundaryManager().getBoundary("Inlet");

    Boundary boundary_5 = 
      region_0.getBoundaryManager().getBoundary("Symmetry");

    Boundary boundary_6 = 
      region_0.getBoundaryManager().getBoundary("Throat");

    Boundary boundary_7 = 
      region_0.getBoundaryManager().getBoundary("Wall");

    scalarDisplayer_0.getInputParts().setObjects(boundary_3, boundary_2, boundary_4, boundary_0, boundary_5, boundary_6, boundary_7);

    CurrentView currentView_2 = 
      scene_2.getCurrentView();

    currentView_2.setInput(new DoubleVector(new double[] {27.60724099765102, 0.6281075259914068, 4.8649218520494895}), new DoubleVector(new double[] {-129.3897683124506, 18.209761724901956, 32.072938566257264}), new DoubleVector(new double[] {0.09182827099334198, 0.9897164098005262, -0.1096767834044181}), 42.8050596437871, 0, 30.0);

    scalarDisplayer_0.getInputParts().setQuery(null);

    scalarDisplayer_0.getInputParts().setObjects(boundary_3, boundary_2, boundary_4, boundary_0, boundary_5, boundary_6);

    currentView_2.setInput(new DoubleVector(new double[] {24.053387451667575, 1.421660838544268, 10.397296963989033}), new DoubleVector(new double[] {37.67048110227287, 12.970841428663302, 170.53491233842695}), new DoubleVector(new double[] {0.06703723999724484, 0.9947405834975473, -0.0774414617406238}), 42.8050596437871, 0, 30.0);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_2.getCreatorGroup().setQuery(null);

    scene_2.getCreatorGroup().setObjects(region_0);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    currentView_2.setInput(new DoubleVector(new double[] {24.22168758955992, 1.2208624502800696, 17.918167384423818}), new DoubleVector(new double[] {17.762781507929503, -18.868733090553295, 177.6603196882256}), new DoubleVector(new double[] {0.07161910481045922, 0.989273972474136, 0.12730950950894385}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {17.406682506366, 1.9261738076081354, 6.550628171088647}), new DoubleVector(new double[] {13.297697727588453, -10.854294161086036, 108.1743495954133}), new DoubleVector(new double[] {0.07161910481045922, 0.989273972474136, 0.12730950950894385}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {17.692565051241765, 2.5815675001251464, -1.0989650658759182}), new DoubleVector(new double[] {14.83276992006132, 8.1594505185147, 105.47812242517507}), new DoubleVector(new double[] {0.0775794766645064, 0.995730024016711, -0.05003143084264272}), 42.8050596437871, 0, 30.0);

    scene_2.setViewOrientation(new DoubleVector(new double[] {0.0, 0.0, 1.0}), new DoubleVector(new double[] {0.0, 1.0, 0.0}));

    currentView_2.setInput(new DoubleVector(new double[] {17.650650659968818, 2.581567500125148, 0.5762795436608423}), new DoubleVector(new double[] {12.311688265973766, 2.581567500125148, 107.20396004837814}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {9.951199381156016, 0.6470357285386951, -4.516051441802325}), new DoubleVector(new double[] {7.5014317714811325, 0.6470357285386951, 44.40975449551154}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {7.050982221685485, -0.055097326262472365, -4.252856096052515}), new DoubleVector(new double[] {5.755562235264868, -0.055097326262472365, 21.6187680582664}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {5.710186703199011, -0.37969953244401805, -4.131179601721522}), new DoubleVector(new double[] {4.948431593450212, -0.37969953244401805, 11.0822971885415}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {17.80992565044506, -1.0387102389623701, 0.20675919326893677}), new DoubleVector(new double[] {11.913041713641057, -1.0387102389623701, 117.9770317642353}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {17.85194178769026, -1.0543631318433526, -0.5559447527587378}), new DoubleVector(new double[] {10.782295576085588, 3.7762487413032915, 117.05058388604999}), new DoubleVector(new double[] {0.0022533585551040678, 0.9991605232490227, -0.0409044148712869}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {10.520595537020794, -2.0045401484095677, -4.552933702156686}), new DoubleVector(new double[] {6.994706593206311, 0.40466117306939425, 54.10170708698338}), new DoubleVector(new double[] {0.0022533585551040678, 0.9991605232490227, -0.0409044148712869}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {7.547714993820422, -1.4102877074418065, -4.23026365306659}), new DoubleVector(new double[] {5.687232740195149, -0.1390405480877131, 26.719638632540377}), new DoubleVector(new double[] {0.0022533585551040678, 0.9991605232490227, -0.0409044148712869}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {5.979249181563619, -1.097983667520483, -4.101680178653941}), new DoubleVector(new double[] {4.996312478869324, -0.4263537776410401, 12.249883961259899}), new DoubleVector(new double[] {0.0022533585551040678, 0.9991605232490227, -0.0409044148712869}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {5.254872158603696, -0.9537369766861815, -4.041856610843875}), new DoubleVector(new double[] {4.67723096531517, -0.5590410720823787, 5.567446812279331}), new DoubleVector(new double[] {0.0022533585551040678, 0.9991605232490227, -0.0409044148712869}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {5.245587988271838, -0.948063978751766, -3.9131767474518866}), new DoubleVector(new double[] {4.148544537709772, -0.42665835810092656, 5.571137285231985}), new DoubleVector(new double[] {0.003446800290541987, 0.9985081015529115, -0.05449486857455926}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {6.1188833024847025, -1.1051443893396617, -4.0344532722219135}), new DoubleVector(new double[] {3.9464996552529836, -0.07264832612880337, 14.746542776071895}), new DoubleVector(new double[] {0.003446800290541987, 0.9985081015529115, -0.05449486857455926}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {7.498633127334667, -1.3487141223515404, -4.093399342307762}), new DoubleVector(new double[] {3.6236737045753, 0.4929865156546475, 29.4069437940811}), new DoubleVector(new double[] {0.003446800290541987, 0.9985081015529115, -0.05449486857455926}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {7.177452120629344, -1.389052089485947, -4.750396904036301}), new DoubleVector(new double[] {33.400354803759406, 0.07412534363625278, 16.326535856202543}), new DoubleVector(new double[] {-0.0017309351844432838, 0.9977440383474369, -0.0671106385421569}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {7.149998685422474, -1.4304726801290184, -5.365495019010901}), new DoubleVector(new double[] {4.656152092506968, 0.7871837732097817, 27.66906165326859}), new DoubleVector(new double[] {-0.0017309351844424711, 0.997744038347439, -0.0671106385421587}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {6.888993600909031, -1.198898687280578, -1.9080627755540727}), new DoubleVector(new double[] {4.65943331531923, 1.3893942301026474, 27.570904249805935}), new DoubleVector(new double[] {-1.9184021571498437E-4, 0.9961663233737138, -0.08747925110237174}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {6.889077281049392, -1.189362488735033, -1.802704347839182}), new DoubleVector(new double[] {26.421690252418387, 1.4998058673120038, 20.26095631017364}), new DoubleVector(new double[] {-0.008860578530725244, 0.9935271078770939, -0.11324917686891064}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {7.8140832350396625, -0.9019812193606658, 1.1091316364960166}), new DoubleVector(new double[] {4.626586783136035, 1.4813563839392847, 30.433077629850654}), new DoubleVector(new double[] {0.0014446416394309377, 0.9967249943813772, -0.08085294420114528}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {6.132111622278691, -0.45098017068873597, -1.261828907794424}), new DoubleVector(new double[] {4.630546179914043, 0.6717622187078427, 12.55209201785621}), new DoubleVector(new double[] {0.0014446416394309377, 0.9967249943813772, -0.08085294420114528}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {5.387810556669609, -0.23059420056520702, -1.850647749970805}), new DoubleVector(new double[] {4.632196131957083, 0.3343897293581372, 5.100762837117694}), new DoubleVector(new double[] {0.0014446416394309377, 0.9967249943813772, -0.08085294420114528}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {5.686082615273175, 0.017439794226141725, -1.88512754936575}), new DoubleVector(new double[] {4.576082727771212, 0.8474029052320249, 8.326515740244247}), new DoubleVector(new double[] {0.0014446416394309377, 0.9967249943813772, -0.08085294420114528}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {5.661732986314635, -0.0037932298632061823, -2.090500828107136}), new DoubleVector(new double[] {8.086977695625652, 1.1401861950115066, 7.795152973145295}), new DoubleVector(new double[] {-7.92724028011041E-4, 0.993392689372324, -0.11476208559562212}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {5.751409403066377, 0.036886575963465784, -1.6947602950332965}), new DoubleVector(new double[] {7.179272433259422, 0.4931535140265799, 8.175636467190186}), new DoubleVector(new double[] {0.012197962066855143, 0.9987760318196813, -0.047933787498687715}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {5.753178795537651, 0.04682612784931872, -1.4872037948686976}), new DoubleVector(new double[] {4.484559484088181, 0.5369549291702258, 8.402570282309743}), new DoubleVector(new double[] {0.012197962066855103, 0.9987760318196844, -0.04793378749868706}), 42.8050596437871, 0, 30.0);

    scene_2.setViewOrientation(new DoubleVector(new double[] {0.0, 0.0, 1.0}), new DoubleVector(new double[] {0.0, 1.0, 0.0}));

    currentView_2.setInput(new DoubleVector(new double[] {4.516709121360599, 0.05506925901049953, -1.4872038873394136}), new DoubleVector(new double[] {4.516709121360599, 0.05506925901049953, 8.495644120275431}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.511806131612044, 0.05191940028325415, -1.5445630828615653}), new DoubleVector(new double[] {6.201011610713091, 1.1371263644696363, 8.234300094287445}), new DoubleVector(new double[] {-0.009292146469564135, 0.9940303875486067, -0.10870715084098066}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.5060491234284, 0.04401323881313801, -1.61636580905308}), new DoubleVector(new double[] {4.403288231625282, 1.1282306416445702, 8.306623672654391}), new DoubleVector(new double[] {-0.00929214646956397, 0.9940303875486072, -0.10870715084098298}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.415933322416875, -1.1842917106492958, -1.9455727249726804}), new DoubleVector(new double[] {4.363429894231069, -0.6303345626671086, 3.1243615321133413}), new DoubleVector(new double[] {-0.00929214646956397, 0.9940303875486072, -0.10870715084098298}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.435042520074211, -1.7575210580926879, -1.902687403661413}), new DoubleVector(new double[] {4.406496498544587, -1.4563355313719153, 0.8538269318287462}), new DoubleVector(new double[] {-0.00929214646956397, 0.9940303875486072, -0.10870715084098298}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.434683533810071, -1.7477565671862318, -1.8127710319760253}), new DoubleVector(new double[] {4.730103275797942, -1.4906394048221778, 0.8507152326477831}), new DoubleVector(new double[] {-0.008611805834827336, 0.9954268963461395, -0.09513743128215274}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.435393741164846, -1.747182006136975, -1.8063670861550891}), new DoubleVector(new double[] {4.731090693513258, -1.5266986628965906, 0.8602617002931747}), new DoubleVector(new double[] {-0.007112242469699118, 0.9966384864056049, -0.08161582825780966}), 42.8050596437871, 0, 30.0);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    currentView_2.setInput(new DoubleVector(new double[] {4.536799036777827, -1.595361970920691, -0.04699365202300925}), new DoubleVector(new double[] {5.1332122527400195, -1.6938693865982295, -0.6908883681059395}), new DoubleVector(new double[] {0.12218553765338022, 0.9917583130279257, -0.03855052435928623}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.502288800938116, -1.4938458123302907, 0.06126200318269337}), new DoubleVector(new double[] {5.806985483718985, -1.7093378487642181, -1.3473038663348316}), new DoubleVector(new double[] {0.12218553765338022, 0.9917583130279257, -0.03855052435928623}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.545499517920132, -1.5009287510463152, 0.006046515800946457}), new DoubleVector(new double[] {4.762690887837417, -1.526505955899241, -1.8607765151565638}), new DoubleVector(new double[] {0.10512384007190227, 0.9944581606797759, -0.0013945988527078324}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.5459107036936475, -1.5009832411025963, -0.001814277736879753}), new DoubleVector(new double[] {4.426750730433579, -1.491014195601878, -1.8752958989977506}), new DoubleVector(new double[] {0.10512384007192131, 0.9944581606797758, -0.0013945988527090745}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.547056269469423, -1.5009986101023987, 6.137676814108627E-4}), new DoubleVector(new double[] {5.860107031133893, -1.5111920114552841, 1.3462663466228324}), new DoubleVector(new double[] {-0.07117200513474828, 0.9944890503560082, 0.07698100029963405}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.588352316025384, -1.5000871972696586, 0.002443687730661515}), new DoubleVector(new double[] {4.466134765434835, -1.557159683648534, 1.7841452046168929}), new DoubleVector(new double[] {-0.09002662251753586, 0.9956072890315514, 0.025716400707791076}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.519872350873656, -1.3135970100843946, -0.02030144012073798}), new DoubleVector(new double[] {4.279954133416228, -1.4256327130723903, 3.4772539429405356}), new DoubleVector(new double[] {-0.09002662251753586, 0.9956072890315514, 0.025716400707791076}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.409851821800611, -1.0186839103534613, -0.034860270839265795}), new DoubleVector(new double[] {3.984843195286733, -1.2171521248644916, 6.160964395017398}), new DoubleVector(new double[] {-0.09002662251753586, 0.9956072890315514, 0.025716400707791076}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.121090429879233, -0.24430125581404377, -0.07470588171627845}), new DoubleVector(new double[] {3.2099929716254243, -0.6697605865301626, 13.207377710683305}), new DoubleVector(new double[] {-0.09002662251753586, 0.9956072890315514, 0.025716400707791076}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.3690437643577384, 1.2364950554535998, -0.033981228421918974}), new DoubleVector(new double[] {4.136463594170283, 1.1278860338287913, 3.356599257100361}), new DoubleVector(new double[] {-0.09002662251753586, 0.9956072890315514, 0.025716400707791076}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.4222413744081255, 1.477801339794624, -0.02900082404701787}), new DoubleVector(new double[] {4.310145294658169, 1.4254553227639941, 1.605148726180852}), new DoubleVector(new double[] {-0.09002662251753586, 0.9956072890315514, 0.025716400707791076}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.418176333464815, 1.6252510952499322, -0.01740276710387434}), new DoubleVector(new double[] {4.364324847744941, 1.6001038216351442, 0.7676503887650165}), new DoubleVector(new double[] {-0.09002662251753586, 0.9956072890315514, 0.025716400707791076}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.412610316519886, 1.6878122977393069, -0.008627922324892179}), new DoubleVector(new double[] {4.384036553702171, 1.6744690775444377, 0.4079236802025287}), new DoubleVector(new double[] {-0.09002662251753586, 0.9956072890315514, 0.025716400707791076}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.412120225965097, 1.7149763508164717, -0.002560266479124662}), new DoubleVector(new double[] {4.398562113624584, 1.7086450573308938, 0.19509145544201983}), new DoubleVector(new double[] {-0.09002662251753586, 0.9956072890315514, 0.025716400707791076}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.410643409642608, 1.7236810808652931, -0.0010162114481827994}), new DoubleVector(new double[] {4.402671928547332, 1.7199586020230047, 0.11519295728949937}), new DoubleVector(new double[] {-0.09002662251753586, 0.9956072890315514, 0.025716400707791076}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.410914613421181, 1.7226734525768346, -6.033638975707356E-4}), new DoubleVector(new double[] {4.40218119589405, 1.7185951688078518, 0.12671340182473087}), new DoubleVector(new double[] {-0.09002662251753586, 0.9956072890315514, 0.025716400707791076}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {5.088180127469424, -0.509747520782474, -0.062460523786615596}), new DoubleVector(new double[] {3.299516145141828, -1.3450080891257912, 26.01288884391199}), new DoubleVector(new double[] {-0.09002662251753586, 0.9956072890315514, 0.025716400707791076}), 42.8050596437871, 0, 30.0);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    currentView_2.setInput(new DoubleVector(new double[] {-1.7054371914590483, -0.9995354000935158, -7.574644364108701}), new DoubleVector(new double[] {24.3070724190738, 1.5821505679676393, -6.863971118599466}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {-1.6851737606489097, -0.6689158158716164, -3.767149927918587}), new DoubleVector(new double[] {24.17188395630352, 1.8973418840841567, -3.0607236967645766}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {-3.1982477726087915, -0.6272419251268941, -1.8107789672093184}), new DoubleVector(new double[] {11.657498402220101, 0.8471591234018596, -1.404913423799692}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    scene_2.getCreatorGroup().setQuery(null);

    scene_2.getCreatorGroup().setObjects(region_0);

    PartDisplayer partDisplayer_7 = 
      scene_2.getDisplayerManager().createPartDisplayer("Section Surface", -1, 1);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    ConstrainedPlaneSection constrainedPlaneSection_3 = 
      (ConstrainedPlaneSection) simulation_0.getPartManager().createConstrainedPlaneImplicitPart(new ArrayList<>(Collections.<NamedObject>emptyList()), new DoubleVector(new double[] {}), units_0, null);

    LabCoordinateSystem labCoordinateSystem_0 = 
      simulation_0.getCoordinateSystemManager().getLabCoordinateSystem();

    constrainedPlaneSection_3.setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getInputParts().setQuery(null);

    constrainedPlaneSection_3.getInputParts().setObjects(region_0);

    constrainedPlaneSection_3.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_3.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.399971385595381, 0.0, 0.0}));

    constrainedPlaneSection_3.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.399971385595381, 0.0, 0.0}));

    constrainedPlaneSection_3.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_3.getNormalCoordinate().setValue(new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_3.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_3.setLoop(new DoubleVector(new double[] {4.399971385595381, 1.7241879078275364, -0.01493723177679307, 4.399971385595381, 1.5207743329269028, -0.7936843777047208, 4.399971385595381, 0.9645202321916265, -1.4211866746718695, 4.399971385595381, -0.00793387928288436, -1.7143846799349833, 4.399971385595381, -0.8656997878799318, -1.4747509405727013, 4.399971385595381, -1.569735717734941, -0.6877513385989975, 4.399971385595381, -1.721460866989284, -0.01526305179263332}));

    SingleValue singleValue_4 = 
      constrainedPlaneSection_3.getSingleValue();

    singleValue_4.getValueQuantity().setValue(0.0);

    singleValue_4.getValueQuantity().setUnits(units_0);

    RangeMultiValue rangeMultiValue_4 = 
      constrainedPlaneSection_3.getRangeMultiValue();

    rangeMultiValue_4.setNValues(2);

    rangeMultiValue_4.getStartQuantity().setValue(0.0);

    rangeMultiValue_4.getStartQuantity().setUnits(units_0);

    rangeMultiValue_4.getEndQuantity().setValue(1.0);

    rangeMultiValue_4.getEndQuantity().setUnits(units_0);

    DeltaMultiValue deltaMultiValue_4 = 
      constrainedPlaneSection_3.getDeltaMultiValue();

    deltaMultiValue_4.setNValues(2);

    deltaMultiValue_4.getStartQuantity().setValue(0.0);

    deltaMultiValue_4.getStartQuantity().setUnits(units_0);

    deltaMultiValue_4.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_4.getDeltaQuantity().setUnits(units_0);

    MultiValue multiValue_4 = 
      constrainedPlaneSection_3.getArbitraryMultiValue();

    multiValue_4.getValueQuantities().setUnits(units_0);

    multiValue_4.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_3.setValueMode(ValueMode.SINGLE);

    partDisplayer_7.getVisibleParts().addParts(constrainedPlaneSection_3);

    partDisplayer_7.getHiddenParts().addParts();

    currentView_2.setInput(new DoubleVector(new double[] {-3.3598984917293393, -0.2528908185230839, -1.8486650251212389}), new DoubleVector(new double[] {5.5116034014045745, 0.6275867784504067, -1.6062916771693783}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {-3.393865028457176, -0.10157773763179812, -2.0776484141129625}), new DoubleVector(new double[] {13.926649821809816, 1.6174463326341066, -1.6044443024440924}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {-3.397374125237043, -0.07013571962792042, -2.1246136334516836}), new DoubleVector(new double[] {15.656088087944468, 1.8208796716296904, -1.6040646348365553}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {4.218042854087626, 1.0256294870012268, -1.4143801566827319}), new DoubleVector(new double[] {9.735588800646862, 1.573234126524237, -1.2636383657599586}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    scene_2.getCreatorGroup().setQuery(null);

    scene_2.getCreatorGroup().setObjects(region_0);

    PartDisplayer partDisplayer_8 = 
      scene_2.getDisplayerManager().createPartDisplayer("Section Surface", -1, 1);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    ConstrainedPlaneSection constrainedPlaneSection_4 = 
      (ConstrainedPlaneSection) simulation_0.getPartManager().createConstrainedPlaneImplicitPart(new ArrayList<>(Collections.<NamedObject>emptyList()), new DoubleVector(new double[] {}), units_0, null);

    constrainedPlaneSection_4.setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_4.getInputParts().setQuery(null);

    constrainedPlaneSection_4.getInputParts().setObjects(region_0);

    constrainedPlaneSection_4.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_4.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_4.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_4.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_4.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_4.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.399971385595381, 0.0, 0.0}));

    constrainedPlaneSection_4.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.399971385595381, 0.0, 0.0}));

    constrainedPlaneSection_4.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_4.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_4.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_4.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_4.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_4.getNormalCoordinate().setValue(new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_4.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_4.setLoop(new DoubleVector(new double[] {4.399971385595381, 1.7241879078275364, -0.01493723177679307, 4.399971385595381, 1.6605951246821642, -0.4044615718638396, 4.399971385595381, 1.5207743329269028, -0.7936843777047208, 4.399971385595381, 1.3150909543502267, -1.0919235610843223, 4.399971385595381, 0.9645202321916265, -1.4211866746718695, 4.399971385595381, 0.5397209544646093, -1.6233574700150255, 4.399971385595381, -0.00793387928288436, -1.7143846799349833, 4.399971385595381, -0.8656997878799318, -1.4747509405727013, 4.399971385595381, -1.569735717734941, -0.6877513385989975, 4.399971385595381, -1.721460866989284, -0.01526305179263332}));

    SingleValue singleValue_5 = 
      constrainedPlaneSection_4.getSingleValue();

    singleValue_5.getValueQuantity().setValue(0.0);

    singleValue_5.getValueQuantity().setUnits(units_0);

    RangeMultiValue rangeMultiValue_5 = 
      constrainedPlaneSection_4.getRangeMultiValue();

    rangeMultiValue_5.setNValues(2);

    rangeMultiValue_5.getStartQuantity().setValue(0.0);

    rangeMultiValue_5.getStartQuantity().setUnits(units_0);

    rangeMultiValue_5.getEndQuantity().setValue(1.0);

    rangeMultiValue_5.getEndQuantity().setUnits(units_0);

    DeltaMultiValue deltaMultiValue_5 = 
      constrainedPlaneSection_4.getDeltaMultiValue();

    deltaMultiValue_5.setNValues(2);

    deltaMultiValue_5.getStartQuantity().setValue(0.0);

    deltaMultiValue_5.getStartQuantity().setUnits(units_0);

    deltaMultiValue_5.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_5.getDeltaQuantity().setUnits(units_0);

    MultiValue multiValue_5 = 
      constrainedPlaneSection_4.getArbitraryMultiValue();

    multiValue_5.getValueQuantities().setUnits(units_0);

    multiValue_5.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_4.setValueMode(ValueMode.SINGLE);

    partDisplayer_8.getVisibleParts().addParts(constrainedPlaneSection_3, constrainedPlaneSection_4);

    partDisplayer_8.getHiddenParts().addParts();

    currentView_2.setInput(new DoubleVector(new double[] {3.825104088977829, 1.569810471944037, -1.2859849639510457}), new DoubleVector(new double[] {15.010014876846727, 2.679888956004055, -0.9804082637649382}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {3.3174392297416873, 2.2750499093884082, -1.1195835862928343}), new DoubleVector(new double[] {21.84407651539358, 4.113779052860171, -0.6134276772591528}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {3.082455068015708, 1.778312264190434, -1.806839285646496}), new DoubleVector(new double[] {12.157160097441924, 2.678957338023575, -1.558914338309237}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    simulation_0.deleteObjects(new ArrayList<>(Arrays.<ClientServerObject>asList(constrainedPlaneSection_4)));

    FvRepresentation fvRepresentation_0 = 
      ((FvRepresentation) simulation_0.getRepresentationManager().getObject("Volume Mesh"));

    simulation_0.getDataSourceManager().getPartExtents(new ArrayList<>(Arrays.<NamedObject>asList(region_0)), fvRepresentation_0);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    currentView_2.setInput(new DoubleVector(new double[] {3.2776781127219623, -0.2418197021235997, -1.6201118494895732}), new DoubleVector(new double[] {12.352550625630425, 0.6588419940871, -1.3721823264296453}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);
  }

  private void execute4() {

    Simulation simulation_0 = 
      getActiveSimulation();

    Scene scene_2 = 
      simulation_0.getSceneManager().getScene("Scalar Scene 1");

    scene_2.getCreatorGroup().setQuery(null);

    Region region_0 = 
      simulation_0.getRegionManager().getRegion("Nozzle");

    scene_2.getCreatorGroup().setObjects(region_0);

    ConstrainedPlaneSection constrainedPlaneSection_3 = 
      ((ConstrainedPlaneSection) simulation_0.getPartManager().getObject("Constrained Plane Section"));

    constrainedPlaneSection_3.setBatched(true);

    LabCoordinateSystem labCoordinateSystem_0 = 
      simulation_0.getCoordinateSystemManager().getLabCoordinateSystem();

    constrainedPlaneSection_3.setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getInputParts().setQuery(null);

    constrainedPlaneSection_3.getInputParts().setObjects(region_0);

    constrainedPlaneSection_3.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    Units units_0 = 
      ((Units) simulation_0.getUnitsManager().getObject("m"));

    constrainedPlaneSection_3.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_3.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.404967696428407, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_3.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.404967696428407, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_3.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_3.getNormalCoordinate().setValue(new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_3.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_3.setLoop(new DoubleVector(new double[] {4.404967696428407, 1.7241879078275364, -0.01493723177679307, 4.404967696428407, 1.6627392580246063, -0.40608481008624897, 4.404967696428407, 1.5207743329269028, -0.7936843777047208, 4.404967696428407, 0.9645202321916265, -1.4211866746718695, 4.404967696428407, 0.49280835103634607, -1.64347318689864, 4.404967696428407, -0.00793387928288436, -1.7143846799349833, 4.404967696428407, -0.7978293739399283, -1.5068720190811304, 4.404967696428407, -1.3029303039953057, -1.0892680984256817, 4.404967696428407, -1.569735717734941, -0.6877513385989975, 4.404967696428407, -1.721460866989284, -0.01526305179263332}));

    SingleValue singleValue_4 = 
      constrainedPlaneSection_3.getSingleValue();

    singleValue_4.getValueQuantity().setValue(0.0);

    singleValue_4.getValueQuantity().setUnits(units_0);

    RangeMultiValue rangeMultiValue_4 = 
      constrainedPlaneSection_3.getRangeMultiValue();

    rangeMultiValue_4.setNValues(2);

    rangeMultiValue_4.getStartQuantity().setValue(0.0);

    rangeMultiValue_4.getStartQuantity().setUnits(units_0);

    rangeMultiValue_4.getEndQuantity().setValue(1.0);

    rangeMultiValue_4.getEndQuantity().setUnits(units_0);

    DeltaMultiValue deltaMultiValue_4 = 
      constrainedPlaneSection_3.getDeltaMultiValue();

    deltaMultiValue_4.setNValues(2);

    deltaMultiValue_4.getStartQuantity().setValue(0.0);

    deltaMultiValue_4.getStartQuantity().setUnits(units_0);

    deltaMultiValue_4.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_4.getDeltaQuantity().setUnits(units_0);

    MultiValue multiValue_4 = 
      constrainedPlaneSection_3.getArbitraryMultiValue();

    multiValue_4.getValueQuantities().setUnits(units_0);

    multiValue_4.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_3.setValueMode(ValueMode.SINGLE);

    constrainedPlaneSection_3.setBatched(false);

    PartDisplayer partDisplayer_7 = 
      ((PartDisplayer) scene_2.getDisplayerManager().getObject("Section Surface 1"));

    partDisplayer_7.getVisibleParts().addParts();

    partDisplayer_7.getHiddenParts().addParts();

    scene_2.getCreatorGroup().setQuery(null);

    scene_2.getCreatorGroup().setObjects(region_0);

    constrainedPlaneSection_3.setBatched(true);

    constrainedPlaneSection_3.setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getInputParts().setQuery(null);

    constrainedPlaneSection_3.getInputParts().setObjects(region_0);

    constrainedPlaneSection_3.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_3.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.404967696428407, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_3.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.404967696428407, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_3.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_3.getNormalCoordinate().setValue(new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_3.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_3.setLoop(new DoubleVector(new double[] {4.404967696428407, 1.7054422941433813, -0.02129293196793136, 4.404967696428407, 1.6627392580246063, -0.40608481008624897, 4.404967696428407, 1.5207743329269028, -0.7936843777047208, 4.404967696428407, 0.9645202321916265, -1.4211866746718695, 4.404967696428407, 0.49280835103634607, -1.64347318689864, 4.404967696428407, -0.00793387928288436, -1.7143846799349833, 4.404967696428407, -0.7978293739399283, -1.5068720190811304, 4.404967696428407, -1.3029303039953057, -1.0892680984256817, 4.404967696428407, -1.569735717734941, -0.6877513385989975, 4.404967696428407, -1.721460866989284, -0.01526305179263332}));

    singleValue_4.getValueQuantity().setValue(0.0);

    singleValue_4.getValueQuantity().setUnits(units_0);

    rangeMultiValue_4.setNValues(2);

    rangeMultiValue_4.getStartQuantity().setValue(0.0);

    rangeMultiValue_4.getStartQuantity().setUnits(units_0);

    rangeMultiValue_4.getEndQuantity().setValue(1.0);

    rangeMultiValue_4.getEndQuantity().setUnits(units_0);

    deltaMultiValue_4.setNValues(2);

    deltaMultiValue_4.getStartQuantity().setValue(0.0);

    deltaMultiValue_4.getStartQuantity().setUnits(units_0);

    deltaMultiValue_4.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_4.getDeltaQuantity().setUnits(units_0);

    multiValue_4.getValueQuantities().setUnits(units_0);

    multiValue_4.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_3.setValueMode(ValueMode.SINGLE);

    constrainedPlaneSection_3.setBatched(false);

    partDisplayer_7.getVisibleParts().addParts();

    partDisplayer_7.getHiddenParts().addParts();

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    FvRepresentation fvRepresentation_0 = 
      ((FvRepresentation) simulation_0.getRepresentationManager().getObject("Volume Mesh"));

    simulation_0.getDataSourceManager().getPartExtents(new ArrayList<>(Arrays.<NamedObject>asList(region_0)), fvRepresentation_0);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    CurrentView currentView_2 = 
      scene_2.getCurrentView();

    currentView_2.setInput(new DoubleVector(new double[] {0.8832492387234261, 0.6807046357039198, -0.7485065510428566}), new DoubleVector(new double[] {7.435721600805394, 1.3310235094524885, -0.5694901135905934}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {-0.5728860611096014, 1.212685838862969, 0.0466531120280103}), new DoubleVector(new double[] {3.9661594282374883, 1.6631763998926403, 0.17066183851098604}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {-0.7647440675449451, 0.992651861007949, 0.07374306804136846}), new DoubleVector(new double[] {4.948156697797401, 1.55964504865633, 0.2298220388506316}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {-0.977146841546193, 0.7514446393301146, 0.16045069275772422}), new DoubleVector(new double[] {6.177918706205516, 1.4615695985039403, 0.35593024205092494}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    currentView_2.setInput(new DoubleVector(new double[] {-1.487090803020374, 0.8556582381315858, -0.42044586233382736}), new DoubleVector(new double[] {9.57445542919807, 1.95349305377793, -0.1182395362660793}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {-1.6413279427613157, 1.1617551687186756, -0.28448073841449656}), new DoubleVector(new double[] {4.322903372536069, 1.753692376143652, -0.12153530603322725}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {-1.6882409734091128, 1.1354036498816549, -0.42916874868874966}), new DoubleVector(new double[] {6.308203260721107, 1.9290336449390453, -0.21070236226589373}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    scene_2.getCreatorGroup().setQuery(null);

    scene_2.getCreatorGroup().setObjects(region_0);

    constrainedPlaneSection_3.setBatched(true);

    constrainedPlaneSection_3.setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getInputParts().setQuery(null);

    constrainedPlaneSection_3.getInputParts().setObjects(region_0);

    constrainedPlaneSection_3.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_3.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.404967696428407, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_3.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.404967696428407, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_3.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_3.getNormalCoordinate().setValue(new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_3.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_3.setLoop(new DoubleVector(new double[] {4.404967696428407, 1.7242075273800737, -0.003908144380038614, 4.404967696428407, 1.6627392580246063, -0.40608481008624897, 4.404967696428407, 1.5207743329269028, -0.7936843777047208, 4.404967696428407, 0.9645202321916265, -1.4211866746718695, 4.404967696428407, 0.49280835103634607, -1.64347318689864, 4.404967696428407, -0.00793387928288436, -1.7143846799349833, 4.404967696428407, -0.7978293739399283, -1.5068720190811304, 4.404967696428407, -1.3029303039953057, -1.0892680984256817, 4.404967696428407, -1.569735717734941, -0.6877513385989975, 4.404967696428407, -1.721460866989284, -0.01526305179263332}));

    singleValue_4.getValueQuantity().setValue(0.0);

    singleValue_4.getValueQuantity().setUnits(units_0);

    rangeMultiValue_4.setNValues(2);

    rangeMultiValue_4.getStartQuantity().setValue(0.0);

    rangeMultiValue_4.getStartQuantity().setUnits(units_0);

    rangeMultiValue_4.getEndQuantity().setValue(1.0);

    rangeMultiValue_4.getEndQuantity().setUnits(units_0);

    deltaMultiValue_4.setNValues(2);

    deltaMultiValue_4.getStartQuantity().setValue(0.0);

    deltaMultiValue_4.getStartQuantity().setUnits(units_0);

    deltaMultiValue_4.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_4.getDeltaQuantity().setUnits(units_0);

    multiValue_4.getValueQuantities().setUnits(units_0);

    multiValue_4.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_3.setValueMode(ValueMode.SINGLE);

    constrainedPlaneSection_3.setBatched(false);

    partDisplayer_7.getVisibleParts().addParts();

    partDisplayer_7.getHiddenParts().addParts();

    scene_2.getCreatorGroup().setQuery(null);

    scene_2.getCreatorGroup().setObjects(region_0);

    constrainedPlaneSection_3.setBatched(true);

    constrainedPlaneSection_3.setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getInputParts().setQuery(null);

    constrainedPlaneSection_3.getInputParts().setObjects(region_0);

    constrainedPlaneSection_3.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_3.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.404967696428407, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_3.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.404967696428407, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_3.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_3.getNormalCoordinate().setValue(new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_3.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_3.setLoop(new DoubleVector(new double[] {4.404967696428407, 1.716331667131238, -0.007088038573035665, 4.404967696428407, 1.6627392580246063, -0.40608481008624897, 4.404967696428407, 1.5207743329269028, -0.7936843777047208, 4.404967696428407, 0.9645202321916265, -1.4211866746718695, 4.404967696428407, 0.49280835103634607, -1.64347318689864, 4.404967696428407, -0.00793387928288436, -1.7143846799349833, 4.404967696428407, -0.7978293739399283, -1.5068720190811304, 4.404967696428407, -1.3029303039953057, -1.0892680984256817, 4.404967696428407, -1.569735717734941, -0.6877513385989975, 4.404967696428407, -1.721460866989284, -0.01526305179263332}));

    singleValue_4.getValueQuantity().setValue(0.0);

    singleValue_4.getValueQuantity().setUnits(units_0);

    rangeMultiValue_4.setNValues(2);

    rangeMultiValue_4.getStartQuantity().setValue(0.0);

    rangeMultiValue_4.getStartQuantity().setUnits(units_0);

    rangeMultiValue_4.getEndQuantity().setValue(1.0);

    rangeMultiValue_4.getEndQuantity().setUnits(units_0);

    deltaMultiValue_4.setNValues(2);

    deltaMultiValue_4.getStartQuantity().setValue(0.0);

    deltaMultiValue_4.getStartQuantity().setUnits(units_0);

    deltaMultiValue_4.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_4.getDeltaQuantity().setUnits(units_0);

    multiValue_4.getValueQuantities().setUnits(units_0);

    multiValue_4.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_3.setValueMode(ValueMode.SINGLE);

    constrainedPlaneSection_3.setBatched(false);

    partDisplayer_7.getVisibleParts().addParts();

    partDisplayer_7.getHiddenParts().addParts();

    scene_2.getCreatorGroup().setQuery(null);

    scene_2.getCreatorGroup().setObjects(region_0);

    constrainedPlaneSection_3.setBatched(true);

    constrainedPlaneSection_3.setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getInputParts().setQuery(null);

    constrainedPlaneSection_3.getInputParts().setObjects(region_0);

    constrainedPlaneSection_3.getOriginCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits0(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits1(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setUnits2(units_0);

    constrainedPlaneSection_3.getOriginCoordinate().setDefinition("");

    constrainedPlaneSection_3.getOriginCoordinate().setValue(new DoubleVector(new double[] {4.404967696428407, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_3.getOriginCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {4.404967696428407, 2.220446049250313E-16, 2.220446049250313E-16}));

    constrainedPlaneSection_3.getNormalCoordinate().setCoordinateSystem(labCoordinateSystem_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits0(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits1(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setUnits2(units_0);

    constrainedPlaneSection_3.getNormalCoordinate().setDefinition("");

    constrainedPlaneSection_3.getNormalCoordinate().setValue(new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_3.getNormalCoordinate().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    constrainedPlaneSection_3.setLoop(new DoubleVector(new double[] {4.404967696428407, 1.716331667131238, -0.007088038573035665, 4.404967696428407, 1.6841780538475186, -0.19403843523848952, 4.404967696428407, 1.6627392580246063, -0.40608481008624897, 4.404967696428407, 1.5207743329269028, -0.7936843777047208, 4.404967696428407, 0.9645202321916265, -1.4211866746718695, 4.404967696428407, 0.49280835103634607, -1.64347318689864, 4.404967696428407, -0.00793387928288436, -1.7143846799349833, 4.404967696428407, -0.7978293739399283, -1.5068720190811304, 4.404967696428407, -1.3029303039953057, -1.0892680984256817, 4.404967696428407, -1.569735717734941, -0.6877513385989975, 4.404967696428407, -1.721460866989284, -0.01526305179263332}));

    singleValue_4.getValueQuantity().setValue(0.0);

    singleValue_4.getValueQuantity().setUnits(units_0);

    rangeMultiValue_4.setNValues(2);

    rangeMultiValue_4.getStartQuantity().setValue(0.0);

    rangeMultiValue_4.getStartQuantity().setUnits(units_0);

    rangeMultiValue_4.getEndQuantity().setValue(1.0);

    rangeMultiValue_4.getEndQuantity().setUnits(units_0);

    deltaMultiValue_4.setNValues(2);

    deltaMultiValue_4.getStartQuantity().setValue(0.0);

    deltaMultiValue_4.getStartQuantity().setUnits(units_0);

    deltaMultiValue_4.getDeltaQuantity().setValue(1.0);

    deltaMultiValue_4.getDeltaQuantity().setUnits(units_0);

    multiValue_4.getValueQuantities().setUnits(units_0);

    multiValue_4.getValueQuantities().setArray(new DoubleVector(new double[] {0.0}));

    constrainedPlaneSection_3.setValueMode(ValueMode.SINGLE);

    constrainedPlaneSection_3.setBatched(false);

    partDisplayer_7.getVisibleParts().addParts();

    partDisplayer_7.getHiddenParts().addParts();

    currentView_2.setInput(new DoubleVector(new double[] {-1.989409041211477, 1.523402857788892, -0.06228978449796613}), new DoubleVector(new double[] {12.489322185030307, 2.9603859786709217, 0.33327554408696625}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {-1.7509386379892735, -0.522172574065086, -1.3681134628196165}), new DoubleVector(new double[] {12.728014501333899, 0.9148325712158573, -0.9725420714713392}), new DoubleVector(new double[] {-0.09917272995905367, 0.994947897676849, 0.015602901682759868}), 42.8050596437871, 0, 30.0);

    scene_2.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    currentView_2.setInput(new DoubleVector(new double[] {-2.019429820773785, -0.5165963283894133, -1.592060050214426}), new DoubleVector(new double[] {0.9481999682210813, -2.31284554201334, 12.543594524700598}), new DoubleVector(new double[] {0.026748912391408322, 0.9923546952541079, 0.12048507996032443}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {-1.0059978106595153, 1.555467650508855, -1.9616689066566977}), new DoubleVector(new double[] {8.457843215661264, -4.172813236962709, 43.11726519626933}), new DoubleVector(new double[] {0.026748912391408322, 0.9923546952541079, 0.12048507996032443}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {9.506166619520231, 1.9822401800800107, -4.002163044585698}), new DoubleVector(new double[] {18.947792073128618, -3.732594048659786, 40.97095204304034}), new DoubleVector(new double[] {0.026748912391408322, 0.9923546952541079, 0.12048507996032443}), 42.8050596437871, 0, 30.0);

    constrainedPlaneSection_3.setPresentationName("Nozzle Exit");

    MassFlowAverageReport massFlowAverageReport_0 = 
      simulation_0.getReportManager().create("star.flow.MassFlowAverageReport");

    ThrustReport thrustReport_0 = 
      simulation_0.getReportManager().create("star.flow.ThrustReport");

    Units units_10 = 
      ((Units) simulation_0.getUnitsManager().getObject("MN"));

    thrustReport_0.setUnits(units_10);

    Units units_2 = 
      ((Units) simulation_0.getUnitsManager().getObject("Pa"));

    thrustReport_0.getReferencePressure().setValueAndUnits(500.0, units_2);

    thrustReport_0.getParts().setQuery(null);

    thrustReport_0.getParts().setObjects(constrainedPlaneSection_3);

    currentView_2.setInput(new DoubleVector(new double[] {18.029511625591244, 3.5245157614146256, -6.049457894471658}), new DoubleVector(new double[] {34.53851619643153, -6.468067069521834, 72.58756982862995}), new DoubleVector(new double[] {0.026748912391408322, 0.9923546952541079, 0.12048507996032443}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {7.924336680137584, 2.430615699095603, -4.285529677530839}), new DoubleVector(new double[] {17.98678625366206, -3.6599914246776226, 43.64474514189645}), new DoubleVector(new double[] {0.026748912391408322, 0.9923546952541079, 0.12048507996032443}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {2.8338391182462344, 1.8740188397745308, -3.4318820133685293}), new DoubleVector(new double[] {9.600489321658687, -2.221704336957887, 28.799574302182812}), new DoubleVector(new double[] {0.026748912391408322, 0.9923546952541079, 0.12048507996032443}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {8.790968582674052, 2.5291142118343073, -4.4566700028168}), new DoubleVector(new double[] {19.423135100980822, -3.9063316171737865, 46.187326712375025}), new DoubleVector(new double[] {0.026748912391408322, 0.9923546952541079, 0.12048507996032443}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {15.931182449950152, 3.2997620684910522, -5.584588699953827}), new DoubleVector(new double[] {31.163014847604956, -5.919773019005746, 66.96890908292627}), new DoubleVector(new double[] {0.026748912391408322, 0.9923546952541079, 0.12048507996032443}), 42.8050596437871, 0, 30.0);

    PrimitiveFieldFunction primitiveFieldFunction_1 = 
      ((PrimitiveFieldFunction) simulation_0.getFieldFunctionManager().getFunction("Velocity"));

    VectorMagnitudeFieldFunction vectorMagnitudeFieldFunction_0 = 
      ((VectorMagnitudeFieldFunction) primitiveFieldFunction_1.getMagnitudeFunction());

    massFlowAverageReport_0.setFieldFunction(vectorMagnitudeFieldFunction_0);

    massFlowAverageReport_0.getParts().setQuery(null);

    massFlowAverageReport_0.getParts().setObjects(constrainedPlaneSection_3);

    ElementCountReport elementCountReport_0 = 
      simulation_0.getReportManager().create("star.base.report.ElementCountReport");

    Scene scene_1 = 
      simulation_0.getSceneManager().getScene("Mesh Scene 1");

    SceneUpdate sceneUpdate_1 = 
      scene_1.getSceneUpdate();

    HardcopyProperties hardcopyProperties_1 = 
      sceneUpdate_1.getHardcopyProperties();

    hardcopyProperties_1.setCurrentResolutionWidth(886);
  }

  private void execute5() {

    Simulation simulation_0 = 
      getActiveSimulation();

    Scene scene_1 = 
      simulation_0.getSceneManager().getScene("Mesh Scene 1");

    SceneUpdate sceneUpdate_1 = 
      scene_1.getSceneUpdate();

    HardcopyProperties hardcopyProperties_1 = 
      sceneUpdate_1.getHardcopyProperties();

    hardcopyProperties_1.setCurrentResolutionHeight(649);

    ElementCountReport elementCountReport_0 = 
      ((ElementCountReport) simulation_0.getReportManager().getReport("Element Count 1"));

    ReportAnnotation reportAnnotation_0 = 
      simulation_0.getAnnotationManager().createReportAnnotation(elementCountReport_0);

    scene_1.getAnnotationPropManager().getAnnotationGroup().addObjects(reportAnnotation_0);

    elementCountReport_0.getParts().setQuery(null);

    Region region_0 = 
      simulation_0.getRegionManager().getRegion("Nozzle");

    Boundary boundary_3 = 
      region_0.getBoundaryManager().getBoundary("Convergent");

    Boundary boundary_2 = 
      region_0.getBoundaryManager().getBoundary("Divergent");

    Boundary boundary_4 = 
      region_0.getBoundaryManager().getBoundary("FlowStab");

    Boundary boundary_1 = 
      region_0.getBoundaryManager().getBoundary("Freestream");

    Boundary boundary_0 = 
      region_0.getBoundaryManager().getBoundary("Inlet");

    Boundary boundary_5 = 
      region_0.getBoundaryManager().getBoundary("Symmetry");

    Boundary boundary_6 = 
      region_0.getBoundaryManager().getBoundary("Throat");

    Boundary boundary_7 = 
      region_0.getBoundaryManager().getBoundary("Wall");

    elementCountReport_0.getParts().setObjects(region_0, boundary_3, boundary_2, boundary_4, boundary_1, boundary_0, boundary_5, boundary_6, boundary_7);

    CurrentView currentView_1 = 
      scene_1.getCurrentView();

    currentView_1.setInput(new DoubleVector(new double[] {7.212876830981604, 5.766745963827544, 3.200866255643374}), new DoubleVector(new double[] {10.594488545848382, 0.6584825850027933, 23.553907414357763}), new DoubleVector(new double[] {0.016845685857530816, 0.9704374298602586, 0.24076423653557003}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {7.0083739424106914, 2.2649263273995395, -0.2996328312657185}), new DoubleVector(new double[] {10.794551662106885, -3.454474544739986, 22.488385859466774}), new DoubleVector(new double[] {0.016845685857530816, 0.9704374298602586, 0.24076423653557003}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {5.7141905421337835, 1.4848835046782303, -4.753786997027176}), new DoubleVector(new double[] {14.054501484930082, 15.550235016359741, 12.929085640135455}), new DoubleVector(new double[] {-0.21724110817277886, 0.8112595182078927, -0.5428298951212364}), 42.805059643573344, 0, 30.0);

    PartDisplayer partDisplayer_6 = 
      ((PartDisplayer) scene_1.getDisplayerManager().getObject("Mesh 1"));

    partDisplayer_6.getInputParts().setQuery(null);

    partDisplayer_6.getInputParts().setObjects(boundary_3, boundary_2, boundary_4, boundary_0, boundary_5, boundary_6);

    currentView_1.setInput(new DoubleVector(new double[] {7.239823295031137, 4.330547711772159, -0.7255079902355263}), new DoubleVector(new double[] {15.695294544194601, 6.762915611676246, -17.20939358044266}), new DoubleVector(new double[] {-0.8810946587280685, 0.21775089826638683, -0.4198294280602894}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {6.093764915584016, 4.180067374025529, -0.5251116494327609}), new DoubleVector(new double[] {0.17768218873429475, 5.336888958045723, -21.435834047511413}), new DoubleVector(new double[] {-0.9493867968602016, 0.14845399755452426, 0.2768142347459604}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.4603423939676414, -0.10316063219745364, -1.1224582606447975}), new DoubleVector(new double[] {-3.0930822596040772, 0.9827473581227828, -20.751345592198525}), new DoubleVector(new double[] {-0.9493867968602016, 0.14845399755452426, 0.2768142347459604}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.5223200986378576, -0.05114043244714794, -0.7303852928720173}), new DoubleVector(new double[] {1.9010006267678148, -6.319741530244033, -20.163129355709486}), new DoubleVector(new double[] {-0.9937914733010637, 0.11118349599937156, -0.0040911870953874805}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.5428863942340105, 0.15393298826758506, 0.03553340419132864}), new DoubleVector(new double[] {2.5897489594889076, 1.0701297380086128, -20.94249884393383}), new DoubleVector(new double[] {-0.9936936851990051, 0.11209683047308872, 0.002675928605032179}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {2.5513434306883247, 0.1531282602056827, 0.12692326805875323}), new DoubleVector(new double[] {-0.25049468503047034, 0.012483014199402342, -20.64709394268268}), new DoubleVector(new double[] {-0.985144519648526, 0.1096950356939824, 0.132125979848664}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {1.4477674362059854, 2.1120705715721235, -0.3240058356817004}), new DoubleVector(new double[] {-1.7055306131968058, 12.715535463877059, 17.601945927186904}), new DoubleVector(new double[] {-0.469847118949824, -0.7935249043719036, 0.38673235054300864}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {0.06488940371660257, 11.314261927657245, 5.00477699664424}), new DoubleVector(new double[] {0.004241224041554026, 26.50325778592405, -2.9877424317118138}), new DoubleVector(new double[] {-0.5984000898843657, 0.3712205831196359, 0.710008880997356}), 42.805059643573344, 0, 30.0);

    scene_1.setViewOrientation(new DoubleVector(new double[] {0.0, 0.0, 1.0}), new DoubleVector(new double[] {0.0, 1.0, 0.0}));

    currentView_1.setInput(new DoubleVector(new double[] {4.604552278977801, 4.834259275066669, -3.063489728560853E-8}), new DoubleVector(new double[] {4.604552278977801, 4.834259275066669, 22.168390840960154}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {4.463317322880496, 7.002215851160294, -0.28945178500200086}), new DoubleVector(new double[] {4.463317322880496, 7.002215851160294, 39.27265707805891}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {8.452033692561148, 2.1054990070807853, -6.636516687308358E-7}), new DoubleVector(new double[] {8.452033692561148, 2.1054990070807853, 39.27265707805891}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.805059643573344, 0, 30.0);

    currentView_1.setInput(new DoubleVector(new double[] {7.461094802392982, 2.341453746937061, 4.492768165494467}), new DoubleVector(new double[] {-9.016071207954715, 6.264869669062836, 39.92511855136373}), new DoubleVector(new double[] {0.02203468556201834, 0.9947532703063898, -0.09990197118640214}), 42.805059643573344, 0, 30.0);

    Scene scene_2 = 
      simulation_0.getSceneManager().getScene("Scalar Scene 1");

    scene_2.setPresentationName("Mach Number");

    simulation_0.getSceneManager().createScalarScene("Scalar Scene", "Outline", "Scalar", null);

    Scene scene_3 = 
      simulation_0.getSceneManager().getScene("Scalar Scene 1");

    scene_3.initializeAndWait();

    ScalarDisplayer scalarDisplayer_1 = 
      ((ScalarDisplayer) scene_3.getDisplayerManager().getObject("Scalar 1"));

    Legend legend_1 = 
      scalarDisplayer_1.getLegend();

    BlueRedLookupTable blueRedLookupTable_0 = 
      ((BlueRedLookupTable) simulation_0.get(LookupTableManager.class).getObject("blue-red"));

    legend_1.setLookupTable(blueRedLookupTable_0);

    SceneUpdate sceneUpdate_3 = 
      scene_3.getSceneUpdate();

    HardcopyProperties hardcopyProperties_3 = 
      sceneUpdate_3.getHardcopyProperties();

    hardcopyProperties_3.setCurrentResolutionWidth(25);

    hardcopyProperties_3.setCurrentResolutionHeight(25);

    SceneUpdate sceneUpdate_2 = 
      scene_2.getSceneUpdate();

    HardcopyProperties hardcopyProperties_2 = 
      sceneUpdate_2.getHardcopyProperties();

    hardcopyProperties_2.setCurrentResolutionWidth(888);

    hardcopyProperties_2.setCurrentResolutionHeight(650);

    hardcopyProperties_3.setCurrentResolutionWidth(886);

    hardcopyProperties_3.setCurrentResolutionHeight(649);

    scene_3.resetCamera();

    scene_3.setPresentationName("AMR");

    scene_1.setPresentationName("Mesh ");

    Scene scene_0 = 
      simulation_0.getSceneManager().getScene("Geometry Scene 1");

    scene_0.setPresentationName("Geometry");

    legend_1.updateLayout(new DoubleVector(new double[] {0.73, 0.08}), 0.19999999999999996, 0.035, 0);

    Units units_1 = 
      ((Units) simulation_0.getUnitsManager().getObject(""));

    scalarDisplayer_1.getScalarDisplayQuantity().getMinimumValue().setValueAndUnits(0.0, units_1);

    scalarDisplayer_1.getScalarDisplayQuantity().getMaximumValue().setValueAndUnits(0.0, units_1);

    scalarDisplayer_1.getScalarDisplayQuantity().setClip(ClipMode.NONE);

    UserFieldFunction userFieldFunction_4 = 
      ((UserFieldFunction) simulation_0.getFieldFunctionManager().getFunction("UserFieldFunction_5"));

    scalarDisplayer_1.getScalarDisplayQuantity().setFieldFunction(userFieldFunction_4);

    scalarDisplayer_1.getScalarDisplayQuantity().setAutoRange(AutoRangeMode.BOTH);

    legend_1.setLookupTable(blueRedLookupTable_0);

    LatestMeshProxyRepresentation latestMeshProxyRepresentation_0 = 
      ((LatestMeshProxyRepresentation) simulation_0.getRepresentationManager().getObject("Latest Surface/Volume"));

    scalarDisplayer_1.setRepresentation(latestMeshProxyRepresentation_0);

    legend_1.setLevels(512);

    ScalarDisplayer scalarDisplayer_0 = 
      ((ScalarDisplayer) scene_2.getDisplayerManager().getObject("Scalar 1"));

    Legend legend_0 = 
      scalarDisplayer_0.getLegend();

    legend_0.setLevels(512);

    scalarDisplayer_1.getInputParts().setQuery(null);

    scalarDisplayer_1.getInputParts().setObjects(boundary_3, boundary_2, boundary_4, boundary_0, boundary_5, boundary_6);

    CurrentView currentView_3 = 
      scene_3.getCurrentView();

    currentView_3.setInput(new DoubleVector(new double[] {-10.901029016947302, 10.251496495300737, 41.366625180770626}), new DoubleVector(new double[] {-166.85596473725622, 46.490836376150796, 33.745120731275044}), new DoubleVector(new double[] {0.2309489604016937, 0.9463342546199663, -0.22608417950456633}), 42.8050596437871, 0, 30.0);

    currentView_3.setInput(new DoubleVector(new double[] {32.90424637202155, -8.327860776410546, 2.02177960480436}), new DoubleVector(new double[] {-7.117248558762097, 0.9719574732501239, 0.06593255013040245}), new DoubleVector(new double[] {0.2309489604016937, 0.9463342546199663, -0.22608417950456633}), 42.8050596437871, 0, 30.0);

    currentView_3.setInput(new DoubleVector(new double[] {29.16153915441561, -7.325439579932692, 0.8416337853244817}), new DoubleVector(new double[] {-4.113430779381041, 3.071250746420981, -20.804774216059087}), new DoubleVector(new double[] {0.39467131883983264, 0.9023303046082232, -0.1733048512617641}), 42.8050596437871, 0, 30.0);

    currentView_3.setInput(new DoubleVector(new double[] {20.241140356843886, -7.009322377622949, 10.151358311878274}), new DoubleVector(new double[] {-11.085595873437807, 2.7786466624573007, -10.227662770381505}), new DoubleVector(new double[] {0.39467131883983264, 0.9023303046082232, -0.1733048512617641}), 42.8050596437871, 0, 30.0);

    currentView_3.setInput(new DoubleVector(new double[] {18.491712333895705, 0.8186785277969522, -5.321038941088154}), new DoubleVector(new double[] {47.19130462186868, 11.870561957381035, -26.060979039922138}), new DoubleVector(new double[] {0.4282590112556455, 0.40440374493242265, 0.8081162233014381}), 42.8050596437871, 0, 30.0);

    scalarDisplayer_1.getInputParts().setQuery(null);

    ConstrainedPlaneSection constrainedPlaneSection_3 = 
      ((ConstrainedPlaneSection) simulation_0.getPartManager().getObject("Nozzle Exit"));

    scalarDisplayer_1.getInputParts().setObjects(boundary_3, boundary_2, boundary_4, boundary_0, boundary_5, boundary_6, constrainedPlaneSection_3);

    currentView_3.setInput(new DoubleVector(new double[] {21.068066012964167, 4.692074793421847, -9.396935802852994}), new DoubleVector(new double[] {28.059823449568455, 33.64679978886033, -34.63050490558501}), new DoubleVector(new double[] {0.5089264246653525, 0.49242346744959203, 0.7060545467471148}), 42.8050596437871, 0, 30.0);

    currentView_3.setInput(new DoubleVector(new double[] {10.712269236666383, -4.771176711463956, 2.268024657204639}), new DoubleVector(new double[] {20.643694867470703, 36.357495236893755, -33.57494003598374}), new DoubleVector(new double[] {0.5089264246653525, 0.49242346744959203, 0.7060545467471148}), 42.8050596437871, 0, 30.0);

    scene_3.setViewOrientation(new DoubleVector(new double[] {0.0, 0.0, 1.0}), new DoubleVector(new double[] {0.0, 1.0, 0.0}));

    currentView_3.setInput(new DoubleVector(new double[] {11.999118473767087, -0.7199846687395208, -8.703785425723254E-7}), new DoubleVector(new double[] {11.999118473767087, -0.7199846687395208, 57.71997673549466}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 42.8050596437871, 0, 30.0);

    PartDisplayer partDisplayer_9 = 
      ((PartDisplayer) scene_3.getDisplayerManager().getObject("Outline 1"));

    partDisplayer_9.getInputParts().setQuery(null);

    partDisplayer_9.getInputParts().setObjects(boundary_3, boundary_2, boundary_4, boundary_1, boundary_0, boundary_5, boundary_6);

    currentView_3.setInput(new DoubleVector(new double[] {10.058957232844563, -0.3145769316893492, 7.663029769720178}), new DoubleVector(new double[] {-17.335907798507105, 5.409736081528484, 58.144208690811766}), new DoubleVector(new double[] {0.02510929284974099, 0.9947532703063913, -0.0991738606051612}), 42.8050596437871, 0, 30.0);

    partDisplayer_9.getInputParts().setQuery(null);

    partDisplayer_9.getInputParts().setObjects(boundary_3, boundary_2, boundary_4, boundary_0, boundary_5, boundary_6);

    currentView_3.setInput(new DoubleVector(new double[] {14.593972951264286, -1.2329730826750338, -1.3473849441009813}), new DoubleVector(new double[] {-5.366172800201063, 1.8472904945132331, 59.826911059930566}), new DoubleVector(new double[] {0.0035851845761220445, 0.9987863828742242, -0.04912135825274983}), 42.8050596437871, 0, 30.0);

    MassFlowAverageReport massFlowAverageReport_0 = 
      ((MassFlowAverageReport) simulation_0.getReportManager().getReport("Mass Flow Averaged 1"));

    simulation_0.getMonitorManager().createMonitorAndPlot(new ArrayList<>(Arrays.<Report>asList(massFlowAverageReport_0)), true, "%1$s Plot");

    ReportMonitor reportMonitor_0 = 
      ((ReportMonitor) simulation_0.getMonitorManager().getMonitor("Mass Flow Averaged 1 Monitor"));

    MonitorPlot monitorPlot_0 = 
      simulation_0.getPlotManager().createMonitorPlot(new ArrayList<>(Arrays.<Monitor>asList(reportMonitor_0)), "Mass Flow Averaged 1 Monitor Plot");

    monitorPlot_0.openInteractive();

    PlotUpdate plotUpdate_0 = 
      monitorPlot_0.getPlotUpdate();

    HardcopyProperties hardcopyProperties_4 = 
      plotUpdate_0.getHardcopyProperties();

    hardcopyProperties_4.setCurrentResolutionWidth(25);

    hardcopyProperties_4.setCurrentResolutionHeight(25);

    hardcopyProperties_3.setCurrentResolutionWidth(888);

    hardcopyProperties_3.setCurrentResolutionHeight(650);

    hardcopyProperties_4.setCurrentResolutionWidth(886);

    hardcopyProperties_4.setCurrentResolutionHeight(649);

    ThrustReport thrustReport_0 = 
      ((ThrustReport) simulation_0.getReportManager().getReport("Thrust 1"));

    simulation_0.getMonitorManager().createMonitorAndPlot(new ArrayList<>(Arrays.<Report>asList(thrustReport_0)), true, "%1$s Plot");

    ReportMonitor reportMonitor_1 = 
      ((ReportMonitor) simulation_0.getMonitorManager().getMonitor("Thrust 1 Monitor"));

    MonitorPlot monitorPlot_1 = 
      simulation_0.getPlotManager().createMonitorPlot(new ArrayList<>(Arrays.<Monitor>asList(reportMonitor_1)), "Thrust 1 Monitor Plot");

    monitorPlot_1.openInteractive();

    PlotUpdate plotUpdate_1 = 
      monitorPlot_1.getPlotUpdate();

    HardcopyProperties hardcopyProperties_5 = 
      plotUpdate_1.getHardcopyProperties();

    hardcopyProperties_5.setCurrentResolutionWidth(25);

    hardcopyProperties_5.setCurrentResolutionHeight(25);

    hardcopyProperties_4.setCurrentResolutionWidth(888);

    hardcopyProperties_4.setCurrentResolutionHeight(650);

    hardcopyProperties_5.setCurrentResolutionWidth(886);

    hardcopyProperties_5.setCurrentResolutionHeight(649);

    SceneUpdate sceneUpdate_0 = 
      scene_0.getSceneUpdate();

    HardcopyProperties hardcopyProperties_0 = 
      sceneUpdate_0.getHardcopyProperties();

    hardcopyProperties_0.setCurrentResolutionWidth(886);

    scene_0.closeInteractive();

    hardcopyProperties_1.setCurrentResolutionWidth(888);

    hardcopyProperties_1.setCurrentResolutionHeight(650);

    scene_1.closeInteractive();

    scene_2.closeInteractive();

    scene_3.closeInteractive();

    monitorPlot_0.closeInteractive();

    monitorPlot_1.closeInteractive();

    ResidualPlot residualPlot_0 = 
      ((ResidualPlot) simulation_0.getPlotManager().getPlot("Residuals"));

    residualPlot_0.getDataSetManager().addDataProviders(new ArrayList<>(Arrays.<ClientServerObject>asList(reportMonitor_0, reportMonitor_1)));

    AmrSolver amrSolver_0 = 
      ((AmrSolver) simulation_0.getSolverManager().getSolver(AmrSolver.class));

    AmrStarUpdate amrStarUpdate_0 = 
      amrSolver_0.getAmrTrigger();

    IterationUpdateFrequency iterationUpdateFrequency_0 = 
      amrStarUpdate_0.getIterationUpdateFrequency();

    IntegerValue integerValue_2 = 
      iterationUpdateFrequency_0.getIterationFrequencyQuantity();

    integerValue_2.getQuantity().setValue(1000.0);

    CoupledImplicitSolver coupledImplicitSolver_0 = 
      ((CoupledImplicitSolver) simulation_0.getSolverManager().getSolver(CoupledImplicitSolver.class));

    coupledImplicitSolver_0.setUseEnhancedDissipation(true);

    AMGLinearSolver aMGLinearSolver_0 = 
      coupledImplicitSolver_0.getAMGLinearSolver();

    aMGLinearSolver_0.getSmootherOption().setSelected(AMGSmootherOption.Type.ILU);

    aMGLinearSolver_0.setConvergeTol(0.001);

    StepStoppingCriterion stepStoppingCriterion_0 = 
      ((StepStoppingCriterion) simulation_0.getSolverStoppingCriterionManager().getSolverStoppingCriterion("Maximum Steps"));

    IntegerValue integerValue_3 = 
      stepStoppingCriterion_0.getMaximumNumberStepsObject();

    integerValue_3.getQuantity().setValue(5000.0);

    PhysicsContinuum physicsContinuum_0 = 
      ((PhysicsContinuum) simulation_0.getContinuumManager().getContinuum("Physics 1"));

    AmrModel amrModel_0 = 
      physicsContinuum_0.getModelManager().getModel(AmrModel.class);

    UserDefinedAmrCriterion userDefinedAmrCriterion_0 = 
      ((UserDefinedAmrCriterion) amrModel_0.getCriterionManager().getObject("User-Defined Mesh Adaption 1"));

    AmrRequestProfile amrRequestProfile_0 = 
      userDefinedAmrCriterion_0.getAmrRequestProfile();

    amrRequestProfile_0.getMethod(AmrFunctionProfileMethod.class).getRange().setArray(new DoubleVector(new double[] {100.0, 500.0}));

    Units units_0 = 
      ((Units) simulation_0.getUnitsManager().getObject("m"));

    physicsContinuum_0.getReferenceValues().get(MinimumAllowableWallDistance.class).setValueAndUnits(1.0E-8, units_0);

    Units units_4 = 
      simulation_0.getUnitsManager().getPreferredUnits(Dimensions.Builder().velocity(1).build());

    UserFieldFunction userFieldFunction_3 = 
      ((UserFieldFunction) simulation_0.getFieldFunctionManager().getFunction("UserFieldFunction_4"));

    userFieldFunction_3.setDefinition("${Mass Flow Averaged 1}/9.81");

    simulation_0.getSceneManager().createVectorScene("Vector Scene", "Outline", "Vector", null);

    Scene scene_4 = 
      simulation_0.getSceneManager().getScene("Vector Scene 1");

    scene_4.initializeAndWait();

    VectorDisplayer vectorDisplayer_0 = 
      ((VectorDisplayer) scene_4.getDisplayerManager().getObject("Vector 1"));

    Legend legend_2 = 
      vectorDisplayer_0.getLegend();

    legend_2.setLookupTable(blueRedLookupTable_0);

    SceneUpdate sceneUpdate_4 = 
      scene_4.getSceneUpdate();

    HardcopyProperties hardcopyProperties_6 = 
      sceneUpdate_4.getHardcopyProperties();

    hardcopyProperties_6.setCurrentResolutionWidth(886);

    hardcopyProperties_6.setCurrentResolutionHeight(649);

    scene_4.resetCamera();

    vectorDisplayer_0.getInputParts().setQuery(null);

    vectorDisplayer_0.getInputParts().setObjects(boundary_3, boundary_2, boundary_4, boundary_0, boundary_5, boundary_6, boundary_7);

    CurrentView currentView_4 = 
      scene_4.getCurrentView();

    currentView_4.setInput(new DoubleVector(new double[] {33.20261844508211, 0.0174186868883206, -2.063017361540033}), new DoubleVector(new double[] {50.77095038926834, -22.87629080698429, 155.60927202029185}), new DoubleVector(new double[] {0.007891492038486797, 0.989716409800523, 0.14282560178402437}), 42.8050596437871, 0, 30.0);

    vectorDisplayer_0.setDisplayMode(VectorDisplayMode.VECTOR_DISPLAY_MODE_LIC);

    currentView_4.setInput(new DoubleVector(new double[] {2.408166474540362, -1.7231773091551759, 13.712269623830407}), new DoubleVector(new double[] {-115.60723054856923, 15.568835370838528, -93.032743113491}), new DoubleVector(new double[] {0.022720127679015566, 0.990538415675745, 0.13534194792764814}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {-2.2646184695252476, 3.274658541307115, -15.173197248276917}), new DoubleVector(new double[] {125.33407900613959, 18.605791879785848, -94.29880794025826}), new DoubleVector(new double[] {0.015549255732998661, 0.976642766472434, 0.21430615330232602}), 42.8050596437871, 0, 30.0);

    vectorDisplayer_0.getInputParts().setQuery(null);

    vectorDisplayer_0.getInputParts().setObjects(boundary_3, boundary_2, boundary_4, boundary_0, boundary_5, boundary_6, constrainedPlaneSection_3);

    currentView_4.setInput(new DoubleVector(new double[] {-6.453295489658073, 1.7052838292741823, -8.43939136404058}), new DoubleVector(new double[] {-150.11736976738348, -9.248814642759848, 56.17689744790084}), new DoubleVector(new double[] {0.05605281285198149, 0.9563635016567071, 0.28675239296357724}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {-23.39064990438547, -1.30065358096099, 12.965856467044697}), new DoubleVector(new double[] {-36.93461467757457, -20.65199690616765, 166.36843224310297}), new DoubleVector(new double[] {0.16246361510979535, 0.9770731900038937, 0.13759925559794292}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {43.27353656333697, -5.378881564526463, 3.8967315416638773}), new DoubleVector(new double[] {28.48414487182804, -26.509665717176038, 171.4053464584395}), new DoubleVector(new double[] {0.16246361510979535, 0.9770731900038937, 0.13759925559794292}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {43.6070074551042, -4.508963223590457, 7.146222346793218}), new DoubleVector(new double[] {58.60723620657807, 35.83890200174058, 175.0501242193931}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {27.265734905996617, -15.648127713518207, -0.4901976757354827}), new DoubleVector(new double[] {43.25288349069639, 27.35437092300615, 178.4607151178016}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {11.8643260449875, -6.103625095851992, -0.9070600006108833}), new DoubleVector(new double[] {19.57003249824191, 14.623312512437735, 85.34616997490954}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {6.693543873045008, -3.152239235813755, -0.38351218544149646}), new DoubleVector(new double[] {10.757159407547459, 7.778141535716583, 45.10225441568669}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {9.394225942190248, -4.4256736890750705, -2.4122594504637647}), new DoubleVector(new double[] {15.544886911149185, 12.118476665823705, 66.43468901238823}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {16.44157248633351, -6.490784060472333, -2.953522307932758}), new DoubleVector(new double[] {27.33293414839749, 22.804982006969613, 118.95809317903156}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    Solution solution_0 = 
      simulation_0.getSolution();

    solution_0.initializeSolution();

    MassFractionProfile massFractionProfile_3 = 
      region_0.get(RegionInitialConditionManager.class).get(MassFractionProfile.class);

    ScalarProfile scalarProfile_1 = 
      massFractionProfile_3.getMethod(CompositeArrayProfileMethod.class).getProfile(1);

    scalarProfile_1.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValueAndUnits(1.0, units_1);

    UserFieldFunction userFieldFunction_5 = 
      simulation_0.getFieldFunctionManager().createFieldFunction();

    userFieldFunction_5.getTypeOption().setSelected(FieldFunctionTypeOption.Type.SCALAR);

    userFieldFunction_5.setPresentationName("Mars Inlet");

    userFieldFunction_5.setDefinition("(($$Position[0] > -2.2007383216932266 && $$Position[0] < -0.7388313921205055) &&  ($$Position[1] > -0.625 && $$Position[1] < 0.625) &&  ($$Position[2] > -0.6211526079148225 && $$Position[2] < 0.0)) ? 0.0 : 1.0 ");

    scalarProfile_1.setMethod(FunctionScalarProfileMethod.class);

    scalarProfile_1.getMethod(FunctionScalarProfileMethod.class).setFieldFunction(userFieldFunction_5);

    currentView_4.setInput(new DoubleVector(new double[] {11.230592405537308, -3.9083243215679637, -0.5964622714064944}), new DoubleVector(new double[] {17.558725833219505, 13.113194409801121, 70.237010449726}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {2.35866947353522, -1.9640291716062341, -2.2634904790629413}), new DoubleVector(new double[] {4.429120195681412, 3.605103678093524, 20.911939752234726}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {2.35866947353522, -1.9640291716062341, -2.2634904790629413}), new DoubleVector(new double[] {4.429120195681412, 3.605103678093524, 20.911939752234726}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    UserFieldFunction userFieldFunction_2 = 
      ((UserFieldFunction) simulation_0.getFieldFunctionManager().getFunction("Methalox Inlet"));

    userFieldFunction_2.setDefinition("(($$Position[0] > -2.5 && $$Position[0] < -0.7388313921205055) &&  ($$Position[1] > -0.625 && $$Position[1] < 0.625) &&  ($$Position[2] > -0.6211526079148225 && $$Position[2] < 0.0)) ? 1.0 : 0.0 ");

    userFieldFunction_5.setDefinition("(($$Position[0] > -2.5 && $$Position[0] < -0.7388313921205055) &&  ($$Position[1] > -0.625 && $$Position[1] < 0.625) &&  ($$Position[2] > -0.6211526079148225 && $$Position[2] < 0.0)) ? 0.0 : 1.0 ");

    solution_0.initializeSolution();

    currentView_4.setInput(new DoubleVector(new double[] {33.56420230813828, -4.580857300091747, -6.7202924495576895}), new DoubleVector(new double[] {46.059204733158666, 29.028408410964285, 133.14155204813943}), new DoubleVector(new double[] {0.16260459384001372, 0.9559814597141247, -0.24425231778841414}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {34.53273045788259, -2.899129247652109, -0.6858835898830263}), new DoubleVector(new double[] {112.08186324264463, 57.94201531321498, 98.26516436211422}), new DoubleVector(new double[] {0.04594874003995345, 0.834489053572832, -0.5491053931222124}), 42.8050596437871, 0, 30.0);

    currentView_4.setInput(new DoubleVector(new double[] {33.507110286365155, -3.075516031723414, 1.4870307215717586}), new DoubleVector(new double[] {26.004500695079567, 18.514745248483933, 144.1772839423958}), new DoubleVector(new double[] {0.16770585910798905, 0.9760084501520842, -0.13886054174107448}), 42.8050596437871, 0, 30.0);

    scene_4.closeInteractive();

    scene_2.openInteractive();

    hardcopyProperties_2.setCurrentResolutionWidth(886);

    hardcopyProperties_2.setCurrentResolutionHeight(649);

    scene_3.openInteractive();

    hardcopyProperties_2.setCurrentResolutionWidth(888);

    hardcopyProperties_2.setCurrentResolutionHeight(650);

    hardcopyProperties_3.setCurrentResolutionWidth(886);

    hardcopyProperties_3.setCurrentResolutionHeight(649);

    currentView_3.setInput(new DoubleVector(new double[] {14.269522584443605, -1.1788377722591754, -0.12471678097031368}), new DoubleVector(new double[] {11.464313491783319, 0.23367775160529947, 63.474443122755766}), new DoubleVector(new double[] {-0.001293509608642151, 0.9997513522528666, -0.022261188231424093}), 42.8050596437871, 0, 30.0);

    currentView_3.setInput(new DoubleVector(new double[] {14.860336495250959, -0.3538021688265234, -0.005023042587680493}), new DoubleVector(new double[] {9.4041100278348, 2.3935882510571873, 123.69749185374704}), new DoubleVector(new double[] {-0.001293509608642151, 0.9997513522528666, -0.022261188231424093}), 42.8050596437871, 0, 30.0);

    currentView_3.setInput(new DoubleVector(new double[] {31.240380156502873, 6.972751794992592, -0.2708569327920273}), new DoubleVector(new double[] {25.74782706419099, 9.738433871540714, 124.25524820198551}), new DoubleVector(new double[] {-0.001293509608642151, 0.9997513522528666, -0.022261188231424093}), 42.8050596437871, 0, 30.0);

    hardcopyProperties_2.setCurrentResolutionWidth(886);

    hardcopyProperties_2.setCurrentResolutionHeight(649);

    CurrentView currentView_2 = 
      scene_2.getCurrentView();

    currentView_2.setInput(new DoubleVector(new double[] {17.15778420418184, 2.5597668394256763, 0.23793702187456592}), new DoubleVector(new double[] {25.051196315532515, -5.865409637502365, 67.87804025184708}), new DoubleVector(new double[] {0.0267489123914088, 0.9923546952541087, 0.12048507996032401}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {19.74526725912884, -2.0355595397224717, -0.5107790867610008}), new DoubleVector(new double[] {27.624434314916815, -10.445531298418858, 67.007255636565}), new DoubleVector(new double[] {0.0267489123914088, 0.9923546952541087, 0.12048507996032401}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {20.001284617169127, -3.6268277867369196, -0.8584086042539241}), new DoubleVector(new double[] {31.550398718109044, -15.953984038046208, 98.10807876297356}), new DoubleVector(new double[] {0.0267489123914088, 0.9923546952541087, 0.12048507996032401}), 42.8050596437871, 0, 30.0);

    currentView_2.setInput(new DoubleVector(new double[] {26.805502788556733, 3.434221412945443, -0.27348022149855206}), new DoubleVector(new double[] {38.29798294162359, -8.832485567670165, 98.20770040810817}), new DoubleVector(new double[] {0.0267489123914088, 0.9923546952541087, 0.12048507996032401}), 42.8050596437871, 0, 30.0);
  }
}
