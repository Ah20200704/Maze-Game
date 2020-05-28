

package LAB1.mod;

public class Maze5
{//Instance Variables
    private boolean[][] _maze;
    private Position _start;
    private Position _end;
    private Position _mStart;
    private Position _fStart;
    private Position _aStart;
    private Position _tStart;
    private Position _sword;
    private Position[] PlayerStart;
    private Position _Player;
    private Position[] PlayerEnd;
    private Position _PlayerEnd;
    private Position[] MinotaurStart;
    private Position _Minotaur;
    private Position[] Rat1Start;
    private Position _Rat1;
    private Position[] SwordStart;
    private Position _Sword;
    //Getters
    public Position getStart() {
        return this._start;
    }
    
    public Position getEnd() {
        return this._end;
    }
    
    public Position getmStart() {
        return this._mStart;
    }
    
    public Position getrStart() {
        return this._fStart;
    }
    
    public Position getaStart() {
        return this._aStart;
    }
    
    public Position getsStart() {
        return this._tStart;
    }
    
    public Position getSword() {
        return this._sword;
    }
    
    public boolean[][] getMaze() {
        return this._maze;
    }
    //Maze Constructor
    public Maze5() {
        this.PlayerStart = new Position[] { new Position(1, 7), new Position(7, 7) };
        this._Player = this.PlayerStart[(int)(Math.random() * 2.0)];
        this.PlayerEnd = new Position[] { new Position(4, 0) };
        this._PlayerEnd = this.PlayerEnd[(int)Math.random()];
        this.MinotaurStart = new Position[] { new Position(1, 3), new Position(4, 8) };
        this._Minotaur = this.MinotaurStart[(int)(Math.random() * 2.0)];
        this.Rat1Start = new Position[] { new Position(8, 1), new Position(4, 7) };
        this._Rat1 = this.Rat1Start[(int)(Math.random() * 2.0)];
        this.SwordStart = new Position[] { new Position(7, 2), new Position(6, 2) };
        this._Sword = this.SwordStart[(int)(Math.random() * 2.0)];
        final boolean[][] maze = { { true, false, false, false, false, true, true, false, false, false, false, true, true },
					        		{ true, false, false, false, false, false, false, false, false, true, false, false, true },
					        		{ true, true, false, false, false, true, false, true, false, true, false, true, true },
					        		{ true, false, false, false, false, false, false, false, false, true, false, true, true },
					        		{ false, false, false, false, true, false, false, false, false, false, false, true, true },
					        		{ true, false, false, true, false, false, true, false, false, false, false, true, true },
					        		{ true, false, false, true, true, false, true, true, false, true, false, false, true },
					        		{ true, false, false, false, false, false, false, false, false, false, true, true, true }, 
					        		{ true, false, true, false, false, false, true, false, false, false, false, false, true },
					        		{ false, false, false, true, false, false, false, true, false, true, false, false, true },
					        		{ true, true, false, true, false, true, false, false, false, false, false, false, true }, 
					        		{ false, false, false, false, false, false, false, true, false, false, true, false, true },
					        		{ true, false, false, true, false, true, false, true, false, false, true, false, false } };
        this._maze = maze;
        this._start = new Position(this._Player.getRow(), this._Player.getCol());
        this._end = new Position(this._PlayerEnd.getRow(), this._PlayerEnd.getCol());
        this._mStart = new Position(this._Minotaur.getRow(), this._Minotaur.getCol());
        this._fStart = new Position(this._Rat1.getRow(), this._Rat1.getCol());
        this._sword = new Position(this._Sword.getRow(), this._Sword.getCol());
    }
}
