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
public class TestaFibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int posicaoFinal = 6;
        int[] resultados = new int[posicaoFinal + 1];
        
        for (int i = 1; i <= posicaoFinal; i++){
            resultados[i] = fibonacci.calculaFibonacci(i);
            System.out.println(resultados[i]);
        }
    }
}
