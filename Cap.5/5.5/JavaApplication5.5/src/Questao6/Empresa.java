/*
6) (Opcional) Crie um método para verificar se um determinado Funcionario se encontra ou não como
funcionário desta empresa:
 */
package Questao6;

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
    
    boolean contem(Funcionario f){
        for (Funcionario empregado : this.empregados){
            if(empregado == f){
                return true;
            }
        }
        return false;
    }
}
