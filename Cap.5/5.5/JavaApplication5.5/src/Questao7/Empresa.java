/*
7) (Opcional) Caso a array já esteja cheia no momento de adicionar um outro funcionário, criar uma nova
maior e copiar os valores. Isto é, fazer a realocação já que java não tem isso: uma array nasce emorre com
o mesmo length.
 */
package Questao7;

/**
 *
 * @author jarde
 */
public class Empresa {
    String nome;
    String cnpj;
    Funcionario[] empregados;
    
    void adiciona(Funcionario novo) {
        for (int i = 0; i <= this.empregados.length; i++){
            if (i == this.empregados.length){ //Array cheio
                Funcionario[] arrayCheio = this.empregados;
                this.empregados = new Funcionario[i * 2];
                for (int x = 0; x < this.empregados.length; x++){
                    if (x < i){
                        this.empregados[x] = arrayCheio[x];
                    }
                    else{
                        if (this.empregados[x] == null){
                            this.empregados[x] = novo;
                            break;
                        }
                    }
                }
            }
            
            if (this.empregados[i] == null){
                this.empregados[i] = novo;
                break;
            }
        }
    }
        
    void mostraEmpregados() {
        int posicao = 0;
        for (Funcionario empregado : this.empregados) {
            if (empregado != null){
                System.out.println("Posição do funcionário: " + posicao++);
                empregado.mostra();
            }
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
