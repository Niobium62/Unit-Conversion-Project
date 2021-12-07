package view;
import java.awt.*;
import model.Subject;

/**
 * The Class MetersArea. It handles the data in the orange square, in the JPanel
 */
public class MetersArea extends TextArea{

	/** The subject. */
	private Subject subject;
	
	/**
	 * Instantiates a new meters area.
	 *
	 * @param subject the subject
	 */
	public MetersArea(Subject subject) {
		super();
		this.textField.setEditable(false);
		this.textField.setOpaque(false);
		this.color = new Color(255, 188, 0);
		textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		this.subject = subject;
		this.subject.addSubscriber(this);
	}
	
	/**
	 * Converts value from cm to m, and updates the textfield with the new value
	 *
	 * @param text the text
	 */
	@Override
	public void updateSquare(String text) {
		try {
			double newValue = Double.parseDouble(text);
			newValue /= 100;
			String newText = newValue + " m";
			textField.setText(newText);
		}
		// if input is invalid, display "Invalid Input"
		catch (NumberFormatException e) {
			textField.setText("Invalid Input");
		}
	}
}
