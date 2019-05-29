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
	 * @param isUnique takes the variable according to the class
	 * @return isUnique
	 */
	public boolean IsUnique(boolean isUnique);
	
	/**
	 * The method IsMobile.
	 * To know if the object is mobile. 
	 *  @param isMobile takes the variable according to the class
	 *  @return isMobile
	 */
	public boolean IsMobile(boolean isMobile);
	
	/**
	 * The method IsConsomable.
	 * To know if the object is consomable. 
	 * @param isConsomable takes the variable according to the class
	 * @return isConsomable
	 */
	public boolean IsConsomable(boolean isConsomable);

	/**
	 * The method IsExplodable.
	 * To know if the object is explodable. 
	 * @param isExplodable takes the variable according to the class
	 * @return isExplodable
	 */
	public boolean IsExplodable(boolean isExplodable);

	

}
