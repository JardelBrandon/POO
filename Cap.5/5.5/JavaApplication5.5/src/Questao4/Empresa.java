/*
4) Percorra o atributo empregados da sua instância da Empresa e imprima os salários de todos seus funcionários.
Para fazer isso, você pode criar um método chamado mostraEmpregados dentro da classe Empresa:
 */
package Questao4;

/**
 *
 * @author jarde
 */
public class Empresa {
    String nome;
    String cnpj;
    Funcionario[] empregados;
    
    void adiciona(Funcionario f) {
        for (int i = 0; i < this.empregados.length; i++){
            if (this.empregados[i] == null){
                this.empregados[i] = f;
                break;
            }
        }
    }
        
    void mostraEmpregados() {
        for (int i = 0; i < this.empregados.length; i++){
            System.out.println("Funcionário na posição: " + i);
            System.out.println("Nome: " + this.empregados[i].nome);
            System.out.println("Salário: " + this.empregados[i].salario);
        }
    }
}
