import java.awt.*;


public abstract class TextArea {

	protected Color color;
	protected String text;
	protected boolean isEditable;
	
	public abstract void updateSquare(TextArea t);
	
	
	public String getText() {
		return text;
	}
	
	public void setText(String newText) {
		text = newText;
	}
	
	public Color getColor() {
		return color;
	}
	
	public boolean isEditable() {
		return isEditable;
	}
}
