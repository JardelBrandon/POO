/*
6. Um hotel cobra R$ 60.00 a diária e mais uma taxa de serviços. A taxa de serviços é
de:
• R$ 5.50 por diária, se o número de diárias for maior que 15;
• R$ 6.00 por diária, se o número de diárias for igual a 15;
• R$ 8.00 por diária, se o número de diárias for menor que 15.
• Construa um programa Java que mostre o nome e o total da conta de um
cliente.
*/

import java.util.Scanner;

class valorDiarias{
	public static void main(String[] args){
		double valor = 60, valorMais15Dias = 5.5, valor15Dias = 6.0, valorMenos15Dias = 8.0; //Variáveis
		int diarias = 0; 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número de diárias : ");//Receber número de diárias 
		diarias = ler.nextInt();

		valor *= diarias;//Cálcula o valor das diárias acrescidas da taxa de serviços em relação ao tempo de estádia
		if(diarias > 15){
			valor += (diarias * valorMais15Dias);
		}	
		else if(diarias == 15){
			valor += (diarias * valor15Dias);
		}
		else{
			valor += (diarias * valorMenos15Dias);
		}
		System.out.println("Valor a ser cobrado : " + valor);//Imprime o preço total 
	}
}