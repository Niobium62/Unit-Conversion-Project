package view;
import java.awt.*;
import model.Subject;

public class MetersArea extends TextArea{

	Subject subject;
	
	public MetersArea(Subject subject) {
		super();
		this.textField.setEditable(false);
		this.textField.setOpaque(false);
		this.color = new Color(255, 188, 0);
		textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		this.subject = subject;
		this.subject.addSubscriber(this);
	}
	
	@Override
	public void updateSquare(String text) {
		try {
			double newValue = Double.parseDouble(text);
			newValue /= 100;
			String newText = newValue + " m";
			textField.setText(newText);
		}
		catch (NumberFormatException e) {
			textField.setText("Invalid Input");
		}
	}
}
