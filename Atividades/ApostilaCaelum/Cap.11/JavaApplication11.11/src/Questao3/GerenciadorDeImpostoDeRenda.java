/*
3) Adicione o try/catch para tratar o erro:
Listagem 11.1: TestaDeposita.java Arquivo: "TestaDeposita.java"
public static void main(String[] args) {
    Conta cp = new ContaPoupanca();
    try {
        cp.deposita(-100);
    } catch (IllegalArgumentException e) {
        System.out.println("Você tentou depositar um valor inválido");
    }
}
*/

package Questao3;

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
