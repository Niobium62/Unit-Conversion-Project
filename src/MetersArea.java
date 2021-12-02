import java.awt.*;

public class MetersArea extends TextArea{

	public MetersArea() {
		this.color = new Color(255, 188, 0);
		this.text = "";
		this.isEditable = false;
	}
	
	@Override
	public void updateSquare(TextArea t) {
		double newValue = Double.parseDouble(t.getText());
		newValue /= 100;
		String newText = newValue + "";
		setText(newText);
		
	}

}
