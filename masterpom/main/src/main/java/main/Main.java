/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import controller.BoulderDashController;
//import contract.ControllerOrder;
//import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 *
 * @author mathéo
 */
public abstract class Main {
	

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
    	
        final Model model = new Model();
       final View view = new View();
       final BoulderDashController controller = new BoulderDashController(view, null);
       view.setController(controller);

      
    }
}
