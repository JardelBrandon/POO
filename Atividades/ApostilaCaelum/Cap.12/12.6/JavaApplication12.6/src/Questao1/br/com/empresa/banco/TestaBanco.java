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
package Questao1.br.com.empresa.banco;

import Questao1.br.com.empresa.banco.conta.Conta;
import Questao1.br.com.empresa.banco.conta.Banco;
import Questao1.br.com.empresa.banco.conta.ContaCorrente;
import Questao1.br.com.empresa.banco.conta.ContaPoupanca;
import Questao1.br.com.empresa.banco.sistema.AtualizadorDeContas;
/**
 *
 * @author jarde
 */
public class TestaBanco {
    public static void main(String[] args) {
        Banco b = new Banco();
        b.contas = new Conta[10];
        
        for (int i = 0; i < 15; i++){
            if (i % 2 == 0){
                Conta nova = new ContaCorrente();
                nova.saldo = i * 1000;
                b.adiciona(nova);
            }
            else{
                Conta nova = new ContaPoupanca();
                nova.saldo = i * 1000;
                b.adiciona(nova);
            }
        }
        
        for (Conta conta : b.contas) {
            if (conta != null){
                AtualizadorDeContas atualizar = new AtualizadorDeContas(0.01);
                atualizar.roda(conta);
            }
        }
        Conta contaTeste = b.pegaConta(5);
        System.out.println(contaTeste.saldo);
        System.out.println(b.pegaTotalDeContas());
    }
    
}
