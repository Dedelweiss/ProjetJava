package model;

import java.io.Serializable;

/**
 * 
 * @author Leblanc Lucas
 *
 *
 */
public class MatrixInit implements EntityMatrix, Serializable{

	private static final long serialVersionUID = 1620562427653382683L;
	/*
	    private static final Logger MATRIX_LOGGER = new DefaultLoggerWithOutNewLine();
	    private static final Logger LOGGER = new DefaultLogger(EntityMatrix2DArrayImpl.class);
	*/
	    
	    private final int rows; // x coord
	    private final int columns; // y coord
	   // private Entity[][] data;

	    public MatrixInit(final int rows, final int columns)
	    {
	        this.rows = rows;
	        this.columns = columns;
	      //  this.data = new Entity[rows][columns];
	    }

	/*
	    public void display()
	    {
	        for ( int i = 0; i < rows; i++ ) {
	            for ( int j = 0; j < columns; j++ ) {
	                MATRIX_LOGGER.debug(this.data[i][j].getName() + " ");
	            }
	            MATRIX_LOGGER.debug("\n");
	        }
	        MATRIX_LOGGER.debug("\n");
	    }
	*/
	    
	    @Override
	    public int getRowsCount()
	    {
	        return this.rows;
	    }

	    @Override
	    public int getColumnsCount()
	    {
	        return this.columns;
	    }
	/*
	    @Override
	    public void setContentAt(final int x, final int y, final Entity entity)
	    {
	        checkCoords(x, y);
	        assert entity != null;
	        this.data[x][y] = entity;
	    }

	    @Override
	    public Entity getContentAt(final int x, final int y)
	    {
	        checkCoords(x, y);
	        Entity checkedContent = this.data[x][y];
	        assert checkedContent != null;
	        return checkedContent;
	    }
	*/
	/*
	    private void checkCoords(final int x, final int y)
	    {
	        if ( x > getRowsCount() || x < 0 || y < 0 || y > getColumnsCount() ) {
	            throw new IllegalEntityPlacementException("Invalid coordinates for x = " + x + " and y = " + y);
	        }
	    }
	    
	*/
/*
	    @Override
	    public int hashCode()
	    {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + this.columns;
	        result = prime * result + Arrays.hashCode(this.data);
	        result = prime * result + this.rows;
	        return result;
	    }*/

	@Override
	public void display() {
	    // TODO Auto-generated method stub
	    
	}

	/*@Override
	public void setContentAt(int x, int y, Entity entity) {
	    // TODO Auto-generated method stub
	   
	}*/
/*
	@Override
	public Entity getContentAt(int x, int y) {
	    // TODO Auto-generated method stub
	    return null;
	}*/


	/*    public boolean equals(final Object object) */
}
