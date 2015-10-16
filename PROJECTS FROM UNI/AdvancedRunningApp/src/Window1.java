import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
/**
 * This class represents the first window that would come up which 
 * is your main screen for your friend's list. This class contains the getter 
 * methods for the components of the frame and a method to create the 
 * frame. 
 * 
 * All Icons are credited to  http://www.icons-land.com , https://www.iconfinder.com
 * @author Zhengquan Jared Koh
 *
 */
public class Window1 {

	private static JFrame frame1;
	private static JButton search;
	private static JButton remove;
	private static JList<?> friendList;
	private static JButton save;
	private static JButton load;
	private static DefaultListModel lm = new DefaultListModel();

	protected static Updating update = new Updating();
	/**
	 * This method creates the start up graphical user interface
	 * @return JFrame 
	 */
	public static JFrame createFriendList() {
		frame1 = new JFrame("Application");
		frame1.setSize(300, 400);
		frame1.setLayout(new BorderLayout());
		JPanel panel = new JPanel(new GridLayout(1, 4));
		panel.setPreferredSize(new Dimension(50, 100));
		Border border1 = BorderFactory.createTitledBorder("Options");
		panel.setBorder(border1);
		
		
		
		/*
		 * Creates the search button ,setting the image and adding an action listener
		 */
		search = new JButton("Search");
		search.setIcon(new ImageIcon("searchIcon.png")); //setting the icon
		search.setHorizontalTextPosition(SwingConstants.CENTER); //setting the text to the center
		search.setVerticalTextPosition(SwingConstants.BOTTOM); //setting the text to the bottom , center
		search.addActionListener(update); //adding an action listener
		
		
		
		/*
		 * Creates the remove button ,setting the image and adding an action listener
		 */
		remove = new JButton("Remove");
		remove.addActionListener(update);
		remove.setIcon(new ImageIcon("removeIcon.png")); //setting the icon
		remove.setHorizontalTextPosition(SwingConstants.CENTER); //setting the text to the center
		remove.setVerticalTextPosition(SwingConstants.BOTTOM); //setting the text to the bottom , center

		
		/*
		 * Creates the save button ,setting the image and adding an action listener
		 */
		save = new JButton("Save"); 
		save.setIcon(new ImageIcon("saveIcon.png")); //setting the icon
		save.setHorizontalTextPosition(SwingConstants.CENTER);  //setting the text to the center
		save.setVerticalTextPosition(SwingConstants.BOTTOM); //setting the text to the bottom , center
		save.addActionListener(update); 
		
		
		/*
		 * Creates the load button ,setting the image and adding an action listener
		 */
		load = new JButton("Load"); 
		load.setIcon(new ImageIcon("loadIcon.png"));//setting the icon
		load.setHorizontalTextPosition(SwingConstants.CENTER);  //setting the text to the center
		load.setVerticalTextPosition(SwingConstants.BOTTOM);//setting the text to the bottom , center
		load.addActionListener(update);
		load.setEnabled(false);
		
		
		/*
		 * adding all the buttons to a panel
		 */
		panel.add(search);
		panel.add(remove);
		panel.add(save);
		panel.add(load);

		/*
		 * Creates a JList, setting it to a empty model and adding a Renderer and
		 * a mouse listener
		 */
		friendList = new JList(); // creates new JList
		friendList.setModel(lm); //sets model
		friendList.addMouseListener(update); //adds mouse listener
		friendList.setCellRenderer(new CustomListCellRenderer()); //sets renderer

		JPanel listPanel = new JPanel(new GridLayout(1, 0)); //sets layouts
		friendList.setVisible(true); //sets visibility
		listPanel.add(friendList); //adds friendlist to panel
		Border border2 = BorderFactory.createTitledBorder("My Friend's List"); // creates border with title : my friend list
		listPanel.setBorder(border2); //set border to the list panel
		listPanel.setVisible(true); //sets visibility

		
		frame1.add(panel, BorderLayout.SOUTH); // adding the panel to the frame in the south;
		frame1.add(listPanel, BorderLayout.CENTER);//adding the panel to the frame in the center;
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
		return frame1;
	}

	/**
	 * getter method for frame
	 */
	public static JFrame getFrame() {
		return frame1;
	}
	
	/**
	 * getter method for search button
	 */
	public static JButton getSearchButton() {
		return search;
	}
	
	/**
	 * getter method for remove button
	 */
	public static JButton getRemoveButton() {
		return remove;
	}
	
	/**
	 * getter method for friend's list
	 */
	public static JList getList() {
		return friendList;
	}
	
	/**
	 * getter method for save button
	 */
	public static JButton getSaveButton() {
		return save;
	}
	
	/**
	 * getter method for load button
	 */
	public static JButton getLoadButton()
	{
		return load;
	}

}