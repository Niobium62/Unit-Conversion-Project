package model;
import java.awt.*;

public class MetersArea extends TextArea{

	public MetersArea() {
		this.color = new Color(255, 188, 0);
	}
	
	@Override
	public void updateSquare(String text) {
		try {
			double newValue = Double.parseDouble(text);
			newValue /= 100;
			String newText = newValue + "";
			textField.setText(newText);
		}
		catch (NumberFormatException e) {
			textField.setText("Invalid Input");
		}
	}
}
