package view;


import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.IModel;


/**
 * The Class ViewFrame.
 *
 */
class ViewFrame extends JFrame implements KeyListener{
	
	/**the model */
	private IModel model;
	
	/** the controller*/
	private IController controller;
	
	/**
	 * it's to lock the version of the class
	 */
	private static final long serialVersionUID = -697358409737458175L;

	
	public ViewFrame() throws HeadlessException {
		super();
		this.buildViewFrame();
	}
	
	private IController getController() {
		return this.controller;
	}

	protected void setController(final IController controller) {
		this.controller = controller;
	}
	
	protected IModel getModel() {
		return this.model;
	}
	
	private void setModel(final IModel model) {
		this.model = model;
	}
	
	/**
	 * creation of the game's frame
	 */
	
	private void buildViewFrame() {
		//this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setAlwaysOnTop(true);
		//this.setContentPane(new ViewPanel(this));
		this.setSize(1920 + this.getInsets().left + this.getInsets().right, 1080 + this.getInsets().top + this.getInsets().bottom);
		this.setLocationRelativeTo(null);
		this.setTitle("lul");
		this.setBackground(Color.black);
	}
	
	
	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	/*private void setContentPane(ViewPanel viewPanel) {
		// TODO Auto-generated method stub
		
	}*/

	/**
	 *method to know when a key was pressed
	 */
	
	public void keyPressed(KeyEvent e) {
		//this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
	}
	
	/**
	 * method to know which key was pressed
	 */
	
	public void keyTyped(KeyEvent e) {
		
	}
	
	/**
	 * method to when a key was released
	 */
	
	public void keyReleased(KeyEvent e) {
		
	}

	}
