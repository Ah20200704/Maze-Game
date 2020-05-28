
// 


package LAB1.cont;

import LAB1.mod.Direction;
import javax.swing.Icon;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import LAB1.view.Window;
import LAB1.view.StringMap;
import LAB1.mod.Maze;
import LAB1.mod.Maze5;
import LAB1.mod.Maze4;
import LAB1.mod.Maze3;
import LAB1.mod.Maze2;
import LAB1.mod.Sword;
import LAB1.mod.Rat1;
import LAB1.mod.Minotaur;
import LAB1.mod.Player;

public class Overseer
{	//Instance Variables
    private int cnt1;
    private int cnt2;
    private int cnt3;
    private int cnt4;
    private int cnt5;
    private Player _p;
    private Minotaur _m;
    private Rat1 _F;
    Object[] options;
    private Sword _K;
    private Maze2 _z2;
    private Maze3 _z3;
    private Maze4 _z4;
    private Maze5 _z5;
    private Maze _z;
    private StringMap _s;
    private Window _w;
    ArrayList<JPanel> replay;
    private static final String[] BUTTONS;
    private static final String[] Replay;
    private static final String[] Loop;
    Object[] String;
    int rand;
    //Creates String arrays that will be used for buttons
    static {
        BUTTONS = new String[] { "UP", "DOWN", "RIGHT", "LEFT", "EXIT", "HELP" };
        Replay = new String[] { "Yes", " No" };
        Loop = new String[] { "Replay", "Exit" };
    }
    //Runs message telling player about game, creates map, player, enemies and sword, gets player movement using getPlayerMovement method
    public Overseer() {
        this.cnt1 = 0;
        this.cnt2 = 1;
        this.cnt3 = 1;
        this.cnt4 = 1;
        this.cnt5 = 1;
        this.options = new Object[] { "Onionscape 2", "Onionscape 3", "Onionscape 4", "Onionscape 5" };
        this.replay = new ArrayList<JPanel>();
        this.String = new Object[] { "1", "2", "3", "4", "5" };
        this.rand = (int)Math.random() * 4;
        (this._w = new Window()).msg("Begin the Legend of Onion Boy?	");
        this._w.msg("Welcome young onion.\n My fairest welcome to the land of Onionautica \n This land is not in peril or any real trouble whatsoever.\n Except the great fires and everything");
        this._w.msg("Well whatever\n The only real reason you have been summoned here is to give a highschool student a good grade on a mediocre assignment\n Go now Onion Boy!\nYour great adventure begins!");
        this._z = new Maze();
        this._s = new StringMap();
        this._p = new Player(this._z);
        this._m = new Minotaur(this._z);
        this._F = new Rat1(this._z);
        this._K = new Sword(this._z);
        this.getPlayerMovement();
    }
    //returns player movement if player is alive, adds movements to replay, creates new enemies,sword, and map
    
