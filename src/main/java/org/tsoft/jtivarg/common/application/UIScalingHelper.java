package org.tsoft.jtivarg.common.application;

import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import java.util.Enumeration;

public class UIScalingHelper
{
    public static final float UI_SCALE_FACTOR = 2.0f;

    /**
     * Scales all Swing UI fonts by the specified factor.
     * Should be called before any GUI components are created.
     *
     * @param scaleFactor the scaling factor (e.g., 1.5, 2.0, 2.5)
     */
    public static void scaleUIFonts(float scaleFactor)
    {
        Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements())
        {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource)
            {
                FontUIResource font = (FontUIResource) value;
                UIManager.put(
                    key,
                    new FontUIResource(
                        font.getFontName(),
                        font.getStyle(),
                        Math.round(font.getSize() * scaleFactor)));
            }
        }
    }
}
