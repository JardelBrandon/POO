/*
4) Reescreva ométodo atualiza() na classe ContaPoupanca para que a classe possa compilar normalmente.
O eclipse também sugere isso como um quick fix:
 */
package Questao4;

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
