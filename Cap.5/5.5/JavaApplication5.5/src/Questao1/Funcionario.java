/*
1) Volte ao nosso sistema de Funcionario e crie uma classe Empresa dentro do mesmo arquivo .java. A
Empresa tem um nome, cnpj e uma referência a uma array de Funcionario, além de outros atributos que
você julgar necessário.
 */
package Questao1;

/**
 *
 * @author jarde
 */
public class Funcionario {
    String nome;
    String departamento;
    double salario;
    Data dataDeEntrada;
    String rg;
    
    void recebeAumento(double valor){
        this.salario += valor;
    }
    
    double calculaGanhoAnual(){
        return this.salario * 12;
    }
    
    void mostra(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Salário atual:" + this.salario);
        System.out.println("Ganho anual:" + this.calculaGanhoAnual());
        System.out.println("RG do funcionário:" + this.rg);
        System.out.println("Data de Entrada do funcionário:" + this.dataDeEntrada.formatada());
    }
}


