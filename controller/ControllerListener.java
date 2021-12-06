package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ValueToConvert;
import view.UnitConversionPanel;

public class ControllerListener implements ActionListener{
	
	private final UnitConversionPanel myPanel;
	
	public ControllerListener(UnitConversionPanel panel)
	{
		myPanel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = myPanel.centimetersArea.textField.getText();
		ValueToConvert myConverter = myPanel.converter;
		myConverter.setValue(s);
	}
}
