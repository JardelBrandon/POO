/*
1) Modele um funcionário. Ele deve ter o nome do funcionário, o departamento onde trabalha, seu salário
(double), a data de entrada no banco (String) e seu RG (String).
Você deve criar alguns métodos de acordo com sua necessidade. Além deles, crie um método
recebeAumento que aumenta o salario do funcionário de acordo com o parâmetro passado como argumento.
Crie também um método calculaGanhoAnual, que não recebe parâmetro algum, devolvendo
o valor do salário multiplicado por 12..
A ideia aqui é apenas modelar, isto é, só identique que informações são importantes e o que um funcionário
faz. Desenhe no papel tudo o que um Funcionario tem e tudo que ele faz.
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
    String dataDeEntrada;
    String rg;
    
    void recebeAumento(double valor){
        this.salario += valor;
    }
    
    double calculaGanhoAnual(){
        return this.salario * 12;
    }
}


