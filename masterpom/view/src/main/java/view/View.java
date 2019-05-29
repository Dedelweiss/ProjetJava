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
		case KeyEvent.VK_UP:
			return ControllerOrder.English;
		case KeyEvent.VK_DOWN:
			return ControllerOrder.Francais;
		case KeyEvent.VK_LEFT:
			return ControllerOrder.Deutsch;
		case KeyEvent.VK_RIGHT:
			return ControllerOrder.Indonesia;
		default:
			return ControllerOrder.English;
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