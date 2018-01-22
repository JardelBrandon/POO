/*
1) Repare que a nossa classe Conta é uma excelente candidata para uma classe abstrata. Por quê? Que
métodos seriam interessantes candidatos a serem abstratos?
Transforme a classe Conta em abstrata, repare o que acontece no seu main já existente do TestaContas.
public abstract class Conta {
// ...
}
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
    
    public double atualiza(double taxa){
        this.saldo += this.saldo * taxa;
        return this.saldo;
    }
}
