/*
1) Volte ao nosso sistema de Funcionario e crie uma classe Empresa dentro do mesmo arquivo .java. A
Empresa tem um nome, cnpj e uma referência a uma array de Funcionario, além de outros atributos que
você julgar necessário.
 */
package Questao1;

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
