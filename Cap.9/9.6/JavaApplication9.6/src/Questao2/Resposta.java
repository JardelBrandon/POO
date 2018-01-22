/*
2) Para que o código do main volte a compilar, troque o new Conta() por new ContaCorrente().
Se não podemos dar new em Conta, qual é a utilidade de ter um método que recebe uma referência a Conta
como argumento? Aliás, posso ter isso?

A utilidade se dar pelo fato de que todas as classes filhas são também tipos da classe mãe
então qualquer classe que herda essas heranças pode ser considerada desse tipo, logo 
quando a referência é feita a classe mãe, os filhos também possuem essa referência,
dessa maneira é totalmente possível se ter um método que recebe uma referência a conta como argumento.
 */

