package model;
import java.awt.*;

public class FeetArea extends TextArea {

	public FeetArea() {
		this.color = new Color(0, 255, 0);
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
