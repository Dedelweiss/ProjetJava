package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;


import org.junit.Test;

import contract.ControllerOrder;

public class ViewTest {

	private View view;

	/**
	 * 
	 */
	@Test
	public void testkeyCodeToControllerorderEN() {
		final ControllerOrder expected = ControllerOrder.UP;
		assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_UP) );
	}

	@Test
	public void testkeyCodeToControllerorderFR() {
		final ControllerOrder expected = ControllerOrder.DOWN;
		assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_DOWN) );
	}
	
	@Test
	public void testkeyCodeToControllerorderDE() {
		final ControllerOrder expected = ControllerOrder.LEFT;
		assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_LEFT) );
	}
	
	@Test
	public void testkeyCodeToControllerorderIN() {
		final ControllerOrder expected = ControllerOrder.RIGHT;
		assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_RIGHT) );
	}
}
