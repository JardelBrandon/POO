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
public class TestaBanco {
    public static void main(String[] args) {
        Banco b = new Banco();
        b.contas = new Conta[10];
        
        for (int i = 0; i < 15; i++){
            if (i % 2 == 0){
                Conta nova = new ContaCorrente();
                nova.saldo = i * 1000;
                b.adiciona(nova);
            }
            else{
                Conta nova = new ContaPoupanca();
                nova.saldo = i * 1000;
                b.adiciona(nova);
            }
        }
        
        for (Conta conta : b.contas) {
            if (conta != null){
                AtualizadorDeContas atualizar = new AtualizadorDeContas(0.01);
                atualizar.roda(conta);
            }
        }
    }
    
}
