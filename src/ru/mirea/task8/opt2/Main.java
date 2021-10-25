package ru.mirea.task8.opt2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main extends JPanel {

    private static final long serialVersionUID = 1L;

    private BufferedImage image;

    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;

    public static void main(String avg[]) throws IOException {
        Main abc = new Main();

    }

    public Main() {
        try {
            JFrame frame = new JFrame();
            Scanner scanner = new Scanner(System.in);
            String path = scanner.nextLine();
            image = ImageIO.read(new File(
                    path));
            // C:\\Users\\1\\Desktop\\bolt.jpg

            frame.setSize(WIDTH, HEIGHT);
            frame.setVisible(true);
            frame.getContentPane().add(this);
            this.setBackground(Color.BLACK);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }
// yES
}