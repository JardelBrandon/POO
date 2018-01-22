/*
3) Modifique suas classes que acessam e modificam atributos de um Funcionario para utilizar os getters e
setters recém criados.
Por exemplo, onde você encontra:

f.salario = 100;
System.out.println(f.salario);
passa para:
f.setSalario(100);
System.out.println(f.getSalario());
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
        
        
        novoFuncionario.setNome("Jardel");
        novoFuncionario.setSalario(1000);
        
        System.out.println("Nome: " + novoFuncionario.getNome());
        System.out.println("Salário: " + novoFuncionario.getSalario());
    }
}
