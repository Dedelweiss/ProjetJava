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
     * the version of the ViewFrame
     */
    private static final long serialVersionUID = -697358409737458175L;

    /**
     * allow the modification of the frame
     */
    public ViewFrame() throws HeadlessException {
        super();
        this.buildViewFrame();
    }
    
    /**
     * link with the controller
     * @return the controller
     */
    private IController getController() {
        return this.controller;
    }

    /**
     * Sets the controller
     * @param controller
     *             new controller
     */
    protected void setController(final IController controller) {
        this.controller = controller;
    }
    
    /**
     * link with the model
     * @return the model
     */
    protected IModel getModel() {
        return this.model;
    }
    
    /**
     * Sets the model
     * @param model
     *             new model
     */
    private void setModel(final IModel model) {
        this.model = model;
    }
/**
     * creation and parameter of the game's frame
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
        this.getContentPane().setBackground(Color.black);
    }
    
    /**
     * Print a message
     * @param message
     *             the message
     */
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
     * method to know when a key was released
     */
    
    public void keyReleased(KeyEvent e) {
        
    }

	}
