
package LAB1.mod;

public class Player
{//Instance Variables
    private int _row;
    private int _col;
    private Position _curPos;
    private boolean sword;
    private boolean _isAlive;
    //Getters
    public int getRow() {
        return this._row;
    }
    
    public int getCol() {
        return this._col;
    }
    
    public Position getPosition() {
        return this._curPos;
    }
    //Setters
    public boolean isAlive() {
        return this._isAlive;
    }
    
    public void setPosition(final Position p) {
        this._curPos = p;
    }
    
    public void killPlayer() {
        this._isAlive = false;
    }
    //Gives player sword
    public boolean giveSword() {
        return this.sword;
    }
    //gives player sword and removes it from map 
    public boolean hasSword(final Sword k) {
        if (this._curPos.getRow() == k.getPosition().getRow() && this._curPos.getCol() == k.getPosition().getCol()) {
            k.dead();
            this.sword = true;
            return false;
        }
        return false;
    }
    // sets sword to false
    public boolean hasSword1(final Sword k) {
        this.sword = false;
        return true;
    }
    //removes sword
    public void RemoveSword() {
        this.sword = false;
    }
    //contructor for player class
    public Player(final Maze z) {
        this._isAlive = true;
        this._curPos = new Position(z.getStart().getRow(), z.getStart().getCol());
    }
  //contructor for player class
    public Player(final Maze2 z2) {
        this._isAlive = true;
        this._curPos = new Position(z2.getStart().getRow(), z2.getStart().getCol());
    }
  //contructor for player class
    public Player(final Maze3 z3) {
        this._isAlive = true;
        this._curPos = new Position(z3.getStart().getRow(), z3.getStart().getCol());
    }
  //contructor for player class
    public Player(final Maze4 z4) {
        this._isAlive = true;
        this._curPos = new Position(z4.getStart().getRow(), z4.getStart().getCol());
    }
  //contructor for player class
    public Player(final Maze5 z5) {
        this._isAlive = true;
        this._curPos = new Position(z5.getStart().getRow(), z5.getStart().getCol());
    }
    //checks which button was pressed and moves player that direction
    public boolean move(final Direction d, final Maze z) {
        if (d == Direction.Up) {
            if (this._curPos.getRow() - 1 >= 0 && !z.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
                return true;
            }
        }
        else if (d == Direction.Down) {
            if (this._curPos.getRow() + 1 < z.getMaze().length && !z.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
                return true;
            }
        }
        else if (d == Direction.Right) {
            if (this._curPos.getCol() + 1 < z.getMaze()[this._curPos.getRow()].length && !z.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
                return true;
            }
        }
        else if (this._curPos.getCol() - 1 >= 0 && !z.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            return true;
        }
        return false;
    }
  //checks which button was pressed and moves player that direction
    public boolean move(final Direction d, final Maze2 z2) {
        if (d == Direction.Up) {
            if (this._curPos.getRow() - 1 >= 0 && !z2.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
                return true;
            }
        }
        else if (d == Direction.Down) {
            if (this._curPos.getRow() + 1 < z2.getMaze().length && !z2.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
                return true;
            }
        }
        else if (d == Direction.Right) {
            if (this._curPos.getCol() + 1 < z2.getMaze()[this._curPos.getRow()].length && !z2.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
                return true;
            }
        }
        else if (this._curPos.getCol() - 1 >= 0 && !z2.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            return true;
        }
        return false;
    }
  //checks which button was pressed and moves player that direction
    public boolean move(final Direction d, final Maze3 z3) {
        if (d == Direction.Up) {
            if (this._curPos.getRow() - 1 >= 0 && !z3.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
                return true;
            }
        }
        else if (d == Direction.Down) {
            if (this._curPos.getRow() + 1 < z3.getMaze().length && !z3.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
                return true;
            }
        }
        else if (d == Direction.Right) {
            if (this._curPos.getCol() + 1 < z3.getMaze()[this._curPos.getRow()].length && !z3.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
                return true;
            }
        }
        else if (this._curPos.getCol() - 1 >= 0 && !z3.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            return true;
        }
        return false;
    }
  //checks which button was pressed and moves player that direction
    public boolean move(final Direction d, final Maze4 z4) {
        if (d == Direction.Up) {
            if (this._curPos.getRow() - 1 >= 0 && !z4.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
                return true;
            }
        }
        else if (d == Direction.Down) {
            if (this._curPos.getRow() + 1 < z4.getMaze().length && !z4.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
                return true;
            }
        }
        else if (d == Direction.Right) {
            if (this._curPos.getCol() + 1 < z4.getMaze()[this._curPos.getRow()].length && !z4.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
                return true;
            }
        }
        else if (this._curPos.getCol() - 1 >= 0 && !z4.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            return true;
        }
        return false;
    }
  //checks which button was pressed and moves player that direction
    public boolean move(final Direction d, final Maze5 z5) {
        if (d == Direction.Up) {
            if (this._curPos.getRow() - 1 >= 0 && !z5.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
                return true;
            }
        }
        else if (d == Direction.Down) {
            if (this._curPos.getRow() + 1 < z5.getMaze().length && !z5.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
                return true;
            }
        }
        else if (d == Direction.Right) {
            if (this._curPos.getCol() + 1 < z5.getMaze()[this._curPos.getRow()].length && !z5.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
                return true;
            }
        }
        else if (this._curPos.getCol() - 1 >= 0 && !z5.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            return true;
        }
        return false;
    }
}
