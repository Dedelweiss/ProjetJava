package model;

import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;

import entity.Boulder;
import entity.Empty;
import entity.Entity;
import entity.Exit;
import entity.Player;
import entity.Wall;

/**
 * 
 * @author Leblanc Lucas
 *
 *@param matrix
 *			Used to create a matrix whith x and y
 */
 

public class DAOMap {
	
	private static final long serialVersionUID = 1620562427653382683L;
	private static final Logger MATRIX_LOGGER = new DefaultLoggerWithOutNewLine();
	private static final Logger LOGGER = new DefaultLogger(EntityMatrix2DArrayImpl.class);

	private final int rows; // x coord
	private final int columns; // y coord
	private Entity[][] data;
	@SuppressWarnings("unused")
	private final Map<Coordinates, Entity> data;

	public EntityMatrixMapImpl()
	{
		throw new NotImplementedException("The EntityMatrixMap has not been implemented yet. Use EntityMatrix2DArray instead.");
	}

	@Override
	public void display()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void setContentAt(final int x, final int y, final Entity entity)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public Entity getContentAt(final int x, final int y)
	{
		// TODO Auto-generated method stub
		return new EmptySpace(); //TODO just an entity is returned cause of Eclipse null analysis.
	}

	@Override
	public int getRowsCount()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumnsCount()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	final class Coordinates
	{
		private int x;
		private int y;

		public Coordinates(final int x, final int y)
		{
			this.x = x;
			this.y = y;
		}

		public int getX()
		{
			return this.x;
		}

		public void setX(final int x)
		{
			this.x = x;
		}

		public int getY()
		{
			return this.y;
		}

		public void setY(final int y)
		{
			this.y = y;
		}
	}

	public EntityMatrix2DArrayImpl(final int rows, final int columns)
	{
		this.rows = rows;
		this.columns = columns;
		this.data = new Entity[rows][columns];
	}

	@Override
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

	private void checkCoords(final int x, final int y)
	{
		if ( x > getRowsCount() || x < 0 || y < 0 || y > getColumnsCount() ) {
			throw new IllegalEntityPlacementException("Invalid coordinates for x = " + x + " and y = " + y);
		}
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + this.columns;
		result = prime * result + Arrays.hashCode(this.data);
		result = prime * result + this.rows;
		return result;
	}

	@Override
	public boolean equals(final @Nullable Object object)
	{
		if ( object == null || object.getClass() != this.getClass() ) {
			LOGGER.debug("Erreur -> les deux objets passés à la méthode equals ne sont pas de la même classe.");
			return false;
		}

		EntityMatrix other = (EntityMatrix) object;

		// Compare sizes
		if ( this.getColumnsCount() != other.getColumnsCount() || this.getRowsCount() != other.getRowsCount() ) {
			LOGGER.debug("Erreur -> les deux matrices n'ont pas la même taille.");
			return false;
		}

		// Compare types
		for ( int i = 0; i < rows; i++ ) {
			for ( int j = 0; j < columns; j++ ) {
				if ( this.getContentAt(i, j).getClass() != other.getContentAt(i, j).getClass() ) {
					LOGGER.debug("Erreur -> au moins une case des deux matrices ne contient pas le même type d'objet.");
					return false;
				}
			}
		}
		return true;
	}
}
