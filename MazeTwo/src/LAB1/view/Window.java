
package LAB1.view;

import javax.swing.Icon;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Window
{//shows message in a Jpane
    public void msg(final String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    //Gives you a group of options to select from
    public int option(final String[] options, final String msg) {
        return JOptionPane.showOptionDialog(null, msg, "Click a button", -1, 1, null, options, options[0]);
    }
    //Gives you a group of options to select from
    public int option(final Object[] options, final Object msg) {
        return JOptionPane.showOptionDialog(null, msg, "Click a button", -1, 1, null, options, options[1]);
    }
}
