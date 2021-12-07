package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ValueToConvert;
import view.UnitConversionPanel;

/**
 * The listener interface for receiving controller events.
 * The class that is interested in processing a controller
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addControllerListener<code> method. When
 * the controller event occurs, that object's appropriate
 * method is invoked.
 *
 * @see ControllerEvent
 */
public class ControllerListener implements ActionListener{
	
	/** The UnitConversionPanel. */
	private final UnitConversionPanel myPanel;
	
	/**
	 * Instantiates a new controller listener.
	 *
	 * @param panel the panel
	 */
	public ControllerListener(UnitConversionPanel panel)
	{
		myPanel = panel;
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = myPanel.centimetersArea.textField.getText();
		ValueToConvert myConverter = myPanel.converter;
		myConverter.setValue(s);
	}
}
