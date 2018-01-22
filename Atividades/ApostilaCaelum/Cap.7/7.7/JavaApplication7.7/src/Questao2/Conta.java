/*
2) Adicione um método na classe Conta, que atualiza essa conta de acordo com uma taxa percentual fornecida.
class Conta {
    private double saldo;

    // outros métodos aqui também ...

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
 */
package Questao2;

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
    
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }
}
