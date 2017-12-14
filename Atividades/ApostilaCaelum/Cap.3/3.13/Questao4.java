/*4) Imprima os fatoriais de 1 a 10.

O fatorial de um n�mero n � n * n-1 * n-2 ... at� n = 1. Lembre-se de utilizar os par�nteses.
O fatorial de 0 � 1
O fatorial de 1 � (0!) * 1 = 1
O fatorial de 2 � (1!) * 2 = 2
O fatorial de 3 � (2!) * 3 = 6
O fatorial de 4 � (3!) * 4 = 24

Fa�a um for que inicie uma vari�vel n (n�mero) como 1 e fatorial (resultado) como 1 e varia n de 1 at� 10:
	int fatorial = 1;
	for (int n = 1; n <= 10; n++) {
	}
*/

class Questao4{
	public static void main(String[] args){
		int fatorial = 1;
		
		for (int n = 1; n <= 10; n++){
			fatorial = fatorial * n;
			System.out.printf("O fatorial de %d � (%d!) * %d = %d\n", n, (n - 1), n, fatorial);
			
		}
	}
}
			