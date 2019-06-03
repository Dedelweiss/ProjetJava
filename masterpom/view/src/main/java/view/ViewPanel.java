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

	/**
	 * link with the class ViewFrame 
	 */
	private ViewFrame viewFrame;
	
	/**
	 * the version of the ViewPanel
	 */
	private static final long	serialVersionUID	= -998294702363713521L;
	
	/**
	 * the constructor who linked himself with ViewFrame
	 * @param viewFrame
	 */
	public ViewPanel(ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	}
	
	/**
	 * Gets the view Frame
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame
	 * @param viewFrame
	 * 			new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}
	
	/**
	 * the method for the map's construction
	 * @param width the map's width
	 * @param height the map's height
	 * @param g the graphical object
	 */
	public void Map(int width, int height, Graphics g) {
		
	}
	
	/**
	 * the method to update the frame
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}
	
	
}
