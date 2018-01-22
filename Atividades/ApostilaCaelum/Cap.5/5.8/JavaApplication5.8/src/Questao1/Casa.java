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
public class Casa {
    String cor;
    int totalDePortas;
    Porta[] portas;
    
    void pinta(String s){
        this.cor = s;
    }
    
    int quantasPortasEstaoAbertas(){
        int quantidadeDePortasAbertas = 0;
        for (Porta porta : portas){
            if (porta != null){
                if (porta.aberta){
                    quantidadeDePortasAbertas++;
                }  
            }
        }
        return quantidadeDePortasAbertas;
    }
    
    void adicionaPorta(Porta p){
        for (int i = 0; i <= this.portas.length; i++){
            if (i == this.portas.length){ //Array cheio
                Porta[] arrayCheio = this.portas;
                this.portas = new Porta[i * 2];
                for (int x = 0; x < this.portas.length; x++){
                    if (x < i){
                        this.portas[x] = arrayCheio[x];
                    }
                }
            }
            
            if (this.portas[i] == null){
                this.portas[i] = p;
                break;
            }
        }
    }
    
    int totalDePortas(){
        int quantidadeDePortas = 0;
        for (Porta porta : portas){
            if (porta != null){
                quantidadeDePortas++;
            }
        }
        return quantidadeDePortas;
    }
}
