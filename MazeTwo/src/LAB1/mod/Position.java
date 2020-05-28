
package LAB1.mod;

public class Position
{//instance variables
    private int _row;
    private int _col;
    //getters
    public int getRow() {
        return this._row;
    }
    
    public int getCol() {
        return this._col;
    }
    //Constructor of position class
    public Position(final int r, final int c) {
        this._row = r;
        this._col = c;
    }
}
