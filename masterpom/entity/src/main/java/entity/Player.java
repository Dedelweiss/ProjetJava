package entity;



/**
 * The class Player.
 *
 * @author Mathéo
 */

public class Player extends Mobile{
	
	/**
	*Variable 
	*
	*/
	private String Sprite = "Player.png";
	/**
	*Variable 
	* 
	*/
	private int diamonds;
	/**
	*Variable 
	*
	*/
	private boolean alive;
	/**
	*Variable return false
	*
	*/
	protected static boolean isExplodable;
	/**
	*Variable return true
	*
	*/
	protected static boolean isUnique = true;
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
	 * Constructor,
	 * set alive to true and diamonds to 0. 
	 * @param x
	 * @param y
	 */
	public Player(Integer x, Integer y) {
		super(x, y);

		this.alive = true;

		this.diamonds = 0;
		
	}
	/**
	 * Method that increases the number of diamond by 1.
	 */
	public void collectDiamond() {
		this.diamonds = this.diamonds + 1;
	}
	
	public int getDiamondsCount() {
		return diamonds;
	}
	/**
	 * Method when the player is alive. 
	 * @return true
	 */
	public boolean isAlive() {

		return alive;
	}
	
	/**
	 * Method when the player is die. 
	 * @return false
	 */
	public void die() {

		this.alive = false;

	}

}
