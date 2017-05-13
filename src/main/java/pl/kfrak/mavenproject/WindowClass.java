package pl.kfrak.mavenproject;

import javax.swing.*;
import java.awt.*;


/**
 * Created by RENT on 2017-05-13.
 */
public class WindowClass extends JFrame {
    public WindowClass() {
        setVisible(true);
        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
    }

    public static void main(String[] args) {
        new WindowClass();
    }
}