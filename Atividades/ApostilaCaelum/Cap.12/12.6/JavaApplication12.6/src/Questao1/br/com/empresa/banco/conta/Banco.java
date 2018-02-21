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
