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
