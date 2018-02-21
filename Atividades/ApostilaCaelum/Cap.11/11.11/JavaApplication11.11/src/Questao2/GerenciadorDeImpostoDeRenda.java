/*
2) Crie uma classe TestaDeposita com o método main. Crie uma ContaPoupanca e tente depositar valores
inválidos:
public static void main(String[] args) {
    Conta cp = new ContaPoupanca();
    cp.deposita(-100);
}
O que acontece?
*/

package Questao2;

/**
 *
 * @author jarde
 */
public class GerenciadorDeImpostoDeRenda {
    private double total;
    
    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);
        this.total += t.calculaTributos();
    }
    
    public double getTotal() {
        return this.total;
    }
}
