import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practical9_2 extends JFrame implements ActionListener {

    JCheckBox notebook, pen, pencil;
    JButton orderBtn;

    Practical9_2() {
        setTitle("Stationary Purchase System");
        setSize(350, 250);
        setLayout(new FlowLayout());

        notebook = new JCheckBox("Notebook @ 50");
        pen = new JCheckBox("Pen @ 30");
        pencil = new JCheckBox("Pencil @ 10");

        orderBtn = new JButton("Order");

        add(notebook);
        add(pen);
        add(pencil);
        add(orderBtn);

        orderBtn.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int total = 0;
        String bill = "";

        try {
            if (notebook.isSelected()) {
                int qty = Integer.parseInt(
                        JOptionPane.showInputDialog("Enter quantity for Notebook:")
                );
                int cost = qty * 50;
                total += cost;
                bill += "Notebook x " + qty + " = " + cost + "\n";
            }

            if (pen.isSelected()) {
                int qty = Integer.parseInt(
                        JOptionPane.showInputDialog("Enter quantity for Pen:")
                );
                int cost = qty * 30;
                total += cost;
                bill += "Pen x " + qty + " = " + cost + "\n";
            }

            if (pencil.isSelected()) {
                int qty = Integer.parseInt(
                        JOptionPane.showInputDialog("Enter quantity for Pencil:")
                );
                int cost = qty * 10;
                total += cost;
                bill += "Pencil x " + qty + " = " + cost + "\n";
            }

            if (total == 0) {
                JOptionPane.showMessageDialog(this, "No item selected!");
            } else {
                bill += "----------------------\n";
                bill += "Total = " + total;

                JOptionPane.showMessageDialog(this, bill, "Bill", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(this, "Successfully Ordered!", "Alert", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input!");
        }
    }

    public static void main(String[] args) {
        new Practical9_2();
    }
}