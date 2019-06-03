package entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EntityTest {
	private Boulder boulder;
	private Diamond diamants;
	private Player player; 
	private Dirt dirt; 
	private Exit exit;
	private Wall wall; 
	private Empty empty;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.boulder = new Boulder(null, null);
		this.diamants = new Diamond(null, null);
		this.player = new Player(null, null);
		this.dirt = new Dirt();
		this.exit = new Exit();
		this.wall = new Wall();
		this.empty = new Empty();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsExplodable() {
		final boolean expected = false;
		System.out.println("Boulder is explodable : " + Boulder.isExplodable);
		assertEquals(expected, Boulder.isExplodable);
		
		final boolean expected1 = false;
		System.out.println("Diamants is explodable : " + Diamond.isExplodable);
		assertEquals(expected1, Diamond.isExplodable);
		
		final boolean expected2 = false;
		System.out.println("Player is explodable : " + Player.isExplodable);
		assertEquals(expected2, Player.isExplodable);
		
		final boolean expected3 = true;
		System.out.println("Dirt is explodable : " + Dirt.isExplodable);
		assertEquals(expected3, Dirt.isExplodable);
		
		final boolean expected4 = false;
		System.out.println("Exit is explodable : " + Exit.isExplodable);
		assertEquals(expected4, Exit.isExplodable);
		
		final boolean expected5 = false;
		System.out.println("Wall is explodable : " + Wall.isExplodable);
		assertEquals(expected5, Wall.isExplodable);
		
		final boolean expected6 = false;
		System.out.println("Empty is explodable : " + Empty.isExplodable);
		assertEquals(expected6, Empty.isExplodable);
		
	}
	
	@Test
	public void testIsUnique() {
		final boolean expected = false;
		System.out.println("Boulder is unique : " + Boulder.isUnique);
		assertEquals(expected, Boulder.isUnique);
		
		final boolean expected1 = false;
		System.out.println("Diamants is unique : " + Diamond.isUnique);
		assertEquals(expected1, Diamond.isUnique);
		
		final boolean expected2 = true;
		System.out.println("Player is unique : " + Player.isUnique);
		assertEquals(expected2, Player.isUnique);
		
		final boolean expected3 = false;
		System.out.println("Dirt is unique : " + Dirt.isUnique);
		assertEquals(expected3, Dirt.isUnique);
		
		final boolean expected4 = true;
		System.out.println("Exit is unique : " + Exit.isUnique);
		assertEquals(expected4, Exit.isUnique);
		
		final boolean expected5 = false;
		System.out.println("Wall is unique : " + Wall.isUnique);
		assertEquals(expected5, Wall.isUnique);
		
		final boolean expected6 = false;
		System.out.println("Empty is unique : " + Empty.isUnique);
		assertEquals(expected6, Empty.isUnique);
	}
	
	@Test
	public void testIsMobile() {
		final boolean expected = true;
		System.out.println("Boulder is mobile : " + Boulder.isMobile);
		assertEquals(expected, Boulder.isMobile);
		
		final boolean expected1 = true;
		System.out.println("Diamants is mobile : " + Diamond.isMobile);
		assertEquals(expected1, Diamond.isMobile);
		
		final boolean expected2 = true;
		System.out.println("Player is mobile : " + Player.isMobile);
		assertEquals(expected2, Player.isMobile);
		
		final boolean expected3 = false;
		System.out.println("Dirt is mobile : " + Dirt.isMobile);
		assertEquals(expected3, Dirt.isMobile);
		
		final boolean expected4 = false;
		System.out.println("Exit is mobile : " + Exit.isMobile);
		assertEquals(expected4, Exit.isMobile);
		
		final boolean expected5 = false;
		System.out.println("Wall is mobile : " + Wall.isMobile);
		assertEquals(expected5, Wall.isMobile);
		
		final boolean expected6 = false;
		System.out.println("Empty is mobile : " + Empty.isMobile);
		assertEquals(expected6, Empty.isMobile);
	}
	
	@Test
	public void testIsConsomable() {
		final boolean expected = false;
		System.out.println("Boulder is consomable : " + Boulder.isConsomable);
		assertEquals(expected, Boulder.isConsomable);
		
		final boolean expected1 = true;
		System.out.println("Diamants is consomable : " + Diamond.isConsomable);
		assertEquals(expected1, Diamond.isConsomable);
		
		final boolean expected2 = false;
		System.out.println("Player is consomable : " + Player.isConsomable);
		assertEquals(expected2, Player.isConsomable);
		
		final boolean expected3 = false;
		System.out.println("Dirt is consomable : " + Dirt.isConsomable);
		assertEquals(expected3, Dirt.isConsomable);
		
		final boolean expected4 = false;
		System.out.println("Exit is consomable : " + Exit.isConsomable);
		assertEquals(expected4, Exit.isConsomable);
		
		final boolean expected5 = false;
		System.out.println("Wall is consomable : " + Wall.isConsomable);
		assertEquals(expected5, Wall.isConsomable);
		
		final boolean expected6 = false;
		System.out.println("Empty is consomable : " + Empty.isConsomable);
		assertEquals(expected6, Empty.isConsomable);
	}

}
