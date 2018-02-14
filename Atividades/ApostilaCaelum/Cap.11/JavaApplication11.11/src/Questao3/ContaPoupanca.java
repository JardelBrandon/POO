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
public class ContaPoupanca extends Conta {
    ///* Descomentar para ver o erro que é causado
    @Override
    public double atualiza(double taxa){
        this.saldo = this.saldo * taxa * 3;
        return this.saldo;
    }
    //*/
}
