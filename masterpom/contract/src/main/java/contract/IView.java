package contract;

/**
 * The Interface IView.
 *
 * 
 */
public interface IView {

	    /**
	     * Prints the message.
	     *
	     * @param message
	     *          the message
	     */
	    void printMessage(final String message);
	    
	    /**
	     * the method too see the frame
	     */
	    public void run();
	    
	    /**
	     * Set the controller
	     * @param controller
	     *             the new controller
	     */
	    public void setController(final IController controller);
}
