package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ValueToConvert;
import view.UnitConversionPanel;

/**
 * 
 * @author  Lab 6 Group 13
 *
 */
public class ControllerListener implements ActionListener{
	
	private final UnitConversionPanel myPanel;
	
	/**
	 * Class constructor of ControllerListener.
	 * 
	 * @param panel A panel.
	 */
	public ControllerListener(UnitConversionPanel panel)
	{
		myPanel = panel;
	}

	/**
	 * Invoked when "Save input centimeters" is pressed
	 *
	 * @param e A ActionEvent e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = myPanel.centimetersArea.textField.getText();
		ValueToConvert myConverter = myPanel.converter;
		myConverter.setValue(s);
	}
}
