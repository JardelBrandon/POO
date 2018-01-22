/*
9) (opcional) Crie a classe PessoaFisica. Queremos ter a garantia de que pessoa física alguma tenha CPF invalido,
nem seja criada PessoaFisica sem cpf inicial. (você não precisa escrever o algoritmo de validação
de cpf, basta passar o cpf por um método valida(String x)...)
 */
package Questao9;

/**
 *
 * @author jarde
 */
public class PessoaFisica {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public PessoaFisica(String cpf) {
        if(this.valida(cpf)){
            this.cpf = cpf;
        }
        else{
            this.cpf = "Inválido";
        }
    }
    
    private boolean valida(String x){
        return x != null;
    }
}
