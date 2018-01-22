/*
1) O objetivo dos exercícios a seguir é fixar os conceitos vistos. Se você está com dificuldade em alguma
parte desse capítulo, aproveite e treine tudo o que vimos até agora no pequeno programa abaixo:
• Programa:
Classe: Casa Atributos: cor, totalDePortas, portas[] Métodos: void pinta(String s), int quantasPortasEstaoAbertas(),
void adicionaPorta(Porta p), int totalDePortas()
Crie uma casa, pinte-a. Crie três portas e coloque-as na casa através do método adicionaPorta, abra e
feche-as como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas
abertas e o método totalDePortas para imprimir o total de portas em sua casa.
 */
package Questao1;

/**
 *
 * @author jarde
 */
public class TestaCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.portas = new Porta[10];
                
        casa.pinta("Amarela");
        for (int i = 0; i < 50; i++){
            Porta nova = new Porta();
            casa.adicionaPorta(nova);
        }
        casa.portas[0].abre();
        casa.portas[1].abre();
        casa.portas[2].fecha();
        
        System.out.println("Quantidade de portas abertas: " + casa.quantasPortasEstaoAbertas());
        System.out.println("Cor da casa: " + casa.cor);
        System.out.println("Total de portas na casa: " + casa.totalDePortas());
    }
}
