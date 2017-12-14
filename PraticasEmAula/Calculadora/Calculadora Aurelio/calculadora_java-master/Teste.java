import java.util.Scanner;

class Teste {
	public static void main(String[] args){
	float soma = 0, subtracao = 0, divisao = 0, multiplicacao = 0, primeiroValor = 0, segundoValor = 0;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o primeiro valor: ");
	primeiroValor = ler.nextFloat();
	System.out.println("Digite o segundo valor: ");
	segundoValor = ler.nextFloat();
	
	soma = Calculadora_Aurelio.soma(primeiroValor, segundoValor);
	subtracao = Calculadora_Aurelio.subtracao(primeiroValor, segundoValor);
	divisao = Calculadora_Aurelio.multiplicacao(primeiroValor, segundoValor);
	multiplicacao = Calculadora_Aurelio.divisao(primeiroValor, segundoValor);
	
	System.out.println("Resultado da soma: " + soma);
	System.out.println("Resultado da subtração: " + subtracao);
	System.out.println("Resultado da divisão: " + divisao);
	System.out.println("Resultado da multiplicação: " + multiplicacao);	
	}
}

