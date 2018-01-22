/*
2) Para que o código do main volte a compilar, troque o new Conta() por new ContaCorrente().
Se não podemos dar new em Conta, qual é a utilidade de ter ummétodo que recebe uma referência a Conta
como argumento? Aliás, posso ter isso?
 */
package Questao2;


public class ContaCorrente extends Conta {
    @Override
    public double atualiza(double taxa){
        this.saldo = super.atualiza(taxa * 2);
        return this.saldo;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }
}
