/*
9. Crie um programa Java que receba dois n�meros do usu�rio e que mostre a
quantidade de n�meros pares, a quantidade de n�meros �mpares e a soma entre os
dois n�meros informados.
*/

import java.util.Scanner;

class parImparSoma{
	public static void main(String[] args){
		int quantidadeNumeros = 2, par = 0, impar = 0, soma = 0;//Vari�veis
		int[] numeros = new int[quantidadeNumeros];
		Scanner ler = new Scanner(System.in);

		for(int i = 0; i < numeros.length; i++){//Receber os n�meros do usu�rios
			System.out.printf("Digite o %d� n�mero inteiro: ", i + 1);
			numeros[i] = ler.nextInt();
			
			soma += numeros[i];//Realiza a soma dos n�meros
			if(numeros[i] % 2 == 0){//Define se � par ou �mpar
				par += 1;
			}
			else{
				impar += 1;
			}
		}
		//Imprimir a quantidade de n�meros par e �mpar digitados e a soma dos n�meros
		System.out.println("Quantidade de n�meros par digitados: " + par);
		System.out.println("Quantidade de n�meros �mpar digitados: " + impar);
		System.out.println("Soma dos n�meros digitados: " + soma);
	}
}