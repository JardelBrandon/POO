/*
8. Crie um programa Java que pe�a 10 n�meros inteiros e apresente: a m�dia, o maior
e o menor.
*/

import java.util.Scanner;

class mediaMaiorMenor{
	public static void main(String[] args){
		int quantidadeNumeros = 10, maior = 0 , menor = 0;
		int[] numeros = new int[quantidadeNumeros];//Vari�veis
		double media = 0;
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++){//Receber 10 n�meros informados pelo usu�rio 
			System.out.printf("Digite o %d� n�mero inteiro:", i + 1);
			numeros[i] = ler.nextInt();

			media += numeros[i];//Somar os n�meros para c�lculo da m�dia			
			if(i == 0){//Estrutura para definir o maior e menor n�mero digitados
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
		media /= quantidadeNumeros;//Dividir pelo quantidade de n�meros informados para c�lculo da m�dia
		//Imprimir m�dia, maior e menor n�meros informados
		System.out.printf("\nM�dia dos n�meros digitados: %f\nMaior n�mero digitado: %d\nMenor n�mero digitado: %d", media, maior, menor);
	}
}