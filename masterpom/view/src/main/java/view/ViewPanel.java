package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

/**
 * The Class ViewPanel.
 *
 */
class ViewPanel extends JPanel implements Observer {

	private ViewFrame viewFrame;
	private static final long	serialVersionUID	= -998294702363713521L;
	
	public ViewPanel(ViewFrame viewFrame) {
		// TODO Auto-generated constructor stub
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	}
	
	/*private ViewFrame getViewFrame() {
		return this.viewFrame;
	}*/

	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}
	
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}
	
	protected void paintComponent(final Graphics graphics) {
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
	}
}
