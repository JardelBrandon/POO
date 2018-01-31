/*
4) (opcional) Use o método printf para imprimir o saldo com exatamente duas casas decimais:
System.out.printf("O saldo é: %.2f", cc.getSaldo());
 */
package Questao4;

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
