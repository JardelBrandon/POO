/*
1) Não podemos dar new em Conta, mas por que, então, podemos dar new em Conta[10], por exemplo?
 */
package Questao1;

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
