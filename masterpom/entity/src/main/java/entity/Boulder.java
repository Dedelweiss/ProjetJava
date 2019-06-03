package entity;



/**
 * The class Boulder.
 *
 * @author Mathéo
 */

public class Boulder extends Mobile{
	/**
	 * Variable 
	 */
	private String Sprite = "boulder.png";
	/**
	*Variable return false 
	* 
	*/
	protected static boolean isExplodable;
	/**
	*Variable return false
	*
	*/
	protected static boolean isUnique;
	/**
	*Variable return true
	*
	*/
	protected static boolean isMobile = true;
	/**
	*Variable return false
	*
	*/
	protected static boolean isConsomable; 
	
	/**
	 * Constructor
	 * @param x Coordinat
	 * @param y Coordinat
	 */
	public Boulder(Integer x, Integer y) {
		super(x, y);
		
	}

}
