package contract;

/**
 * The Interface IController.
 *
 * @author mathéo
 */
public interface IController {


	/**
	 * Order perform.
	 *
	 * @param controllerOrder the controller order
	 */
	public void orderPerform(ControllerOrder controllerOrder);
	
	/**
	 * Method moveEntity.
	 * This method move all of entity
	 */
	public void moveEntity();
	
	/**
	 * Method updateView.
	 * When the player moves, we refresh the view 
	 */
	
	public void updateView();
	/**
	 * Method Finish.
	 * When the player wins, this method starts to complete the game
	 */
	public void Finish();
	/**
	 * Method Interaction.
	 * It is to manage all the interactions between the entities.
	 * @return false 
	 */
	public boolean Interaction();
	/**
	 * Method Rolling 
	 * It is to manage the rolling of boulder. 
	 */
	public void Rolling();
}
