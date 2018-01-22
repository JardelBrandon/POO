/*
1) Programa 1
Classe: Pessoa
Atributos: nome, idade.
Método: void fazAniversario()
Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários (aumentando a idade) e
imprima seu nome e sua idade.
 */
package Questao1;

/**
 *
 * @author jarde
 */
public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "Jardel";
        pessoa.idade = 21;
        pessoa.fazAniversario();
        
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
    }
}
