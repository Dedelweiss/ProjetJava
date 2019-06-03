package model;

import java.util.logging.Logger;
/**
 * 
 * @author Leblanc Lucas
 *            
 *
 *The most important class where we have all the organization of the game.
 */
public final class Model /*extends Observable implements IModel*/ {
	
	 private EntityMatrix matrix; 
	    //private Player player;
	    //private Exit exit;
	    private static Logger LOGGER;

	    /**
	     * 
	     * @param rows Used for the map's size
	     * @param columns
	     * Used for the map's size
	     * 
	     */
	        public void DAOMap(int rows, int columns) {
	            //this.matrix = new EntityMatrix(rows, columns);
	            Integer x = null;
	            Integer y = null;
	            //this.player = new Player(x, y);
	            //this.exit = new Exit();
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
	           /* final int rowsCount = getMatrix().getRowsCount();
	            final int columnsCount = getMatrix().getColumnsCount();

	            for ( int i = 0; i < rowsCount; i++ ) {
	                for ( int j = 0; j < columnsCount; j++ ) {
	                    //Initialize the world with just indestructible wall on the edges.
	                    if ( i == 0 || i == rowsCount - 1 || j == 0 || j == columnsCount - 1 ) {
	                        getMatrix().setContentAt(i, j, new Wall());
	                    } else {
	                        getMatrix().setContentAt(i, j, new entity.Dirt());
	                    }
	                }
	            }*/
	            
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
	        
	      /*  private Entity getEntityBelow(int x, int y) {
	            return getMatrix().getContentAt(x + 1, y);
	            
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
	            
	        }/*
	    
	/**
	 * 
	 * @param x coordinate
	 * @param y coordinate
	 * @param entity
	 * Initializes the entity placement
	 */
	        public void addEntity (int x, int y /*Entity entity*/) {
	        }

	/**
	 * 
	 * @param rowIndex Initializes the player placement
	 * @param columnIndex
	 * Initializes the player placement
	 */
	  
	      public void initPlayerPosition(int rowIndex, int columnIndex) {
	            
	            /*if ( getPlayer().getX() != null || getPlayer().getY() != null ) {
	                // If player was already existing, then move it to the neww coords
	                getMatrix().setContentAt(getPlayer().getX(), getPlayer().getY(), new Dirt());
	            }
	            this.player.setCoordonnees(rowIndex, columnIndex);
	            getMatrix().setContentAt(rowIndex, columnIndex, player);*/
	            
	        }
	/**
	 *     
	 * @param rowIndex Initialize the position of the exit
	 * @param columnIndex
	 * Initialize the position of the exit
	 */
	        public void initExitPosition(int rowIndex, int columnIndex) {
	/*        
	            if ( getExit().getX() != null || getExit().getY() != null ) {
	                // If the exit was already existing, then move it to the neww coords
	                getMatrix().setContentAt(getExit().getX(), getExit().getY(), new Dirt());
	            }
	            this.exit.setCoordonnees(rowIndex, columnIndex);
	            getMatrix().setContentAt(rowIndex, columnIndex, exit);
	*/
	        }
	       /* public Player getPlayer() {
	            return this.player;
	            
	        }
	        
	        public Exit getExit() {
	            return this.exit;
	            
	        }*/
	 
	/**
	 * 
	 * @param direction
	 * A method that associates each key with a player’s movement.
	 */
	        public void movePlayer(Direction direction) {
	            
	            /*switch ( direction ) {
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
	        }*/
	            
	        }
	        
	/**
	 * 
	 * 
	 * @param direction it is the direction
	 * 
	 * Used to see that what action is performed on diamond and rock objects. Just when the position of the player is same that these objects.
	 */
	        private void move(/*Entity neighboringEntity*/ Direction direction) {
	            
	            /*if ( neighboringEntity.isConsomable() ) {
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
	                
	            }*/
	            
	        }
	        
	        
	/**
	 * 
	 * 
	 * @param direction it is the direction
	 * @return Movement of the boulder when the player push it.
	 */
	        private boolean pushBoulder(/*Boulder boulder*/ Direction direction ) {
	            
	           /* if ( direction == Direction.LEFT && getEntityOnLeft(boulder.getX(), boulder.getY()) instanceof Empty ) {
	                deplace(boulder, direction);
	                deplace(player, direction);
	                return true;
	            } else if ( direction == Direction.RIGHT && getEntityOnRight(boulder.getX(), boulder.getY()) instanceof Empty ) { // Right
	                deplace(boulder, direction);
	                deplace(player, direction);
	                return true;
	            }*/
	            return false;
	            
	        }
	/**
	 *     
	 * Different method used for the movable entities like the boulder.
	 * @param direction it is the direction
	 */
	        //public void updateMovableEntities() {
	        //    
	        //}
	        
	        //private void fall(Entity entity) {
	        //    
	        //}
	        //private void explose(Entity entity) {
	        //    
	        //}
	        private void deplace(/*Mobile entity*/ Direction direction) {
	            
	/*
	                    if ( entity.equals(getPlayer()) ) {
	                        getMatrix().setContentAt(entity.getX(), entity.getY(), new Empty());
	                        getPlayer().move(direction);
	                        getMatrix().setContentAt(entity.getX(), entity.getY(), entity);
	                    } else {
	                        getMatrix().setContentAt(entity.getX(), entity.getY(), new Empty());
	                        entity.move(direction);
	                        getMatrix().setContentAt(entity.getX(), entity.getY(), entity);
	                    }
	            
	*/
	        }

}
