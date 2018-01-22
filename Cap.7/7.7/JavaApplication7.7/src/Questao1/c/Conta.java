/*
1) Vamos criar uma classe Conta, que possua um saldo os métodos para pegar saldo, depositar e sacar.
c) Crie os métodos getSaldo(), deposita(double) e saca(double)

public class Conta {
    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }
    public void saca(double valor) {
        this.saldo -= valor;
    }
    public double getSaldo() {
        return this.saldo;
    }
}
 */
package Questao1.c;

/**
 *
 * @author jarde
 */
public class Conta {
    private double saldo;
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public void saca(double valor){
        this.saldo -= valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
}
