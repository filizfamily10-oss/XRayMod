package com.xray;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class XRayMenu extends GuiScreen {
    private static boolean menuOpen = false;

    @Override
    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, "XRay Mod Menu", this.width / 2, 20, 16777215);
        this.drawString(this.fontRendererObj, "1: Titanium", 20, 50, 16777215);
        this.drawString(this.fontRendererObj, "2: Diamond", 20, 70, 16777215);
        this.drawString(this.fontRendererObj, "3: Gold", 20, 90, 16777215);
        this.drawString(this.fontRendererObj, "4: Iron", 20, 110, 16777215);
        this.drawString(this.fontRendererObj, "5: Emerald", 20, 130, 16777215);
        this.drawString(this.fontRendererObj, "6: Lapis", 20, 150, 16777215);
        this.drawString(this.fontRendererObj, "X: Toggle XRay", 20, 170, 16777215);
        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
    }

    @Override
    protected void keyTyped(char c, int key) {
        if (key == 1) {
            this.mc.displayGuiScreen((GuiScreen) null);
            menuOpen = false;
        } else if (key >= 2 && key <= 7) {
            BlockHandler.selectBlock(key - 2);
            this.mc.displayGuiScreen((GuiScreen) null);
            menuOpen = false;
        }
    }

    public static void openMenu() {
        if (!menuOpen) {
            Minecraft.getMinecraft().displayGuiScreen(new XRayMenu());
            menuOpen = true;
        }
    }
}
