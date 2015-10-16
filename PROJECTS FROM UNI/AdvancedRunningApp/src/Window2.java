import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.DefaultListSelectionModel;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * This class represents is the second window that will appear after a search button,
 * from the window, is clicked.  This class contains the getter 
 * methods for the components of the frame and a method to create the 
 * frame. 
 * 
 * @author Zhengquan Jared Koh
 *
 */

public class Window2 {

	private static JFrame frame2;
	private static JList<String> jliSearchBox;
	private static JTextField jtfInput;

	/**
	 * getter method for frame
	 */
	public JFrame getFrame() {
		return frame2;
	}

	/**
	 * getter method for location list
	 */
	public static JList<String> getList() {
		return jliSearchBox;
	}

	/**
	 * getter method for the text field
	 */
	public static JTextField getTextField() {
		return jtfInput;
	}

	/**
	 * a method for creating the window
	 */
	public static JFrame createSearchWindow() {
		frame2 = new JFrame("Searching...");
		/*
		 * setting the search button to disable when this window is opened
		 */
		frame2.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Window1.getSearchButton().setEnabled(true);
			}

			public void windowOpened(WindowEvent e) {
				Window1.getSearchButton().setEnabled(false);
			}
		});
		JPanel jpLeft = new JPanel();
		// creates a empty border around the left panel
		Border bLeft = BorderFactory.createEmptyBorder(15, 15, 15, 15);
		jpLeft.setBorder(bLeft);
		// left panel uses group layout
		GroupLayout layout = new GroupLayout(jpLeft);

		JLabel jlSearch = new JLabel("Search:");
		jtfInput = new JTextField();
		jtfInput.addActionListener(Window1.update);
		JLabel jlRecentRaces = new JLabel("Possible Recent Races:");

		jliSearchBox = new JList<String>();
		jliSearchBox.setCellRenderer(new CustomListCellRenderer());
		// adding a scroll pane to the searchbox
		JScrollPane jspSearchBox = new JScrollPane(jliSearchBox);

		jliSearchBox
				.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
		jliSearchBox.addMouseListener(Window1.update); // adds mouse listener

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		// sets the layout
		layout.setHorizontalGroup(layout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup().addComponent(jlSearch)
								.addComponent(jtfInput))

				.addGroup(
						layout.createSequentialGroup().addComponent(
								jlRecentRaces, 0, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE))

				.addComponent(jspSearchBox, 0, GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));

		layout.setVerticalGroup(layout
				.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup(
								GroupLayout.Alignment.BASELINE)
								.addComponent(jlSearch).addComponent(jtfInput))
				.addGroup(
						layout.createParallelGroup(
								GroupLayout.Alignment.BASELINE).addComponent(
								jlRecentRaces, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

				.addComponent(jspSearchBox, GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		jpLeft.setLayout(layout); //sets the layout
		frame2.setSize(300, 400); //sets the size
		frame2.add(jpLeft);//adds the size
		frame2.setVisible(true);// sets visibility
		return frame2;

	}

}
