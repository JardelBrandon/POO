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
public class TestaPorta {
    public static void main(String[] args) {
        Porta porta = new Porta();
        
        porta.abre();
        porta.fecha();
        porta.pinta("verde");
        porta.pinta("Azul");
        porta.pinta("Rosa");
        porta.dimensaoX = 10;
        porta.dimensaoY = 20.5;
        porta.dimensaoZ = 1.55;
        
        System.out.println("A porta está aberta?\n" + porta.estaAberta());
    }
}
