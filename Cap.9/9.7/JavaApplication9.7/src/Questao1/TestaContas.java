/*
1) Não podemos dar new em Conta, mas por que, então, podemos dar new em Conta[10], por exemplo?
 */
package Questao1;

/**
 *
 * @author jarde
 */
public class TestaContas {
    public static void main(String[] args) {
        Conta[] c = new Conta[10]; 
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        c[0] = new ContaPoupanca();
        c[0].deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        c[0].atualiza(0.1);
        cc.atualiza(0.1);
        cp.atualiza(0.1);
        
        System.out.println(c[0].getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
    
}
