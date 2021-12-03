import java.awt.*;

public class MetersArea extends TextArea{

	public MetersArea() {
		this.color = new Color(255, 188, 0);
		this.text = "";
		this.isEditable = false;
	}
	
	@Override
	public void updateSquare(TextArea t) {
		try {
			double newValue = Double.parseDouble(t.textField.getText());
			newValue /= 100;
			String newText = newValue + "";
			setText(newText);
		}
		catch (NumberFormatException e) {
			setText("Invalid Input");
		}
	}
}
