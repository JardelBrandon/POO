package Questao5;

/*
5) Crie sua própria Exception, ValorInvalidoException. Para isso, você precisa criar uma classe com esse
nome que seja filha de RuntimeException.
public class ValorInvalidoException extends RuntimeException {
}
Lance-a em vez de IllegalArgumentException. Quais alterações você teve que fazer nas classes Conta e
na TestaDeposita?

Resposta:
A classe Conta foi alterada da seguinte maneira, no lugar de:
    if (valor < 0){
        throw new IllegalArgumentException("Você tentou depositar "
                                            + "um valor negativo");
    }
Foi introduzida a seguinte modificação:
    if (valor < 0){
        throw new ValorInvalidoException();
    }

A classe TestaDeposita foi alterada da seguinte maneira, no lugar de:
    catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
    }
Foi introduzida a seguinte modificação:
    catch(ValorInvalidoException e){
        System.out.println(e);
    }
 */

