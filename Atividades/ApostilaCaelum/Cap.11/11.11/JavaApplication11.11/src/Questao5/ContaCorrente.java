/*
5) Crie sua própria Exception, ValorInvalidoException. Para isso, você precisa criar uma classe com esse
nome que seja filha de RuntimeException.
public class ValorInvalidoException extends RuntimeException {
}
Lance-a em vez de IllegalArgumentException. Quais alterações você teve que fazer nas classes Conta e
na TestaDeposita?
 */
package Questao5;


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
