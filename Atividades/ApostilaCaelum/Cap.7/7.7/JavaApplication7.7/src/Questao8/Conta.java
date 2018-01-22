/*
8) (Opcional)Use a palavra chave super nosmétodos atualiza reescritos, para não ter de refazer o trabalho.
 */
package Questao8;

/**
 *
 * @author jarde
 */
public class Conta {
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
