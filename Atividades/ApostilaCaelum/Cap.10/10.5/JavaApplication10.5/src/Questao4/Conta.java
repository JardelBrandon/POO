/*
4) (opcional) Use o método printf para imprimir o saldo com exatamente duas casas decimais:
System.out.printf("O saldo é: %.2f", cc.getSaldo());
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
