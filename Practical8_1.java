import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practical8_1 extends JFrame implements ActionListener {

    JTextField tf;
    JButton up, down, reset;
    int count = 0;

    Practical8_1() {
        setTitle("Counter");

        JLabel label = new JLabel("Counter:");
        tf = new JTextField("0", 10);
        tf.setEditable(false);

        up = new JButton("Count Up");
        down = new JButton("Count Down");
        reset = new JButton("Reset");

        up.addActionListener(this);
        down.addActionListener(this);
        reset.addActionListener(this);

        setLayout(new FlowLayout());

        add(label);
        add(tf);
        add(up);
        add(down);
        add(reset);

        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == up) {
            count++;
        } else if (e.getSource() == down) {
            count--;
        } else if (e.getSource() == reset) {
            count = 0;
        }
        tf.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        new Practical8_1();
    }
}
