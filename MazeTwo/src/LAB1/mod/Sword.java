
package LAB1.mod;

public class Sword
{//Instance variables
    private Position _curPos;
    private boolean _isAlive;
    //getters
    public Position getPosition() {
        return this._curPos;
    }
    
    public boolean isAlive() {
        return this._isAlive;
    }
    //setters
    public void killSword() {
        this._isAlive = false;
    }
    //Sword constructor
    public Sword(final Maze z) {
        this._isAlive = true;
        this._curPos = new Position(z.getSword().getRow(), z.getSword().getCol());
    }
  //Sword constructor
    public Sword(final Maze2 z2) {
        this._isAlive = true;
        this._curPos = new Position(z2.getSword().getRow(), z2.getSword().getCol());
    }
  //Sword constructor
    public Sword(final Maze3 z3) {
        this._isAlive = true;
        this._curPos = new Position(z3.getSword().getRow(), z3.getSword().getCol());
    }
  //Sword constructor
    public Sword(final Maze4 z4) {
        this._isAlive = true;
        this._curPos = new Position(z4.getSword().getRow(), z4.getSword().getCol());
    }
  //Sword constructor
    public Sword(final Maze5 z5) {
        this._isAlive = true;
        this._curPos = new Position(z5.getSword().getRow(), z5.getSword().getCol());
    }
    //sets new position for sword
    public void dead() {
        this._curPos = new Position(5, 0);
    }
}
