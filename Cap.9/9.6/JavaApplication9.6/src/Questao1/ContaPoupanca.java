/*
1) Repare que a nossa classe Conta é uma excelente candidata para uma classe abstrata. Por quê? Que
métodos seriam interessantes candidatos a serem abstratos?
Transforme a classe Conta em abstrata, repare o que acontece no seu main já existente do TestaContas.
public abstract class Conta {
// ...
}
 */
package Questao1;

/**
 *
 * @author jarde
 */
public class ContaPoupanca extends Conta {
    @Override
    public double atualiza(double taxa){
        this.saldo = super.atualiza(taxa * 3);
        return this.saldo;
    }
}
