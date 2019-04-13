import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

/*<applet code="AppletLifeCycle.class" width="350" height="150"> </applet>*/
public class Demo extends Applet {
    @Override
    public void init() {
        setBackground(Color.CYAN);
        System.out.println("init() called");
    }

    @Override
    public void start() {
        System.out.println("Start() called");
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("Paint(() called");
    }

    @Override
    public void stop() {
        System.out.println("Stop() Called");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy)() Called");
    }
}