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



    }
    public void decrementa(int x) {
        valor -= 1;


    }


}
class ex3 {

    public static void main(String[] args) {
        int inteiro = 0;
        final Tela listener;
        Contador cont = new Contador();


        cont.setListener(new Tela() {
            private int inteiro;

            public void oValorMudou(int novoValor) {

                this.inteiro = novoValor;
            }

        });

    }
}