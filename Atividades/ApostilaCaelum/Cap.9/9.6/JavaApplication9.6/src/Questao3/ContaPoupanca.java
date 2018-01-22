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
