/*
4) Faça com que sua classe Funcionario possa receber, opcionalmente, o nome do Funcionario durante a
criação do objeto. Utilize construtores para obter esse resultado.
Dica: utilize um construtor sem argumentos também, para o caso de a pessoa não querer passar o nome
do Funcionario.
Seria algo como:
class Funcionario {
public Funcionario() {
// construtor sem argumentos
}
public Funcionario(String nome) {
// construtor que recebe o nome
}
}
Por que você precisa do construtor sem argumentos para que a passagem do nome seja opcional?
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
        Funcionario novoFuncionario = new Funcionario();
        
        
        novoFuncionario.setNome("Jardel");
        novoFuncionario.setSalario(1000);
        
        System.out.println("Nome: " + novoFuncionario.getNome());
        System.out.println("Salário: " + novoFuncionario.getSalario());
    }
}
