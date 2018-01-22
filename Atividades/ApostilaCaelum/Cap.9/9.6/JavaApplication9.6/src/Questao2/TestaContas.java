/*
2) Para que o código do main volte a compilar, troque o new Conta() por new ContaCorrente().
Se não podemos dar new em Conta, qual é a utilidade de ter ummétodo que recebe uma referência a Conta
como argumento? Aliás, posso ter isso?
 */
package Questao2;

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
