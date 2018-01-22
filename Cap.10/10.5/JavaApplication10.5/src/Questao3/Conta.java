/*
2) Nosso banco precisa tributar dinheiro de alguns bens que nossos clientes possuem. Para isso, vamos criar
uma interface no nosso projeto banco já existente:
interface Tributavel {
    double calculaTributos();
}
Lemos essa interface da seguinte maneira: “todos que quiserem ser tributável precisam saber calcular
tributos, devolvendo um double”.
Alguns bens são tributáveis e outros não, ContaPoupanca não é tributável, já para ContaCorrente você
precisa pagar 1% da conta e o SeguroDeVida tem uma taxa fixa de 42 reais.
Aproveite o Eclipse! Quando você escrever implements Tributavel na classe ContaCorrente, o quick fix
do Eclipse vai sugerir que você reescreva o método; escolha essa opção e, depois, preencha o corpo do
método adequadamente:
class ContaCorrente extends Conta implements Tributavel {
    // outros atributos e métodos
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
Crie a classe SeguroDeVida, aproveitando novamente do Eclipse, para obter:
class SeguroDeVida implements Tributavel {
    public double calculaTributos() {
        return 42;
    }
}
Vamos criar uma classe TestaTributavel com um método main para testar o nosso exemplo:
class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());
        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
}
Tente chamar o método getSaldo através da referência t, o que ocorre? Por quê?
A linha em que atribuímos cc a um Tributavel é apenas para você enxergar que é possível fazê-lo. Nesse
nosso caso, isso não tem uma utilidade. Essa possibilidade será útil para o próximo exercício.
 */
package Questao3;

import Questao2.*;

/**
 *
 * @author jarde
 */
public abstract class Conta {
    protected double saldo;
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public void saca(double valor){
        this.saldo -= valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public abstract double atualiza(double taxa);
}
