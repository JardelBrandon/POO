/*2) Adicione código (sem alterar as linhas que já existem) na classe anterior para imprimir a média mensal
de gasto, criando uma variável mediaMensal junto com uma mensagem. Para isso, concatene a String
com o valor, usando "Valor da média mensal = "+ mediaMensal.
*/

class Questao2BalancoTrimenstral{
	public static void main(String[] args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
	
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		double mediaMensal = gastosTrimestre/3;

		System.out.println(gastosTrimestre);
		System.out.println("Valor da média mensal = " + mediaMensal);
		
	}
}