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
public class TestaFuncionario {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Funcionario novoFuncionario = new Funcionario();
        
        novoFuncionario.nome = "Jardel";
        novoFuncionario.salario = 1000;
        novoFuncionario.rg = "387.945.957";

        
        Data data = new Data();
        novoFuncionario.dataDeEntrada = data;
        
        novoFuncionario.dataDeEntrada.dia = 9;
        novoFuncionario.dataDeEntrada.mes = 12;
        novoFuncionario.dataDeEntrada.ano = 2009;
        
        novoFuncionario.mostra();
    }
}
