package view;

import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.*;
import controller.*;

public class UnitConversionPanel extends JPanel {

	private static final long serialVersionUID = 1947477796477083029L;

	public ValueToConvert converter = new ValueToConvert();
	
	private FeetArea feetArea = new FeetArea(converter);
	private MetersArea metersArea = new MetersArea(converter);
	public CentimetersArea centimetersArea = new CentimetersArea();

	public UnitConversionPanel() {

		FlowLayout myLayout = new FlowLayout();
		myLayout.setHgap(120);
		myLayout.setVgap(200);
		this.setLayout(myLayout);

		this.add(feetArea.textField);
		this.add(metersArea.textField);
		this.add(centimetersArea.textField);
	}

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
