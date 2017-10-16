/*
8. Crie um programa Java que peça 10 números inteiros e apresente: a média, o maior
e o menor.
*/

import java.util.Scanner;

class mediaMaiorMenor{
	public static void main(String[] args){
		int quantidadeNumeros = 10, maior = 0 , menor = 0;
		int[] numeros = new int[quantidadeNumeros];//Variáveis
		double media = 0;
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++){//Receber 10 números informados pelo usuário 
			System.out.printf("Digite o %dº número inteiro:", i + 1);
			numeros[i] = ler.nextInt();

			media += numeros[i];//Somar os números para cálculo da média			
			if(i == 0){//Estrutura para definir o maior e menor número digitados
				maior = numeros[i];
				menor = numeros[i];
			}
			else{
				if(numeros[i] > maior){
					maior = numeros[i];
				}
				if(numeros[i] < menor){
					menor = numeros[i];
				}
			}	
		}
		media /= quantidadeNumeros;//Dividir pelo quantidade de números informados para cálculo da média
		//Imprimir média, maior e menor números informados
		System.out.printf("\nMédia dos números digitados: %f\nMaior número digitado: %d\nMenor número digitado: %d", media, maior, menor);
	}
}