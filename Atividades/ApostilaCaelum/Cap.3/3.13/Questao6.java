/*
6) (opcional) Imprima os primeiros números da série de Fibonacci até passar de 100. A série de Fibonacci
é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la,
o primeiro elemento vale 0, o segundo vale 1, daí
por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).
*/

class Questao6{
    public static void main(String[] args){
        long primeiroElemento = 0;
        long segundoElemento = 1;

        for (int n = 0; n <= 100; n++) {
            if (n < 2) {
                System.out.printf("A sequência de Fibonacci na posição %d é = %d\n", n, n);
            }
            else {
                long fibonacci = primeiroElemento + segundoElemento;
                primeiroElemento = segundoElemento;
                segundoElemento = fibonacci;
                System.out.printf("A sequência de Fibonacci na posição %d é = %d\n", n, fibonacci);
            }
        }
    }
}
