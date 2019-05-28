package entity;

import java.awt.image.BufferedImage;

/**
 * The interface IEntity.
 *
 * @author Mathéo
 */
public interface IEntity {
	
	/**
	 * The method IsUnique.
	 * Pour savoir si l'objet est unique. 
	 * @return true
	 */
	public boolean IsUnique(boolean isUnique);
	
	/**
	 * The method IsMobile.
	 * Pour savoir si l'objet est bougeable. 
	 *  @return true
	 */
	boolean IsMobile(boolean isMobile);
	
	/**
	 * The method IsConsomable.
	 * Pour savoir si l'objet est consomable . 
	 * @return true
	 */
	boolean IsConsomable(boolean isConsomable);

	/**
	 * The method IsExplodable.
	 * Pour savoir si l'objet est explosable. 
	 * @return true
	 */
	boolean IsExplodable(boolean isExplodable);

	

	/**
	 * The method getSprite.
	 * Pour récuperer l'image. 
	 * @return Sprite
	 */
	BufferedImage getSprite();

}
