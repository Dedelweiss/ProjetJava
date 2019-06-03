package entity;

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
	private String Sprite = "Exit.png";
	/**
	 * Variable
	 */
	
	private boolean allowed;
	/**
	 * Variable
	 */
	private boolean reached; 
	
	/**
	*Variable return false
	*
	*/
	protected static boolean isExplodable;	
	/**
	*Variable return true
	*
	*/
	protected static boolean isUnique = true;
	/**
	*Variable return false
	*
	*/
	protected static boolean isMobile; 
	/**
	*Variable return false
	*
	*/
	protected static boolean isConsomable; 
	
	/**
	 * Assessor
	 * @return allowed
	 */
	public boolean isAllowed(){
		return allowed;
	}
	/**
	 * Assessor
	 * @param allowed d
	 */
	public void setAllowed(boolean allowed) {
		this.allowed = allowed;	
	}
	/**
	 * Assessor
	 * @return reached
	 */
	public boolean isReached(){
		return reached;
	}
	/**
	 * Assessor
	 * @param reached d
	 */
	public void setReached(final boolean reached){
		this.reached = reached;
	}
}
