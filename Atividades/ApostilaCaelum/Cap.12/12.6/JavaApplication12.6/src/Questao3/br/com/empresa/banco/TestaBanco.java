/*
3) O código não vai compilar prontamente, pois muitos métodos que declaramos são package-private
quando, na verdade, precisaríamos que eles fossem public.
O mesmo vale para as classes: algumas delas precisarão ser públicas.
Use o recurso de quick fix do Eclipse aqui: ele mesmo vai sugerir que o modificador de acesso deve ser
público. Para isso, use o ctrl + 1 em cada um dos erros, escolhendo o quick fix mais adequado para seu
problema.
 */
package Questao3.br.com.empresa.banco;

import Questao3.br.com.empresa.banco.conta.Conta;
import Questao3.br.com.empresa.banco.conta.banco.Banco;
import Questao3.br.com.empresa.banco.conta.contacorrente.ContaCorrente;
import Questao3.br.com.empresa.banco.conta.contapoupanca.ContaPoupanca;
import Questao3.br.com.empresa.banco.sistema.AtualizadorDeContas;
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
