/*
11. O cardápio de uma lanchonete é o seguinte.

Código 	Produto 		Preço unitário (R$)
10	Pastel de carne 	1,50
11 	Coxinha de frango 	1,80
12 	Empada de frango 	1,90
20 	Hamburguer 		10,00
30 	Pizza 			8,00
50 	Suco 			2,50

Escreva um programa em Java que leia quantos produtos foram pedidos, o código
de cada produto, a quantidade e calcule o valor a ser pago por aquele lanche. Se o
valor total for maior do que R$ 50,00, deverá ser dado um desconto de 5%.
*/

import java.util.Scanner;

class lanchonete {
	public static void imprimirCardapio() {
		System.out.println("***********************************************");
		System.out.println("Código 	Produto 		Preço unitário R$");
		System.out.println("10	Pastel de carne 	1,50");
		System.out.println("11 	Coxinha de frango 	1,80");
		System.out.println("12 	Empada de frango 	1,90");
		System.out.println("20 	Hamburguer 		10,00");
		System.out.println("30 	Pizza 			8,00");
		System.out.println("50 	Suco 			2,50");
		System.out.println("***********************************************");
	}
	public static boolean continuarPedido() {
		String desejoCliente;
		boolean pedir = false, invalido = true;
		Scanner ler = new Scanner(System.in);

		while(invalido == true) {
			System.out.println("Deseja continuar o pedido?");
			System.out.print("Digite S para sim ou N para não (S/N): ");
			desejoCliente = ler.next();

			if (desejoCliente.equals("S")) {
				pedir = true;
				invalido = false;
			}
			else if(desejoCliente.equals("N")) {
				pedir = false;
				invalido = false;
			
			}
			else{
				System.out.println("Entrada inválida, por favor digite um novo caractere");
				invalido = true;
			}
		}
		return pedir;
	}

	public static double adicionarValorDoProduto(String codigoCliente) {
		boolean invalido = true;
		double valorDoProduto;
		Scanner ler = new Scanner(System.in);	

		switch(codigoCliente) {
			case "10" : 
				System.out.println("Pastel de carne 	1,50");
			   	valorDoProduto = 1.5;	
				break;
			case "11" : 
				System.out.println("Coxinha de frango 	1,80");
				valorDoProduto = 1.8;	
				break;
			case "12" : 
				System.out.println("Empada de frango 	1,90");
				valorDoProduto = 1.9;	
			   	break;
			case "20" : 
				System.out.println("Hamburguer 		10,00");
				valorDoProduto = 10;	
				break;
			case "30" : 
				System.out.println("Pizza 			8,00");
				valorDoProduto = 8;	
				break;
			case "50" : 
				System.out.println("Suco 			2,50");
				valorDoProduto = 2.5;	
		 	 	break;
			default : 
				System.out.println("Código inválido!");
				valorDoProduto = 0;
				break;
		}	
		return valorDoProduto;
	}

	public static void main(String[] arg) {
		double precoProduto = 0, valorTotal = 0, valorParaGanharDesconto = 50.00, desconto = 5, valorTotalComDesconto = 0;
		int quantidadeProdutos = 0, quantidadeDesejada = 0;
		String codigo;
		Scanner ler = new Scanner(System.in);
			
		while(continuarPedido()) {
			imprimirCardapio();
			System.out.println("Digite o código do produto que deseja :");
			codigo = ler.next();				
			System.out.println("Digite a quantidade que deseja :");
			quantidadeDesejada = ler.nextInt();
			if(quantidadeDesejada > 0){
				precoProduto = adicionarValorDoProduto(codigo);
				if(precoProduto != 0){
					valorTotal += (precoProduto * quantidadeDesejada);
					quantidadeProdutos += quantidadeDesejada;
				}
			}
			else{
				System.out.println("Quantidade inválida!");
			}
		}

		System.out.println("Quantidade de produtos pedidos: " + quantidadeProdutos);
		System.out.println("Valor total do pedido: " + valorTotal);
 			
		if(valorTotal >= valorParaGanharDesconto){
			System.out.println("O valor total do pedido foi acima de R$: " + valorParaGanharDesconto);
			System.out.println("O valor total do pedido terá um desconto de: " + desconto + "%");
			valorTotalComDesconto = valorTotal*(1 - (desconto/100))	;
			System.out.println("Novo valor total com o desconto concebido R$: " + valorTotalComDesconto);
		}
	}
}
