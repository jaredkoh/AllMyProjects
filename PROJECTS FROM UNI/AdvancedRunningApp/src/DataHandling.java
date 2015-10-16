import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import runningdata.DataTable;
import runningdata.RunningStats;
import runningdata.Track;
/**
 * This Class represents the Data handling that is done behind the scenes.
 * It deals with the server and it access the server to get the DataTables and
 * sets it to a tablemodel with a method. 
 * By calling this class , it will also create the server.
 * @author Zhengquan Jared Koh
 *
 */

public class DataHandling {
	private RunningStats server = new RunningStats();
	private LinkedList<String> results;
	private DataTable data;
	private String [] column_Names = {"Bib Number" ,"Position", "Race Time" , "Category","Total Recorded Races","Gender"};

	public DataHandling()
	{
		createServer(); //creating the server
	}
	
	@SuppressWarnings("unchecked")
	public DefaultListModel<String> searchedList(JTextField tf) {
		DefaultListModel<String> model;

		// checks if the input is less than 3 characters
		if (tf.getText().length() < 3) {
			JOptionPane.showMessageDialog(null,
					"Please Enter At Least 3 Characters");

			model = new DefaultListModel<String>();

		} else {
			String searchFor = tf.getText();
			String searchIn = "find_title";
			// getting the results from the server searched with arguments
			// consisting of the input
			results = server.search(searchFor, searchIn);
			ArrayList<String> foundResults = new ArrayList<String>();

			// storing the results to an array list from a track

			for (Object s : results) {
				Track firstResult = (Track) s;
				foundResults.add(firstResult.its_title());
			}
			// adding the results to the list model
			model = new DefaultListModel<String>();
			for (String a : foundResults) {
				model.addElement(a);
			}

		}
		return model;

	}

	/**
	 * this methods creates the server and make sure the connection to the
	 * server is a success
	 */

	private void createServer() {
		// making sure that it is connected to the server
		boolean success = server.create("0f6d595380", "zhengquan.koh");

		if (success == false) {
			System.out
					.println("Fatal error: could not open connection to server");
			System.exit(1);
		}
	}

	/**
	 * This Method gets the data from the Server with the selected item in the
	 * List and stores it in a DataTable.
	 * 
	 * @param location
	 *            The List is selected
	 * @return a Datatable which consists of all the results
	 */

	@SuppressWarnings("unchecked")
	public DataTable getDatafromList(String location) {

		try {
			// gets selected index of the list
			

			results = server.search(location, "find_title");
			// getting all the data for the specific location
			data = server.getDataFor(results.get(0));
			return data;
		}

		catch (Exception e) {

			return null;
		}

	}
	
	
	/**
	 * This method gets the data from the server and places it on a JTable
	 * 
	 * @param location the list.
	 * @return a DefaultTableModel that consists of the data.
	 */
	public DefaultTableModel getTable(String location) {
		DataTable data = getDatafromList(location);
		DefaultTableModel tm = new DefaultTableModel(column_Names, data.getRowCount() );
		/*
		 * Searches the server for the data and placing it in a JTable
		 */

		for (int row = 0; row < data.getRowCount(); row++) {
			for (int col = 0; col < 6; col++) {
				tm.setValueAt(data.getCell(row, col), row, col);//setting the value to the table model
			}

		}
		return tm;

	}


}
