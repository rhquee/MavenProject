package pl.kfrak.mavenproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


/**
 * Created by RENT on 2017-05-13.
 */
public class WindowClass extends JFrame {

    public static void main(String[] args) {
        new WindowClass();
    }

    public WindowClass() {
        setVisible(true);
        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //textfield 1
        final JTextField xField = new JTextField();
        xField.setPreferredSize(new Dimension(200, 50));
        add(xField);

        //textfield 2
        final JTextField yField = new JTextField();
        yField.setPreferredSize(new Dimension(200, 50));
        add(yField);

        //button dodawania
        JButton button = new JButton("Dodaj");
        add(button);

        //textfield 3
        final JTextField resultField = new JTextField();
        resultField.setPreferredSize(new Dimension(200, 50));
        add(resultField);



        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(xField.getText());
                double y = Double.parseDouble(yField.getText());

                double sum = BusinessLogic.add(x, y);
                resultField.setText("" + sum);
            }
        });
        repaint();
    }}

