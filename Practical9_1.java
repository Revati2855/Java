import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practical9_1 extends JFrame implements ActionListener {

    JTextField tf;
    double num1, num2, result;
    char op;

    Practical9_1() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        tf.setHorizontalAlignment(JTextField.RIGHT);
        add(tf, BorderLayout.NORTH);

        JPanel p = new JPanel(new GridLayout(5, 4, 5, 5));

        String btns[] = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0",".","=","+",
            "C"
        };

        for(String b : btns) {
            JButton btn = new JButton(b);
            btn.addActionListener(this);
            p.add(btn);
        }

        add(p, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if(cmd.matches("[0-9.]")) {
            tf.setText(tf.getText() + cmd);
        }
        else if(cmd.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(tf.getText());
            op = cmd.charAt(0);
            tf.setText("");
        }
        else if(cmd.equals("=")) {
            num2 = Double.parseDouble(tf.getText());

            switch(op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = (num2 != 0) ? num1 / num2 : 0; break;
            }

            tf.setText("" + result);
        }
        else if(cmd.equals("C")) {
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Practical9_1();
    }
}