/*
1) (Opcional) Transforme a classe Conta em uma interface.
public interface Conta {
    public double getSaldo();
    public void deposita(double valor);
    public void saca(double valor);
    public void atualiza(double taxaSelic);
}
Adapte ContaCorrente e ContaPoupanca para essa modificação:
class ContaCorrente implements Conta {
    // ...
}
class ContaPoupanca implements Conta {
    // ...
}
Algum código vai ter de ser copiado e colado? Isso é tão ruim?
 */
package Questao1;


public class ContaCorrente implements Conta, Tributavel{

    private double saldo;
    @Override
    public double atualiza(double taxa){
        this.saldo = this.saldo * taxa * 2;
        return this.saldo;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor;
    }

    @Override
    public double getSaldo() {
       return this.saldo;
    }
}
