/*
5) Crie duas referências para o mesmo funcionário, compare-os com o ==. Tire suas conclusões. Para criar
duas referências pro mesmo funcionário:
 */
package Questao5;

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
        
        novoFuncionario1.nome = "Jardel";
        novoFuncionario1.salario = 1000;
        
        Funcionario novoFuncionario2 = novoFuncionario1;
        
        if (novoFuncionario1 == novoFuncionario2) {
            System.out.println("Iguais"); 
        }
        else {
            System.out.println("Diferentes");
        }
    }
}
