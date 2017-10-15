/*
4. Crie um programa Java para verificar se o aluno foi aprovado (média maior ou igual
a 7,0), se vai fazer final (média maior ou igual a 5,0 e menor do que 7,0) ou se foi
reprovado (média abaixo de 5,0). O usuário deverá informar 4 notas.
*/

import java.util.Scanner;

class mediaSituacao{
	public static void main(String[] args){
		double[] notas = new double[4];//Variáveis
		double media = 0;
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < notas.length; i++){ //Receber as notas
			System.out.printf("Digite a %dºnota:", i + 1);
			notas[i] = ler.nextDouble();
			media += notas[i];
		}
		media /= notas.length; //Cálculo da média

		System.out.println("Média final do aluno: " + media);//Imprimir média
		if (media >= 7){//Verificar e imprimir a situação do aluno de acordo com a média
			System.out.println("Aluno aprovado!");
		}
		else if (media >= 5 && media < 7){
			System.out.println("Aluno classificado para a prova final!");
		}
		else{
			System.out.println("Aluno Reprovado!");
		}
	}
}