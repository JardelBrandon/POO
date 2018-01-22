/*
3) Apenas para entendermelhor o abstract, comente o método atualiza() da ContaPoupanca, dessa forma
ele herdará o método diretamente de Conta.
Transforme o método atualiza() da classe Conta em abstrato. 
Sua classe Conta deve ficar parecida com:
public abstract class Conta {
    // atributos e métodos que já existiam
    public abstract void atualiza(double taxaSelic);
}
Qual é o problema com a classe ContaPoupanca?

Pelo fato de se ter transformado o método atualiza em abstrato, todas as classes filhas de Conta
deveria sobre-escrever o método, e como ele foi comentado a seguinte excessão é levantada:
Exception in thread "main" java.lang.ExceptionInInitializerError
	at Questao3.TestaContas.main(TestaContas.java:22)
Caused by: java.lang.RuntimeException: Uncompilable source code - Questao3.ContaPoupanca is not abstract and does not override abstract method atualiza(double) in Questao3.Conta
	at Questao3.ContaPoupanca.<clinit>(ContaPoupanca.java:18)
	... 1 more
C:\Users\jarde\AppData\Local\NetBeans\Cache\dev\executor-snippets\run.xml:135: The following error occurred while executing this line:
C:\Users\jarde\AppData\Local\NetBeans\Cache\dev\executor-snippets\run.xml:92: Java returned: 1
FALHA NA CONSTRUÇÃO (tempo total: 1 segundo)

 */

