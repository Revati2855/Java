import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practical8_3 extends JFrame implements ActionListener {

    JRadioButton male, female, other;
    JButton submit;

    Practical8_3() {
        setTitle("Gender Selection");

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);

        submit = new JButton("Submit");
        submit.addActionListener(this);

        setLayout(new FlowLayout());

        add(new JLabel("Select Gender:"));
        add(male);
        add(female);
        add(other);
        add(submit);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String gender = "";

        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else if (other.isSelected()) {
            gender = "Other";
        }

        JOptionPane.showMessageDialog(this, "Selected Gender: " + gender);
    }

    public static void main(String[] args) {
        new Practical8_3();
    }
}