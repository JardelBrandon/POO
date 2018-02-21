/*
2) Se você ainda não tiver separado cada classe em um arquivo, essa é a hora de mudar isso. Coloque cada
classe em seu respectivo arquivo .java. Faça isso independente de ela ser pública: é uma boa prática.
 */
package Questao2.br.com.empresa.banco.conta.banco;

import Questao2.br.com.empresa.banco.conta.Conta;

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
