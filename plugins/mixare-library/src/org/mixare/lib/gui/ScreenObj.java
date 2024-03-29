package org.mixare.lib.gui;

/**
 * Objects displayed on the screen are forced to have a paint method and getters
 * for the width and height. Therefore they must implement this interface.
 * 
 * @author mixare
 */
public interface ScreenObj {
	public void paint(PaintScreen dw);

	public float getWidth();

	public float getHeight();
}