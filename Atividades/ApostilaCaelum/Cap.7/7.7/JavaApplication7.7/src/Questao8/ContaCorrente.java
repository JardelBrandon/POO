/*
8) (Opcional)Use a palavra chave super nos métodos atualiza reescritos, para não ter de refazer o trabalho.
 */
package Questao8;


public class ContaCorrente extends Conta {
    @Override
    public double atualiza(double taxa){
        this.saldo = super.atualiza(taxa * 2);
        return this.saldo;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }
}
