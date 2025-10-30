package org.tsoft.jtivarg.astrovania;

import org.tsoft.jtivarg.common.application.UIScalingHelper;

import java.awt.EventQueue;

import static org.tsoft.jtivarg.common.application.UIScalingHelper.UI_SCALE_FACTOR;

public class Main
{
    public static void main(String[] args)
    {
        // Scale all UI fonts for better readability
        UIScalingHelper.scaleUIFonts(UI_SCALE_FACTOR);

        // Fixes a lot of repaint bugs when redrawing menus or dragging windows over each other.
        System.setProperty("swing.bufferPerWindow", "false");

        EventQueue.invokeLater(() ->
        {
            Application application = new Application();
            javax.swing.SwingUtilities.invokeLater(application);
        });
    }
}
