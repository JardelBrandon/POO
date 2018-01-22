/*
7) (Opcional) Caso a array já esteja cheia no momento de adicionar um outro funcionário, criar uma nova
maior e copiar os valores. Isto é, fazer a realocação já que java não tem isso: uma array nasce emorre com
o mesmo length.
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
    String dataDeEntrada;
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
        System.out.println("Data de Entrada do funcionário:" + dataDeEntrada);
    }
}


