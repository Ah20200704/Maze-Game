
package LAB1.view;

import LAB1.mod.Maze5;
import LAB1.mod.Maze4;
import LAB1.mod.Maze3;
import LAB1.mod.Maze2;
import java.awt.Component;
import LAB1.mod.Sword;
import LAB1.mod.Rat1;
import LAB1.mod.Maze;
import LAB1.mod.Minotaur;
import LAB1.mod.Player;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class StringMap extends JFrame
{//Instance Variables 
    private static final long serialVersionUID = 1L;
    private JPanel _map;
    private JLabel[][] Maze;
    private JLabel[][] Maze2;
    private JLabel[][] Maze3;
    private JLabel[][] Maze4;
    private JLabel[][] Maze5;
    private Icon wall;
    private Icon rat1;
    private Icon player;
    private Icon floor;
    private Icon minotaur;
    private Icon exit;
    private Icon swordc;
    //Getters
    public JPanel getMap() {
        return this._map;
    }
    //Stringmap constructor
    public StringMap() {
        this._map = new JPanel(new GridLayout(10, 10));
        this.Maze = new JLabel[13][13];
        this.Maze2 = new JLabel[13][13];
        this.Maze3 = new JLabel[13][13];
        this.Maze4 = new JLabel[13][13];
        this.Maze5 = new JLabel[13][13];
        this.wall = new ImageIcon(this.getClass().getResource("trippy.jpg"));//floor
        this.rat1 = new ImageIcon(this.getClass().getResource("rat (1) (1).jpg"));//rat
        this.player = new ImageIcon(this.getClass().getResource("onion boy (1).jpg"));//player
        this.floor = new ImageIcon(this.getClass().getResource("fiyah (1).jpg"));//walls
        this.minotaur = new ImageIcon(this.getClass().getResource("mino (1).jpg"));//mino
        this.exit = new ImageIcon(this.getClass().getResource("EXIT (1).jpg"));//exit
        this.swordc = new ImageIcon(this.getClass().getResource("no (1).jpg"));//swardedede
    }
    //Updates map with all entity movement
    public JPanel updateMap(final Player p, final Minotaur m, final Maze z, final Rat1 F, final Sword K) {
        this._map = new JPanel(new GridLayout(13, 13));
        for (int r = 0; r < z.getMaze().length; ++r) {
            for (int c = 0; c < z.getMaze()[r].length; ++c) {
                if (z.getMaze()[r][c]) {
                    this.Maze[r][c] = new JLabel(this.floor);
                    this._map.add(this.Maze[r][c]);
                }
                else if (r == p.getPosition().getRow() && c == p.getPosition().getCol()) {
                    this.Maze[r][c] = new JLabel(this.player);
                    this._map.add(this.Maze[r][c]);
                }
                else if (r == m.getPosition().getRow() && c == m.getPosition().getCol()) {
                    this.Maze[r][c] = new JLabel(this.minotaur);
                    this._map.add(this.Maze[r][c]);
                }
                else if (r == F.getPosition().getRow() && c == F.getPosition().getCol()) {
                    this.Maze[r][c] = new JLabel(this.rat1);
                    this._map.add(this.Maze[r][c]);
                }
                else if (r == K.getPosition().getRow() && c == K.getPosition().getCol()) {
                    this.Maze[r][c] = new JLabel(this.swordc);
                    this._map.add(this.Maze[r][c]);
                }
                else if (r == z.getEnd().getRow() && c == z.getEnd().getCol()) {
                    this.Maze[r][c] = new JLabel(this.exit);
                    this._map.add(this.Maze[r][c]);
                }
                else {
                    this.Maze[r][c] = new JLabel(this.wall);
                    this._map.add(this.Maze[r][c]);
                }
            }
        }
        return this._map;
    }
  //Updates map with all entity movement
    public JPanel updateMap2(final Player p, final Minotaur m, final Maze2 _z2, final Rat1 F, final Sword K) {
        this._map = new JPanel(new GridLayout(13, 13));
        for (int r = 0; r < _z2.getMaze().length; ++r) {
            for (int c = 0; c < _z2.getMaze()[r].length; ++c) {
                if (_z2.getMaze()[r][c]) {
                    this.Maze2[r][c] = new JLabel(this.floor);
                    this._map.add(this.Maze2[r][c]);
                }
                else if (r == p.getPosition().getRow() && c == p.getPosition().getCol()) {
                    this.Maze2[r][c] = new JLabel(this.player);
                    this._map.add(this.Maze2[r][c]);
                }
                else if (r == m.getPosition().getRow() && c == m.getPosition().getCol()) {
                    this.Maze2[r][c] = new JLabel(this.minotaur);
                    this._map.add(this.Maze2[r][c]);
                }
                else if (r == F.getPosition().getRow() && c == F.getPosition().getCol()) {
                    this.Maze2[r][c] = new JLabel(this.rat1);
                    this._map.add(this.Maze2[r][c]);
                }
                else if (r == K.getPosition().getRow() && c == K.getPosition().getCol()) {
                    this.Maze2[r][c] = new JLabel(this.swordc);
                    this._map.add(this.Maze2[r][c]);
                }
                else if (r == _z2.getEnd().getRow() && c == _z2.getEnd().getCol()) {
                    this.Maze2[r][c] = new JLabel(this.exit);
                    this._map.add(this.Maze2[r][c]);
                }
                else {
                    this.Maze2[r][c] = new JLabel(this.wall);
                    this._map.add(this.Maze2[r][c]);
                }
            }
        }
        return this._map;
    }
  //Updates map with all entity movement
    public JPanel updateMap3(final Player p, final Minotaur m, final Maze3 z3, final Rat1 F, final Sword K) {
        this._map = new JPanel(new GridLayout(13, 13));
        for (int r = 0; r < z3.getMaze().length; ++r) {
            for (int c = 0; c < z3.getMaze()[r].length; ++c) {
                if (z3.getMaze()[r][c]) {
                    this.Maze3[r][c] = new JLabel(this.floor);
                    this._map.add(this.Maze3[r][c]);
                }
                else if (r == p.getPosition().getRow() && c == p.getPosition().getCol()) {
                    this.Maze3[r][c] = new JLabel(this.player);
                    this._map.add(this.Maze3[r][c]);
                }
                else if (r == m.getPosition().getRow() && c == m.getPosition().getCol()) {
                    this.Maze3[r][c] = new JLabel(this.minotaur);
                    this._map.add(this.Maze3[r][c]);
                }
                else if (r == F.getPosition().getRow() && c == F.getPosition().getCol()) {
                    this.Maze3[r][c] = new JLabel(this.rat1);
                    this._map.add(this.Maze3[r][c]);
                }
                else if (r == K.getPosition().getRow() && c == K.getPosition().getCol()) {
                    this.Maze3[r][c] = new JLabel(this.swordc);
                    this._map.add(this.Maze3[r][c]);
                }
                else if (r == z3.getEnd().getRow() && c == z3.getEnd().getCol()) {
                    this.Maze3[r][c] = new JLabel(this.exit);
                    this._map.add(this.Maze3[r][c]);
                }
                else {
                    this.Maze3[r][c] = new JLabel(this.wall);
                    this._map.add(this.Maze3[r][c]);
                }
            }
        }
        return this._map;
    }
  //Updates map with all entity movement
    public JPanel updateMap4(final Player p, final Minotaur m, final Maze4 z4, final Rat1 F, final Sword K) {
        this._map = new JPanel(new GridLayout(13, 13));
        for (int r = 0; r < z4.getMaze().length; ++r) {
            for (int c = 0; c < z4.getMaze()[r].length; ++c) {
                if (z4.getMaze()[r][c]) {
                    this.Maze4[r][c] = new JLabel(this.floor);
                    this._map.add(this.Maze4[r][c]);
                }
                else if (r == p.getPosition().getRow() && c == p.getPosition().getCol()) {
                    this.Maze4[r][c] = new JLabel(this.player);
                    this._map.add(this.Maze4[r][c]);
                }
                else if (r == m.getPosition().getRow() && c == m.getPosition().getCol()) {
                    this.Maze4[r][c] = new JLabel(this.minotaur);
                    this._map.add(this.Maze4[r][c]);
                }
                else if (r == F.getPosition().getRow() && c == F.getPosition().getCol()) {
                    this.Maze[r][c] = new JLabel(this.rat1);
                    this._map.add(this.Maze[r][c]);
                }
                else if (r == K.getPosition().getRow() && c == K.getPosition().getCol()) {
                    this.Maze4[r][c] = new JLabel(this.swordc);
                    this._map.add(this.Maze4[r][c]);
                }
                else if (r == z4.getEnd().getRow() && c == z4.getEnd().getCol()) {
                    this.Maze4[r][c] = new JLabel(this.exit);
                    this._map.add(this.Maze4[r][c]);
                }
                else {
                    this.Maze4[r][c] = new JLabel(this.wall);
                    this._map.add(this.Maze4[r][c]);
                }
            }
        }
        return this._map;
    }
  //Updates map with all entity movement
    public JPanel updateMap5(final Player p, final Minotaur m, final Maze5 z5, final Rat1 F, final Sword K) {
        this._map = new JPanel(new GridLayout(13, 13));
        for (int r = 0; r < z5.getMaze().length; ++r) {
            for (int c = 0; c < z5.getMaze()[r].length; ++c) {
                if (z5.getMaze()[r][c]) {
                    this.Maze5[r][c] = new JLabel(this.floor);
                    this._map.add(this.Maze5[r][c]);
                }
                else if (r == p.getPosition().getRow() && c == p.getPosition().getCol()) {
                    this.Maze5[r][c] = new JLabel(this.player);
                    this._map.add(this.Maze5[r][c]);
                }
                else if (r == m.getPosition().getRow() && c == m.getPosition().getCol()) {
                    this.Maze5[r][c] = new JLabel(this.minotaur);
                    this._map.add(this.Maze5[r][c]);
                }
                else if (r == F.getPosition().getRow() && c == F.getPosition().getCol()) {
                    this.Maze[r][c] = new JLabel(this.rat1);
                    this._map.add(this.Maze[r][c]);
                }
                else if (r == K.getPosition().getRow() && c == K.getPosition().getCol()) {
                    this.Maze5[r][c] = new JLabel(this.swordc);
                    this._map.add(this.Maze5[r][c]);
                }
                else if (r == z5.getEnd().getRow() && c == z5.getEnd().getCol()) {
                    this.Maze5[r][c] = new JLabel(this.exit);
                    this._map.add(this.Maze5[r][c]);
                }
                else {
                    this.Maze5[r][c] = new JLabel(this.wall);
                    this._map.add(this.Maze5[r][c]);
                }
            }
        }
        return this._map;
    }
}
