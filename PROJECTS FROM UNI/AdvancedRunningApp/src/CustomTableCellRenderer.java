import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * This Class consists of the table cell renderer , setting the table
 * to bold the rows of the friends.
 */
public class CustomTableCellRenderer extends DefaultTableCellRenderer{
	
	private static final long serialVersionUID = 1L;
	private HashMap<?, ?> hm ;
	private String location;
	public CustomTableCellRenderer(String location , HashMap<?, ?> hm)
	{
		this.hm = hm;
		this.location = location;
	}
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column ) {
		Component coloredCell = super.getTableCellRendererComponent(table,
				value, isSelected, hasFocus, row, column);
		
		
		setHorizontalAlignment(SwingConstants.CENTER); // setting the data to the center 
		
		
		try {
			
			@SuppressWarnings("unchecked")
			ArrayList<Integer> rows = (ArrayList<Integer>) hm.get(location);
			for (int j = 0; j < rows.size(); j++) {
				if (row == rows.get(j)) {
					for (int i = 0; i < 6; i++) {
						String result = (String) table.getValueAt(row, i); 
						coloredCell.setFont(new Font(result, Font.BOLD, 16)); //bolding the row
						return coloredCell;
					}

				}

			}

			return coloredCell;
		}

		catch (Exception e) {
			return coloredCell;
		}

	}
		
	
	
}
