/*
3.  Crie	a	classe GerenciaPessoa,	que deve possuir	um	mapa	como	variável	de	
instância.	Esta	classe	deverá	possuir	um	método	de	adicionar	uma	pessoa	(para	
inserir	uma	pessoa	no	mapa)	e	um	método	para	obter	uma	pessoa	(para	obter	
uma	pessoa	do	mapa,	dado	um	CPF).	OBS.:	O	CPF	deve	ser	a	chave.
 */
package Questao3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ifpb
 */
public class GerenciaPessoa {
    Map<String, Pessoa> mapa = new HashMap<>();
    
    public void setPessoaNoMapa(Pessoa pessoa){
        this.mapa.put(pessoa.getCpf(), pessoa);
    }
    
    public Pessoa getPessoaNoMapa(String cpf){
        if (mapa.containsKey(cpf)){
            Pessoa pessoaReferenciada = mapa.get(cpf);
            System.out.println("Retornando a pessoa: " + pessoaReferenciada.getNome());
            return pessoaReferenciada;
        }
        else{
            System.out.println("Cpf não encontrado!");
            return null;
        }
    }
}
