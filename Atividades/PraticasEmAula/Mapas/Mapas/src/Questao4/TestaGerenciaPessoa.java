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
public class TestaGerenciaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GerenciaPessoa gerenciador = new GerenciaPessoa();
        Pessoa novaPessoa1 = new Pessoa("Jardel", 22, "099.153.964-81");
        Pessoa novaPessoa2 = new Pessoa("Brandon", 21, "199.153.964-81");
        Pessoa novaPessoa3 = new Pessoa("Jamerson", 18, "099.153.964-00");
        Pessoa novaPessoa4 = new Pessoa("Fran", 22, "116.533.834-37");
        Pessoa novaPessoa5 = new Pessoa("asdf", 2, "000.153.964-81");
        
        gerenciador.setPessoaNoMapa(novaPessoa1);
        gerenciador.setPessoaNoMapa(novaPessoa2);
        gerenciador.setPessoaNoMapa(novaPessoa3);
        gerenciador.setPessoaNoMapa(novaPessoa4);
        gerenciador.setPessoaNoMapa(novaPessoa5);
        
        gerenciador.getPessoaNoMapa("099.153.964-81");
        gerenciador.getPessoaNoMapa("2");
    }
    
}
