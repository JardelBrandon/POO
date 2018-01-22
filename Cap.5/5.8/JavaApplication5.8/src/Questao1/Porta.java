/*
1) O objetivo dos exercícios a seguir é fixar os conceitos vistos. Se você está com dificuldade em alguma
parte desse capítulo, aproveite e treine tudo o que vimos até agora no pequeno programa abaixo:
• Programa:
Classe: Casa Atributos: cor, totalDePortas, portas[] Métodos: void pinta(String s), int quantasPortasEstaoAbertas(),
void adicionaPorta(Porta p), int totalDePortas()
Crie uma casa, pinte-a. Crie três portas e coloque-as na casa através do método adicionaPorta, abra e
feche-as como desejar. Utilize ométodo quantasPortasEstaoAbertas para imprimir o número de portas
abertas e o método totalDePortas para imprimir o total de portas em sua casa.
 */
package Questao1;

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
