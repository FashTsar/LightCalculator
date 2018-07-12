import javax.swing.*;
import java.awt.*;

public class General extends JFrame {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bPlus, bMinus, bMultiply, bDivide, bEqually, bClear;
    JTextArea echo = new JTextArea(null, null, 3, 20);

    public General (String s) {
        super(s);
        setLayout(new FlowLayout());

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bPlus = new JButton("+");
        bMinus = new JButton("-");
        bMultiply = new JButton("x");
        bDivide = new JButton("/");
        bClear = new JButton("Clear");
        bEqually = new JButton("=");

        echo.setEditable(false);
        bEqually.setPreferredSize(new Dimension(100,26));

        add(echo);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(bPlus);
        add(bMinus);
        add(bMultiply);
        add(bDivide);
        add(bEqually);
        add(bClear);
    }
}
