/*
2) Para que o código do main volte a compilar, troque o new Conta() por new ContaCorrente().
Se não podemos dar new em Conta, qual é a utilidade de ter ummétodo que recebe uma referência a Conta
como argumento? Aliás, posso ter isso?
 */
package Questao2;

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
