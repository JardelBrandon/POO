/*
3) (opcional) Crie um GerenciadorDeImpostoDeRenda, que recebe todos os tributáveis de uma pessoa e
soma seus valores e inclua nele um método para devolver seu total:
class GerenciadorDeImpostoDeRenda {
    private double total;
    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);
        this.total += t.calculaTributos();
    }
    public double getTotal() {
        return this.total;
    }
}
Crie um main para instanciar diversas classes que implementam Tributavel e passar como argumento
para um GerenciadorDeImpostoDeRenda. Repare que você não pode passar qualquer tipo de conta para
o método adiciona, apenas a que implementa Tributavel. Além disso, pode passar o SeguroDeVida.
public class TestaGerenciadorDeImpostoDeRenda {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador =
        new GerenciadorDeImpostoDeRenda();
        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);
        System.out.println(gerenciador.getTotal());
    }
}
Repare que, de dentro do GerenciadorDeImpostoDeRenda, você não pode acessar o método getSaldo,
por exemplo, pois você não tem a garantia de que o Tributavel que vai ser passado como argumento tem
esse método. A única certeza que você tem é de que esse objeto tem os métodos declarados na interface
Tributavel.
É interessante enxergar que as interfaces (como aqui, no caso, Tributavel) costumam ligar classes muito
distintas, unindo-as por uma característica que elas tem em comum. No nosso exemplo, SeguroDeVida e
ContaCorrente são entidades completamente distintas, porém ambas possuem a característica de serem
tributáveis.
Se amanhã o governo começar a tributar até mesmo PlanoDeCapitalizacao, basta que essa classe
implemente a interface Tributavel! Repare no grau de desacoplamento que temos: a classe
GerenciadorDeImpostoDeRenda nem imagina que vai trabalhar como PlanoDeCapitalizacao. Para ela, o
único fato que importa é que o objeto respeite o contrato de um tributável, isso é, a interface Tributavel.
Novamente: programe voltado à interface, não à implementação.
Quais os benefícios de manter o código com baixo acoplamento?
 */
package Questao3;

/**
 *
 * @author jarde
 */
public class TestaGerenciadorDeImpostoDeRenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = 
                new GerenciadorDeImpostoDeRenda();
        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);
        
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);
        
        System.out.println(gerenciador.getTotal());
    }
    
}
