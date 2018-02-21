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
public abstract class Conta {
    protected double saldo;
    
    public void deposita(double valor){
        if (valor < 0){
            throw new IllegalArgumentException();
        }
        else{
            this.saldo += valor;
        }
    }
    
    public void saca(double valor){
        this.saldo -= valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public abstract double atualiza(double taxa);
}
