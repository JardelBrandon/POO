/*
7. Suponha que o conceito de um aluno seja determinado em função da sua nota.
Suponha, também, que esta nota seja um valor inteiro na faixa de 0 a 100, conforme
a seguinte faixa:

Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 a 100 Ótimo
*/

import java.util.Scanner;

class conceitoAluno{
	public static void main(String[] args){
		double nota = 0; //Variáveis
		String[] conceito = {"Ótimo", "Bom", "Regular", "Insuficiente"};
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a nota do aluno (0 a 100) : ");//Receber a nota do respectivo aluno 
		nota = ler.nextDouble();
		if(nota < 0 || nota > 100){
			System.out.println("Foi digitado uma nota inválida!");
		}
		else{ 
			if(nota >=85 && nota <= 100){
				System.out.println("Conceito do aluno em função da nota: " + conceito[0]);
			}
			else if(nota >= 65 && nota <= 84){
				System.out.println("Conceito do aluno em função da nota: " + conceito[1]);
			}
			else if(nota >= 50 && nota <= 64){
				System.out.println("Conceito do aluno em função da nota: " + conceito[2]);
			}
			else{
				System.out.println("Conceito do aluno em função da nota: " + conceito[3]);
			}
		}
	}
}