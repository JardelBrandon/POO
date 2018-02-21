/*
3) O código não vai compilar prontamente, pois muitos métodos que declaramos são package-private
quando, na verdade, precisaríamos que eles fossem public.
O mesmo vale para as classes: algumas delas precisarão ser públicas.
Use o recurso de quick fix do Eclipse aqui: ele mesmo vai sugerir que o modificador de acesso deve ser
público. Para isso, use o ctrl + 1 em cada um dos erros, escolhendo o quick fix mais adequado para seu
problema.
 */
package Questao3.br.com.empresa.banco.conta.banco;

import Questao3.br.com.empresa.banco.conta.Conta;

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
