package view;
import model.*;
import java.awt.*;

public class FeetArea extends TextArea {

	Subject subject;
	
	public FeetArea(Subject subject) {
		super();
		this.textField.setEditable(false);
		this.textField.setOpaque(false);
		this.color = new Color(0, 255, 0);

		this.subject = subject;
		this.subject.addSubscriber(this);
	}

	@Override
	public void updateSquare(String text) {
		try {
			double newValue = Double.parseDouble(text);
			newValue /= 30.48;
			String newText = newValue + "";
			textField.setText(newText);
		}
		catch (NumberFormatException e) {
			textField.setText("Invalid Input");
		}
	}
}
