/*
12. Desenvolva um programa em Java que calcule os quadrados e cubos dos números de
0 a 10 e imprima os valores resultantes conforme a tabela abaixo.

Número		Quadrado	Cubo
0		 0 		0
1 		 1 		1
2		 4 		8
3 		 9 		27
4 		 16 		64
5		 25 		125
6		 36 		216
7 		 49 		343
8 		 64		512
9 		 81		729
10 		 100		1000
*/

class numeroSeuQuadradoSeuCubo{
	public static void imprimirTabelaNumeroQuadradoCubo(int intervaloInicial, int intervaloFinal){
		int numero = 0, quadrado = 0, cubo = 0;
		System.out.println("**************************************");
		System.out.println("Número	Quadrado    Cubo");
		for(int i = intervaloInicial; i <= intervaloFinal; i++){
			numero = i;
			quadrado = (numero * numero);
			cubo = (quadrado * numero);
 			System.out.printf("%d         %d         %d\n",numero, quadrado, cubo);
		}
		System.out.println("**************************************");
	}
	
	public static void main(String[] args){
		int valorInicial = 0, valorFinal = 10;
		imprimirTabelaNumeroQuadradoCubo(valorInicial, valorFinal);
	}
}


