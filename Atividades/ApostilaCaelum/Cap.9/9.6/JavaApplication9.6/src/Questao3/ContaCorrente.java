/*
3) Apenas para entendermelhor o abstract, comente o método atualiza() da ContaPoupanca, dessa forma
ele herdará o método diretamente de Conta.
Transforme o método atualiza() da classe Conta em abstrato. 
Sua classe Conta deve ficar parecida com:
public abstract class Conta {
    // atributos e métodos que já existiam
    public abstract void atualiza(double taxaSelic);
}
Qual é o problema com a classe ContaPoupanca?
 */
package Questao3;


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
