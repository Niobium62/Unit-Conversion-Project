import java.awt.*;

public class FeetArea extends TextArea {

	public FeetArea() {
		this.color = new Color(0, 255, 0);
		this.text = "";
		this.isEditable = false;
	}

	@Override
	public void updateSquare(TextArea t) {
		double newValue = Double.parseDouble(t.getText());
		newValue /= 30.48;
		String newText = newValue + "";
		setText(newText);
		
	}
}
