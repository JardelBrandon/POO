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
public class Pessoa {
    String nome;
    int idade;
    
    void fazAniversario(){
        this.idade++;
    }
}
