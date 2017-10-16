/*
10. Faça um programa Java que leia um número e divida-o por dois (sucessivamente)
até que o resultado seja menor que 1. Mostre o resultado da última divisão e a
quantidade de divisões efetuadas.
*/

import java.util.Scanner;

class divisoes{
	public static void main(String[] args){
		int dividir = 2, quantidadeDivisoes = 0;//Variáveis
		double numero = 0, resultadoUltimaDivisao = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número:");//Receber um número
		numero = ler.nextDouble();
		resultadoUltimaDivisao = numero;
		
		while(resultadoUltimaDivisao >= 1){//Loop para definição do resultado da última divisão e a quantidade de divisões
			resultadoUltimaDivisao /= dividir; 
			quantidadeDivisoes++;
		}
		System.out.println("Resultado da última divisão: " + resultadoUltimaDivisao);
		System.out.println("Quantidade de divisões efetuadas : " + quantidadeDivisoes);
	}
}