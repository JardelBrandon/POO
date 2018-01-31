/*
4) (opcional) Use o método printf para imprimir o saldo com exatamente duas casas decimais:
System.out.printf("O saldo é: %.2f", cc.getSaldo()); */
package Questao4;

/**
 *
 * @author jarde
 */
public class GerenciadorDeImpostoDeRenda {
    private double total;
    
    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);
        this.total += t.calculaTributos();
    }
    
    public double getTotal() {
        return this.total;
    }
}
