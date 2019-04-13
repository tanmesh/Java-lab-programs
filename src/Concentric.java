import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Dimension;
/*  <applet code="con.java" width=200 height=200></applet> */

public class Concentric extends Applet {
    @Override
    public void paint(Graphics g) {
        int si=10;
        Dimension d=this.getSize();

        while(si<=d.width&si<=d.height) {
            g.drawOval(d.width/2-si/2,d.height/2-si/2,si,si);
            si+=10;
        }
    }
}
