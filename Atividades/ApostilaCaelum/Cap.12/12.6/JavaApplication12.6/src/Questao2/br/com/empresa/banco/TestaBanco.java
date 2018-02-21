/*
2) Se você ainda não tiver separado cada classe em um arquivo, essa é a hora de mudar isso. Coloque cada
classe em seu respectivo arquivo .java. Faça isso independente de ela ser pública: é uma boa prática.
 */
package Questao2.br.com.empresa.banco;

import Questao2.br.com.empresa.banco.conta.Conta;
import Questao2.br.com.empresa.banco.conta.banco.Banco;
import Questao2.br.com.empresa.banco.conta.contacorrente.ContaCorrente;
import Questao2.br.com.empresa.banco.conta.contapoupanca.ContaPoupanca;
import Questao2.br.com.empresa.banco.sistema.AtualizadorDeContas;
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
