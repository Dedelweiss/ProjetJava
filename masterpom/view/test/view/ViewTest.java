package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;


import org.junit.Test;

import contract.ControllerOrder;

public class ViewTest {

	/**
	 * test to verify if the up key is detected
	 */
	@Test
	public void testkeyCodeToControllerorderEN() {
		final ControllerOrder expected = ControllerOrder.UP;
		assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_UP) );
	}

	/**
	 * test to verify if the down key is detected
	 */
	@Test
	public void testkeyCodeToControllerorderFR() {
		final ControllerOrder expected = ControllerOrder.DOWN;
		assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_DOWN) );
	}
	
	/**
	 * test to verify if the left key is detected
	 */
	@Test
	public void testkeyCodeToControllerorderDE() {
		final ControllerOrder expected = ControllerOrder.LEFT;
		assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_LEFT) );
	}
	
	/**
	 * test to verify if the right key is detected
	 */
	@Test
	public void testkeyCodeToControllerorderIN() {
		final ControllerOrder expected = ControllerOrder.RIGHT;
		assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_RIGHT) );
	}
}
