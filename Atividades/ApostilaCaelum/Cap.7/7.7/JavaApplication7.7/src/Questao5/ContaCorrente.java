/*
5) O que você acha de rodar o código anterior da seguinte maneira:
Conta c = new Conta();
Conta cc = new ContaCorrente();
Conta cp = new ContaPoupanca();
Compila? Roda? O quemuda? Qual é a utilidade disso? Realmente, essa não é amaneiramais útil do polimor
fismo - veremos o seu real poder no próximo exercício. Porém existe uma utilidade de declararmos
uma variável de um tipo menos específico do que o objeto realmente é.
É extremamente importante perceber que não importa como nos referimos a um objeto, o método que
será invocado é sempre o mesmo! A JVM vai descobrir em tempo de execução qual deve ser invocado,
dependendo de que tipo é aquele objeto, não importando como nos referimos a ele.
 */
package Questao5;


public class ContaCorrente extends Conta {
    @Override
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 2;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }
}
