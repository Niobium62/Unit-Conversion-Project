package view;
import javax.swing.*;

import controller.ValueController;
import model.CentimetersArea;
import model.FeetArea;
import model.MetersArea;
import model.TextArea;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.*;

public class UnitConversionFrame extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1752112959869347174L;
	private FeetArea feetArea = new FeetArea();
	private MetersArea metersArea = new MetersArea();
	private CentimetersArea centimetersArea = new CentimetersArea();
	
	
	private ValueController valueController = new ValueController();
	
	
	private void initializeSubscribers() {
		valueController.add(feetArea);
		valueController.add(metersArea);
		valueController.add(centimetersArea);
	}
	
	
	public UnitConversionFrame() {
		initializeSubscribers();
		setTitle("Unit Conversion App");
		GraphicsPanel panel = new GraphicsPanel();
		setSize(900, 900);
		
		FlowLayout myLayout = new FlowLayout();
		myLayout.setHgap(120);
		myLayout.setVgap(200);
		
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
					valueController.notifySubscribers(centimetersArea.textField.getText());
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
	

	
	public class GraphicsPanel extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1947477796477083029L;

		@Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
			g.setColor(feetArea.getColor());
	        g.fillRect(100, 35, 300, 300);
	         
	         
			g.setColor(metersArea.getColor());
	        g.fillRect(500, 35, 300, 300);
	         
	        g.setColor(centimetersArea.getColor());
	        g.fillRect(300, 350, 300, 300);
	    }
	}

}