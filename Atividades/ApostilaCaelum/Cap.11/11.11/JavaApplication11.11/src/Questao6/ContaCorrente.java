/*
6) (opcional) Coloque um construtor na classe ValorInvalidoException que receba valor inválido que ele
tentou passar (isto é, ele vai receber um double valor).
Quando estendemos uma classe, não herdamos seus construtores, mas podemos acessá-los através da
palavra chave super de dentro de um construtor. As exceções do Java possuem uma série de construtores
úteis para poder populá-las já com uma mensagem de erro. Então vamos criar um construtor em
ValorInvalidoException que delegue para o construtor de sua mãe. Essa vai guardar essa mensagem
para poder mostrá-la ao ser invocado o método getMessage:
public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(double valor) {
        super("Valor invalido: " + valor);
    }
}
Dessamaneira, na hora de dar o throw new ValorInvalidoException você vai precisar passar esse valor
como argumento:
if (valor < 0) {
    throw new ValorInvalidoException(valor);
}
Atenção: você pode se aproveitar do Eclipse para isso: comece já passando o valor como argumento para
o construtor da exception e o Eclipse vai reclamar que não existe tal construtor. O quick x (ctrl + 1)
vai sugerir que ele seja construindo, poupando-lhe tempo!
E agora, como fica a classe TestaDeposita?
 */
package Questao6;


public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public double atualiza(double taxa){
        this.saldo = this.saldo * taxa * 2;
        return this.saldo;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
