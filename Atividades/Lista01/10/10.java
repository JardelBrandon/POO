/*
10. Fa�a um programa Java que leia um n�mero e divida-o por dois (sucessivamente)
at� que o resultado seja menor que 1. Mostre o resultado da �ltima divis�o e a
quantidade de divis�es efetuadas.
*/

import java.util.Scanner;

class divisoes{
	public static void main(String[] args){
		int dividir = 2, quantidadeDivisoes = 0;//Vari�veis
		double numero = 0, resultadoUltimaDivisao = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um n�mero:");//Receber um n�mero
		numero = ler.nextDouble();
		resultadoUltimaDivisao = numero;
		
		while(resultadoUltimaDivisao >= 1){//Loop para defini��o do resultado da �ltima divis�o e a quantidade de divis�es
			resultadoUltimaDivisao /= dividir; 
			quantidadeDivisoes++;
		}
		System.out.println("Resultado da �ltima divis�o: " + resultadoUltimaDivisao);
		System.out.println("Quantidade de divis�es efetuadas : " + quantidadeDivisoes);
	}
}