 

package LAB1.mod;

public class Minotaur
{//Instance Variables
    private boolean _isAlive;
    private Position _curPos;
    //Getters
    public boolean isAlive() {
        return this._isAlive;
    }
    
    public Position getPosition() {
        return this._curPos;
    }
    //Minotaur Constructor
    public Minotaur(final Maze z) {
        this._isAlive = true;
        this._curPos = new Position(z.getmStart().getRow(), z.getmStart().getCol());
    }
  //Minotaur Constructor
    public Minotaur(final Maze2 z2) {
        this._isAlive = true;
        this._curPos = new Position(z2.getmStart().getRow(), z2.getmStart().getCol());
    }
  //Minotaur Constructor
    public Minotaur(final Maze3 z3) {
        this._isAlive = true;
        this._curPos = new Position(z3.getmStart().getRow(), z3.getmStart().getCol());
    }
  //Minotaur Constructor
    public Minotaur(final Maze4 z4) {
        this._isAlive = true;
        this._curPos = new Position(z4.getmStart().getRow(), z4.getmStart().getCol());
    }
  //Minotaur Constructor
    public Minotaur(final Maze5 z5) {
        this._isAlive = true;
        this._curPos = new Position(z5.getmStart().getRow(), z5.getmStart().getCol());
    }
    //Sets Minotaur as dead and makes it disappear
    public void killMinotaur() {
        this._isAlive = false;
        this._curPos = new Position(0, 0);
    }
    //Moves the minotaur and makes sure the minotaur is moving within the bounds
    public void move(final Maze _z, final Player _p) {
        final int distRow = this._curPos.getRow() - _p.getPosition().getRow();
        final int distCol = this._curPos.getCol() - _p.getPosition().getCol();
        if (distRow > 0) {
            if (!_z.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
            }
            else if (distCol > 0 && !_z.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else if (!_z.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
            }
            else if (!_z.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
            }
        }
        else if (distRow == 0) {
            if (distCol > 0 && !_z.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else if (!_z.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
            }
            else if (!_z.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
            }
            else if (!_z.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
            }
            else {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
        }
        else if (!_z.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
            this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
        }
        else if (distCol > 0 && !_z.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
        }
        else if (!_z.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
        }
        else if (!_z.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
        }
        else {
            this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
        }
    }
  //Moves the minotaur and makes sure the minotaur is moving within the bounds
    public void move(final Maze2 _z2, final Player _p) {
        final int distRow = this._curPos.getRow() - _p.getPosition().getRow();
        final int distCol = this._curPos.getCol() - _p.getPosition().getCol();
        if (distRow > 0) {
            if (!_z2.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
            }
            else if (distCol > 0 && !_z2.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else if (!_z2.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
            }
            else if (!_z2.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
            }
        }
        else if (distRow == 0) {
            if (distCol > 0 && !_z2.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else if (!_z2.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
            }
            else if (!_z2.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
            }
            else if (!_z2.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
            }
            else {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
        }
        else if (!_z2.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
            this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
        }
        else if (distCol > 0 && !_z2.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
        }
        else if (!_z2.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
        }
        else if (!_z2.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
        }
        else {
            this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
        }
    }
  //Moves the minotaur and makes sure the minotaur is moving within the bounds
    public void move(final Maze3 _z3, final Player _p) {
        final int distRow = this._curPos.getRow() - _p.getPosition().getRow();
        final int distCol = this._curPos.getCol() - _p.getPosition().getCol();
        if (distRow > 0) {
            if (!_z3.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
            }
            else if (distCol > 0 && !_z3.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else if (!_z3.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
            }
            else if (!_z3.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
            }
        }
        else if (distRow == 0) {
            if (distCol > 0 && !_z3.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else if (!_z3.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
            }
            else if (!_z3.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
            }
            else if (!_z3.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
            }
            else {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
        }
        else if (!_z3.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
            this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
        }
        else if (distCol > 0 && !_z3.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
        }
        else if (!_z3.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
        }
        else if (!_z3.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
        }
        else {
            this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
        }
    }
  //Moves the minotaur and makes sure the minotaur is moving within the bounds
    public void move(final Maze4 _z4, final Player _p) {
        final int distRow = this._curPos.getRow() - _p.getPosition().getRow();
        final int distCol = this._curPos.getCol() - _p.getPosition().getCol();
        if (distRow > 0) {
            if (!_z4.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
            }
            else if (distCol > 0 && !_z4.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else if (!_z4.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
            }
            else if (!_z4.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
            }
        }
        else if (distRow == 0) {
            if (distCol > 0 && !_z4.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else if (!_z4.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
            }
            else if (!_z4.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
            }
            else if (!_z4.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
            }
            else {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
        }
        else if (!_z4.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
            this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
        }
        else if (distCol > 0 && !_z4.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
        }
        else if (!_z4.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
        }
        else if (!_z4.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
        }
        else {
            this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
        }
    }
  //Moves the minotaur and makes sure the minotaur is moving within the bounds
    public void move(final Maze5 _z5, final Player _p) {
        final int distRow = this._curPos.getRow() - _p.getPosition().getRow();
        final int distCol = this._curPos.getCol() - _p.getPosition().getCol();
        if (distRow > 0) {
            if (!_z5.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
            }
            else if (distCol > 0 && !_z5.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else if (!_z5.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
            }
            else if (!_z5.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
            }
        }
        else if (distRow == 0) {
            if (distCol > 0 && !_z5.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
            else if (!_z5.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
            }
            else if (!_z5.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
            }
            else if (!_z5.getMaze()[this._curPos.getRow() - 1][this._curPos.getCol()]) {
                this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
            }
            else {
                this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
            }
        }
        else if (!_z5.getMaze()[this._curPos.getRow() + 1][this._curPos.getCol()]) {
            this._curPos = new Position(this._curPos.getRow() + 1, this._curPos.getCol());
        }
        else if (distCol > 0 && !_z5.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
        }
        else if (!_z5.getMaze()[this._curPos.getRow()][this._curPos.getCol() + 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() + 1);
        }
        else if (!_z5.getMaze()[this._curPos.getRow()][this._curPos.getCol() - 1]) {
            this._curPos = new Position(this._curPos.getRow(), this._curPos.getCol() - 1);
        }
        else {
            this._curPos = new Position(this._curPos.getRow() - 1, this._curPos.getCol());
        }
    }
}
