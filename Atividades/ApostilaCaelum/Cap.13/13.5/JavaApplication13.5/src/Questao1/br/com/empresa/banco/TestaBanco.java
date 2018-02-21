/*
1) Gere um jar do seu sistema com o arquivo de manifesto. Execute-o com java -jar:
java -jar caelum-banco-1.0.jar
Se o Windows ou o Linux foi configurado para trabalhar com a extensão .jar, basta você dar um duplo
clique no arquivo, que ele será “executado": o arquivo Manifest será lido para que ele descubra qual é a
classe com main que o Java deve processar.
 */
package Questao1.br.com.empresa.banco;

import Questao1.br.com.empresa.banco.conta.Conta;
import Questao1.br.com.empresa.banco.conta.banco.Banco;
import Questao1.br.com.empresa.banco.conta.contacorrente.ContaCorrente;
import Questao1.br.com.empresa.banco.conta.contapoupanca.ContaPoupanca;
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
