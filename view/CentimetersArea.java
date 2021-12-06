package view;
import java.awt.*;
import javax.swing.JTextField;

/**
 * 
 * CentimetersArea class that the user can enter (type) a value is centimeters
 * precondition: any positive value or 0
 */
public class CentimetersArea extends TextArea{
	
	public CentimetersArea() {
		
		this.color = new Color(255, 255, 0);
		this.textField = new JTextField("165", 20);
		
		this.textField.setEditable(true);
		this.textField.setOpaque(false);
	}
	
	@Override
	public void updateSquare(String text) {

	}

}
