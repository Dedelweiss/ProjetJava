package model;



/**
 * EntityMatrix is used to store the elements of a playfield.
 */
public interface EntityMatrix {
	
	// debug/development only
    void display();

    /**
     * Store an entity for the specified coords.
     * 
     * @param x coordinate 
     * @param y coordinate
     * @param entity entity
     */
   // void setContentAt(final int x, final int y, final Entity entity);

    /**
     * Get the entity stored at the specified coords.
     * 
     * @param x coordinate
     * @param y coordinate
     * 
     */
    //Entity getContentAt(final int x, final int y);

    /**
     * @return number of rows of the matrix
     */
    int getRowsCount();

    /**
     * @return number of columns of the matrix
     */
    int getColumnsCount();

    @Override
    boolean equals(Object other);

    @Override
    int hashCode();

}
