package entity;



/**
 * The class Diamants.
 *
 * @author Mathéo
 */


public class Diamond extends Mobile{
	/**
	*Variable 
	*
	*/
	private String Sprite = "diamond.png";
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
	*Variable return true
	*
	*/
	protected static boolean isConsomable = true; 
	
	/**
	 * Constructor
	 * @param x Coordinat
	 * @param y Coordinat
	 */
	
	public Diamond(Integer x, Integer y) {
		super(x, y);
		
	}

}
