/*
6) (opcional)Vamos criar uma classe que seja responsável 
por fazer a atualização de todas as contas bancárias
e gerar um relatório com o saldo anterior e saldo novo de cada uma das contas.
Além disso, conforme atualiza as contas, o banco quer saber quanto do dinheiro do banco foi atualizado
até o momento. Por isso, precisamos ir guardando o saldoTotal e adicionar um getter à classe.

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        // aqui você imprime o saldo anterior, atualiza a conta,
        // e depois imprime o saldo final
        // lembrando de somar o saldo final ao atributo saldoTotal
    }
    // outros métodos, colocar o getter para saldoTotal!
}
 */
package Questao6;

/**
 *
 * @author jarde
 */
public class ContaPoupanca extends Conta {
    @Override
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 3;
    }
}
