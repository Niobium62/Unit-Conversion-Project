package view;
import java.awt.*;
import javax.swing.JTextField;

public abstract class TextArea {

	protected Color color;
	public JTextField textField = new JTextField("", 20);
	
	public abstract void updateSquare(String text);
	
	
	public Color getColor() {
		return color;
	}

}
