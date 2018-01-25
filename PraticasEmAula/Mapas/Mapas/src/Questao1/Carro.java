/*
1. Crie	um	programa	em	Java	para	executar	o	trecho	de	código	do	slide	20	(isto	
inclui	você	criar	a	classe	Carro).
 */
package Questao1;

/**
 *
 * @author ifpb
 */
public class Carro {
    private String nome;
    private String ano;
    private String odometro; //Marcador de quilometragem

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOdometro() {
        return odometro;
    }

    public void setOdometro(String odometro) {
        this.odometro = odometro;
    }

    public Carro(String nome, String ano, String odometro) {
        this.nome = nome;
        this.ano = ano;
        this.odometro = odometro;
    }
    
    
}
