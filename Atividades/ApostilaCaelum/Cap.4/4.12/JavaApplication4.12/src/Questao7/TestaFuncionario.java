/*
7) (opcional) Modifique seu método mostra para que ele imprima o valor da dataDeEntrada daquele
Funcionario:
 */
package Questao7;

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
        novoFuncionario.rg = "387.945.957";
        
        Data data = new Data();
        novoFuncionario.dataDeEntrada = data;
        novoFuncionario.mostra();
        
    }
}
