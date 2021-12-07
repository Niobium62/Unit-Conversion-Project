package view;
import java.awt.*;
import javax.swing.JTextField;

/**
 * The Abstract Class TextArea.
 */
public abstract class TextArea {

	/** The color. */
	protected Color color;
	
	/** The text field. */
	public JTextField textField = new JTextField("", 20);
	
	/**
	 * Update square with new data for its textfield. Must be implemented by child classes.
	 *
	 * @param text the text
	 */
	public abstract void updateSquare(String text);
	
	
	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

}
