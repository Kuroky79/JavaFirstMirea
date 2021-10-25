package ru.mirea.task8.opt3;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Animation animation = new Animation();
        JFrame frame = new JFrame("Animation");
        frame.add(animation, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}