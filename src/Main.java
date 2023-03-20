import javax.swing.*;
public class Main extends JFrame{
    JLabel l;
    JTextField t;
    Main() {
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("GUI Test");
        setLayout(null);
        l = new JLabel("Your Name");
        t = new JTextField(15);
        l.setBounds(150, 100, 100, 30);
        add(l);
        t.setBounds(225, 100, 100, 30);
        add(t);
        setVisible(true);
    }
    public static void main(String[] args) {
        Main hf = new Main();
    }
}