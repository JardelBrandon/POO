/*
1) (Opcional) Transforme a classe Conta em uma interface.
public interface Conta {
    public double getSaldo();
    public void deposita(double valor);
    public void saca(double valor);
    public void atualiza(double taxaSelic);
}
Adapte ContaCorrente e ContaPoupanca para essa modificação:
class ContaCorrente implements Conta {
    // ...
}
class ContaPoupanca implements Conta {
    // ...
}
Algum código vai ter de ser copiado e colado? Isso é tão ruim?
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
        cc.deposita(2000);
        gerenciador.adiciona(cc);
        
        System.out.printf("O saldo é: %.2f", gerenciador.getTotal());
    }
    
}
