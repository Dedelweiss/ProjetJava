package entity;

import java.awt.image.BufferedImage;

/**
 * The class Entity.
 *
 * @author Mathéo
 */

public class Entity implements IEntity{
	
	private boolean isExplodable = false; 
	private boolean isUnique = false; 
	private boolean isMobile = false; 
	private boolean isConsomable = false; 
	
	public boolean IsExplodable(boolean isExplodable) {
		
		return isExplodable;
	}

	@Override
	public boolean IsUnique(boolean isUnique) {
		// TODO Auto-generated method stub
		return isUnique;
	}

	@Override
	public boolean IsMobile(boolean isMobile) {
		// TODO Auto-generated method stub
		return isMobile;
	}

	@Override
	public boolean IsConsomable(boolean isConsomable) {
		// TODO Auto-generated method stub
		return isConsomable;
	}
	
	@Override
	public BufferedImage getSprite() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isExplodable() {
		return isExplodable;
	}

	public void setExplodable(boolean isExplodable) {
		this.isExplodable = isExplodable;
	}

	public boolean isUnique() {
		return isUnique;
	}

	public void setUnique(boolean isUnique) {
		this.isUnique = isUnique;
	}

	public boolean isMobile() {
		return isMobile;
	}

	public void setMobile(boolean isMobile) {
		this.isMobile = isMobile;
	}

	public boolean isConsomable() {
		return isConsomable;
	}

	public void setConsomable(boolean isConsomable) {
		this.isConsomable = isConsomable;
	}
	

}
