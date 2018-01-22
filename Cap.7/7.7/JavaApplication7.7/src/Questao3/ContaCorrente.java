/*
3) Crie duas subclasses da classe Conta: ContaCorrente e ContaPoupanca. Ambas terão o método atualiza
reescrito: A ContaCorrente deve atualizar-se com o dobro da taxa e a ContaPoupanca deve atualizar-se
com o triplo da taxa.
Além disso, a ContaCorrente deve reescrever o método deposita, a fim de retirar uma taxa bancária de
dez centavos de cada depósito.
• Crie as classes ContaCorrente e ContaPoupanca. Ambas são filhas da classe Conta:

public class ContaCorrente extends Conta {
}
public class ContaPoupanca extends Conta {
}

• Reescreva o método atualiza na classe ContaCorrente, seguindo o enunciado:
public class ContaCorrente extends Conta {
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }
}
Repare que, para acessar o atributo saldo herdado da classe Conta, você vai precisar trocar o modi
ficador de visibilidade de saldo para protected.
• Reescreva o método atualiza na classe ContaPoupanca, seguindo o enunciado:
public class ContaPoupanca extends Conta {
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }
}
• Na classe ContaCorrente, reescreva o método deposita para descontar a taxa bancária de dez centavos:
public class ContaCorrente extends Conta {
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }
    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }
}
 */
package Questao3;


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
