/*
1. Crie um programa Java para receber uma velocidade em m/s e alterar para km/h.
*/
import java.util.Scanner;

class velocidade{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		double velocidadeMs;
		System.out.println("Digite a velocidade em M/s para converter em Km/h:");
		velocidadeMs = ler.nextFloat();
		double velocidadeKmh = velocidadeMs * 3.6;
		System.out.println("Velocidade convertida: " + velocidadeKmh + "Km/h");
	}
} 		