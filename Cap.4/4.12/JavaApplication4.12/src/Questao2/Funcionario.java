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
public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataDeEntrada;
    String rg;
    
    void recebeAumento(double valor){
        this.salario += valor;
    }
    
    double calculaGanhoAnual(){
        return this.salario * 12;
    }
}


