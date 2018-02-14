/*
2) Crie uma classe TestaDeposita com o método main. Crie uma ContaPoupanca e tente depositar valores
inválidos:
public static void main(String[] args) {
    Conta cp = new ContaPoupanca();
    cp.deposita(-100);
}
O que acontece?
 */
package Questao2;

/**
 *
 * @author jarde
 */
public class TestaDeposita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        cp.deposita(-100);
    }
    
}
