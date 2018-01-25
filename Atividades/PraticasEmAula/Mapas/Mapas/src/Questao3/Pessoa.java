/*
3.  Crie	a	classe GerenciaPessoa,	que deve possuir	um	mapa	como	variável	de	
instância.	Esta	classe	deverá	possuir	um	método	de	adicionar	uma	pessoa	(para	
inserir	uma	pessoa	no	mapa)	e	um	método	para	obter	uma	pessoa	(para	obter	
uma	pessoa	do	mapa,	dado	um	CPF).	OBS.:	O	CPF	deve	ser	a	chave.
 */
package Questao3;

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

