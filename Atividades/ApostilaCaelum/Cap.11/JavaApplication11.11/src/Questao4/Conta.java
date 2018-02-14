/*
4) Ao lançar a IllegalArgumentException, passe via construtor uma mensagem a ser exibida. Lembre que
a String recebida como parâmetro é acessível depois via o método getMessage() herdado por todas as
Exceptions.
public void deposita(double valor) {
    if (valor < 0) {
        throw new IllegalArgumentException("Você tentou depositar" +
                                                " um valor negativo");
    } else {
        this.saldo += valor - 0.10;
    }
}
Com isso, você precisará fazer algumasmudanças no TestaDeposita. Como ficou ele, depois de alterado?
*/
package Questao4;

/**
 *
 * @author jarde
 */
public abstract class Conta {
    protected double saldo;
    
    public void deposita(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Você tentou depositar "
                                                + "um valor negativo");
        }
        else{
            this.saldo += valor;
        }
    }
    
    public void saca(double valor){
        this.saldo -= valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public abstract double atualiza(double taxa);
}
