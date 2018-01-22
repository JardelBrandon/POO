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
public class TestaPessoaFisica {
    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica("099.153.964-81");
        pessoa.setNome("Jardel");
        PessoaFisica novaPessoa = new PessoaFisica(null);
        novaPessoa.setNome("Sim");
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Cpf: " + pessoa.getCpf());
        System.out.println("Nome: " + novaPessoa.getNome());
        System.out.println("Cpf: " + novaPessoa.getCpf());
    }
}
