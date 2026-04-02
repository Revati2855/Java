import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practical8_2 extends JFrame implements ActionListener {

    JTextField inputField, resultField;
    JButton reverseButton;

    Practical8_2() {
        setTitle("Reverse Number");

        // Labels
        JLabel l1 = new JLabel("Enter Number:");
        JLabel l2 = new JLabel("Reversed Number:");

        // Text Fields
        inputField = new JTextField(15);
        resultField = new JTextField(15);
        resultField.setEditable(false);

        // Button
        reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(this);

        // Layout
        setLayout(new FlowLayout());

        add(l1);
        add(inputField);
        add(l2);
        add(resultField);
        add(reverseButton);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(inputField.getText());
            int rev = 0;

            while (num != 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }

            resultField.setText(String.valueOf(rev));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!");
        }
    }

    public static void main(String[] args) {
        new Practical8_2();
    }
}