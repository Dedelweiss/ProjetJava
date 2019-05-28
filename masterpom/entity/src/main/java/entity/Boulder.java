package entity;

import java.awt.image.BufferedImage;

/**
 * The class Boulder.
 *
 * 
 */

public class Boulder extends Mobile{
	private String Sprite = "boulder.png";
	
	public Boulder() {
		
	}
	
	/**
	 * @return false
	 */
	
	public boolean IsUnique() {
		
		return false;
	}

	/**
	 * @return true
	 */
	
	public boolean IsMobile() {
	
		return true;
	}

	/**
	 *  @return false
	 */
	
	public boolean IsConsomable() {

		return false;
	}

	/**
	 *  @return true
	 */
	
	public boolean IsExplodable() {

		return true;
	}

	/**
	 *  @return false
	 */
	
	public BufferedImage getSprite() {

		return null ;
	}

}
