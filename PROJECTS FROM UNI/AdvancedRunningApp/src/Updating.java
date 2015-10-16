import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * This Class has all the listeners which is where all the updating of the
 * individual windows opened, happens. it consists of public and private methods
 * and which calls methods from the data handling class
 * 
 */
public class Updating implements ActionListener, MouseListener {

	private ArrayList<Racer> friendList = new ArrayList<Racer>();
	private HashMap<String, ArrayList<Integer>> friendsInLocation = new HashMap<>();
	private ArrayList<String> namesList = new ArrayList<>();
	private DataHandling dh = new DataHandling();

	@SuppressWarnings("unchecked")
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		if (source == Window1.getSearchButton()) {
			Window2.createSearchWindow(); //create window 2 
		}

		else if (source == Window2.getTextField()) {

			DefaultListModel<String> model = dh.searchedList((JTextField) e
					.getSource());
			Window2.getList().setModel(model); //setting the model to the search box

		}

		else if (source == Window1.getRemoveButton()) {

			try {

				int selectedIndex = Window1.getList().getSelectedIndex(); 
				removingFriends(selectedIndex); //removing friends method
			} catch (ArrayIndexOutOfBoundsException w) {
				JOptionPane.showMessageDialog(null,
						"Please select a friend to remove");
			}
		}

		else if (source == Window1.getSaveButton()) {

			try { 
					// Open a file to write to, named SavedObj.sav.
				FileOutputStream saveFile = new FileOutputStream("SavedList.sav");

				// Create an ObjectOutputStream to put objects into save file.
				ObjectOutputStream save = new ObjectOutputStream(saveFile);

				
				save.writeObject(friendList);
				Window1.getLoadButton().setEnabled(true);
				// Close the file.
				save.close(); // This also closes saveFile.
			} catch (Exception exc) {
				exc.printStackTrace(); // If there was an error, print the info.
			}

		}

