/*1) Na empresa onde trabalhamos, h� tabelas com o quanto foi gasto em cada m�s. Para fechar o balan�o do
primeiro trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos 15000 reais,
em Fevereiro, 23000 reais e em Mar�o, 17000 reais, fa�a um programa que calcule e imprima o gasto total
no trimestre. Siga esses passos:

	a) Crie uma classe chamada BalancoTrimestral com um bloco main, como nos exemplos anteriores;
	b) Dentro do main (o miolo do programa), declare uma vari�vel inteira chamada gastosJaneiro e
	inicialize-a com 15000;
	c) Crie tamb�m as vari�veis gastosFevereiro e gastosMarco, inicializando-as com 23000 e 17000, respectivamente,
	utilize uma linha para cada declara��o;
	d) Crie uma vari�vel chamada gastosTrimestre e inicialize-a com a soma das outras 3 vari�veis:
	int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
	e) Imprima a vari�vel gastosTrimestre.
/*

class Questao1BalancoTrimenstral{
	public static void main(String[] args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

		System.out.println(gastosTrimestre);
	}
}