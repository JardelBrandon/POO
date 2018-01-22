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
    
    public double atualiza(double taxa){
        this.saldo += this.saldo * taxa;
        return this.saldo;
    }
}
