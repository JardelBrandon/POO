/*
3) Programa 3
Classe: Casa
Atributos: cor, porta1, porta2, porta3
Método: void pinta(String s),
int quantasPortasEstaoAbertas()
Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche as mesmas como desejar.
Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas.
 */
package Questao3;

/**
 *
 * @author jarde
 */
public class Porta {
    boolean aberta;
    String cor;
    double dimensaoX, dimensaoY, dimensaoZ;
    
    void abre(){
        this.aberta = true;
    }
    
    void fecha(){
        this.aberta = false;
    }
    
    void pinta(String s){
        this.cor = s;
    }
    
    boolean estaAberta(){
        return this.aberta;
    }
}
