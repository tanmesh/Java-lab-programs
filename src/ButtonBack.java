import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="ButtonBack" width="200" height="200"> </applet>*/

public class ButtonBack extends Applet implements ActionListener {
    private Button b1, b2, b3;
    private String s1;

    @Override
    public void init() {
        setBackground(Color.WHITE);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        s1 = e.getActionCommand();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        Dimension d=this.getSize();
        int si=200;
        g.drawOval(d.width/2-si/2,d.height/2-si/2,si,si);
        switch (s1) {
            case "RED":
                g.setColor(Color.RED);
                g.fillOval(d.width/2-si/2,d.height/2-si/2,si,si);
                break;
            case "BLUE":
                g.setColor(Color.BLUE);
                g.fillOval(d.width/2-si/2,d.height/2-si/2,si,si);
                break;
            case "GREEN":
                g.setColor(Color.GREEN);
                g.fillOval(d.width/2-si/2,d.height/2-si/2,si,si);
                break;
        }
    }
}
