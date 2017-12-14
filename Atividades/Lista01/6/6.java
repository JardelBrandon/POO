/*
6. Um hotel cobra R$ 60.00 a di�ria e mais uma taxa de servi�os. A taxa de servi�os �
de:
� R$ 5.50 por di�ria, se o n�mero de di�rias for maior que 15;
� R$ 6.00 por di�ria, se o n�mero de di�rias for igual a 15;
� R$ 8.00 por di�ria, se o n�mero de di�rias for menor que 15.
� Construa um programa Java que mostre o nome e o total da conta de um
cliente.
*/

import java.util.Scanner;

class valorDiarias{
	public static void main(String[] args){
		double valor = 60, valorMais15Dias = 5.5, valor15Dias = 6.0, valorMenos15Dias = 8.0; //Vari�veis
		int diarias = 0; 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de di�rias : ");//Receber n�mero de di�rias 
		diarias = ler.nextInt();

		valor *= diarias;//C�lcula o valor das di�rias acrescidas da taxa de servi�os em rela��o ao tempo de est�dia
		if(diarias > 15){
			valor += (diarias * valorMais15Dias);
		}	
		else if(diarias == 15){
			valor += (diarias * valor15Dias);
		}
		else{
			valor += (diarias * valorMenos15Dias);
		}
		System.out.println("Valor a ser cobrado : " + valor);//Imprime o pre�o total 
	}
}