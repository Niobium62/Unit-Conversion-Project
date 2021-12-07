package view;
import java.awt.*;
import javax.swing.JTextField;

/**
 * CentimetersArea class that the user can enter (type) a value is centimeters
 * precondition: any integer or decimal value
 */
public class CentimetersArea extends TextArea{
	
	/**
	 * Instantiates a new centimeters area.
	 */
	public CentimetersArea() {
		
		this.color = new Color(255, 255, 0);
		this.textField = new JTextField("", 20);
		
		this.textField.setEditable(true);
		this.textField.setOpaque(false);
	}
	
	@Override
	public void updateSquare(String text) {

	}

}
