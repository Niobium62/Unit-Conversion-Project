package view;
import model.*;
import java.awt.*;

/**
 * The Class FeetArea. It handles the data in the green square, in the JPanel
 */
public class FeetArea extends TextArea {

	/** The subject. */
	private Subject subject;
	
	/**
	 * Instantiates a new feet area.
	 *
	 * @param subject the subject
	 */
	public FeetArea(Subject subject) {
		super();
		this.textField.setEditable(false);
		this.textField.setOpaque(false);
		this.color = new Color(0, 255, 0);
		textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		this.subject = subject;
		this.subject.addSubscriber(this);
	}

	/**
	 * Converts value from cm to ft, and updates the textfield with the new value
	 *
	 * @param text the text
	 */
	@Override
	public void updateSquare(String text) {
		try {
			double newValue = Double.parseDouble(text);
			newValue /= 30.48;
			String newText = newValue + " ft";
			textField.setText(newText);
		}
		// if input is invalid, display "Invalid Input"
		catch (NumberFormatException e) {
			textField.setText("Invalid Input");
		}
	}
}
