package view;

import java.awt.event.KeyEvent;



import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 */
public class View implements IView, Runnable {

	 private final ViewFrame viewFrame;
	    
	    /**
	     * the constructor
	     */
	    public View() {
	        this.viewFrame = new ViewFrame();
	        SwingUtilities.invokeLater(this);
	    }
	    
	    /**
	     * the method to listen the key was pressed
	     * @param keyCode
	     *             is the parameter who stock the key who are pressed
	     * @return ControllerOrder.UP
	     *             is the link with the order to go up, ControllerOrder.DOWN is the link with the order to go down,
	     *             ControllerOrder.LEFT is the link with the order to go left, ControllerOrder.RIGHT is the link with the order to go right
	     */
	    protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
	        switch (keyCode) {
	        case KeyEvent.VK_UP:
	            return ControllerOrder.UP;
	        case KeyEvent.VK_DOWN:
	            return ControllerOrder.DOWN;
	        case KeyEvent.VK_LEFT:
	            return ControllerOrder.LEFT;
	        case KeyEvent.VK_RIGHT:
	            return ControllerOrder.RIGHT;
	        default:
	            return ControllerOrder.UP;
	        }
	        
	    }

	    /**
	     * the method too see the frame
	     */
	    public void run() {
	        this.viewFrame.setVisible(true);        
	    }
	    
	    /**
	     * Set the controller
	     * @param controller
	     *             the new controller
	     */
	    public void setController(final IController controller) {
	        this.viewFrame.setController(controller);
	    }

	    /**
	     * the method to print a message
	     * @param message
	     *             the message
	     */
	    @Override
	    public void printMessage(String message) {
	        this.viewFrame.printMessage(message);
	    }

	}

