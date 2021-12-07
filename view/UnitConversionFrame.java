package view;

import javax.swing.*;

import controller.ControllerListener;
import view.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.*;

/**
 * The JFrame that holds the UnitConversionPanel, which handles the text areas
 */
public class UnitConversionFrame extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1752112959869347174L;

	/**
	 * Instantiates a new unit conversion frame.
	 */
	public UnitConversionFrame() {
		setTitle("Unit Conversion App");
		setSize(900, 900);

		FlowLayout myLayout = new FlowLayout();
		myLayout.setHgap(120);
		myLayout.setVgap(200);

		UnitConversionPanel panel = new UnitConversionPanel();
		setContentPane(panel);

		ControllerListener controllerListener = new ControllerListener(panel);
		UnitConversionMenuBar menubar = new UnitConversionMenuBar(controllerListener);

		setJMenuBar(menubar);

		setVisible(false);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}