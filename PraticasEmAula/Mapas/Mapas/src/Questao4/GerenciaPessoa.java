/*
4.  Você	deverá	criar	uma	classe	principal	que	insere	no	objeto	GerenciaPessoa
cinco	pessoas.	Teste	também	a	recuperação	de	uma	pessoa,	dado	um	CPF	que	
você	previamente	inseriu.
 */
package Questao4;

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
