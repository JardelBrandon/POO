/*
1) Selecionando o src do seu projeto, faça ctrl + N e escreva Package, ponha o seu sistema de Contas para
utilizar pacotes. Na janela de criação de pacotes escreva o nome completo, desde o br, e o Eclipse tratará
de fazer a separação das pastas corretamente.
Respeite a convenção de código da Sun, por exemplo:
• br.com.empresa.banco: colocar classes com o método main aqui (os Testes)
• br.com.empresa.banco.conta : colocar Conta, suas filhas e exceptions aqui
• br.com.empresa.banco.sistema : colocar AtualizadorDeContas aqui
Antes de corrigir qualquer erro de compilação, primeiro mova todas as suas classes, sem deixar nenhuma
no pacote default.
 */
package Questao1.br.com.empresa.banco.conta;


public class ContaCorrente extends Conta {
    @Override
    public double atualiza(double taxa){
        this.saldo = super.atualiza(taxa * 2);
        return this.saldo;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }
}
