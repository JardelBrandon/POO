import java.util.Scanner;

class Fibonacci{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		int primeiroTermo = 0;		
		int segundoTermo = 1;
		int soma;
		int posicao;		
		System.out.println("Digite a n-ésima posição do sitema Fibonnaci que deseja receber");
		posicao = ler.nextInt();

		if (posicao == 0){
			System.out.println("0º Termo do sistema Fibonnaci:0");
		}else{
			System.out.println("0º Termo do sistema Fibonnaci:0");
			for (int i = 1; i <= posicao; i++){
				soma = primeiroTermo + segundoTermo;
				System.out.println(i + "º Termo do sistema Fibonnaci:" + soma);	
				primeiroTermo = segundoTermo;
				segundoTermo = soma;
			}
		}
	}
}