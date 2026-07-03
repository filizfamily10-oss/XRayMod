package com.xray;

import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class KeyBindings {
    public static KeyBinding toggleXray;
    public static KeyBinding openMenu;
    public static KeyBinding block1, block2, block3, block4, block5, block6;

    public static void init() {
        toggleXray = new KeyBinding("Toggle XRay", Keyboard.KEY_X, "XRay Mod");
        openMenu = new KeyBinding("Open Menu", Keyboard.KEY_M, "XRay Mod");
        block1 = new KeyBinding("XRay: Titanium", Keyboard.KEY_1, "XRay Mod");
        block2 = new KeyBinding("XRay: Diamond", Keyboard.KEY_2, "XRay Mod");
        block3 = new KeyBinding("XRay: Gold", Keyboard.KEY_3, "XRay Mod");
        block4 = new KeyBinding("XRay: Iron", Keyboard.KEY_4, "XRay Mod");
        block5 = new KeyBinding("XRay: Emerald", Keyboard.KEY_5, "XRay Mod");
        block6 = new KeyBinding("XRay: Lapis", Keyboard.KEY_6, "XRay Mod");
    }
}
