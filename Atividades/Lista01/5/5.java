/*
5. Crie um programa em Java para receber um n�mero entre 1 e 12 e imprimir o nome
do m�s correspondente (em que, 1 � Janeiro e 12 � Dezembro). Crie um m�todo em
Java que dever� receber o n�mero e realizar a impress�o.
*/

import java.util.Scanner;

class imprimir{
	public static void imprimirMes(int mes){//M�todo para imprimir o m�s que foi digitado
	String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", 
				"Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

	for(int i = 0; i < meses.length; i++){ //Encontra o m�s digitado e imprime seu respectivo nome
		if(i == (mes - 1)){
			System.out.println("Respectivo m�s do n�mero digitado: " + meses[i]);
			break;
			}
		}
	}
}

class mes{
	public static void main(String[] args){
		int mesRecebido; //Vari�veis
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro entre 1 e 12:"); //Receber o n�mero que representa o m�s
		mesRecebido = ler.nextInt();
		imprimir.imprimirMes(mesRecebido); //Invoca o m�todo passando como par�metro o n�mero recebido
	}
}