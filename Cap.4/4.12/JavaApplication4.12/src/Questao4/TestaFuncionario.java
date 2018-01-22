/*
4) Construa dois funcionários com o new e compare-os com o ==. E se eles tiverem os mesmos atributos?
Para isso você vai precisar criar outra referência:
 */
package Questao4;

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
        Funcionario novoFuncionario1 = new Funcionario();
        Funcionario novoFuncionario2 = new Funcionario();
        
        novoFuncionario1.nome = "Jardel";
        novoFuncionario1.salario = 1000;
        
        novoFuncionario2.nome = "Jardel";
        novoFuncionario2.salario = 1000;
        
        if (novoFuncionario1 == novoFuncionario2) {
            System.out.println("Iguais"); 
        }
        else {
            System.out.println("Diferentes");
        }
    }
}
