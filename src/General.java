import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class General extends JFrame {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bPlus, bMinus, bMultiply, bDivide, bEqually, bClear;
    JTextArea echo = new JTextArea(null, "", 3, 20);
    String value = "";
    String[] data = new String[3];
    int i = 0, result;
    float fresult;
    String resultS;
    boolean clickSymbol = false, clickS = false, oneElement = false, runDivide = false;

    Calculat calk = new Calculat();

    public General (String s) {
        super(s);
        setLayout(new FlowLayout());

        for (int x = 0; x < 3; x++){
            data[x] = "";
        }

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

        b1.addActionListener(calk);
        b2.addActionListener(calk);
        b3.addActionListener(calk);
        b4.addActionListener(calk);
        b5.addActionListener(calk);
        b6.addActionListener(calk);
        b7.addActionListener(calk);
        b8.addActionListener(calk);
        b9.addActionListener(calk);
        b0.addActionListener(calk);
        bPlus.addActionListener(calk);
        bMinus.addActionListener(calk);
        bMultiply.addActionListener(calk);
        bDivide.addActionListener(calk);
        bEqually.addActionListener(calk);
        bClear.addActionListener(calk);
    }

    public class Calculat implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                ClickNomber("1");
            }
            if (e.getSource() == b2) {
                ClickNomber("2");
            }
            if (e.getSource() == b3) {
                ClickNomber("3");
            }
            if (e.getSource() == b4) {
                ClickNomber("4");
            }
            if (e.getSource() == b5) {
                ClickNomber("5");
            }
            if (e.getSource() == b6) {
                ClickNomber("6");
            }
            if (e.getSource() == b7) {
                ClickNomber("7");
            }
            if (e.getSource() == b8) {
                ClickNomber("8");
            }
            if (e.getSource() == b9) {
                ClickNomber("9");
            }
            if (e.getSource() == b0) {
                ClickNomber("0");
            }
            if (e.getSource() == bPlus) {
                ClickSymbol("+");
                // блокируем знаки
                bPlus.setEnabled(false);
                bMinus.setEnabled(false);
                bMultiply.setEnabled(false);
                bDivide.setEnabled(false);
            }
            if (e.getSource() == bMinus) {
                ClickSymbol("-");
                // блокируем знаки
                bPlus.setEnabled(false);
                bMinus.setEnabled(false);
                bMultiply.setEnabled(false);
                bDivide.setEnabled(false);
            }
            if (e.getSource() == bMultiply) {
                ClickSymbol("*");
                // блокируем знаки
                bPlus.setEnabled(false);
                bMinus.setEnabled(false);
                bMultiply.setEnabled(false);
                bDivide.setEnabled(false);
            }
            if (e.getSource() == bDivide) {
                ClickSymbol("/");
                // блокируем знаки
                bPlus.setEnabled(false);
                bMinus.setEnabled(false);
                bMultiply.setEnabled(false);
                bDivide.setEnabled(false);
            }
            if (e.getSource() == bEqually) {      // равно
                try {
                    // блокируем цифры
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b0.setEnabled(false);

                    // блокируем знаки
                    bPlus.setEnabled(false);
                    bMinus.setEnabled(false);
                    bMultiply.setEnabled(false);
                    bDivide.setEnabled(false);

                    //переводим значенния в тип int
                    if (data[0] == "") {
                        data[0] = "0";
                    }
                    if (data[2] == "") {
                        data[2] = "0";
                    }

                    int v1 = Integer.parseInt(data[0]);
                    int v2 = Integer.parseInt(data[2]);
                    float fv1 = (float) (v1);
                    float fv2 = (float) (v2);

                    if (data[1] == "") {
                        result = v1 + v2;
                    }
                    if (data[1] == "+") {
                        result = v1 + v2;
                    }
                    if (data[1] == "-") {
                        result = v1 - v2;
                    }
                    if (data[1] == "*") {
                        result = v1 * v2;
                    }
                    if (data[1] == "/") {
                        fresult = fv1 / fv2;
                        runDivide = true;
                        if (fv1 == 0.0 && fv2 == 0.0) {
                            fresult = Float.POSITIVE_INFINITY;
                        }
                    }
                    if (runDivide == true) {
                        if (fresult == Float.POSITIVE_INFINITY) {
                            resultS = "Некорректные параметры деления";
                        } else {
                            resultS = "Итого = " + fresult;
                        }
                    } else {
                        resultS = "Итого = " + result;
                    }
                    echo.setText(resultS);
                } catch (Exception ignored) {
                    resultS = "Введены некорректные параметры";
                    echo.setText(resultS);
                }
            }
            if (e.getSource() == bClear) {
                setVisible(false);
                General g = new General("Лайтовый калькулятор");
                g.setSize(250, 220);
                g.setResizable(false);
                g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                g.setLocationRelativeTo(null);
                g.setVisible(true);
            }
        }

        public void ClickNomber(String n) { // цифры
            if (clickS == true){
                // блокируем знаки
                bPlus.setEnabled(false);
                bMinus.setEnabled(false);
                bMultiply.setEnabled(false);
                bDivide.setEnabled(false);
            }
            if (clickSymbol == true){
                i = i + 1;
            }
            data[i] = data[i] + n;
            value = value + n;
            clickSymbol = false;
            echo.setText(value);
        }

        public void ClickSymbol(String n){  // действия
            if (clickSymbol == true){}
            else {i++;}
            data[i] = n;
            clickSymbol = true;
            clickS = true;
            oneElement = false;
            value = value + n;
            echo.setText(value);
        }
    }
}
