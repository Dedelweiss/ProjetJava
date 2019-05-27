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
	@Override
	public boolean IsUnique() {
		
		return false;
	}

	/**
	 * @return true
	 */
	@Override
	public boolean IsMobile() {
	
		return true;
	}

	/**
	 * @return false
	 */
	@Override
	public boolean IsConsomable() {

		return false;
	}

	/**
	 * @return true
	 */
	@Override
	public boolean IsExplodable() {

		return true;
	}


	/**
	 * @return false
	 */
	@Override
	public BufferedImage getSprite() {

		return null ;
	}

}
