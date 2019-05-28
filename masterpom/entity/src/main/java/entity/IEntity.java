package entity;

import java.awt.image.BufferedImage;

/**
 * The interface IEntity.
 *
 * 
 */
public interface IEntity {
	
	/**
	 * The method IsUnique.
	 * Pour savoir si l'objet est unique. 
	 * @return true
	 */
	boolean IsUnique();
	
	/**
	 * The method IsMobile.
	 * Pour savoir si l'objet est bougeable. 
	 *  @return true
	 */
	boolean IsMobile();
	
	/**
	 * The method IsConsomable.
	 * Pour savoir si l'objet est consomable . 
	 * @return true
	 */
	boolean IsConsomable();

	/**
	 * The method IsExplodable.
	 * Pour savoir si l'objet est explosable. 
	 * @return true
	 */
	boolean IsExplodable();

	

	/**
	 * The method getSprite.
	 * Pour récuperer l'image. 
	 * @return Sprite
	 */
	BufferedImage getSprite();

}
