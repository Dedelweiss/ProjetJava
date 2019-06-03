package model;

import java.util.logging.Logger;

import entity.Boulder;
import entity.Empty;
import entity.Entity;
import entity.Exit;
import entity.Player;
import entity.Wall;
import src.main.java.nantel.java.boulder.models.ArrayList;
import src.main.java.nantel.java.boulder.models.Diamond;
import src.main.java.nantel.java.boulder.models.Direction;
import src.main.java.nantel.java.boulder.models.Dirt;
import src.main.java.nantel.java.boulder.models.EmptySpace;
import src.main.java.nantel.java.boulder.models.EntityMatrix;
import src.main.java.nantel.java.boulder.models.EntityMatrix2DArrayImpl;
import src.main.java.nantel.java.boulder.models.List;
import src.main.java.nantel.java.boulder.models.Mobile;
import src.main.java.nantel.java.boulder.models.MovableEntityComparator;
import src.main.java.nantel.java.boulder.models.SteelWall;

public class DAOMap {
	private EntityMatrix matrix; // the map 
	private Player player;
	private Exit exit;
	private static long serialVersionUID;
	private static Logger LOGGER;


	public DAOMap(int rows, int columns) {
		this.matrix = new EntityMatrix2DArrayImpl(rows, columns);
		this.player = new Player(x, y);
		this.exit = new Exit();
		init();
		
	}
	
	//private EntityMatrix getMatrix() {
	//	
	//}
	private EntityMatrix getMatrix()
	{
		return this.matrix;
	}
	
	public static Logger getLOGGER(){
		return LOGGER;
		
	}
	
	private void init() {
		final int rowsCount = getMatrix().getRowsCount();
		final int columnsCount = getMatrix().getColumnsCount();

		for ( int i = 0; i < rowsCount; i++ ) {
			for ( int j = 0; j < columnsCount; j++ ) {
				// Initialise le terrain avec uniquement de la terre + des murs indestructibles sur les contours.
				if ( i == 0 || i == rowsCount - 1 || j == 0 || j == columnsCount - 1 ) {
					getMatrix().setContentAt(i, j, new Wall());
				} else {
					getMatrix().setContentAt(i, j, new entity.Dirt());
				}
			}
		}
		
	}
	
	public void display() {
		getMatrix().display();
		
	}
	
	public int getRowsCount() {
		return 25;
		
	}
	
	public int getColumnsCount() {
		return 25;
		
	}
	
	private Entity getEntityBelow(int x, int y) {
		return getMatrix().getContentAt(x + 1, y);;
		
	}
	
	private Entity getEntityAbove(int x, int y) {
		return getMatrix().getContentAt(x - 1, y);
				
	}
	
	private Entity getEntityOnRight(int x, int y) {
		return getMatrix().getContentAt(x, y + 1);
	
	}
	
	private Entity getEntityOnLeft(int x, int y) {
		return getMatrix().getContentAt(x, y - 1);
		
	}
	
	private Entity getEntityBelowRight(int x, int y) {
		return getMatrix().getContentAt(x + 1, y + 1);
		
	}
	
	private Entity getEntityBelowLeft(int x, int y) {
		return getMatrix().getContentAt(x + 1, y - 1);
		
	}
	
	private Entity getEntityAboveRight(int x, int y) {
		return getMatrix().getContentAt(x - 1, y + 1);
		
	}
	
	private Entity getEntityAboveLeft(int x, int y) {
		return getMatrix().getContentAt(x - 1, y - 1);
		
	}
	
	public Entity getContentAt(int x, int y) {
		return getMatrix().getContentAt(x, y);
		
	}
	
	private list<Mobile> getDiamondsAndBoulders(){
		
		List<Mobile> list = new ArrayList<>();
		for ( int i = 0; i < getRowsCount(); i++ ) {
			for ( int j = 0; j < getColumnsCount(); j++ ) {
				if ( getContentAt(i, j).Movable() ) {
					Mobile entity = (Mobile) getContentAt(i, j);
					if ( entity instanceof Boulder || entity instanceof Diamond ) {
						list.add((Mobile) getContentAt(i, j));
					}
				}
			}
		}
		return list;
		
	}
	
