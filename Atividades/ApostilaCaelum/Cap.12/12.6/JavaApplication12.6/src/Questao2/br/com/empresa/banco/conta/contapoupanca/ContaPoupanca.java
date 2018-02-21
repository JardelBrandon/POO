/*
2) Se você ainda não tiver separado cada classe em um arquivo, essa é a hora de mudar isso. Coloque cada
classe em seu respectivo arquivo .java. Faça isso independente de ela ser pública: é uma boa prática.
 */
package Questao2.br.com.empresa.banco.conta.contapoupanca;

import Questao2.br.com.empresa.banco.conta.Conta;

/**
 *
 * @author jarde
 */
public class ContaPoupanca extends Conta {
    @Override
    public double atualiza(double taxa){
        this.saldo = super.atualiza(taxa * 3);
        return this.saldo;
    }
}
