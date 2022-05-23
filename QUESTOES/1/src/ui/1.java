package ui;

import javax.swing.*;

public class Button {
    public static void main(String[] args) {

        JFrame frame = new JFrame("novo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLayout(null);
        JButton botao1 = new JButton("BOTAO#1");
        JButton botao2 = new JButton("BOTAO#2");
        botao1.setBounds(100,100,100,100);
        botao2.setBounds(300,100,100,100);
        frame.add(botao1);
        frame.add(botao2);
        frame.setVisible(true);

    }
}