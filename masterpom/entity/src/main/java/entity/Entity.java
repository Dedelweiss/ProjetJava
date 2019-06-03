package entity;



import contract.IEntity;

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
	 * To know if the object is explodable. 
	 * @return false or true according to the class
	 */
	public boolean IsExplodable(boolean isExplodable) {
		
		return isExplodable;
	}
	
	/**
	 * The method IsUnique.
	 * To know if the object is unique. 
	 * @return false or true according to the class
	 */
	@Override
	public boolean IsUnique(boolean isUnique) {
		// TODO Auto-generated method stub
		return isUnique;
	}
	
	/**
	 * The method IsMobile.
	 * To know if the object is mobile. 
	 *  @return false or true according to the class
	 */
	@Override
	public boolean IsMobile(boolean isMobile) {
		// TODO Auto-generated method stub
		return isMobile;
	}
	
	/**
	 * The method IsConsomable.
	 * To know if the object is consomable. 
	 * @return false or true according to the class
	 */
	@Override
	public boolean IsConsomable(boolean isConsomable) {
		// TODO Auto-generated method stub
		return isConsomable;
	}
	
	/**
	 * Assessor  
	 * @return isExplodable
	 */
	public boolean isExplodable() {
		return isExplodable;
	}
	
	/**
	 * Assessor  
	 * @return isExplodable
	 */

	public void setExplodable(boolean isExplodable) {
		this.isExplodable = isExplodable;
	}
	
	/**
	 * Assessor  
	 * @return isUnique
	 */

	public boolean isUnique() {
		return isUnique;
	}
	
	/**
	 * Assessor  
	 * @return isUnique
	 */

	public void setUnique(boolean isUnique) {
		this.isUnique = isUnique;
	}
	
	/**
	 * Assessor  
	 * @return isMobile
	 */

	public boolean isMobile() {
		return isMobile;
	}
	
	/**
	 * Assessor  
	 * @return isMobile
	 */

	public void setMobile(boolean isMobile) {
		this.isMobile = isMobile;
	}
	
	/**
	 * Assessor  
	 * @return isConsomable
	 */

	public boolean isConsomable() {
		return isConsomable;
	}
	
	/**
	 * Assessor  
	 * @return isConsomable
	 */

	public void setConsomable(boolean isConsomable) {
		this.isConsomable = isConsomable;
	}
	

}
