/*
1) Repare que a nossa classe Conta é uma excelente candidata para uma classe abstrata. Por quê? Que
métodos seriam interessantes candidatos a serem abstratos?
Transforme a classe Conta em abstrata, repare o que acontece no seu main já existente do TestaContas.
public abstract class Conta {
// ...
}
 */
package Questao1;

/**
 *
 * @author jarde
 */
public class TestaContas {
    public static void main(String[] args) {
        //Conta c = new Conta(); //Linha que aconterce o erro
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        //c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        //c.atualiza(0.1);
        cc.atualiza(0.1);
        cp.atualiza(0.1);
        
        //System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
    
}
