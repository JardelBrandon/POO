/*
4) (opcional) Use o método printf para imprimir o saldo com exatamente duas casas decimais:
System.out.printf("O saldo é: %.2f", cc.getSaldo());
 */
package Questao4;


public class ContaCorrente extends Conta implements Tributavel{
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
}
