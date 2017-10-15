/*
2. Crie um programa Java que determine a idade atual da pessoa, baseado no ano de
nascimento.
*/

import java.util.Scanner;
import java.util.Calendar;

class idade{
	public static void main(String[] args){
		int anoAtual, anoNascimento, idade;//Variáveis
		Scanner ler = new Scanner(System.in);

		Calendar calendarioAtual = Calendar.getInstance();//Ano Atual
		anoAtual = calendarioAtual.get(Calendar.YEAR);
		//System.out.println("Data/Hora Atual:" + anoAtual);

		System.out.println("Digite o ano do seu nascimento:");//Ano do nascimento
		anoNascimento = ler.nextInt();
		idade = anoAtual - anoNascimento;
		System.out.println("Sua idade atual é: " + idade + "anos");	
	}
}
