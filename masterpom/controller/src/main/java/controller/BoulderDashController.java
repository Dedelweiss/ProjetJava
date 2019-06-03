package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;


/**
 * The Class Controller.
 * @author mathéo
 */
public final class BoulderDashController implements IController {

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view the view
	 * @param model the model
	 */
	public BoulderDashController(final IView view, IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	/**
     * Sets the view.
     *
     * @param view the new view
     */
	private void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
     * Order perform.
     *
     * @param controllerOrder the controller order
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
		
			case UP:
				
				break;
			case DOWN:
				
				break;
			case RIGHT:
				
				break;
			case LEFT:
				
				break;
			default:
				break;
		}
		
		
	}
	
	/**
	 * Method moveEntity.
	 * This method move all of entity
	 */
	
	public void moveEntity() {
		
	}
	
	/**
	 * Method updateView.
	 * When the player moves, we refresh the view 
	 */
	
	public void updateView() {
		
	}
	/**
	 * Method Finish.
	 * When the player wins, this method starts to complete the game
	 */
	public void Finish() {
		
	}
	
	/**
	 * Method Interaction.
	 * It is to manage all the interactions between the entities.
	 * @return false 
	 */
	public boolean Interaction() {
		return false;
		
	}
	
	/**
	 * Method Rolling 
	 * It is to manage the rolling of boulder. 
	 */
	 public void Rolling() {
		 
	}
}
