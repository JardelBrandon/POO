/*
1) Repare que a nossa classe Conta é uma excelente candidata para uma classe abstrata. Por quê? Que
métodos seriam interessantes candidatos a serem abstratos?
Transforme a classe Conta em abstrata, repare o que acontece no seu main já existente do TestaContas.
public abstract class Conta {
// ...
}

É uma excelente candidata pois obriga que a conta seja do tipo poupança ou corrente.
Seria interessante transformar o método public double atualiza(double taxa){} em abstrato,
pois todos as classes herdeiras seriam obrigadas a implementa-lá da melhor forma.
Na classe principal TestaContas que contém o main acontece um erro, pois está instanciando
uma classe abstrata, a seguinte excessão é levantada:
Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - Questao1.Conta is abstract; cannot be instantiated
	at Questao1.TestaContas.main(TestaContas.java:17)
C:\Users\jarde\AppData\Local\NetBeans\Cache\dev\executor-snippets\run.xml:135: The following error occurred while executing this line:
C:\Users\jarde\AppData\Local\NetBeans\Cache\dev\executor-snippets\run.xml:92: Java returned: 1
FALHA NA CONSTRUÇÃO (tempo total: 2 segundos)
 */
