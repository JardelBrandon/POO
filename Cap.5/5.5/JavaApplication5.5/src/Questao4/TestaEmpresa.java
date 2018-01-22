/*
4) Percorra o atributo empregados da sua instância da Empresa e imprima os salários de todos seus funcionários.
Para fazer isso, você pode criar um método chamado mostraEmpregados dentro da classe Empresa:
 */
package Questao4;

/**
 *
 * @author jarde
 */
public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];
        
        for (int i = 0; i < 10; i++){
            Funcionario f = new Funcionario();
            f.salario = 1000 + i * 100;
            empresa.adiciona(f);
        }
        empresa.mostraEmpregados();
    }
}
