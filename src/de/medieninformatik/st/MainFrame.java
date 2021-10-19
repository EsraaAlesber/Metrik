package de.medieninformatik.st;

import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This class is responsible for setting the window/frame e.g. size, title, etc..
 */

public class MainFrame extends Frame{
	public MainFrame(MainFrameController mfc) {
		setTitle("Metrik Variante 1.1.0");
		setSize(500, 500);

		addWindowListener(mfc);
		initializeMenu();
	}

	public void initializeMenu() {
		MenuBar mbar = new MenuBar();
		Menu mBG = new Menu("Background");

		MenuItem b = new MenuItem("Blue");
		MenuItem r = new MenuItem("Red");
		MenuItem g = new MenuItem("Green");

		// Add listeners to the menu items
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeBGColor(Color.BLUE);
			}
		});

		r.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeBGColor(Color.RED);
			}
		});

		g.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeBGColor(Color.GREEN);
			}
		});

		mBG.add(b);
		mBG.add(r);
		mBG.add(g);

		mbar.add(mBG);
		this.setMenuBar(mbar);
		changeBGColor(Color.WHITE);
	}

	/**
	 * This method creates a new canvas and removes all the elements from the frame and adds the new canvas
	 * @param c Background color of the canvas
	 */
	public void changeBGColor(Color c) {
		MainCanvas mcs = new MainCanvas();
		mcs.setBackground(c);
		this.removeAll();
		this.add(mcs);
	}
}
package de.medieninformatik.st;

		import java.awt.*;
		import java.awt.Color;
		import java.awt.event.ActionListener;
		import java.awt.event.ActionEvent;

/**
 * This class is responsible for setting the window/frame e.g. size, title, etc..
 */

public class MainFrame extends Frame{
	public MainFrame(MainFrameController mfc) {
		setTitle("Metrik Variante 1.1.0");
		setSize(500, 500);

		addWindowListener(mfc);
		initializeMenu();
	}

	public void initializeMenu() {
		MenuBar mbar = new MenuBar();
		Menu mBG = new Menu("Background");

		MenuItem b = new MenuItem("Blue");
		MenuItem r = new MenuItem("Red");
		MenuItem g = new MenuItem("Green");

		// Add listeners to the menu items
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeBGColor(Color.BLUE);
			}
		});

		r.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeBGColor(Color.RED);
			}
		});

		g.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeBGColor(Color.GREEN);
			}
		});

		mBG.add(b);
		mBG.add(r);
		mBG.add(g);

		mbar.add(mBG);
		this.setMenuBar(mbar);
		changeBGColor(Color.WHITE);
	}

	/**
	 * This method creates a new canvas and removes all the elements from the frame and adds the new canvas
	 * @param c Background color of the canvas
	 */
	public void changeBGColor(Color c) {
		MainCanvas mcs = new MainCanvas();
		mcs.setBackground(c);
		this.removeAll();
		this.add(mcs);
	}
}

