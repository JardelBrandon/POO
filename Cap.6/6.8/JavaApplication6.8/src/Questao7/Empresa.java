/*
7) (opcional) Na classe Empresa, em vez de criar um array de tamanho fixo, receba como parâmetro no
construtor o tamanho do array de Funcionario.
Com esse construtor, o que acontece se tentarmos dar new Empresa() sem passar argumento algum? Por
quê?
 */
package Questao7;

/**
 *
 * @author jarde
 */
public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] empregados;
    
    Empresa(int tamanhoDoArrayDeFuncionarios){
        this.empregados = new Funcionario[tamanhoDoArrayDeFuncionarios];
    }
    
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
