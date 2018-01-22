/*
3) Apenas para entendermelhor o abstract, comente o método atualiza() da ContaPoupanca, dessa forma
ele herdará o método diretamente de Conta.
Transforme o método atualiza() da classe Conta em abstrato. 
Sua classe Conta deve ficar parecida com:
public abstract class Conta {
    // atributos e métodos que já existiam
    public abstract void atualiza(double taxaSelic);
}
Qual é o problema com a classe ContaPoupanca?
 */
package Questao3;

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
