/*
1) No capítulo anterior, você deve ter reparado que a versão recursiva para o problema de Fibonacci é lenta
porque toda hora estamos recalculando valores. Faça com que a versão recursiva seja tão boa quanto a
versão iterativa. (Dica: use arrays para isso)
 */
package Questao1;

/**
 *
 * @author jarde
 */
public class Fibonacci {
    int calculaFibonacci(int posicao){
        switch (posicao) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return calculaFibonacci(posicao - 1) + calculaFibonacci(posicao - 2);
        }
    }
}
