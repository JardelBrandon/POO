/*
4) (opcional) Use o método printf para imprimir o saldo com exatamente duas casas decimais:
System.out.printf("O saldo é: %.2f", cc.getSaldo());
 */
package Questao4;

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
