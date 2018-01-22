/*
4) Construa dois funcionários com o new e compare-os com o ==. E se eles tiverem os mesmos atributos?
Para isso você vai precisar criar outra referência:
 */
package Questao4;

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
    
    void mostra(){
        System.out.println("Salário atual:" + this.salario);
        System.out.println("Ganho anual:" + this.calculaGanhoAnual());
        System.out.println("Data de Entrada do funcionário:" + this.dataDeEntrada);
        System.out.println("RG do funcionário:" + this.rg);
    }
}


