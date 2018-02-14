package Questao2;

/*
2) Crie uma classe TestaDeposita com o método main. Crie uma ContaPoupanca e tente depositar valores
inválidos:
public static void main(String[] args) {
    Conta cp = new ContaPoupanca();
    cp.deposita(-100);
}
O que acontece?

Resposta:
Ao chamar o metódo deposita, passando como argumento um valor negativo,
é lançada a excessão que foi instanciada, acontecendo o erro abaixo:
run:
Exception in thread "main" java.lang.IllegalArgumentException
	at Questao1.Conta.deposita(Conta.java:24)
	at Questao1.TestaDeposita.main(TestaDeposita.java:19)
C:\Users\jarde\AppData\Local\NetBeans\Cache\dev\executor-snippets\run.xml:135: The following error occurred while executing this line:
C:\Users\jarde\AppData\Local\NetBeans\Cache\dev\executor-snippets\run.xml:92: Java returned: 1
FALHA NA CONSTRUÇÃO (tempo total: 0 segundos)
 */


