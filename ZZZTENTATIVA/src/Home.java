

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Home extends JFrame {
    public static String nomeFilme = new String();

    public void main() {
        int i = 0;
        JFrame frame = new JFrame("novo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(null);
        JButton busca = new JButton("Buscar");
        JButton limpa = new JButton("Limpar");
        JTextField text = new JTextField(20);

        busca.setBounds(100, 150, 100, 100);
        limpa.setBounds(300, 150, 100, 100);
        text.setBounds(200, 50, 100, 50);

        frame.add(busca);
        frame.add(limpa);
        frame.add(text);
        frame.setVisible(true);


        busca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //buscando

                //nome do filme

                nomeFilme = text.getText();
                System.out.println(nomeFilme);

                Tella tela = new Tella(nomeFilme);
                tela.setVisible(true);


            }
        });
        limpa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                Tella tela = new Tella(nomeFilme);
                tela.setVisible(false);
                text.setText("");


            }
        });



    }
}
