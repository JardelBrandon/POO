/*
2) Crie uma classe TestaDeposita com o método main. Crie uma ContaPoupanca e tente depositar valores
inválidos:
public static void main(String[] args) {
    Conta cp = new ContaPoupanca();
    cp.deposita(-100);
}
O que acontece?
*/
package Questao2;

/**
 *
 * @author jarde
 */
public abstract class Conta {
    protected double saldo;
    
    public void deposita(double valor){
        if (valor < 0){
            throw new IllegalArgumentException();
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
