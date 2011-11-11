/*
 * This is the main class
 */
package com.github.janpath.pongME;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author Max
 */
public class PongME extends MIDlet {

	public Display display;
	public PongCanvas canvas = null;

	public void startApp() {
		if (canvas == null) {
			canvas = new Court(this);
		}
		Display display = Display.getDisplay(this);
		display.setCurrent(canvas);
	}

	public void pauseApp() {
	}

	public void destroyApp(boolean unconditional) {
	}
}
