package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

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

        //parte2
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botao 1 pressionado");
            }
        });
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botao 2 pressionado");
            }
        });
    }
}