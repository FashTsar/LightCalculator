import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        General g = new General("Лайтовый калькулятор");
        g.setSize(250, 220);
        g.setResizable(false);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setLocationRelativeTo(null);
        g.setVisible(true);
    }
}
