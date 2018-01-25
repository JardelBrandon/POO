/*
2.  Crie 	a	classe Pessoa,	que deve possuir	um	construtor que receba como
parâmetro	o	nome, a	idade	e	o	CPF.	OBS:	Crie	geqers	e	seqers.
 */
package Questao2;

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