	public void addEntity (int x, int y, Entity entity) {
		
if ( entity.isUnique() ) { // Contournement du pattern singleton
			
		} else { 
			if ( entity.isMobile() ) {
				Mobile Mobile = (Mobile) entity;
				Mobile.setCoordonnees(x, y); // Save the coords
				getMatrix().setContentAt(x, y, Mobile);
			} else {
				getMatrix().setContentAt(x, y, entity);
			}
		}
		
	}
	
	public void initPlayerPosition(int rowIndex, int columnIndex) {
		
		if ( getPlayer().getX() != null || getPlayer().getY() != null ) {
			// If player was already existing, then move it to the neww coords
			getMatrix().setContentAt(getPlayer().getX(), getPlayer().getY(), new Dirt());
		}
		this.player.setCoordonnees(rowIndex, columnIndex);
		getMatrix().setContentAt(rowIndex, columnIndex, player);
		
	}
	
	public void initExitPosition(int rowIndex, int columnIndex) {
		
		if ( getExit().getX() != null || getExit().getY() != null ) {
			// If the exit was already existing, then move it to the neww coords
			getMatrix().setContentAt(getExit().getX(), getExit().getY(), new Dirt());
		}
		this.exit.setCoordonnees(rowIndex, columnIndex);
		getMatrix().setContentAt(rowIndex, columnIndex, exit);
		
	}
	public Player getPlayer() {
		return this.player;
		
	}
	
	public Exit getExit() {
		return this.exit;
		
	}
	
	public void movePlayer(Direction direction) {
		
		switch ( direction ) {
		case DOWN :
			move(getEntityBelow(player.getX(), player.getY()), Direction.DOWN);
			break;
		case LEFT :
			move(getEntityOnLeft(player.getX(), player.getY()), Direction.LEFT);
			break;
		case RIGHT :
			move(getEntityOnRight(player.getX(), player.getY()), Direction.RIGHT);
			break;
		case UP :
			move(getEntityAbove(player.getX(), player.getY()), Direction.UP);
			break;
		default :
			break;
	}
		
	}
	
	private void move(Entity neighboringEntity, Direction direction) {
		
		if ( neighboringEntity.isConsomable() ) {
			if ( neighboringEntity instanceof Diamond ) {
				player.collectDiamond();
			}
			deplace(player, direction);
		} else if ( neighboringEntity instanceof Boulder && (direction == Direction.RIGHT || direction == Direction.LEFT) ) { // Can only push boulder and only on the sides.
			if ( !pushBoulder((Boulder) neighboringEntity, direction) ) {
			}
		} else if ( neighboringEntity.equals(getExit()) ) {
			if ( exit.isAllowed() ) {
				deplace(player, direction);
				exit.setReached(true); // will end the game
			} else {
	
			}
		} else {
			
		}
		
	}
	
	private boolean pushBoulder(Boulder boulder, Direction direction ) {
		
		if ( direction == Direction.LEFT && getEntityOnLeft(boulder.getX(), boulder.getY()) instanceof Empty ) {
			deplace(boulder, direction);
			deplace(player, direction);
			return true;
		} else if ( direction == Direction.RIGHT && getEntityOnRight(boulder.getX(), boulder.getY()) instanceof Empty ) { // Right
			deplace(boulder, direction);
			deplace(player, direction);
			return true;
		}
		return false;
		
	}
	
	//public void updateMovableEntities() {
	//	
	//}
	
	//private void fall(Entity entity) {
	//	
	//}
	//private void explose(Entity entity) {
	//	
	//}
	private void deplace(Mobile entity, Direction direction) {
		
		// FIXME: don't delete the Exit if player reach it and don't has enough diamonds yet
				if ( entity.equals(getPlayer()) ) {
					getMatrix().setContentAt(entity.getX(), entity.getY(), new EmptySpace());
					getPlayer().move(direction);
					getMatrix().setContentAt(entity.getX(), entity.getY(), entity);
				} else {
					getMatrix().setContentAt(entity.getX(), entity.getY(), new EmptySpace());
					entity.move(direction);
					getMatrix().setContentAt(entity.getX(), entity.getY(), entity);
				}
		
	}
	//public int hashCode() {
	//	return 0;
	//	
		
	//}

}
