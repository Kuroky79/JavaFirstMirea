package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match extends JFrame {

    Font font = new Font("Century Gothic", Font.BOLD, 20);

    private int milanStrikes = 0;
    private int madridStrikes = 0;
    private String teamName = "DRAW";

    JButton milanButton = new JButton("Milan");
    JButton madridButton = new JButton("Madrid");

    JLabel result = new JLabel();
    JLabel lastScorer = new JLabel();
    JLabel winner = new JLabel();

    String resultLine = "Result: " + milanStrikes + " X " + madridStrikes;
    String scorerInfo = "Last Scorer: N/A";
    String winnerInfo = "Winner: " + teamName;


    public Match(){
        JFrame frame = getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);

        milanButton.setBounds(50,300,100,20);
        milanButton.addActionListener(new ChangeMilanInfo());
        panel.add(milanButton, BorderLayout.WEST);

        madridButton.setBounds(350,300,100,20);
        madridButton.addActionListener(new ChangeMadridInfo());
        panel.add(madridButton, BorderLayout.EAST);


        result.setFont(font);
        result.setText(resultLine);
        result.setBounds(180, 50, 300, 100);
        panel.add(result, BorderLayout.CENTER);

        lastScorer.setFont(font);
        lastScorer.setText(scorerInfo);
        lastScorer.setBounds(180, 100, 300, 100);
        panel.add(lastScorer, BorderLayout.CENTER);

        winner.setFont(font);
        winner.setText(winnerInfo);
        winner.setBounds(180, 150, 300, 100);
        panel.add(winner, BorderLayout.CENTER);
    }

    private class ChangeMilanInfo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            milanStrikes++;
            resultLine = "Result: " + milanStrikes + " X " + madridStrikes;
            result.setText(resultLine);

            if (milanStrikes > madridStrikes)
                winnerInfo = "Winner: " + "Milan";
            else if(milanStrikes < madridStrikes)
                winnerInfo = "Winner: " + "Madrid";
            else
                winnerInfo = "Winner: " + "-";

            winner.setText(winnerInfo);

            teamName = "Milan";
            scorerInfo = "Last Scorer: " + teamName;
            lastScorer.setText(scorerInfo);
        }
    }

    private class ChangeMadridInfo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            madridStrikes++;
            resultLine = "Result: " + milanStrikes + " X " + madridStrikes;
            result.setText(resultLine);

            if (milanStrikes > madridStrikes)
                winnerInfo = "Winner: " + "Milan";
            else if(milanStrikes < madridStrikes)
                winnerInfo = "Winner: " + "Madrid";
            else
                winnerInfo = "Winner: " + "-";

            winner.setText(winnerInfo);

            teamName = "Madrid";
            scorerInfo = "Last Scorer: " + teamName;
            lastScorer.setText(scorerInfo);
        }
    }

    static JFrame getFrame(){
        JFrame frame = new JFrame() {};
        frame.setVisible(true);
        frame.setBounds(250, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public static void main(String[]args)
    {
        new Match();
    }
}
