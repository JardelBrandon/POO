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


public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public double atualiza(double taxa){
        this.saldo = this.saldo * taxa * 2;
        return this.saldo;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
