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
	
	public View() {
		this.viewFrame = new ViewFrame();
		SwingUtilities.invokeLater(this);
	}
	
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
		case KeyEvent.VK_A:
			return ControllerOrder.UP;
		case KeyEvent.VK_B:
			return ControllerOrder.DOWN;
		case KeyEvent.VK_C:
			return ControllerOrder.RIGHT;
		case KeyEvent.VK_NUMPAD0:
			return ControllerOrder.LEFT;
		default:
			return null;
		}
		
	}

	public void run() {
		this.viewFrame.setVisible(true);		
	}
	
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}

	@Override
	public void printMessage(String message) {
		this.viewFrame.printMessage(message);
	}

}