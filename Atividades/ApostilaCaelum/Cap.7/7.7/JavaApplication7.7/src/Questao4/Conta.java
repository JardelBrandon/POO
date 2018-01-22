/*
4) Crie uma classe com método main e instancie essas classes, atualize-as e veja o resultado. Algo como:
public class TestaContas {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
Após imprimir o saldo (getSaldo()) de cada uma das contas, o que acontece?
 */
package Questao4;

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
    
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }
}
