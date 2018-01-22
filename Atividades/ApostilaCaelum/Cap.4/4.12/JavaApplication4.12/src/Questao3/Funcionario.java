/*
3) Crie ummétodo mostra(), que não recebe nem devolve parâmetro algum e simplesmente imprime todos
os atributos do nosso funcionário. Dessa maneira, você não precisa ficar copiando e colando um monte
de System.out.println() para cada mudança e teste que fizer com cada um de seus funcionários, você
simplesmente vai fazer:

Funcionario f1 = new Funcionario();
// brincadeiras com f1....
f1.mostra();
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


