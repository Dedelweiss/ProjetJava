package entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BoulderTest {
	private Boulder boulder;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.boulder = new Boulder();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsUnique() {
		final boolean expected = false;
		
		assertEquals(expected, boulder.IsUnique());
	}

	@Test
	public void testIsMobile() {
		final boolean expected = true;
		
		assertEquals(expected, boulder.IsMobile());
	}

	@Test
	public void testIsConsomable() {
		final boolean expected = false;
		
		assertEquals(expected, boulder.IsConsomable());
	}

	@Test
	public void testIsExplodable() {
		final boolean expected = true;
		
		assertEquals(expected, boulder.IsExplodable());
	}



	@Test
	public void testGetSprite() {
		fail("Not yet implemented");
	}

	@Test
	public void testBoulder() {
		fail("Not yet implemented");
	}

}
