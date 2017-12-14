/*
5. Crie um programa em Java para receber um número entre 1 e 12 e imprimir o nome
do mês correspondente (em que, 1 – Janeiro e 12 – Dezembro). Crie um método em
Java que deverá receber o número e realizar a impressão.
*/

import java.util.Scanner;

class imprimir{
	public static void imprimirMes(int mes){//Método para imprimir o mês que foi digitado
	String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", 
				"Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

	for(int i = 0; i < meses.length; i++){ //Encontra o mês digitado e imprime seu respectivo nome
		if(i == (mes - 1)){
			System.out.println("Respectivo mês do número digitado: " + meses[i]);
			break;
			}
		}
	}
}

class mes{
	public static void main(String[] args){
		int mesRecebido; //Variáveis
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número inteiro entre 1 e 12:"); //Receber o número que representa o mês
		mesRecebido = ler.nextInt();
		imprimir.imprimirMes(mesRecebido); //Invoca o método passando como parâmetro o número recebido
	}
}