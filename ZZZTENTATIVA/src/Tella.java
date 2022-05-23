

import javax.swing.*;
import java.awt.*;

public class Tella extends JFrame implements CinefiloObserver {
    Filme filme = new Filme();
    JFormattedTextField texto;
    JLabel lTitulo;
    JLabel llancamento;
    JLabel lsinopse;
    JLabel poster;
    public Tella(String filme) {

        super(Home.nomeFilme);
        Navegador telespectador = new Navegador();
        setTitle(filme);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,700);
        setLayout(new BorderLayout());
        texto = new JFormattedTextField(filme);
        lTitulo = new JLabel("titulo");
        llancamento = new JLabel("lançamento");
        lsinopse = new JLabel("sinopse");

        JPanel panel = new JPanel((new GridLayout(3,1)));
        panel.add(lTitulo);
        panel.add(llancamento);
        panel.add(lsinopse);
        add(panel,BorderLayout.CENTER);
        telespectador.setObserver(this);
        telespectador.busca(filme);
        }



    public void acheiOFilme(Filme f) {
        lTitulo.setText("Titulo: "+f.titulo);
        llancamento.setText("data de lançamento: "+f.lancamento);
        lsinopse.setText("sinopse : "+f.sinopse);
        add(new JLabel(new ImageIcon(f.poster)),BorderLayout.SOUTH);
        this.pack();
    }
}



