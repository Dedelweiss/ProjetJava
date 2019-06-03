package entity;



/**
 * The class Mobile.
 *
 * @author matheo
 */

public class Mobile extends Entity{
	/**
	 * Variable
	 */
	private Integer x;
	private Integer y;
	
	/**
	 * Constructor
	 * @param x
	 * @param y
	 */
	
	public Mobile(Integer x, Integer y) {
		this.x = x;
		this.y = y;	
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void setCoordonnees(final int x, final int y) {
		this.setX(x);
		this.setY(y);
	}
	
	/**
	 * Assessor  
	 * @return x
	 */

	public Integer getX() {
		return x;
	}
	
	/**
	 * Assessor
	 * @param x
	 */

	public void setX(final int x) {
		this.x = x;
	}
	
	/**
	 * Assessor
	 * @return y 
	 */

	public Integer getY() {
		return y;
	}
	
	/**
	 * Assessor
	 * @param y
	 */
	
	public void setY(final int y) {
		this.y = y;
	}
}
