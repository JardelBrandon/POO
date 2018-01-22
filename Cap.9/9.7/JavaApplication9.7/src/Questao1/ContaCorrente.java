/*
1) Não podemos dar new em Conta, mas por que, então, podemos dar new em Conta[10], por exemplo?
 */
package Questao1;


public class ContaCorrente extends Conta {
    @Override
    public double atualiza(double taxa){
        this.saldo = this.saldo * taxa * 2;
        return this.saldo;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }
}
