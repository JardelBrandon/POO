/*
3) O código não vai compilar prontamente, pois muitos métodos que declaramos são package-private
quando, na verdade, precisaríamos que eles fossem public.
O mesmo vale para as classes: algumas delas precisarão ser públicas.
Use o recurso de quick fix do Eclipse aqui: ele mesmo vai sugerir que o modificador de acesso deve ser
público. Para isso, use o ctrl + 1 em cada um dos erros, escolhendo o quick fix mais adequado para seu
problema.
 */
package Questao3.br.com.empresa.banco.sistema;

import Questao3.br.com.empresa.banco.conta.Conta;

/**
 *
 * @author jarde
 */
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }
    
    public void roda(Conta c) {
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Saldo final: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSelic() {
        return selic;
    }
    
}
