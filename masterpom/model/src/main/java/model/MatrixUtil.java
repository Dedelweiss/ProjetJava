package model;
/**
 * 
 * @author lebla
 *Used for the class MatrixInit
 */
public abstract class MatrixUtil implements EntityMatrix{
	
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

}
