package com.xray;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventbus.SubscribeEvent;
import net.minecraft.client.Minecraft;

@Mod(modid = "xraymod", name = "XRay Mod", version = "1.0")
public class XRayMod {

    public static final String MODID = "xraymod";
    public static final String NAME = "XRay Mod";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        KeyBindings.init();
    }

    @SubscribeEvent
    public static void onRenderWorld(RenderWorldLastEvent event) {
        if (KeyBindings.toggleXray.isPressed()) {
            BlockHandler.toggleXRay();
        }
        if (KeyBindings.openMenu.isPressed()) {
            XRayMenu.openMenu();
        }
    }
}
