/*
7) (opcional) Na classe Empresa, em vez de criar um array de tamanho fixo, receba como parâmetro no
construtor o tamanho do array de Funcionario.
Com esse construtor, o que acontece se tentarmos dar new Empresa() sem passar argumento algum? Por
quê?

Acontesse um erro de compilação pois o argumento se torna obrigatório, porque quando se 
define um construtor, o construtor default deixa de existir, para esse erro não acontecer
novamente seria necessário fazer um sobre-escrita do construtor sem argumentos.
Com isso a seguinte excessão é lançada:
Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - constructor Empresa in class Questao7.Empresa cannot be applied to given types;
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
	at Questao7.TestaEmpresa.main(TestaEmpresa.java:15)
C:\Users\jarde\AppData\Local\NetBeans\Cache\dev\executor-snippets\run.xml:135: The following error occurred while executing this line:
C:\Users\jarde\AppData\Local\NetBeans\Cache\dev\executor-snippets\run.xml:92: Java returned: 1
FALHA NA CONSTRUÇÃO (tempo total: 1 segundo)

 */