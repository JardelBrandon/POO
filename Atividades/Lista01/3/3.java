/*
3. O sistema de avalia��o de determinada disciplina, � composto por tr�s provas. A
primeira prova tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. Fa�a um
programa em Java para calcular a m�dia final de um aluno desta disciplina.
*/

import java.util.Scanner;

class media{
	public static void main(String[] args){
		double[] notas = new double[3];
		double media;
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++){
			System.out.printf("Digite a %d�nota:", i + 1);
			notas[i] = ler.nextDouble();
		}
		notas[0] *= 0.2;
		notas[1] *= 0.3;
		notas[2] *= 0.5;
		media = notas[0] + notas[1] + notas[2];
		System.out.println("M�dia final do aluno na disciplina:" + media);
	}
}