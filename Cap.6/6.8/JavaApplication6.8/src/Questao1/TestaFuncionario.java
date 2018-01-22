/*
1) Adicione o modificador de visibilidade (private, se necessário) para cada atributo e método da classe
Funcionario. Tente criar um Funcionario no main e modicar ou ler um de seus atributos privados. O
que acontece?
 */
package Questao1;

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
