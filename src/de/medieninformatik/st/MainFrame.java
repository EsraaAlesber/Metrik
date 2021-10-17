package de.medieninformatik.st;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MainFrame extends Frame{

    @Override
    public void paint(Graphics g) {
        Ellipse2D ellipse2D;
        ellipse2D = new Ellipse2D.Float(
                10.0F, 10.0F, //Koordinaten
                5.0F, 5.0F);   // Größen
        Graphics2D gd2 = (Graphics2D)g;
        gd2.draw(ellipse2D);
    }
    /**
     super.paint(g);
     g.drawOval(50,50,50,50);
     }

     */
    private static PaintAreaController _paController = new PaintAreaController();
    private static PaintArea _paintArea = new PaintArea(_paController);

    public MainFrame(MainFrameController mfc) {
        setTitle("AWT-Demo");
        setSize(400,300);

        initalizeMenu();

        addWindowListener(mfc);
        add(_paintArea);
    }

    /**
     * Initalisation of the menu bar
     */
    private void initalizeMenu() {
        MenuBar mbar = new MenuBar();

        Menu mFile = new Menu("File");
        mFile.add(new MenuItem("New Program"));
        mFile.add(new MenuItem("End"));

        mbar.add(mFile);
        setMenuBar(mbar);
    }

}
