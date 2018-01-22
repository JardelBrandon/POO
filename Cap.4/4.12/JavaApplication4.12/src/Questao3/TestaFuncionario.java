/*
3) Crie ummétodo mostra(), que não recebe nem devolve parâmetro algum e simplesmente imprime todos
os atributos do nosso funcionário. Dessa maneira, você não precisa ficar copiando e colando um monte
de System.out.println() para cada mudança e teste que fizer com cada um de seus funcionários, você
simplesmente vai fazer:

Funcionario f1 = new Funcionario();
// brincadeiras com f1....
f1.mostra();
 */
package Questao3;

/**
 *
 * @author jarde
 */
public class TestaFuncionario {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Funcionario novoFuncionario = new Funcionario();
        
        novoFuncionario.nome = "Jardel";
        novoFuncionario.salario = 1000;
        novoFuncionario.recebeAumento(500);
        novoFuncionario.dataDeEntrada = "09/12/2009";
        novoFuncionario.rg = "387.945.957";
        
        novoFuncionario.mostra();
    }
}
