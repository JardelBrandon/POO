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
public class Casa {
    String cor;
    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();
    
    void pinta(String s){
        this.cor = s;
    }
    
    int quantasPortasEstaoAbertas(){
        int quantidadeDePortasAbertas = 0;
        if (porta1.aberta){
            quantidadeDePortasAbertas++;
        }
        if (porta2.aberta){
            quantidadeDePortasAbertas++;
        }
        if (porta3.aberta){
            quantidadeDePortasAbertas++;
        }
        
        return quantidadeDePortasAbertas;
    }
}
