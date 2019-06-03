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
	 * @param x Coordinat
	 * @param y Coordinat
	 */
	
	public Mobile(Integer x, Integer y) {
		this.x = x;
		this.y = y;	
	}
	
	/**
	 * Set Coordonnees
	 * @param x Coordinat
	 * @param y Coordinat
	 */
	public void setCoordonnees(final int x, final int y) {
		this.setX(x);
		this.setY(y);
	}
	
	/**
	 * Assessor  
	 * @return x Coordinat
	 */

	public Integer getX() {
		return x;
	}
	
	/**
	 * Assessor
	 * @param x Coordinat
	 */

	public void setX(final int x) {
		this.x = x;
	}
	
	/**
	 * Assessor
	 * @return y Coordinat
	 */

	public Integer getY() {
		return y;
	}
	
	/**
	 * Assessor
	 * @param y Coordinat
	 */
	
	public void setY(final int y) {
		this.y = y;
	}
}
