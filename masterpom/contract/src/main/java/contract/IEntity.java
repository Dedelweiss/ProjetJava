package contract;


/**
 * The interface IEntity.
 *
 * @author Mathéo
 */
public interface IEntity {
	/**
	 * The method IsUnique.
	 * To know if the object is unique.
	 * 
	 */
	public boolean IsUnique(boolean isUnique);
	
	/**
	 * The method IsMobile.
	 * To know if the object is mobile. 
	 *  
	 */
	boolean IsMobile(boolean isMobile);
	
	/**
	 * The method IsConsomable.
	 * To know if the object is consomable. 
	 * 
	 */
	boolean IsConsomable(boolean isConsomable);

	/**
	 * The method IsExplodable.
	 * To know if the object is explodable. 
	 * 
	 */
	boolean IsExplodable(boolean isExplodable);

	

}
