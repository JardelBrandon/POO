/*
5) (opcional) Adicione um atributo na classe Funcionario de tipo int que se chama identificador. Esse
identificador deve ter um valor único para cada instância do tipo Funcionario. O primeiro Funcionario
instanciado tem identificador 1, o segundo 2, e assim por diante. Você deve utilizar os recursos aprendidos
aqui para resolver esse problema.
Crie um getter para o identicador. Devemos ter um setter?
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
        
        novoFuncionario1.setNome("Jardel");
        novoFuncionario1.setSalario(1000);
        
        System.out.println("Nome: " + novoFuncionario1.getNome());
        System.out.println("Salário: " + novoFuncionario1.getSalario());
        System.out.println("Identificador: " + novoFuncionario1.getIdentificador());
        
        Funcionario novoFuncionario2 = new Funcionario("Brandon");
        System.out.println("Nome: " + novoFuncionario2.getNome());
        System.out.println("Salário: " + novoFuncionario2.getSalario());
        System.out.println("Identificador: " + novoFuncionario2.getIdentificador());
        
        Funcionario novoFuncionario3 = new Funcionario("sim");
        System.out.println("Nome: " + novoFuncionario3.getNome());
        System.out.println("Salário: " + novoFuncionario3.getSalario());
        System.out.println("Identificador: " + novoFuncionario3.getIdentificador());
        
        Funcionario novoFuncionario4 = new Funcionario("del");
        System.out.println("Nome: " + novoFuncionario4.getNome());
        System.out.println("Identificador: " + novoFuncionario4.getIdentificador());
    }
}