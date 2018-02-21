/*
1) Gere um jar do seu sistema com o arquivo de manifesto. Execute-o com java -jar:
java -jar caelum-banco-1.0.jar
Se o Windows ou o Linux foi configurado para trabalhar com a extensão .jar, basta você dar um duplo
clique no arquivo, que ele será “executado": o arquivo Manifest será lido para que ele descubra qual é a
classe com main que o Java deve processar.
 */
package Questao1.br.com.empresa.banco.conta.contapoupanca;

import Questao1.br.com.empresa.banco.conta.Conta;

/**
 *
 * @author jarde
 */
public class ContaPoupanca extends Conta {
    @Override
    public double atualiza(double taxa){
        this.saldo = super.atualiza(taxa * 3);
        return this.saldo;
    }
}
