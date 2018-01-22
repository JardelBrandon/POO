/* 
8) (opcional) O que acontece se você tentar acessar um atributo diretamente na classe? Como, por exemplo:
Funcionario.salario = 1234;
Esse código faz sentido? E este:
Funcionario.calculaGanhoAtual();
Faz sentido perguntar para o esquema do Funcionario seu valor anual?

    Não faz sentido, pois o atributo pode ser acessado diretamente dentro da classse,
sem ser necessário utilizar o nome de sua classe como referência.
Também não faz sentido perguntar seu valor anual, pois esse é um pensamento
do paradigma de programação procedural, nesse caso o método deve ser invocado por um
objeto instanciado dessa classe.
Tentar realizar essas operações da questão 8 proposta causariam erros.
*/