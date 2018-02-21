/*
3) O código não vai compilar prontamente, pois muitos métodos que declaramos são package-private
quando, na verdade, precisaríamos que eles fossem public.
O mesmo vale para as classes: algumas delas precisarão ser públicas.
Use o recurso de quick fix do Eclipse aqui: ele mesmo vai sugerir que o modificador de acesso deve ser
público. Para isso, use o ctrl + 1 em cada um dos erros, escolhendo o quick fix mais adequado para seu
problema.
 */
package Questao3.br.com.empresa.banco.conta.contapoupanca;

import Questao3.br.com.empresa.banco.conta.Conta;

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
