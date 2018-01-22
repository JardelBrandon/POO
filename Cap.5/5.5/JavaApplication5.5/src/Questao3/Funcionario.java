/*
3) Crie uma classe TestaEmpresa que possuirá um método main. Dentro dele crie algumas instâncias de
Funcionario e passe para a empresa pelo método adiciona. Repare que antes você vai precisar criar a
array, pois inicialmente o atributo empregados da classe Empresa não referencia lugar nenhum (seu valor
é null):
 */
package Questao3;

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


