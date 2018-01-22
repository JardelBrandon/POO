/*
4) Reescreva ométodo atualiza() na classe ContaPoupanca para que a classe possa compilar normalmente.
O eclipse também sugere isso como um quick fix:
 */
package Questao4;


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
