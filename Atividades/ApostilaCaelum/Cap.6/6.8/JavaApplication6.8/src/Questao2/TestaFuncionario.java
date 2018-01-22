/*
2) Crie os getters e setters necessários da sua classe Funcionario. Por exemplo:
class Funcionario {
    private double salario;
    // ...
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
Não copie e cole! Aproveite para praticar sintaxe. Logo passaremos a usar o Eclipse e aí sim teremos
procedimentos mais simples para este tipo de tarefa.
Repare que ométodo calculaGanhoAnual parece também um getter. Aliás, seria comum alguém nomeálo
de getGanhoAnual. Getters não precisam apenas retornar atributos. Eles podem trabalhar com esses
dados.
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
        Funcionario novoFuncionario1 = new Funcionario();
        
        //Linhas que causam erro
        //novoFuncionario1.nome = "Jardel";
        //novoFuncionario1.salario = 1000;
        
        Funcionario novoFuncionario2 = novoFuncionario1;
        
        if (novoFuncionario1 == novoFuncionario2) {
            System.out.println("Iguais"); 
        }
        else {
            System.out.println("Diferentes");
        }
    }
}
