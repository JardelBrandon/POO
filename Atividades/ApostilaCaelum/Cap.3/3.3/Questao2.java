/*2) Adicione c�digo (sem alterar as linhas que j� existem) na classe anterior para imprimir a m�dia mensal
de gasto, criando uma vari�vel mediaMensal junto com uma mensagem. Para isso, concatene a String
com o valor, usando "Valor da m�dia mensal = "+ mediaMensal.
*/

class Questao2BalancoTrimenstral{
	public static void main(String[] args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
	
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		double mediaMensal = gastosTrimestre/3;

		System.out.println(gastosTrimestre);
		System.out.println("Valor da m�dia mensal = " + mediaMensal);
		
	}
}