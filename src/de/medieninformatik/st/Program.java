package de.medieninformatik.st;

/**
 * Softwaretechnik Aufgabe 2
 * Metrik
 * @date 20.10.2021
 * @author Esraa Alesber (m29063) und Christina-Marie Frischkorn (m29268)
 */

public class Program {

	public static void main(String[] args) {
		MainFrameController mfc = new MainFrameController();
		MainFrame mainFrame = new MainFrame(mfc);

		mainFrame.setVisible(true);
		new connectCircles();
	}
}
