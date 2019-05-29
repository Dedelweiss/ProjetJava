package entity;



/**
 * The class Mobile.
 *
 * @author matheo
 */

public class Mobile extends Entity{

	private Integer x;
	private Integer y;
	
	public Mobile(Integer x, Integer y) {
		this.x = x;
		this.y = y;	
	}
	
	
	public void setCoordonnees(final int x, final int y) {
		this.setX(x);
		this.setY(y);
	}

	public Integer getX() {
		return x;
	}

	public void setX(final int x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}
	
	public void setY(final int y) {
		this.y = y;
	}
}
