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
}
 */
package Questao1.br.com.empresa.banco.sistema;

import Questao1.br.com.empresa.banco.conta.Conta;

/**
 *
 * @author jarde
 */
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }
    
    public void roda(Conta c) {
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Saldo final: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSelic() {
        return selic;
    }
    
}
