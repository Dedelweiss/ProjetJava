package entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EntityTest {

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

	@Test
	public void testIsExplodable() {
		System.out.println(Boulder.isExplodable);
		System.out.println(Diamants.isExplodable);
	}
	
	@Test
	public void testIsUnique() {
		System.out.println(Boulder.isUnique);
		
		
	}
	
	@Test
	public void testIsMobile() {
		System.out.println(Boulder.isMobile);
		
	}
	
	@Test
	public void testIsConsomable() {
		System.out.println(Boulder.isConsomable);
		
	}

}
