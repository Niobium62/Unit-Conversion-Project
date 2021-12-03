import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class UnitConversionApp extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1752112959869347174L;
	FeetArea feetArea = new FeetArea();
	MetersArea metersArea = new MetersArea();
	CentimetersArea centimetersArea = new CentimetersArea();
	
	List<TextArea> subscribers = new ArrayList<TextArea>();
	
	
	private void initializeSubscribers() {
		subscribers.add(feetArea);
		subscribers.add(metersArea);
		subscribers.add(centimetersArea);
	}
	
	public UnitConversionApp() {
		initializeSubscribers();
		setTitle("Unit Conversion App");
		JPanel panel = new JPanel();
		setSize(900, 900);
		//panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));;
		FlowLayout myLayout = new FlowLayout();
		myLayout.setHgap(100);
		myLayout.setVgap(150);
		
		panel.setLayout(myLayout);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.setLayout(new FlowLayout());
		JTextField feetText = new JTextField("length in feet", 20);
		feetText.setEditable(true);
		feetText.setOpaque(false);
		panel.add(feetText);
		JTextField metersText = new JTextField("length in meters", 20);
		metersText.setEditable(true);
		metersText.setOpaque(false);
		panel.add(metersText);
		
		JTextField centimetersText = new JTextField("length in cm", 20);
		centimetersText.setEditable(true);
		centimetersText.setOpaque(false);
		panel.add(centimetersText);
		
		
		setContentPane(panel);
		setVisible(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		UnitConversionApp app = new UnitConversionApp();
		app.repaint();
	}
	
	public void paint(Graphics g) 
    {
		 
		 g.setColor(feetArea.getColor());
         g.fillRect(100, 35, 300, 300);
         
         
		 g.setColor(metersArea.getColor());
         g.fillRect(500, 35, 300, 300);
         
         g.setColor(centimetersArea.getColor());
         g.fillRect(300, 350, 300, 300);
    }

}
