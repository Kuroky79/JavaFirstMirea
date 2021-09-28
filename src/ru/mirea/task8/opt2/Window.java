package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Window extends JFrame {

    private Image img;

    public Window() {
        setSize(600,600);
        setTitle("Pic");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }
    public void loadImage(String src) {
        img = new ImageIcon(src).getImage();
    }
    public void drawIcon() {
        Graphics g = getGraphics();
        g.drawImage(img, 0, 0, 600, 600, null);
    }
}