import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal extends Applet implements ActionListener {
    private Button add, mul, sub, div;
    private TextArea n1, n2, res;

    public void init() {
        n1 = new TextArea(2,5);
        add(n1);
        n1.append("");

        n2 = new TextArea(2,5);
        add(n2);
        n2.append("");

        res = new TextArea(2,5);
        add(res);
        res.append("");

        add = new Button("+");
        add.addActionListener(this);
        add(add);

        sub = new Button("-");
        sub.addActionListener(this);
        add(sub);

        mul = new Button("x");
        mul.addActionListener(this);
        add(mul);

        div = new Button("/");
        div.addActionListener(this);
        add(div);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        switch (s) {
            case "+": {
                Integer s1 = Integer.parseInt(n1.getText());
                Integer s2 = Integer.parseInt(n2.getText());
                res.append(Integer.toString(s1 + s2));
                break;
            }
            case "-": {
                Integer s1 = Integer.parseInt(n1.getText());
                Integer s2 = Integer.parseInt(n2.getText());
                res.append(Integer.toString(s1 - s2));
                break;
            }
            case "x": {
                Integer s1 = Integer.parseInt(n1.getText());
                Integer s2 = Integer.parseInt(n2.getText());
                res.append(Integer.toString(s1 * s2));
                break;
            }
            case "/": {
                Integer s1 = Integer.parseInt(n1.getText());
                Integer s2 = Integer.parseInt(n2.getText());
                res.append(Integer.toString(s1 / s2));
                break;
            }
        }
    }
}
