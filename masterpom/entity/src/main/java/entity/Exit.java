package entity;

import java.awt.image.BufferedImage;

/**
 * The class Exit.
 *
 * @author Mathéo
 */

public class Exit extends Static{
	
	private boolean allowed;
	private boolean reached; 
	
	/**
	*Variable 
	*
	*/
	protected static boolean isExplodable;	
	/**
	*Variable 
	*
	*/
	protected static boolean isUnique = true;
	/**
	*Variable 
	*
	*/
	protected static boolean isMobile; 
	/**
	*Variable 
	*
	*/
	protected static boolean isConsomable; 
	




	@Override
	public BufferedImage getSprite() {

		return null;
	}



	public boolean isAllowed(){
		return allowed;
	}

	public void setAllowed(boolean allowed) {
		this.allowed = allowed;
		
	}

	public boolean isReached(){
		return reached;
	}

	public void setReached(final boolean reached){
		this.reached = reached;
	}
}
