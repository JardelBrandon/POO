/*
4) (opcional) Use o método printf para imprimir o saldo com exatamente duas casas decimais:
System.out.printf("O saldo é: %.2f", cc.getSaldo());
 */
package Questao4;

/**
 *
 * @author jarde
 */
public class SeguroDeVida implements Tributavel{

    @Override
    public double calculaTributos() {
        return 42;
    }
    
}