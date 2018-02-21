/*
2) Se você ainda não tiver separado cada classe em um arquivo, essa é a hora de mudar isso. Coloque cada
classe em seu respectivo arquivo .java. Faça isso independente de ela ser pública: é uma boa prática.
 */
package Questao2.br.com.empresa.banco.conta.contacorrente;

import Questao2.br.com.empresa.banco.conta.Conta;


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
