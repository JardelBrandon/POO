import java.util.Scanner;

class TesteOperacoes {
	public static void operacaoCalculadora(float primeiroValor, String modo, float segundoValor){
		float soma = 0, subtracao = 0, divisao = 0, multiplicacao = 0;
		switch (modo){
			case "+" :
				soma = Calculadora_Aurelio.soma(primeiroValor, segundoValor);	
				System.out.println("Resultado da soma: " + soma);
				break;

			case "-" :
				subtracao = Calculadora_Aurelio.subtracao(primeiroValor, segundoValor);
				System.out.println("Resultado da subtração: " + subtracao);
				break;

			case "/" :
				multiplicacao = Calculadora_Aurelio.divisao(primeiroValor, segundoValor);
				System.out.println("Resultado da multiplicação: " + multiplicacao);
				break;

			case "*" :
				divisao = Calculadora_Aurelio.multiplicacao(primeiroValor, segundoValor);
				System.out.println("Resultado da divisão: " + divisao);
				break;
		}


	}

	public static void main(String[] args){
	float primeiroValor = 0, segundoValor = 0;
	String operacao;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o primeiro valor: ");
	primeiroValor = ler.nextFloat();
	System.out.println("Digite a operação que deseja realizar entre os valores");
	System.out.printf("(+) Para adição/ (-) Para subtração(*) Para multiplicação/ (/) Para divisão :");
	operacao = ler.next();
	System.out.println("Digite o segundo valor: ");
	segundoValor = ler.nextFloat();
	
	operacaoCalculadora(primeiroValor, operacao, segundoValor);
	}
}
