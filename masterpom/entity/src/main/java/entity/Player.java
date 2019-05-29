package entity;

import java.awt.image.BufferedImage;

/**
 * The class Player.
 *
 * @author Mathéo
 */

public class Player extends Mobile{
	private int diamonds;

	private boolean alive;
	/**
	*Variable 
	*
	*/
	protected static boolean isExplodable;
	/**
	*Variable 
	*
	*/
	protected static boolean isUnique = true;
	/**
	*Variable 
	*
	*/
	protected static boolean isMobile = true; 
	/**
	*Variable 
	*
	*/
	protected static boolean isConsomable; 
	
	/**
	 * Constructor 
	 */
	
	public Player(Integer x, Integer y) {
		super(x, y);

		this.alive = true;

		this.diamonds = 0;
		
	}

	@Override
	public BufferedImage getSprite() {
		
		return null;
	}
	
	public void collectDiamond() {
		this.diamonds = this.diamonds + 1;
	}
	
	public int getDiamondsCount() {
		return diamonds;
	}
	
	public boolean isAlive() {

		return alive;
	}


	public void die() {

		this.alive = false;

	}

}
