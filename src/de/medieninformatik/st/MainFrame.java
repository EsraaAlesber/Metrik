package de.medieninformatik.st;

import java.awt.*;

/**
 * This class is responsible for setting the window/frame e.g. size, title, etc..
 */

public class MainFrame extends Frame {
	
	public MainFrame(MainFrameController mfc) {
		setTitle("Metrik Version 1.0");
		setSize(500, 500);
		
		addWindowListener(mfc);
	}

}
