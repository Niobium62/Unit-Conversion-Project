package view;

import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.*;
import controller.*;

/**
 * A custom JPanel that allows the textfields to appear in colored squares.
 */
public class UnitConversionPanel extends JPanel {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1947477796477083029L;

	/** The unit converter. */
	public ValueToConvert converter = new ValueToConvert();
	
	/** The feet area. */
	private FeetArea feetArea = new FeetArea(converter);
	
	/** The meters area. */
	private MetersArea metersArea = new MetersArea(converter);
	
	/** The centimeters area. */
	public CentimetersArea centimetersArea = new CentimetersArea();

	/**
	 * Instantiates a new unit conversion panel.
	 */
	public UnitConversionPanel() {
		
		//adjust the layout, so that the textfields will fit in the colored squares
		FlowLayout myLayout = new FlowLayout();
		myLayout.setHgap(120);
		myLayout.setVgap(200);
		this.setLayout(myLayout);
		//add the textfields
		this.add(feetArea.textField);
		this.add(metersArea.textField);
		this.add(centimetersArea.textField);
	}

	/**
	 * Paint component, drawing the orange, green and yellow squares.
	 *
	 * @param g the Graphics Object
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(feetArea.getColor());
		g.fillRect(100, 35, 300, 300);

		g.setColor(metersArea.getColor());
		g.fillRect(500, 35, 300, 300);

		g.setColor(centimetersArea.getColor());
		g.fillRect(300, 350, 300, 300);
	}
}
