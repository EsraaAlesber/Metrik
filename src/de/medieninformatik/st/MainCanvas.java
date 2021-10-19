package de.medieninformatik.st;

import java.awt.Canvas;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * This class is responsible for the canvas and drawing the circles. Its implementing a mouse listener as well
 */

public class MainCanvas extends Canvas implements MouseListener {
	// The x coordinates for the mouse
	public int x;
	// The y coordinates for the mouse
	public int y;
	// The number of circles drawn
	private int numCircles = 0;

	public MainCanvas() {
		setSize(500, 500);
		setVisible(true);
		addMouseListener(this);
	}

	/**
	 * This method is responsible for drawing the circles
	 */
	private void paintCircle() {
		Ellipse2D e;
		e = new Ellipse2D.Float(
				this.x, this.y,
				20.0F, 20.0F);

		Graphics2D gd2 = (Graphics2D)this.getGraphics();
		gd2.draw(e);
		// Show coordinates
		gd2.drawString("(" + this.x + ", " + this.y + ")", this.x + 20, this.y -20);
	}




	/**
	* This method is responsible for connecting the circles with a line.
	 */

private void connectCircles(Graphics g){
	// Get coordinates
	x1 = event.getX1();
	y1 = event.getY1();
	x2 = event.getX2();
	y2 = event.getY2();

	Graphics2D g2 = (Graphics2D) g; //casting

	g.drawline(x1, x2, y1, y2);

}



	/**
	 * By double-clicking on the canvas with the mouse, the circles appear on the canvas
	 * @param event for the mouse click
	 */
	@Override
	public void mouseClicked(MouseEvent event) {
		if (event.getClickCount() == 2 && event.getButton() == MouseEvent.BUTTON1) {
			// Get coordinates
			x = event.getX();
			y = event.getY();

			// After 2 circles has been drawn the canvas gets repainted
			numCircles++;
			if (numCircles == 3) {
				numCircles = 0;
				repaint();
			}
			else {
				paintCircle();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}
