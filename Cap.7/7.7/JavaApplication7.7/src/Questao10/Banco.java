/*
10) (Opcional, Trabalhoso) Crie uma classe Banco que possui um array de Conta. Repare que num
array de Conta você pode colocar tanto ContaCorrente quanto ContaPoupanca. Crie um método
public void adiciona(Conta c), um método public Conta pegaConta(int x) e outro public int
pegaTotalDeContas(), muito similar a relação anterior de Empresa-Funcionario.
Faça com que seu método main crie diversas contas, insira-as no Banco e depois, com um for, percorra
todas as contas do Banco para passá-las como argumento para o AtualizadorDeContas.
 */
package Questao10;

/**
 *
 * @author jarde
 */
public class Banco {
    protected Conta[] contas;
    private static int totalDeContas;
    
    Banco(){
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
