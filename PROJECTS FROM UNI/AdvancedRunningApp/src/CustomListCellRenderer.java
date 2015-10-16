import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.SwingConstants;
/**
 * This Class represents a List cell Renderer and it sets the color to blue
 * each time i click a value on the list and the JLabel to white. it also sets 
 * its text to the center alignment.
 * @author Zhengquan Jared Koh
 *
 */
public class CustomListCellRenderer extends DefaultListCellRenderer {
	
	private static final long serialVersionUID = 1L;
	/**
	 * Constructor for the list cell renderer,  which sets the opaque to true as well
	 */
	public CustomListCellRenderer() {
		setOpaque(true);
	}

	public Component getListCellRendererComponent(JList<?> list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {

		setHorizontalAlignment(SwingConstants.CENTER);
		setText(value.toString());

		Color background;
		Color foreground;

		// check if this cell represents the current DnD drop location
		JList.DropLocation dropLocation = list.getDropLocation();
		if (dropLocation != null && !dropLocation.isInsert()
				&& dropLocation.getIndex() == index) {

			background = Color.BLUE;
			foreground = Color.WHITE;

			// check if this cell is selected
		} else if (isSelected) {
			background = Color.BLUE;
			foreground = Color.WHITE;

			// unselected, and not the DnD drop location
		} else {
			background = Color.WHITE;
			foreground = Color.BLACK;
		}
		;

		setBackground(background);
		setForeground(foreground);

		return this;
	}
}
