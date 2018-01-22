/*
2) Transforme omodelo acima em uma classe Java. Teste-a, usando uma outra classe que tenha o main. Você
deve criar a classe do funcionário com o nome Funcionario, mas pode nomear como quiser a classe de
testes, contudo, ela deve possuir o método main.
 */
package Questao2;

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
                
        System.out.println("Salário atual:" + novoFuncionario.salario);
        System.out.println("Ganho anual:" + novoFuncionario.calculaGanhoAnual());
        System.out.println("Data de Entrada do funcionário:" + novoFuncionario.dataDeEntrada);
        System.out.println("RG do funcionário:" + novoFuncionario.rg);
    }
}
