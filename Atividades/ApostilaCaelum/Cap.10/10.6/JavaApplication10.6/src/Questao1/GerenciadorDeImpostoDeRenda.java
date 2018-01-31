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
package Questao1;

/**
 *
 * @author jarde
 */

package Questao1;

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
