import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//avisaa quando acabou
interface Tela {
    void oValorMudou(int novoValor);
}


class Contador{
    public int valor = 0;
    public Tela listener;

    public void setListener(Tela listener){
        this.listener = listener;
    }

    public void incrementa(int x){
        valor += 1;

            listener.oValorMudou(valor);

    }
    public void decrementa(int x) {
        valor -= 1;

            listener.oValorMudou(valor);
    }


}
class ex5{

    public static void main(String[] args) {
        int inteiro =0;
        final Tela listener ;
        Contador cont = new Contador();

        cont.setListener(new Tela() {
            private int inteiro;
            public void oValorMudou(int novoValor) {
                this.inteiro = novoValor;
            }

        });





        JFrame frame = new JFrame("novo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,450);
        frame.setLayout(null);
        JButton botao1 = new JButton("incrementa");
        JButton botao2 = new JButton("decrementta");
        JButton botao3 = new JButton();
        botao1.setBounds(100,100,150,150);
        botao2.setBounds(300,100,150,150);
        botao3.setBounds(300,100,150,150);

        frame.add(botao1);
        frame.add(botao2);
        frame.setVisible(true);

        //parte2
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cont.incrementa(1);
                cont.listener.oValorMudou(cont.valor);
                System.out.println("“O novo Valor do Contador e:"+cont.valor);

            }
        });
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cont.decrementa(1);
                cont.listener.oValorMudou(cont.valor);
                System.out.println("“O novo Valor do Contador e:"+cont.valor);;
            }
        });
    }
}


