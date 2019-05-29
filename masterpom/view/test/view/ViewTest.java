package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ControllerOrder;

public class ViewTest {

	private View view;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * 
	 */
	@Test
	public void testkeyCodeToControllerorderEN() {
		final ControllerOrder expected = ControllerOrder.English;
		assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_UP) );
	}

	@Test
	public void testkeyCodeToControllerorderFR() {
		final ControllerOrder expected = ControllerOrder.Francais;
		assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_DOWN) );
	}
	
	@Test
	public void testkeyCodeToControllerorderDE() {
		final ControllerOrder expected = ControllerOrder.Deutsch;
		assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_LEFT) );
	}
	
	@Test
	public void testkeyCodeToControllerorderIN() {
		final ControllerOrder expected = ControllerOrder.Indonesia;
		assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_RIGHT) );
	}
}
