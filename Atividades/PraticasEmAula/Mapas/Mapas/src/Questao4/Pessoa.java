/*
4.  Você	deverá	criar	uma	classe	principal	que	insere	no	objeto	GerenciaPessoa
cinco	pessoas.	Teste	também	a	recuperação	de	uma	pessoa,	dado	um	CPF	que	
você	previamente	inseriu.
 */
package Questao4;

/**
 *
 * @author ifpb
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

