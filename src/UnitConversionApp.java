import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.*;

public class UnitConversionApp extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1752112959869347174L;
	private FeetArea feetArea = new FeetArea();
	private MetersArea metersArea = new MetersArea();
	private CentimetersArea centimetersArea = new CentimetersArea();
	
	List<TextArea> subscribers = new ArrayList<TextArea>();
	
	
	private void initializeSubscribers() {
		subscribers.add(feetArea);
		subscribers.add(metersArea);
		subscribers.add(centimetersArea);
	}
	
	protected void notifySubscribers() {
		repaint();
		for (TextArea t : subscribers) {
			t.updateSquare(centimetersArea);
		}
	}
	
	public UnitConversionApp() {
		initializeSubscribers();
		setTitle("Unit Conversion App");
		setSize(900, 900);
		
		FlowLayout myLayout = new FlowLayout();
		myLayout.setHgap(100);
		myLayout.setVgap(150);
		
		panel.setLayout(myLayout);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		feetArea.textField.setEditable(true);
		feetArea.textField.setOpaque(false);
		panel.add(feetArea.textField);
		metersArea.textField.setEditable(true);
		metersArea.textField.setOpaque(false);
		panel.add(metersArea.textField);
		centimetersArea.textField.setEditable(true);
		centimetersArea.textField.setOpaque(false);
		panel.add(centimetersArea.textField);
		
		
		JMenuBar menubar = new JMenuBar();
		JMenu updateModel = new JMenu("Update Model");
		JMenuItem saveBtn = new JMenuItem("Save input centimeters");
		
		saveBtn.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			            notifySubscribers();
			        }  
			    });  
		
		menubar.add(updateModel);
		updateModel.add(saveBtn);
		setJMenuBar(menubar);
		
		
		
		setContentPane(panel);
		setVisible(false);
		setVisible(true);
		setResizable(false); 
		
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