    public void getPlayerMovement() {
        while (true) {
            if (!this._p.isAlive()) {
                final int z = this._w.option(Overseer.Replay, "Wanna watch yourself die?");
                if (z == 0) {
                    for (int i = 0; i < this.replay.size(); ++i) {
                        final int y = this._w.option(Overseer.Loop, this.replay.get(i));
                        if (y == 0) {
                            if (i <= this.replay.size()) {
                                ++i;
                            }
                        }
                        else {
                            System.exit(0);
                        }
                    }
                }
                else {
                    System.exit(0);
                }
                this._z = new Maze();
                this._s = new StringMap();
                this._p = new Player(this._z);
                this._m = new Minotaur(this._z);
                this._F = new Rat1(this._z);
                this._K = new Sword(this._z);
            }
            else {
                final int x = this._w.option(Overseer.BUTTONS, this._s.updateMap(this._p, this._m, this._z, this._F, this._K));
                this.replay.add(this._s.getMap());
                this.swordRemove();
                this.move(x);
                this.gamecheck1();
                this.replay.add(this._s.getMap());
            }
        }
    }
    //returns player movement if player is alive, adds movements to replay, creates new enemies,sword, and map
    public void getPlayerMovement2() {
        while (true) {
            if (!this._p.isAlive()) {
                final int z = this._w.option(Overseer.Replay, "Wanna watch yourself die?");
                if (z == 0) {
                    for (int i = 0; i < this.replay.size(); ++i) {
                        final int y = this._w.option(Overseer.Loop, this.replay.get(i));
                        if (y == 0) {
                            if (i <= this.replay.size()) {
                                ++i;
                            }
                        }
                        else {
                            System.exit(0);
                        }
                    }
                }
                else {
                    System.exit(0);
                }
                this._z2 = new Maze2();
                this._s = new StringMap();
                this._p = new Player(this._z2);
                this._m = new Minotaur(this._z2);
                this._F = new Rat1(this._z2);
                this._K = new Sword(this._z2);
            }
            else {
                final int x = this._w.option(Overseer.BUTTONS, this._s.updateMap2(this._p, this._m, this._z2, this._F, this._K));
                this.replay.add(this._s.getMap());
                this.swordRemove();
                this.move2(x);
                this.gamecheck1m2();
                this.replay.add(this._s.getMap());
            }
        }
    }
    //returns player movement if player is alive, adds movements to replay, creates new enemies,sword, and map
    public void getPlayerMovement3() {
        while (true) {
            if (!this._p.isAlive()) {
                final int z = this._w.option(Overseer.Replay, "Wanna watch yourself die?");
                if (z == 0) {
                    for (int i = 0; i < this.replay.size(); ++i) {
                        final int y = this._w.option(Overseer.Loop, this.replay.get(i));
                        if (y == 0) {
                            if (i <= this.replay.size()) {
                                ++i;
                            }
                        }
                        else {
                            System.exit(0);
                        }
                    }
                }
                else {
                    System.exit(0);
                }
                this._z3 = new Maze3();
                this._s = new StringMap();
                this._p = new Player(this._z3);
                this._m = new Minotaur(this._z3);
                this._F = new Rat1(this._z3);
                this._K = new Sword(this._z3);
            }
            else {
                final int x = this._w.option(Overseer.BUTTONS, this._s.updateMap3(this._p, this._m, this._z3, this._F, this._K));
                this.replay.add(this._s.getMap());
                this.swordRemove();
                this.move3(x);
                this.gamecheck1m3();
                this.replay.add(this._s.getMap());
            }
        }
    }
    //returns player movement if player is alive, adds movements to replay, creates new enemies,sword, and map
    public void getPlayerMovement4() {
        while (true) {
            if (!this._p.isAlive()) {
                final int z = this._w.option(Overseer.Replay, "Wanna watch yourself die?");
                if (z == 0) {
                    for (int i = 0; i < this.replay.size(); ++i) {
                        final int y = this._w.option(Overseer.Loop, this.replay.get(i));
                        if (y == 0) {
                            if (i <= this.replay.size()) {
                                ++i;
                            }
                        }
                        else {
                            System.exit(0);
                        }
                    }
                }
                else {
                    System.exit(0);
                }
                this._z4 = new Maze4();
                this._s = new StringMap();
                this._p = new Player(this._z4);
                this._m = new Minotaur(this._z4);
                this._F = new Rat1(this._z4);
                this._K = new Sword(this._z4);
            }
            else {
                final int x = this._w.option(Overseer.BUTTONS, this._s.updateMap4(this._p, this._m, this._z4, this._F, this._K));
                this.replay.add(this._s.getMap());
                this.swordRemove();
                this.move4(x);
                this.gamecheck1m4();
                this.replay.add(this._s.getMap());
            }
        }
    }
    //returns player movement if player is alive, adds movements to replay, creates new enemies,sword, and map
    public void getPlayerMovement5() {
        while (true) {
            if (!this._p.isAlive()) {
                final int z = this._w.option(Overseer.Replay, "Wanna watch yourself die?");
                if (z == 0) {
                    for (int i = 0; i < this.replay.size(); ++i) {
                        final int y = this._w.option(Overseer.Loop, this.replay.get(i));
                        if (y == 0) {
                            if (i <= this.replay.size()) {
                                ++i;
                            }
                        }
                        else {
                            System.exit(0);
                        }
                    }
                }
                else {
                    System.exit(0);
                }
                this._z5 = new Maze5();
                this._s = new StringMap();
                this._p = new Player(this._z5);
                this._m = new Minotaur(this._z5);
                this._F = new Rat1(this._z5);
                this._K = new Sword(this._z5);
            }
            else {
                final int x = this._w.option(Overseer.BUTTONS, this._s.updateMap5(this._p, this._m, this._z5, this._F, this._K));
                this.replay.add(this._s.getMap());
                this.swordRemove();
                this.move5(x);
                this.gamecheck1m5();
                this.replay.add(this._s.getMap());
            }
        }
    }
    //takes sword away from player
    public boolean swordRemove() {
        return this._p.hasSword(this._K);
    }
    //sets up buttons and movement for this stage
    public void move(final int x) {
        if (x == 5) {
            this._w.msg("The rules of the land - \n1 The goose of doom can slay the wretched beasts  \n2 Let not the flames spook your warrior heart \nNUMBER 3 - BE SMART OF WHERE THE MINOTAUR IS GOING TO HEAD. \nNUMBER 4 - THE SWORD CAN KILL ANY OPPONET, BUT WILL DISAPPEAR. \nNUMBER 5 - THE RATS PATROL AN AREA AND THE MINOTAUR MOVES CLOSER TO YOU AS YOU MOVE. \nNUMBER 6 - TO BEAT THE GAME REACH THE END GOAL MARKED AS A EXIT. \nNUMBER 7 - THE PICTURES OF THE THREE RATS, ON THE MAP ARE THE RATS AND THE IMAGE OF A MINOTAUR IS THE MINOTAUR.GOOD LUCK PLAYER.\n");
            return;
        }
        if (!this._p.move(this.getPlayerDirection(x), this._z) && x != 5) {
            this._w.msg("The flames block your onion-y schemes.");
        }
        else {
            this.gamecheck2();
            if (this._F.isAlive()) {
                this._F.move(this._z);
            }
            if (this._m.isAlive()) {
                this._m.move(this._z, this._p);
            }
        }
        if (this._p.getPosition().getRow() == 4 && this._p.getPosition().getCol() == 1) {
            if (JOptionPane.showInputDialog("Onion?(Y/N").equalsIgnoreCase("Y")) {
                JOptionPane.showMessageDialog(null, "Indeed");
            }
            else {
                JOptionPane.showMessageDialog(null, "Only death comes to onions who spout lies");
                this._p.killPlayer();
            }
        }
        if (this._p.getPosition().getRow() == 3 && this._p.getPosition().getCol() == 1) {
            if (JOptionPane.showInputDialog("If a goose is on the loose is a moose obtuse?(Y/N)").equalsIgnoreCase("Y")) {
                JOptionPane.showMessageDialog(null, "mhm");
            }
            else {
                JOptionPane.showMessageDialog(null, "Only death comes to onions who spout lies");
                this._p.killPlayer();
            }
        }
        if (this._p.getPosition().getRow() == 4 && this._p.getPosition().getCol() == 0) {
            final int a = JOptionPane.showOptionDialog(null, "Which Onionscape would you like to travel to?", "Maze 2.0", 1, -1, null, this.options, null);
            if (a == 0) {
                if (this.cnt2 == 1) {
                    --this.cnt2;
                    this._z2 = new Maze2();
                    this._s = new StringMap();
                    this._p = new Player(this._z2);
                    this._m = new Minotaur(this._z2);
                    this._F = new Rat1(this._z2);
                    this._K = new Sword(this._z2);
                    this.getPlayerMovement2();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 1) {
                if (this.cnt3 == 1) {
                    --this.cnt3;
                    this._z3 = new Maze3();
                    this._s = new StringMap();
                    this._p = new Player(this._z3);
                    this._m = new Minotaur(this._z3);
                    this._F = new Rat1(this._z3);
                    this._K = new Sword(this._z3);
                    this.getPlayerMovement3();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 2) {
                if (this.cnt4 == 1) {
                    --this.cnt4;
                    this._z4 = new Maze4();
                    this._s = new StringMap();
                    this._p = new Player(this._z4);
                    this._m = new Minotaur(this._z4);
                    this._F = new Rat1(this._z4);
                    this._K = new Sword(this._z4);
                    this.getPlayerMovement4();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 3) {
                if (this.cnt5 == 1) {
                    --this.cnt5;
                    this._z5 = new Maze5();
                    this._s = new StringMap();
                    this._p = new Player(this._z5);
                    this._m = new Minotaur(this._z5);
                    this._F = new Rat1(this._z5);
                    this._K = new Sword(this._z5);
                    this.getPlayerMovement5();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
        }
    }
  //sets up buttons and movement for this stage
    public void move2(final int x) {
        if (x == 5) {
            this._w.msg("The rules of the land - \n1 The goose of doom can slay the wretched beasts  \n2 Let not the flames spook your warrior heart \nNUMBER 3 - BE SMART OF WHERE THE MINOTAUR IS GOING TO HEAD. \nNUMBER 4 - THE SWORD CAN KILL ANY OPPONET, BUT WILL DISAPPEAR. \nNUMBER 5 - THE RATS PATROL AN AREA AND THE MINOTAUR MOVES CLOSER TO YOU AS YOU MOVE. \nNUMBER 6 - TO BEAT THE GAME REACH THE END GOAL MARKED AS A EXIT. \nNUMBER 7 - THE PICTURES OF THE THREE RATS, ON THE MAP ARE THE RATS AND THE IMAGE OF A MINOTAUR IS THE MINOTAUR.GOOD LUCK PLAYER.\n");
            return;
        }
        if (!this._p.move(this.getPlayerDirection(x), this._z2) && x != 5) {
            this._w.msg("The flames block your onion-y schemes.");
        }
        else {
            this.gamecheck2();
            if (this._F.isAlive()) {
                this._F.move(this._z2);
            }
            if (this._m.isAlive()) {
                this._m.move(this._z2, this._p);
            }
        }
        if (this._p.getPosition().getRow() == 2 && this._p.getPosition().getCol() == 10) {
            if (JOptionPane.showInputDialog("Best vegetable?").equalsIgnoreCase("onion")) {
                JOptionPane.showMessageDialog(null, "Correct");
            }
            else {
                JOptionPane.showMessageDialog(null, "Only death comes to onions who spout lies");
                this._p.killPlayer();
            }
        }
        if (this._p.getPosition().getRow() == 3 && this._p.getPosition().getCol() == 10) {
            if (JOptionPane.showInputDialog("Will you go out with me?(Yes/no)").equalsIgnoreCase("no")) {
                JOptionPane.showMessageDialog(null, "Good Choice");
            }
            else {
                JOptionPane.showMessageDialog(null, "Only death comes to onions who spout lies");
                this._p.killPlayer();
            }
        }
        if (this._p.getPosition().getRow() == 1 && this._p.getPosition().getCol() == 10) {
            final int a = JOptionPane.showOptionDialog(null, "Which Onionscape would you like to travel to?", "Maze 2.0", 1, -1, null, this.options, null);
            if (a == 0) {
                if (this.cnt2 == 1) {
                    --this.cnt2;
                    this._z2 = new Maze2();
                    this._s = new StringMap();
                    this._p = new Player(this._z2);
                    this._m = new Minotaur(this._z2);
                    this._F = new Rat1(this._z2);
                    this._K = new Sword(this._z2);
                    this.getPlayerMovement2();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 1) {
                if (this.cnt3 == 1) {
                    --this.cnt3;
                    this._z3 = new Maze3();
                    this._s = new StringMap();
                    this._p = new Player(this._z3);
                    this._m = new Minotaur(this._z3);
                    this._F = new Rat1(this._z3);
                    this._K = new Sword(this._z3);
                    this.getPlayerMovement3();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 2) {
                if (this.cnt4 == 1) {
                    --this.cnt4;
                    this._z4 = new Maze4();
                    this._s = new StringMap();
                    this._p = new Player(this._z4);
                    this._m = new Minotaur(this._z4);
                    this._F = new Rat1(this._z4);
                    this._K = new Sword(this._z4);
                    this.getPlayerMovement4();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 3) {
                if (this.cnt5 == 1) {
                    --this.cnt5;
                    this._z5 = new Maze5();
                    this._s = new StringMap();
                    this._p = new Player(this._z5);
                    this._m = new Minotaur(this._z5);
                    this._F = new Rat1(this._z5);
                    this._K = new Sword(this._z5);
                    this.getPlayerMovement5();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
        }
    }
  //sets up buttons and movement for this stage
    public void move3(final int x) {
        if (x == 5) {
            this._w.msg("The rules of the land - \n1 The goose of doom can slay the wretched beasts  \n2 Let not the flames spook your warrior heart \nNUMBER 3 - BE SMART OF WHERE THE MINOTAUR IS GOING TO HEAD. \nNUMBER 4 - THE SWORD CAN KILL ANY OPPONET, BUT WILL DISAPPEAR. \nNUMBER 5 - THE RATS PATROL AN AREA AND THE MINOTAUR MOVES CLOSER TO YOU AS YOU MOVE. \nNUMBER 6 - TO BEAT THE GAME REACH THE END GOAL MARKED AS A EXIT. \nNUMBER 7 - THE PICTURES OF THE THREE RATS, ON THE MAP ARE THE RATS AND THE IMAGE OF A MINOTAUR IS THE MINOTAUR.GOOD LUCK PLAYER.\n");
            return;
        }
        if (!this._p.move(this.getPlayerDirection(x), this._z3) && x != 5) {
            this._w.msg("The flames block your onion-y schemes.");
        }
        else {
            this.gamecheck2();
            if (this._F.isAlive()) {
                this._F.move(this._z3);
            }
            if (this._m.isAlive()) {
                this._m.move(this._z3, this._p);
            }
        }
        if (this._p.getPosition().getRow() == 4 && this._p.getPosition().getCol() == 1) {
            if (JOptionPane.showInputDialog("Chuck?(Y/N)").equalsIgnoreCase("y")) {
                JOptionPane.showMessageDialog(null, "My love!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Only death comes to onions who spout lies");
                this._p.killPlayer();
            }
        }
        if (this._p.getPosition().getRow() == 3 && this._p.getPosition().getCol() == 1) {
            if (JOptionPane.showInputDialog("Would you pass me that Croissant(Kwahso)").equalsIgnoreCase("Yes")) {
                JOptionPane.showMessageDialog(null, "Thanks Homie <3");
            }
            else {
                JOptionPane.showMessageDialog(null, "u suck");
                this._p.killPlayer();
            }
        }
        if (this._p.getPosition().getRow() == 4 && this._p.getPosition().getCol() == 0) {
            final int a = JOptionPane.showOptionDialog(null, "Which Onionscape would you like to travel to?", "Maze 2.0", 1, -1, null, this.options, null);
            if (a == 0) {
                if (this.cnt2 == 1) {
                    --this.cnt2;
                    this._z2 = new Maze2();
                    this._s = new StringMap();
                    this._p = new Player(this._z2);
                    this._m = new Minotaur(this._z2);
                    this._F = new Rat1(this._z2);
                    this._K = new Sword(this._z2);
                    this.getPlayerMovement2();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 1) {
                if (this.cnt3 == 1) {
                    --this.cnt3;
                    this._z3 = new Maze3();
                    this._s = new StringMap();
                    this._p = new Player(this._z3);
                    this._m = new Minotaur(this._z3);
                    this._F = new Rat1(this._z3);
                    this._K = new Sword(this._z3);
                    this.getPlayerMovement3();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 2) {
                if (this.cnt4 == 1) {
                    --this.cnt4;
                    this._z4 = new Maze4();
                    this._s = new StringMap();
                    this._p = new Player(this._z4);
                    this._m = new Minotaur(this._z4);
                    this._F = new Rat1(this._z4);
                    this._K = new Sword(this._z4);
                    this.getPlayerMovement4();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 3) {
                if (this.cnt5 == 1) {
                    --this.cnt5;
                    this._z5 = new Maze5();
                    this._s = new StringMap();
                    this._p = new Player(this._z5);
                    this._m = new Minotaur(this._z5);
                    this._F = new Rat1(this._z5);
                    this._K = new Sword(this._z5);
                    this.getPlayerMovement5();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
        }
    }
  //sets up buttons and movement for this stage
    public void move4(final int x) {
        if (x == 5) {
            this._w.msg("The rules of the land - \n1 The goose of doom can slay the wretched beasts  \n2 Let not the flames spook your warrior heart \nNUMBER 3 - BE SMART OF WHERE THE MINOTAUR IS GOING TO HEAD. \nNUMBER 4 - THE SWORD CAN KILL ANY OPPONET, BUT WILL DISAPPEAR. \nNUMBER 5 - THE RATS PATROL AN AREA AND THE MINOTAUR MOVES CLOSER TO YOU AS YOU MOVE. \nNUMBER 6 - TO BEAT THE GAME REACH THE END GOAL MARKED AS A EXIT. \nNUMBER 7 - THE PICTURES OF THE THREE RATS, ON THE MAP ARE THE RATS AND THE IMAGE OF A MINOTAUR IS THE MINOTAUR.GOOD LUCK PLAYER.\n");
            return;
        }
        if (!this._p.move(this.getPlayerDirection(x), this._z4) && x != 5) {
            this._w.msg("The flames block your onion-y schemes.");
        }
        else {
            this.gamecheck2();
            if (this._F.isAlive()) {
                this._F.move(this._z4);
            }
            if (this._m.isAlive()) {
                this._m.move(this._z4, this._p);
            }
        }
        if (this._p.getPosition().getRow() == 4 && this._p.getPosition().getCol() == 1) {
            if (JOptionPane.showInputDialog("Hi").equalsIgnoreCase("hi")) {
                JOptionPane.showMessageDialog(null, "Hi!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Only death comes to onions who spout lies");
                this._p.killPlayer();
            }
        }
        if (this._p.getPosition().getRow() == 3 && this._p.getPosition().getCol() == 1) {
            if (JOptionPane.showInputDialog("Fight me(Yes/No))").equalsIgnoreCase("no")) {
                JOptionPane.showMessageDialog(null, "ok...");
            }
            else {
                JOptionPane.showMessageDialog(null, "Only death comes to onions who spout lies");
                this._p.killPlayer();
            }
        }
        if (this._p.getPosition().getRow() == 4 && this._p.getPosition().getCol() == 0) {
            final int a = JOptionPane.showOptionDialog(null, "Which Onionscape would you like to travel to?", "Maze 2.0", 1, -1, null, this.options, null);
            if (a == 0) {
                if (this.cnt2 == 1) {
                    --this.cnt2;
                    this._z2 = new Maze2();
                    this._s = new StringMap();
                    this._p = new Player(this._z2);
                    this._m = new Minotaur(this._z2);
                    this._F = new Rat1(this._z2);
                    this._K = new Sword(this._z2);
                    this.getPlayerMovement2();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 1) {
                if (this.cnt3 == 1) {
                    --this.cnt3;
                    this._z3 = new Maze3();
                    this._s = new StringMap();
                    this._p = new Player(this._z3);
                    this._m = new Minotaur(this._z3);
                    this._F = new Rat1(this._z3);
                    this._K = new Sword(this._z3);
                    this.getPlayerMovement3();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 2) {
                if (this.cnt4 == 1) {
                    --this.cnt4;
                    this._z4 = new Maze4();
                    this._s = new StringMap();
                    this._p = new Player(this._z4);
                    this._m = new Minotaur(this._z4);
                    this._F = new Rat1(this._z4);
                    this._K = new Sword(this._z4);
                    this.getPlayerMovement4();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 3) {
                if (this.cnt5 == 1) {
                    --this.cnt5;
                    this._z5 = new Maze5();
                    this._s = new StringMap();
                    this._p = new Player(this._z5);
                    this._m = new Minotaur(this._z5);
                    this._F = new Rat1(this._z5);
                    this._K = new Sword(this._z5);
                    this.getPlayerMovement5();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
        }
    }
  //sets up buttons and movement for this stage
    public void move5(final int x) {
        if (x == 5) {
            this._w.msg("The rules of the land - \n1 The goose of doom can slay the wretched beasts  \n2 Let not the flames spook your warrior heart \n3 To advance, simply reach the exit \n4 Onion ");
            return;
        }
        if (!this._p.move(this.getPlayerDirection(x), this._z5) && x != 5) {
            this._w.msg("The flames block your onion-y schemes.");
        }
        else {
            this.gamecheck2();
            if (this._F.isAlive()) {
                this._F.move(this._z5);
            }
            if (this._m.isAlive()) {
                this._m.move(this._z5, this._p);
            }
        }
        if (this._p.getPosition().getRow() == 4 && this._p.getPosition().getCol() == 1) {
            if (JOptionPane.showInputDialog("Who are you (You/Me)").equalsIgnoreCase("you")) {
                JOptionPane.showMessageDialog(null, "Knew it");
            }
            else {
                JOptionPane.showMessageDialog(null, "Only death comes to onions who spout lies");
                this._p.killPlayer();
            }
        }
        if (this._p.getPosition().getRow() == 3 && this._p.getPosition().getCol() == 1) {
            if (JOptionPane.showInputDialog("Want some spagetti?(Y/N)").equalsIgnoreCase("N")) {
                JOptionPane.showMessageDialog(null, "Yup all mine");
            }
            else {
                JOptionPane.showMessageDialog(null, "NO MINE");
                this._p.killPlayer();
            }
        }
        if (this._p.getPosition().getRow() == 4 && this._p.getPosition().getCol() == 0) {
            final int a = JOptionPane.showOptionDialog(null, "Which Onionscape would you like to travel to?", "Maze 2.0", 1, -1, null, this.options, null);
            if (a == 0) {
                if (this.cnt2 == 1) {
                    --this.cnt2;
                    this._z2 = new Maze2();
                    this._s = new StringMap();
                    this._p = new Player(this._z2);
                    this._m = new Minotaur(this._z2);
                    this._F = new Rat1(this._z2);
                    this._K = new Sword(this._z2);
                    this.getPlayerMovement2();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 1) {
                if (this.cnt3 == 1) {
                    --this.cnt3;
                    this._z3 = new Maze3();
                    this._s = new StringMap();
                    this._p = new Player(this._z3);
                    this._m = new Minotaur(this._z3);
                    this._F = new Rat1(this._z3);
                    this._K = new Sword(this._z3);
                    this.getPlayerMovement3();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 2) {
                if (this.cnt4 == 1) {
                    --this.cnt4;
                    this._z4 = new Maze4();
                    this._s = new StringMap();
                    this._p = new Player(this._z4);
                    this._m = new Minotaur(this._z4);
                    this._F = new Rat1(this._z4);
                    this._K = new Sword(this._z4);
                    this.getPlayerMovement4();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
            if (a == 3) {
                if (this.cnt5 == 1) {
                    --this.cnt5;
                    this._z5 = new Maze5();
                    this._s = new StringMap();
                    this._p = new Player(this._z5);
                    this._m = new Minotaur(this._z5);
                    this._F = new Rat1(this._z5);
                    this._K = new Sword(this._z5);
                    this.getPlayerMovement5();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You cant choose this Onionscape, you have already ventured through this area");
                }
            }
        }
    }
    //checks if player has found sword, has sword, and can kill enemies, checks if player was killed by enemies, and if the player has won the game 
    public void gamecheck1() {
        if (this._p.getPosition().getRow() == this._m.getPosition().getRow() && this._p.getPosition().getCol() == this._m.getPosition().getCol()) {
            if (this._p.giveSword()) {
                this._w.msg("The goose fights the minotaur and wins.");
                this._m.killMinotaur();
                this._w.msg("The goose is vaporized in its mighty power");
                this._p.hasSword1(this._K);
            }
            else {
                this._p.killPlayer();
                this._w.msg("You have been slain.");
            }
        }
        if (this._p.getPosition().getRow() == this._F.getPosition().getRow() && this._p.getPosition().getCol() == this._F.getPosition().getCol()) {
            if (this._p.giveSword()) {
                this._w.msg("The goose has defeated the rat!");
                this._F.killRat1();
                this._w.msg("The goose flaps away. The rat of jazz is in its mouth.");
                this._p.hasSword1(this._K);
            }
            else {
                this._p.killPlayer();
                this._w.msg("You have been slain.");
            }
        }
        if (this._p.getPosition().getRow() == this._z.getEnd().getRow() && this._p.getPosition().getCol() == this._z.getEnd().getCol() && this.cnt1 == 0 && this.cnt2 == 0 && this.cnt3 == 0 && this.cnt4 == 0 && this.cnt5 == 0) {
            this._p.killPlayer();
            this._w.msg("Onion boy is the champion");
        }
        if (this._p.getPosition().getRow() == this._K.getPosition().getRow() && this._p.getPosition().getCol() == this._K.getPosition().getCol()) {
            this._w.msg("You have located the goose of doom.");
        }
    }
  //checks if player has found sword, has sword, and can kill enemies, checks if player was killed by enemies, and if the player has won the game 
    public void gamecheck1m2() {
        if (this._p.getPosition().getRow() == this._m.getPosition().getRow() && this._p.getPosition().getCol() == this._m.getPosition().getCol()) {
            if (this._p.giveSword()) {
                this._w.msg("The goose fights the minotaur and wins.");
                this._m.killMinotaur();
                this._w.msg("The goose is vaporized in its mighty power");
                this._p.hasSword1(this._K);
            }
            else {
                this._p.killPlayer();
                this._w.msg("You have been slain.");
            }
        }
        if (this._p.getPosition().getRow() == this._F.getPosition().getRow() && this._p.getPosition().getCol() == this._F.getPosition().getCol()) {
            if (this._p.giveSword()) {
                this._w.msg("The goose has defeated the rat!");
                this._F.killRat1();
                this._w.msg("The goose flaps away. The rat of jazz is in its mouth.");
                this._p.hasSword1(this._K);
            }
            else {
                this._p.killPlayer();
                this._w.msg("You have been slain.");
            }
        }
        if (this._p.getPosition().getRow() == this._z2.getEnd().getRow() && this._p.getPosition().getCol() == this._z2.getEnd().getCol() && this.cnt1 == 0 && this.cnt2 == 0 && this.cnt3 == 0 && this.cnt4 == 0 && this.cnt5 == 0) {
            this._p.killPlayer();
            this._w.msg("Onion boy is the champion");
        }
        if (this._p.getPosition().getRow() == this._K.getPosition().getRow() && this._p.getPosition().getCol() == this._K.getPosition().getCol()) {
            this._w.msg("You have located the goose of doom.");
        }
    }
  //checks if player has found sword, has sword, and can kill enemies, checks if player was killed by enemies, and if the player has won the game 
    public void gamecheck1m3() {
        if (this._p.getPosition().getRow() == this._m.getPosition().getRow() && this._p.getPosition().getCol() == this._m.getPosition().getCol()) {
            if (this._p.giveSword()) {
                this._w.msg("The goose fights the minotaur and wins.");
                this._m.killMinotaur();
                this._w.msg("The goose is vaporized in its mighty power");
                this._p.hasSword1(this._K);
            }
            else {
                this._p.killPlayer();
                this._w.msg("You have been slain.");
            }
        }
        if (this._p.getPosition().getRow() == this._F.getPosition().getRow() && this._p.getPosition().getCol() == this._F.getPosition().getCol()) {
            if (this._p.giveSword()) {
                this._w.msg("The goose has defeated the rat!");
                this._F.killRat1();
                this._w.msg("The goose flaps away. The rat of jazz is in its mouth.");
                this._p.hasSword1(this._K);
            }
            else {
                this._p.killPlayer();
                this._w.msg("You have been slain.");
            }
        }
        if (this._p.getPosition().getRow() == this._z3.getEnd().getRow() && this._p.getPosition().getCol() == this._z3.getEnd().getCol() && this.cnt1 == 0 && this.cnt2 == 0 && this.cnt3 == 0 && this.cnt4 == 0 && this.cnt5 == 0) {
            this._p.killPlayer();
            this._w.msg("Onion boy is the champion");
        }
        if (this._p.getPosition().getRow() == this._K.getPosition().getRow() && this._p.getPosition().getCol() == this._K.getPosition().getCol()) {
            this._w.msg("You have located the goose of doom.");
        }
    }
  //checks if player has found sword, has sword, and can kill enemies, checks if player was killed by enemies, and if the player has won the game 
    public void gamecheck1m4() {
        if (this._p.getPosition().getRow() == this._m.getPosition().getRow() && this._p.getPosition().getCol() == this._m.getPosition().getCol()) {
            if (this._p.giveSword()) {
                this._w.msg("The goose fights the minotaur and wins.");
                this._m.killMinotaur();
                this._w.msg("The goose is vaporized in its mighty power");
                this._p.hasSword1(this._K);
            }
            else {
                this._p.killPlayer();
                this._w.msg("You have been slain.");
            }
        }
        if (this._p.getPosition().getRow() == this._F.getPosition().getRow() && this._p.getPosition().getCol() == this._F.getPosition().getCol()) {
            if (this._p.giveSword()) {
                this._w.msg("The goose has defeated the rat!");
                this._F.killRat1();
                this._w.msg("The goose flaps away. The rat of jazz is in its mouth.");
                this._p.hasSword1(this._K);
            }
            else {
                this._p.killPlayer();
                this._w.msg("You have been slain.");
            }
        }
        if (this._p.getPosition().getRow() == this._z4.getEnd().getRow() && this._p.getPosition().getCol() == this._z4.getEnd().getCol() && this.cnt1 == 0 && this.cnt2 == 0 && this.cnt3 == 0 && this.cnt4 == 0 && this.cnt5 == 0) {
            this._p.killPlayer();
            this._w.msg("Onion boy is the champion");
        }
        if (this._p.getPosition().getRow() == this._K.getPosition().getRow() && this._p.getPosition().getCol() == this._K.getPosition().getCol()) {
            this._w.msg("You have located the goose of doom.");
        }
    }
  //checks if player has found sword, has sword, and can kill enemies, checks if player was killed by enemies, and if the player has won the game 
    public void gamecheck1m5() {
        if (this._p.getPosition().getRow() == this._m.getPosition().getRow() && this._p.getPosition().getCol() == this._m.getPosition().getCol()) {
            if (this._p.giveSword()) {
                this._w.msg("The goose fights the minotaur and wins.");
                this._m.killMinotaur();
                this._w.msg("The goose is vaporized in its mighty power");
                this._p.hasSword1(this._K);
            }
            else {
                this._p.killPlayer();
                this._w.msg("You have been slain.");
            }
        }
        if (this._p.getPosition().getRow() == this._F.getPosition().getRow() && this._p.getPosition().getCol() == this._F.getPosition().getCol()) {
            if (this._p.giveSword()) {
                this._w.msg("The goose has defeated the rat!");
                this._F.killRat1();
                this._w.msg("The goose flaps away. The rat of jazz is in its mouth.");
                this._p.hasSword1(this._K);
            }
            else {
                this._p.killPlayer();
                this._w.msg("You have been slain.");
            }
        }
        if (this._p.getPosition().getRow() == this._z5.getEnd().getRow() && this._p.getPosition().getCol() == this._z5.getEnd().getCol() && this.cnt1 == 0 && this.cnt2 == 0 && this.cnt3 == 0 && this.cnt4 == 0 && this.cnt5 == 0) {
            this._p.killPlayer();
            this._w.msg("Onion boy is the champion");
        }
        if (this._p.getPosition().getRow() == this._K.getPosition().getRow() && this._p.getPosition().getCol() == this._K.getPosition().getCol()) {
            this._w.msg("You have located the goose of doom.");
        }
    }
  //checks if player has found sword, has sword, and can kill enemies, checks if player was killed by enemies, and if the player has won the game 
    public void gamecheck2() {
        if (this._p.getPosition().getRow() == this._m.getPosition().getRow() && this._p.getPosition().getCol() == this._m.getPosition().getCol()) {
            if (this._p.giveSword()) {
                this._w.msg("The goose fights the minotaur and wins.");
                this._m.killMinotaur();
                this._w.msg("With one final breath the goose was vaporized in its own power");
                this._p.hasSword1(this._K);
            }
            else {
                this._p.killPlayer();
                this._w.msg("You have been slain.");
            }
        }
        if (this._p.getPosition().getRow() == this._F.getPosition().getRow() && this._p.getPosition().getCol() == this._F.getPosition().getCol()) {
            if (this._p.giveSword()) {
                this._w.msg("The goose has defeated the rat!");
                this._F.killRat1();
                this._w.msg("The goose flaps away. The rat of jazz is in its mouth.");
                this._p.hasSword1(this._K);
            }
            else {
                this._p.killPlayer();
                this._w.msg("You have been slain.");
            }
        }
    }
    //sets buttons at bottom of screen
    public Direction getPlayerDirection(final int x) {
        if (x == 0) {
            return Direction.Up;
        }
        if (x == 1) {
            return Direction.Down;
        }
        if (x == 2) {
            return Direction.Right;
        }
        if (x == 3) {
            return Direction.Left;
        }
        if (x == 5) {
            return Direction.Help;
        }
        System.exit(1);
        return null;
    }
}