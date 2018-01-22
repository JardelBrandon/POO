/*
9) (opcional-avançado) Crie um método na classe Data que devolva o valor formatado da data, isto é, devolva
uma String com “dia/mes/ano”. Isso para que o método mostra da classe Funcionario possa ficar assim:

class Funcionario {
    // atributos e metodos

    void mostra() {
        // imprime outros atributos...
        System.out.println("Data de entrada: " + this.dataDeEntrada.formatada());
    }
}
 */
package Questao9;

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


