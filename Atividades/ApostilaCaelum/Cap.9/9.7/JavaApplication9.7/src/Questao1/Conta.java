/*
1) Não podemos dar new em Conta, mas por que, então, podemos dar new em Conta[10], por exemplo?
 */
package Questao1;

/**
 *
 * @author jarde
 */
public abstract class Conta {
    protected double saldo;
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public void saca(double valor){
        this.saldo -= valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public abstract double atualiza(double taxa);
}
