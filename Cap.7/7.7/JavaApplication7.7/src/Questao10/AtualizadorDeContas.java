/*
10) (Opcional, Trabalhoso) Crie uma classe Banco que possui um array de Conta. Repare que num
array de Conta você pode colocar tanto ContaCorrente quanto ContaPoupanca. Crie um método
public void adiciona(Conta c), um método public Conta pegaConta(int x) e outro public int
pegaTotalDeContas(), muito similar a relação anterior de Empresa-Funcionario.
Faça com que seu método main crie diversas contas, insira-as no Banco e depois, com um for, percorra
todas as contas do Banco para passá-las como argumento para o AtualizadorDeContas.
}
 */
package Questao10;

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
