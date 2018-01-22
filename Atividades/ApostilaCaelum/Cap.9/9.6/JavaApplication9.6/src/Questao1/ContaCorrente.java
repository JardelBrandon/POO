/*
1) Repare que a nossa classe Conta é uma excelente candidata para uma classe abstrata. Por quê? Que
métodos seriam interessantes candidatos a serem abstratos?
Transforme a classe Conta em abstrata, repare o que acontece no seu main já existente do TestaContas.
public abstract class Conta {
// ...
}
 */
package Questao1;


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
