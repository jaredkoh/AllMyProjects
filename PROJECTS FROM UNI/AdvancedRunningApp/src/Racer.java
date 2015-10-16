
/**
 * This Class represents an individual racer, an each racer has a name 
 * bib number , position and location attached to him/her
 * @author Zhengquan Jared Koh
 *
 */
public class Racer implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int position;
	private String bibNo;
	private String location ;
	
	
	/**
	 * Constructor for individual Racer
	 * @param name Racer's name
	 * @param bibNo Racer's bib number
	 * @param position Racer's position
	 * @param location Racer's location
	 */
	public Racer(String name, String bibNo, int position , String location) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.position = position;
		this.bibNo = bibNo;
		this.location = location;
	}
	
	/**
	 * getter method for racer name
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * getter method for racer position
	 * @return
	 */
	public int getPosition()
	{
		return position;
	}
	/**
	 * getter method for racer bib number
	 * @return
	 */
	public String getBibNo()
	{
		return bibNo;
	}
	/**
	 * getter method for racer location
	 * @return
	 */
	public String getLocation()
	{
		return location;
	}
	/**
	 * toString method to put into the friend list
	 * @return
	 */
	public String toString()
	{
		return name+" "+"("+ bibNo+ ")";
	}

}
