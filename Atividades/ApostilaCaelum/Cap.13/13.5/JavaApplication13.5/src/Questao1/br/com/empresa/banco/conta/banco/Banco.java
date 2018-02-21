/*
1) Gere um jar do seu sistema com o arquivo de manifesto. Execute-o com java -jar:
java -jar caelum-banco-1.0.jar
Se o Windows ou o Linux foi configurado para trabalhar com a extensão .jar, basta você dar um duplo
clique no arquivo, que ele será “executado": o arquivo Manifest será lido para que ele descubra qual é a
classe com main que o Java deve processar.
 */
package Questao1.br.com.empresa.banco.conta.banco;

import Questao1.br.com.empresa.banco.conta.Conta;

/**
 *
 * @author jarde
 */
public class Banco {
    public Conta[] contas;
    private static int totalDeContas;
    
    public Banco(){
        Banco.totalDeContas++;
    }
    
    public void adiciona(Conta c){
        for (int i = 0; i <= this.contas.length; i++){
            if (i == this.contas.length){ //Array cheio
                Conta[] arrayCheio = this.contas;
                this.contas = new Conta[i * 2];
                for (int x = 0; x < this.contas.length; x++){
                    if (x < i){
                        this.contas[x] = arrayCheio[x];
                    }          
                }
            }
            
            if (this.contas[i] == null){
                this.contas[i] = c;
                break;
            }
        }        
    }
    
    public Conta pegaConta(int x){
        return this.contas[x];
    }
    
    public int pegaTotalDeContas(){
        return totalDeContas;
    }
}
