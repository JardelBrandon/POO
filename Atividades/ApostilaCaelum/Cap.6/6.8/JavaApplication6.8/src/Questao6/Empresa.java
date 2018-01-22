/*
6) (opcional) Crie os getters e setters da sua classe Empresa e coloque seus atributos como private. Lembrese
de que não necessariamente todos os atributos devem ter getters e setters.
Por exemplo, na classe Empresa, seria interessante ter um setter e getter para a sua array de funcionários?
Não seria mais interessante ter um método como este?
class Empresa {
// ...
    public Funcionario getFuncionario (int posicao) {
        return this.empregados[posicao];
    }
}
 */
package Questao6;

/**
 *
 * @author jarde
 */
public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] empregados;
    
    void adiciona(Funcionario f) {
        for (int i = 0; i < this.empregados.length; i++){
            if (this.empregados[i] == null){
                this.empregados[i] = f;
                break;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario getFuncionario(int posicao) {
        return this.empregados[posicao];
    }

    public void setEmpregados(Funcionario[] empregados) {
        this.empregados = empregados;
    }
        
    void mostraEmpregados() {
        for (Funcionario empregado : this.empregados) {
            empregado.mostra();
        }
    }
}
