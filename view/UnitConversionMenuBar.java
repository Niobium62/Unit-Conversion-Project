package view;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * a JMenuBar that comprises a "Save input centimeters" JMenuItem
 */
public class UnitConversionMenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;

	/**
	 * The class constructor to create MenuBar and add menu item to it.
	 */

	public UnitConversionMenuBar(ActionListener menubarListener) {
		super();
		JMenu updateModel = new JMenu("Update Model");
		JMenuItem saveBtn = new JMenuItem("Save input centimeters");
		
		saveBtn.addActionListener(menubarListener);

		this.add(updateModel);
		updateModel.add(saveBtn);
	}
}
