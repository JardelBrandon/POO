/*
5) Crie sua própria Exception, ValorInvalidoException. Para isso, você precisa criar uma classe com esse
nome que seja filha de RuntimeException.
public class ValorInvalidoException extends RuntimeException {
}
Lance-a em vez de IllegalArgumentException. Quais alterações você teve que fazer nas classes Conta e
na TestaDeposita?
 */
package Questao5;

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
