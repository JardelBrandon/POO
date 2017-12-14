/*
9. Crie um programa Java que receba dois números do usuário e que mostre a
quantidade de números pares, a quantidade de números ímpares e a soma entre os
dois números informados.
*/

import java.util.Scanner;

class parImparSoma{
	public static void main(String[] args){
		int quantidadeNumeros = 2, par = 0, impar = 0, soma = 0;//Variáveis
		int[] numeros = new int[quantidadeNumeros];
		Scanner ler = new Scanner(System.in);

		for(int i = 0; i < numeros.length; i++){//Receber os números do usuários
			System.out.printf("Digite o %dº número inteiro: ", i + 1);
			numeros[i] = ler.nextInt();
			
			soma += numeros[i];//Realiza a soma dos números
			if(numeros[i] % 2 == 0){//Define se é par ou ímpar
				par += 1;
			}
			else{
				impar += 1;
			}
		}
		//Imprimir a quantidade de números par e ímpar digitados e a soma dos números
		System.out.println("Quantidade de números par digitados: " + par);
		System.out.println("Quantidade de números ímpar digitados: " + impar);
		System.out.println("Soma dos números digitados: " + soma);
	}
}