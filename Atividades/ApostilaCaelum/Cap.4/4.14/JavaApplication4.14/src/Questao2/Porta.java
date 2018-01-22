/*
2) Programa 2
Classe: Porta
Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ
Métodos: void abre()
void fecha()
void pinta(String s)
boolean estaAberta()
Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões e use o método
estaAberta para verificar se ela está aberta.
 */
package Questao2;

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
