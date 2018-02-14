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
public class SeguroDeVida implements Tributavel{

    @Override
    public double calculaTributos() {
        return 42;
    }
    
}
