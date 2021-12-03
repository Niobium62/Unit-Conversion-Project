import java.awt.*;

import javax.swing.JTextField;


public abstract class TextArea {

	protected Color color;
	protected String text;
	protected boolean isEditable;
	public JTextField textField = new JTextField("", 20);
	
	public abstract void updateSquare(TextArea t);
	
	
	public String getText() {
		return text;
	}
	
	public void setText(String newText) {
		text = newText;
		textField.setText(newText);
	}
	
	public Color getColor() {
		return color;
	}
	
	public boolean isEditable() {
		return isEditable;
	}
}
