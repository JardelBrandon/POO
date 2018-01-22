/*
4) Faça com que sua classe Funcionario possa receber, opcionalmente, o nome do Funcionario durante a
criação do objeto. Utilize construtores para obter esse resultado.
Dica: utilize um construtor sem argumentos também, para o caso de a pessoa não querer passar o nome
do Funcionario.
Seria algo como:
class Funcionario {
public Funcionario() {
// construtor sem argumentos
}
public Funcionario(String nome) {
// construtor que recebe o nome
}
}
Por que você precisa do construtor sem argumentos para que a passagem do nome seja opcional?

Porque a partir do momento em que se é criado um construtor, o construtor default do java 
deixa de existir, então se não fosse criado outro construtor sem argumentos, tornaria obrigátorio
a passagem do argumento nome
 */

