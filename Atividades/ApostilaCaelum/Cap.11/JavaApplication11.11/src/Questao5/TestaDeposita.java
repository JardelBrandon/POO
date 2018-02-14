/*
5) Crie sua própria Exception, ValorInvalidoException. Para isso, você precisa criar uma classe com esse
nome que seja filha de RuntimeException.
public class ValorInvalidoException extends RuntimeException {
}
Lance-a em vez de IllegalArgumentException. Quais alterações você teve que fazer nas classes Conta e
na TestaDeposita?
 */
package Questao5;

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
        try{
            cp.deposita(-100);
        }
        catch(ValorInvalidoException e){
            System.out.println(e);
        }
    }
    
}
