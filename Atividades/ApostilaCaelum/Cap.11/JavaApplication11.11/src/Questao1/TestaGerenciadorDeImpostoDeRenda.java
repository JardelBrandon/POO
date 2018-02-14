/*
1) Na classe Conta, modifique o método deposita(double x): Ele deve lançar uma exception chamada
IllegalArgumentException, que já faz parte da biblioteca do Java, sempre que o valor passado como
argumento for inválido (por exemplo, quando for negativo).
public void deposita(double valor) {
    if (valor < 0) {
        throw new IllegalArgumentException();
    } else {
        this.saldo += valor;
    }
}
 */
package Questao1;

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
        
        System.out.printf("O saldo é: %.2f", gerenciador.getTotal());
    }
    
}
