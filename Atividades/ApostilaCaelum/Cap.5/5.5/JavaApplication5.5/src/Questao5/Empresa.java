/*
5) (opcional)Emvez demostrar apenas o salário de cada funcionário, você pode chamar ométodo mostra()
de cada Funcionario da sua array.
 */
package Questao5;

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
        for (Funcionario empregado : this.empregados) {
            empregado.mostra();
        }
    }
}
