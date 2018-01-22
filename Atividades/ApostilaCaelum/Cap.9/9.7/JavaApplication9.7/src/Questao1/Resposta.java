/*
1) Não podemos dar new em Conta, mas por que, então, podemos dar new em Conta[10], por exemplo?

Porque nesse caso não estamos instanciando uma referência ao objeto do tipo conta
e sim estamos criando um array que terá referência a objetos do tipo conta. 
Porém o array inicia com todos os "ponteiros" apontados para o nulo, esperando uma 
referência valida que no caso seria para as classes filhas não abstratas da classe Conta.
 */

