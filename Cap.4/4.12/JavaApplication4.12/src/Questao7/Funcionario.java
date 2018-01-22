/*
7) (opcional) Modifique seu método mostra para que ele imprima o valor da dataDeEntrada daquele
Funcionario:
 */
package Questao7;

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
        System.out.println("Data de Entrada do funcionário:");
        System.out.println("Dia:" + this.dataDeEntrada.dia);
        System.out.println("Mês:" + this.dataDeEntrada.mes);
        System.out.println("Ano:" + this.dataDeEntrada.ano);
    }
}


