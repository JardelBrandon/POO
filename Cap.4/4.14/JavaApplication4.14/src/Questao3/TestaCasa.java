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
public class TestaCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        
        casa.pinta("Amarela");
        casa.porta1.abre();
        casa.porta2.fecha();
        casa.porta3.abre();
        casa.porta1.pinta("Cinza");
        
        System.out.println("Quantidade de portas abertas: " + casa.quantasPortasEstaoAbertas());
        System.out.println("Cor da casa: " + casa.cor);
        System.out.println("Cor da primeira porta: " + casa.porta1.cor);
    }
}
