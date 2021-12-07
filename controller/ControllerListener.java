package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ValueToConvert;
import view.UnitConversionPanel;

/**
<<<<<<< HEAD
 * 
 * @author  Lab 6 Group 13
 *
=======
 * The listener interface for receiving controller events.
 * The class that is interested in processing a controller
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addControllerListener<code> method. When
 * the controller event occurs, that object's appropriate
 * method is invoked.
 *
 * @see ControllerEvent
>>>>>>> e2849c8240b1a76baf7d83c13c8f5ab2a9f9f133
 */
public class ControllerListener implements ActionListener{
	
	/** The UnitConversionPanel. */
	private final UnitConversionPanel myPanel;
	
	/**
<<<<<<< HEAD
	 * Class constructor of ControllerListener.
	 * 
	 * @param panel A panel.
=======
	 * Instantiates a new controller listener.
	 *
	 * @param panel the panel
>>>>>>> e2849c8240b1a76baf7d83c13c8f5ab2a9f9f133
	 */
	public ControllerListener(UnitConversionPanel panel)
	{
		myPanel = panel;
	}

	/**
<<<<<<< HEAD
	 * Invoked when "Save input centimeters" is pressed
	 *
	 * @param e A ActionEvent e
=======
	 * Action performed.
	 *
	 * @param e the e
>>>>>>> e2849c8240b1a76baf7d83c13c8f5ab2a9f9f133
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = myPanel.centimetersArea.textField.getText();
		ValueToConvert myConverter = myPanel.converter;
		myConverter.setValue(s);
	}
}
