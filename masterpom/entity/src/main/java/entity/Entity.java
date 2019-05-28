package entity;

import java.awt.image.BufferedImage;

/**
 * The class Entity.
 *
 * @author Mathéo
 */

public class Entity implements IEntity{
	
	/**
	*Variable 
	*
	*/
	private boolean isExplodable = false; 
	/**
	*Variable 
	*
	*/
	private boolean isUnique = false; 
	/**
	*Variable 
	*
	*/
	private boolean isMobile = false; 
	/**
	*Variable 
	*
	*/
	private boolean isConsomable = false;
	
	/**
	 * The method IsExplodable.
	 * Pour savoir si l'objet est explosable. 
	 * @return false or true en fonction de la classe
	 */
	public boolean IsExplodable(boolean isExplodable) {
		
		return isExplodable;
	}
	
	/**
	 * The method IsUnique.
	 * Pour savoir si l'objet est unique. 
	 * @return false or true en fonction de la classe
	 */
	@Override
	public boolean IsUnique(boolean isUnique) {
		// TODO Auto-generated method stub
		return isUnique;
	}
	
	/**
	 * The method IsMobile.
	 * Pour savoir si l'objet est bougeable. 
	 *  @return false or true en fonction de la classe
	 */
	@Override
	public boolean IsMobile(boolean isMobile) {
		// TODO Auto-generated method stub
		return isMobile;
	}
	
	/**
	 * The method IsConsomable.
	 * Pour savoir si l'objet est consomable . 
	 * @return false or true en fonction de la classe
	 */
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
