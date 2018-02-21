/*
1) Na classe Conta, modifique o método deposita(double x): Ele deve lançar uma exception chamada
IllegalArgumentException, que já faz parte da biblioteca do Java, sempre que o valor passado como
argumento for inválido (por exemplo, quando for negativo).
public void deposita(double valor) {
    if (valor < 0) {
        throw new IllegalArgumentException();
    } else {
        this.saldo += valor;
    }
}
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
