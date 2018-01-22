/*
1) Um método pode chamar ele mesmo. Chamamos isso de recursão. Você pode resolver a série de Fibonacci
usando um método que chama ele mesmo. O objetivo é você criar uma classe, que possa ser usada
da seguinte maneira:

Fibonacci fibonacci = new Fibonacci();
for (int i = 1; i <= 6; i++) {
    int resultado = fibonacci.calculaFibonacci(i);
    System.out.println(resultado);
}
Aqui imprimirá a sequência de Fibonacci até a sexta posição, isto é: 1, 1, 2, 3, 5, 8.
Este método calculaFibonacci não pode ter nenhum laço, só pode chamar ele mesmo como método.
Pense nele como uma função, que usa a própria função para calcular o resultado.
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
