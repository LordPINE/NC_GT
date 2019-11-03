package com.lordpine.nc_gt;

import gregtech.api.unification.Element;
import gregtech.api.unification.material.IMaterialHandler;
import gregtech.api.unification.material.MaterialIconSet;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.type.GemMaterial;
import gregtech.api.unification.material.type.IngotMaterial;
import gregtech.api.unification.stack.MaterialStack;

import static com.google.common.collect.ImmutableList.of;
import static gregtech.api.unification.material.type.DustMaterial.MatFlags.GENERATE_ORE;
import static gregtech.api.unification.material.type.DustMaterial.MatFlags.GENERATE_PLATE;
import static gregtech.api.unification.material.type.GemMaterial.MatFlags.GENERATE_LENSE;
import static gregtech.api.unification.material.type.IngotMaterial.MatFlags.GENERATE_BOLT_SCREW;
import static gregtech.api.unification.material.type.SolidMaterial.MatFlags.GENERATE_LONG_ROD;
import static gregtech.api.unification.material.type.SolidMaterial.MatFlags.GENERATE_ROD;

@IMaterialHandler.RegisterMaterialHandler
public class CustomMaterials implements IMaterialHandler {

    private static final long STD_SOLID = GENERATE_PLATE | GENERATE_ROD | GENERATE_BOLT_SCREW | GENERATE_LONG_ROD;
    private static final long STD_GEM = GENERATE_ORE | STD_SOLID | GENERATE_LENSE;
    private static final long STD_METAL = GENERATE_PLATE;
    private static final long EXT_METAL = STD_METAL | GENERATE_ROD | GENERATE_BOLT_SCREW;

    static {
        IngotMaterial Zirconium = new IngotMaterial(800, "zirconium", 0xFAF0F0, MaterialIconSet.METALLIC, 1, of(), STD_METAL, Element.Zr);
        IngotMaterial Cobalt_60 = new IngotMaterial(801, "cobalt60", 0x2929BC, MaterialIconSet.METALLIC, 2, of(), STD_METAL, Element.get("Co_60"));
        IngotMaterial Zinc_65 = new IngotMaterial(802, "zinc65", 0xFAF0F0, MaterialIconSet.METALLIC, 2, of(), STD_METAL, Element.get("Zn_65"));
        GemMaterial Zircon = new GemMaterial(803, "zircon", 0x3D170C, MaterialIconSet.DIAMOND, 2, of(new MaterialStack(Zirconium, 1L), new MaterialStack(Materials.Silicon, 1L), new MaterialStack(Materials.Oxygen, 4L)), STD_GEM);
    }


    @Override
    public void onMaterialsInit() {

    }
}
