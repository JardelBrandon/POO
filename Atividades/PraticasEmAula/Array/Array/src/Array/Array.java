package Array;

import java.util.Scanner;


public class Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] numeros = new float[10];
		float numero;
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++){
			System.out.printf("Digite o %dº número para lista: ", i + 1);
			numero = ler.nextFloat();
			numeros[i] = numero;
		}
		System.out.println("Imprimindo Lista");
		for(float x : numeros){
			System.out.println(x);
		}

	}
}
