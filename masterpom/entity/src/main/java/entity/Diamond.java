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
	protected static boolean isExplodable;	
	/**
	*Variable 
	*
	*/
	protected static boolean isUnique;	
	/**
	*Variable 
	*
	*/
	protected static boolean isMobile = true; 	
	/**
	*Variable 
	*
	*/
	protected static boolean isConsomable = true; 
	
	public Diamond(Integer x, Integer y) {
		super(x, y);
		
	}

}
