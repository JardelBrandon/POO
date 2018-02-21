/*
2) Se você ainda não tiver separado cada classe em um arquivo, essa é a hora de mudar isso. Coloque cada
classe em seu respectivo arquivo .java. Faça isso independente de ela ser pública: é uma boa prática.
 */
package Questao2.br.com.empresa.banco.conta;

/**
 *
 * @author jarde
 */
public class Conta {
    public double saldo;
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public void saca(double valor){
        this.saldo -= valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public double atualiza(double taxa){
        this.saldo += this.saldo * taxa;
        return this.saldo;
    }
}
