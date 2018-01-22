/*
6) (opcional) Em vez de utilizar uma String para representar a data, crie uma outra classe, chamada Data.
Ela possui ì campos int, para dia, mês e ano. Faça com que seu funcionário passe a usá-la. (é parecido
com o último exemplo, em que a Conta passou a ter referência para um Cliente).
 */
package Questao6;

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
        
        Data data = new Data();
        novoFuncionario.dataDeEntrada = data;
        
    }
}
