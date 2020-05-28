

package LAB1.mod;

public class Rat1
{//Instance Variables
    private Position _curPos;
    private boolean _facingLeft;
    private boolean _isAlive;
    //getters
    public Position getPosition() {
        return this._curPos;
    }
    
    public boolean isAlive() {
        return this._isAlive;
    }
//Rat1 constructor    
    public Rat1(final Maze z) {
        this._facingLeft = true;
        this._isAlive = true;
        this._curPos = new Position(z.getrStart().getRow(), z.getrStart().getCol());
    }
  //Rat1 constructor    
    public Rat1(final Maze2 z2) {
        this._facingLeft = true;
        this._isAlive = true;
        this._curPos = new Position(z2.getrStart().getRow(), z2.getrStart().getCol());
    }
  //Rat1 constructor
    public Rat1(final Maze3 z3) {
        this._facingLeft = true;
        this._isAlive = true;
        this._curPos = new Position(z3.getrStart().getRow(), z3.getrStart().getCol());
    }
  //Rat1 constructor
    public Rat1(final Maze4 z4) {
        this._facingLeft = true;
        this._isAlive = true;
        this._curPos = new Position(z4.getrStart().getRow(), z4.getrStart().getCol());
    }
  //Rat1 constructor
    public Rat1(final Maze5 z5) {
        this._facingLeft = true;
        this._isAlive = true;
        this._curPos = new Position(z5.getrStart().getRow(), z5.getrStart().getCol());
    }
    //kills and removes rat
    public void killRat1() {
        this._isAlive = false;
        this._curPos = new Position(0, 0);
    }
    //moves rat
    public void move(final Maze z) {
        if (this._facingLeft) {
            if (!z.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
                this._facingLeft = false;
            }
        }
        else if (!z.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
        }
        else {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            this._facingLeft = true;
        }
    }
  //moves rat
    public void move(final Maze2 z2) {
        if (this._facingLeft) {
            if (!z2.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
                this._facingLeft = false;
            }
        }
        else if (!z2.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
        }
        else {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            this._facingLeft = true;
        }
    }
  //moves rat
    public void move(final Maze3 z3) {
        if (this._facingLeft) {
            if (!z3.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
                this._facingLeft = false;
            }
        }
        else if (!z3.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
        }
        else {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            this._facingLeft = true;
        }
    }
  //moves rat
    public void move(final Maze4 z4) {
        if (this._facingLeft) {
            if (!z4.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
                this._facingLeft = false;
            }
        }
        else if (!z4.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
        }
        else {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            this._facingLeft = true;
        }
    }
  //moves rat
    public void move(final Maze5 z5) {
        if (this._facingLeft) {
            if (!z5.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
                this._facingLeft = false;
            }
        }
        else if (!z5.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
        }
        else {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            this._facingLeft = true;
        }
    }
}
