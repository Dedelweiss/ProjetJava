package entity;

import java.awt.image.BufferedImage;

/**
 * The class Exit.
 *
 * 
 */

public class Exit extends Static{
	
	@Override
	public boolean IsUnique() {
		
		return false;
	}

	@Override
	public boolean IsMobile() {
	
		return false;
	}

	@Override
	public boolean IsConsomable() {

		return false;
	}

	@Override
	public boolean IsExplodable() {

		return false;
	}



	@Override
	public BufferedImage getSprite() {

		return null;
	}


}
