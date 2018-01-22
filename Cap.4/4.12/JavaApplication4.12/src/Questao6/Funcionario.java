/*
6) (opcional) Em vez de utilizar uma String para representar a data, crie uma outra classe, chamada Data.
Ela possui ì campos int, para dia, mês e ano. Faça com que seu funcionário passe a usá-la. (é parecido
com o último exemplo, em que a Conta passou a ter referência para um Cliente).
 */
package Questao6;

import Questao5.*;

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
        System.out.println("Salário atual:" + this.salario);
        System.out.println("Ganho anual:" + this.calculaGanhoAnual());
        System.out.println("Data de Entrada do funcionário:" + this.dataDeEntrada);
        System.out.println("RG do funcionário:" + this.rg);
    }
}


