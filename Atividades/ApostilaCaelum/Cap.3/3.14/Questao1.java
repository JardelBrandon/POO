/*
Desafio:
1) Faça o exercício da série de Fibonacci usando apenas duas variáveis.
 */
class Questao1{
    public static void main(String[] args){
        long primeiroElemento = 0;
        long segundoElemento = 1;

        for (int n = 0; n <= 100; n++) {
            if (n < 2) {
                System.out.printf("A sequência de Fibonacci na posição %d é = %d\n", n, n);
            }
            else {
                segundoElemento = primeiroElemento + segundoElemento;
                primeiroElemento = segundoElemento - primeiroElemento;
                System.out.printf("A sequência de Fibonacci na posição %d é = %d\n", n, segundoElemento);

            }
        }
    }
}
