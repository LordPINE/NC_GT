package com.lordpine.nc_gt.Elements;

import gregtech.api.unification.Element;
import net.minecraftforge.common.util.EnumHelper;

public class ModElements {
    private ModElements() {}

    public static void registerElements() {
        registerElement("Co_60", 27, 33, "Cobalt-60");
        registerElement("Zn_65", 30, 35, "Zinc-65");
    }

    private static void registerElement(String name, long atomicnumber, long neutrons, String full_name) {
        EnumHelper.addEnum(Element.class, name, new Class[] { long.class, long.class, long.class, String.class, String.class, boolean.class }, atomicnumber, neutrons, -1L, null, full_name, true);
    }
}
