/*
4) Percorra o atributo empregados da sua instância da Empresa e imprima os salários de todos seus funcionários.
Para fazer isso, você pode criar um método chamado mostraEmpregados dentro da classe Empresa:
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


