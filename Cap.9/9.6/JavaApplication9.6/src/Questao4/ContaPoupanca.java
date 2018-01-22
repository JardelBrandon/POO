/*
4) Reescreva ométodo atualiza() na classe ContaPoupanca para que a classe possa compilar normalmente.
O eclipse também sugere isso como um quick fix:
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
