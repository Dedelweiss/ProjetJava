package entity;

import java.awt.image.BufferedImage;

/**
 * The class Mobile.
 *
 * 
 */

public abstract class Mobile implements IEntity{
	
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
