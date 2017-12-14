/*
5) No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos, até
        20, 30, 40. Em um determinado momento, além desse cálculo demorar, vai começar a mostrar respostas
        completamente erradas. Por quê?
        Mude de int para long para ver alguma mudança.
*/

class Questao5{
    public static void main(String[] args){
        long fatorial = 1;

        for (int n = 1; n <= 40; n++){
            fatorial = fatorial * n;
            System.out.printf("O fatorial de %d é (%d!) * %d = %d\n", n, (n - 1), n, fatorial);

        }
    }
}
