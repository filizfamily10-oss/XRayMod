package com.xray;

import net.minecraft.client.Minecraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHandler {
    private static boolean xrayEnabled = false;
    private static int selectedBlock = 0;

    public static void toggleXRay() {
        xrayEnabled = !xrayEnabled;
        Minecraft.getMinecraft().thePlayer.addChatMessage(
            new net.minecraft.util.ChatComponentText(
                xrayEnabled ? "XRay: ON" : "XRay: OFF"
            )
        );
    }

    public static void selectBlock(int blockId) {
        selectedBlock = blockId;
        String[] blockNames = {"Titanium", "Diamond", "Gold", "Iron", "Emerald", "Lapis"};
        if (blockId >= 0 && blockId < blockNames.length) {
            Minecraft.getMinecraft().thePlayer.addChatMessage(
                new net.minecraft.util.ChatComponentText(
                    "Selected: " + blockNames[blockId]
                )
            );
        }
    }

    public static boolean isXRayEnabled() {
        return xrayEnabled;
    }

    public static int getSelectedBlock() {
        return selectedBlock;
    }
}
