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
	 * 
	 */
	boolean IsUnique();
	
	/**
	 * The method IsMobile.
	 * Pour savoir si l'objet est bougeable. 
	 * 
	 */
	boolean IsMobile();
	
	/**
	 * The method IsConsomable.
	 * Pour savoir si l'objet est consomable . 
	 * 
	 */
	boolean IsConsomable();

	/**
	 * The method IsExplodable.
	 * Pour savoir si l'objet est explosable. 
	 * 
	 */
	boolean IsExplodable();

	

	/**
	 * The method getSprite.
	 * Pour récuperer l'image. 
	 * 
	 */
	BufferedImage getSprite();

}
