/*
2) A Empresa deve ter um método adiciona, que recebe uma referência a Funcionario como argumento e
guarda esse funcionário. Algo como:
void adiciona(Funcionario f) {
// algo tipo:
// this.empregados[ ??? ] = f;
// mas que posição colocar?
}
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


