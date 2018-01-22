/*
7) (opcional) No método main, vamos criar algumas contas e rodá-las:

public class TestaAtualizadorDeContas {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}
 */
package Questao7;


public class ContaCorrente extends Conta {
    @Override
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 2;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }
}
