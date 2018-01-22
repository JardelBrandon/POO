/*
10) (Opcional, Trabalhoso) Crie uma classe Banco que possui um array de Conta. Repare que num
array de Conta você pode colocar tanto ContaCorrente quanto ContaPoupanca. Crie um método
public void adiciona(Conta c), um método public Conta pegaConta(int x) e outro public int
pegaTotalDeContas(), muito similar a relação anterior de Empresa-Funcionario.
Faça com que seu método main crie diversas contas, insira-as no Banco e depois, com um for, percorra
todas as contas do Banco para passá-las como argumento para o AtualizadorDeContas.
 */
package Questao10;

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
