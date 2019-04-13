import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonBackground extends Applet implements ActionListener {
    private Button b1, b2, b3;

    public void init() {
        setBackground(Color.yellow);

        b1 = new Button("RED");
        b1.addActionListener(this);
        add(b1);

        b2 = new Button("BLUE");
        b2.addActionListener(this);
        add(b2);

        b3 = new Button("GREEN");
        b3.addActionListener(this);
        add(b3);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = e.getActionCommand();
        String s2 = e.getActionCommand();
        String s3 = e.getActionCommand();

        if (s1.equals("RED")) {
            setBackground(Color.RED);
        }
        else if (s2.equals("BLUE")) {
            setBackground(Color.BLUE);
        }
        else if (s3.equals("GREEN")) {
            setBackground(Color.GREEN);
        }
    }

}
