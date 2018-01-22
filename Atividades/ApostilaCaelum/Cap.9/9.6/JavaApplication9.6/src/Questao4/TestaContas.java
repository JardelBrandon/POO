/*
4) Reescreva ométodo atualiza() na classe ContaPoupanca para que a classe possa compilar normalmente.
O eclipse também sugere isso como um quick fix:
 */
package Questao4;

/**
 *
 * @author jarde
 */
public class TestaContas {
    public static void main(String[] args) {
        Conta c = new ContaCorrente(); 
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        c.atualiza(0.1);
        cc.atualiza(0.1);
        cp.atualiza(0.1);
        
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
    
}