		else if (source == Window1.getLoadButton()) {

			ArrayList<Object> stuff = new ArrayList<Object>();
			DefaultListModel<Object> lm = new DefaultListModel<Object>();

			try {
				// Open file to read from, named SavedObj.sav.
				FileInputStream saveFile = new FileInputStream("SavedList.sav");

				// Create an ObjectInputStream to get objects from save file.
				ObjectInputStream save = new ObjectInputStream(saveFile);


				stuff = (ArrayList<Object>) save.readObject();

				// Close the file.
				save.close(); // This also closes saveFile.
			} catch (Exception exc) {
				exc.printStackTrace(); // If there was an error, print the info.
			}

			for (int i = 0; i < stuff.size(); i++) {

				Racer racer = (Racer) stuff.get(i);
				if (!friendList.contains(racer)) {
					friendList.add(racer);//if the friend list doesnt not contain the racer then add him/her
				} else {
					continue;// if friend is in the friend list , skip iteration 
				}
				String location = racer.getLocation(); //getting racer's location
				int position = racer.getPosition();//getting racer's position

				updateHashMap(location, position); //updating hash map( location , position) 
				namesList.add(racer.getName()); //adding the names to a list of names

				lm.addElement(racer); //adding the racer to the list model

			}

			Window1.getList().setModel(lm);

		}

	}

	private void removingFriends(int a) {
		Racer friend = friendList.get(a); //getting the racer in the friend list
		Object pos = friend.getPosition(); //gets the position of the friend
		
		/*
		 * if friend is in location preston then remove his position 
		 */
		try {
			friendsInLocation.get(friend.getLocation()).remove(pos);
		} catch (NullPointerException e) {
			friendsInLocation.remove(friend.getLocation()); 
		}

		namesList.remove(a); //removing from the list of names
		friendList.remove(a);//removing from the list of racers

		@SuppressWarnings("unchecked")
		DefaultListModel<String> lm = (DefaultListModel<String>) Window1
				.getList().getModel();
		lm.remove(a); //removing from the list model

	}

	public void mouseClicked(MouseEvent e) {

		if (e.getSource() == Window1.getList()) {
			if (e.getClickCount() == 2) {
				try {
					Racer friend = friendList.get(Window1.getList()
							.getSelectedIndex());// getting the selected friends

					String location = friend.getLocation(); // getting the location of the friend's race
					DefaultTableModel tm = dh.getTable(location); //getting the table model
					Window3 w3 = new Window3(location); //new instantiation for window 3
					JTable table = new JTable(tm) {
						/**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						public boolean isCellEditable(int row, int col) {
							return false; //making the each cell unclickable
						}
					};
					w3.createResultWindow(table);
					table.setDefaultRenderer(Object.class,
							new CustomTableCellRenderer(location, friendsInLocation));//sets the renderer to the table
					moveColumns(table); // re order the table to the correct oder
				}

				catch (ArrayIndexOutOfBoundsException a) {
					JOptionPane.showMessageDialog(null,
							"You have no friends added in the list");
				}
			}

			else {
				if (Window1.getList().getModel().getSize() == 0) {
					Window1.getRemoveButton().setEnabled(false);//sets the remove button to false

				}
			}

		}

		else if (e.getSource() == Window2.getList()) {
			if (e.getClickCount() == 2) {

				@SuppressWarnings("unchecked")
				JList<String> list = (JList<String>) e.getSource();
				String location = (String) list.getSelectedValue();

				DefaultTableModel tm = dh.getTable(location);
				Window3 w3 = new Window3(location); // instantiate a new window 3 as it is a new instance
				JTable table = new JTable(tm) { 
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int col) {
						return false;
					}
				};
				w3.createResultWindow(table); //setting the table to window 3

				table.setDefaultRenderer(Object.class,
						new CustomTableCellRenderer(location, friendsInLocation)); //set the renderer to the table , to get the updated rows
				moveColumns(table); //swap the columns around to the right order.
			}

		}

		else {
			JTable table = (JTable) e.getSource(); //casting e.getsource into a table
			String location = "";
			if (e.getClickCount() == 2) {
				int position = table.getSelectedRow();
				try {
					String name = JOptionPane
							.showInputDialog("Current selected Bib Number: "
									+ table.getValueAt(position, 1)
									+ "\nInput name"); //creating a variable for the text that the user inputs

					if (!(name.matches(".*\\w.*"))) {
						JOptionPane.showMessageDialog(null,
								"Your name must consist of one or more characters "); // using regular expression to match what is needed 
					} else {
						String bibNo = ((String) table.getValueAt(position, 1));
						try {
							location = (String) (Window2.getList()
									.getSelectedValue()); //getting the location from window 2 selected value.
						} catch (Exception a) {
							int selectedFriend = Window1.getList().getSelectedIndex(); 
							Racer racer = friendList.get(selectedFriend); // getting the racer from the array list of racer
							location = racer.getLocation(); //getting the location of the racer

						}

						boolean check = checkIfPositionIsAdded(position, location);
						boolean secondCheck = checkIfNameAdded(name);
						if (check == false && secondCheck == false) {
							Racer racer = new Racer(name, bibNo, position,
									location); //creating a new instance of racer
							friendList.add(racer); //adding the racer to a arraylist of racers
							updateHashMap(location, position); //updating the hash map(key = location ,value = position)
							@SuppressWarnings("unchecked")
							DefaultListModel<String> lm = (DefaultListModel<String>) Window1
									.getList().getModel(); 

							namesList.add(name); //adding the name to an array list of Names
							lm.addElement(racer.toString()); //adds the racer to the list model
							table.setDefaultRenderer(Object.class,
									new CustomTableCellRenderer(location,
											friendsInLocation)); //sets the renderer to the table
							Window1.getRemoveButton().setEnabled(true); //sets the remove button to true
						}

						else {
							JOptionPane.showMessageDialog(null,
									"Friend has already been added");
						}

					}

				} catch (NullPointerException w) {

				}

			}

		}
	}
	
	/**
	 * This method checks if the position is added to the specific location
	 * @param position Racer's position
	 * @param location location of the Racer's race
	 * @return boolean true/false
	 */
	private boolean checkIfPositionIsAdded(int position, String location) {
		try {
			if (friendsInLocation.get(location).contains(position)) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			return false;
		}

	}
	
	/**
	 * this method checks if the Name list contains the name
	 * @param name Friend's name
	 * @return boolean true or false
	 */

	private boolean checkIfNameAdded(String name) {
		if (namesList.contains(name)) {
			return true;
		}
		return false;
	}

	/**
	 * This methods changes to columns of the JTable to the desired position in
	 * the requirements
	 * 
	 * @param table
	 */
	private void moveColumns(JTable table) {
		// swaps the columns by using method moveColumns from JTable API
		table.moveColumn(1, 0);
		table.moveColumn(4, 5);
		table.moveColumn(3, 5);
		table.moveColumn(4, 5);

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * This method updates the hash map to make it to the most updated
	 * @param location location of the racer
	 * @param row position of the racer in the location
	 */
	private void updateHashMap(String location, int row) {

		if (friendsInLocation.containsKey(location)) {
			friendsInLocation.get(location).add(row); //get the location and add on the its list
		} else {
			ArrayList<Integer> listOfRowSelected = new ArrayList<>(); //creating a new arraylist for a new key in the hashmap
			listOfRowSelected.add(row); // adds the position to the arraylist 
			friendsInLocation.put(location, listOfRowSelected);//adds to the hashmap a new key(which is a location and a value(which is the position of the racer))
		}

	}

}
