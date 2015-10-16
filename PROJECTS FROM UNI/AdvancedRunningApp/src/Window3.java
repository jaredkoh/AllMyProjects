import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 * This class represents the Window 3 which is created either by clicking
 * a friend in the friend list in window 1 or clicking on a location in window 2
 * This class contains the getter methods for the components of the frame and
 * a method to create the frame.
 * @author Zhengquan Jared Koh
 *
 */

public class Window3 {
	
	
	
	private JFrame frame3;
	private JTable jtResultBox;
	private String location;
	
	/**
	 * Constructor for the class window stating its location as a the name of the frame 	
	 */
	public Window3(String location)
	{
		this.location = location;
	}

	/**
	 * getter method for frame
	 */
	public JFrame getFrame()
	{
		return frame3;
	}
	
	/**
	 * getter method for table
	 */
	public JTable getTable()
	{
		return jtResultBox;
	}

	
	/**
	 * getter method for frame
	 */
	public String location()
	{
		return location;
	}
	
	/**
	 * getter method for frame
	 */
	public JFrame createResultWindow(JTable table)
	{
		frame3 = new JFrame(location);
		JPanel jpRight = new JPanel();
		jpRight.setLayout(new GridLayout(1,0));
	
		
		/*
		 * setting the table and adding a mouse listener
		 */
		jtResultBox = table;
		jtResultBox.setRowSelectionAllowed(true); // sets the row selection to true;
		jtResultBox.setColumnSelectionAllowed(false); // sets the column selection to false
		jtResultBox.getTableHeader().setReorderingAllowed(false); // set the reordering to false
		jtResultBox.setShowGrid(false); //sets the visibility of the grid to false
		jtResultBox.addMouseListener(Window1.update);
		
		
		
		jtResultBox.setPreferredScrollableViewportSize(new Dimension(200, 200));
		jtResultBox.setFillsViewportHeight(true);
		
		
		/*
		 * setting the table to a scroll pane
		 */
		JScrollPane jspResultBox = new JScrollPane(jtResultBox);
		
		jpRight.add(jspResultBox); //adding the scrollpane to the table
		frame3.setSize(600, 450);
		frame3.add(jpRight);
		frame3.setVisible(true);
		
		
		return frame3;
	}
	
}