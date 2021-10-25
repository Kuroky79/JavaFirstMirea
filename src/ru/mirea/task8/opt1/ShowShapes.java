package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;

public class ShowShapes extends JPanel {

    public static void main(String[] args){
        //создание окна
        JFrame fr = new JFrame();
        fr.setSize(700, 700);
        fr.setVisible(true);

        fr.add(new ShowShapes());
        fr.setResizable(false);
    }

    public void paint(Graphics g){

        int index;
        int max = 2;

        for (int i = 0; i < 20; i++) {

            index = (int) (Math.random() * ++max);

            if (index == 0){
                Circle circle = new Circle();
                g.drawOval(circle.x, circle.y, circle.radius, circle.radius);
                Color color = new Color(circle.r, circle.g, circle.b);
                g.setColor(color);
                g.fillOval(circle.x, circle.y, circle.radius, circle.radius);
            }
            else if (index == 1) {
                Square square = new Square();
                g.drawRect(square.x, square.y, square.side, square.side);
                Color color = new Color(square.r, square.g, square.b);
                g.setColor(color);
                g.fillRect(square.x, square.y, square.side, square.side);
            }
            else if (index == 2){
                Rectangle rectangle = new Rectangle();
                g.drawRect(rectangle.x, rectangle.y, rectangle.sideA, rectangle.sideB);
                Color color = new Color(rectangle.r, rectangle.g, rectangle.b);
                g.setColor(color);
                g.fillRect(rectangle.x, rectangle.y, rectangle.sideA, rectangle.sideB);
            }
            else {
                Oval oval = new Oval();
                g.drawOval(oval.x, oval.y, oval.width, oval.height);
                Color color = new Color(oval.r, oval.g, oval.b);
                g.setColor(color);
                g.fillOval(oval.x, oval.y, oval.width, oval.height);
            }
        }
    }
}