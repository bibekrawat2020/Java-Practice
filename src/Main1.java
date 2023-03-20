import javax.swing.*;
public class Main1 extends JFrame{
    JCheckBox c;
    JLabel l;
    Main1(){
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("CheckBox");
        c = new JCheckBox();
        c.isSelected();
        c.setBounds(150, 100, 100, 50);
        add(c);
        setVisible(true);
    }

    public static void main(String[] args) {
        Main1 hf = new Main1();
    }
}
