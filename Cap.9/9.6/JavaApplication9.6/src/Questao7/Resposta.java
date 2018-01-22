/*
7) (opcional) Posso chamar um método abstrato de dentro de um outro método da própria classe abstrata?
Um exemplo: o mostra do Funcionario pode invocar this.getBonificacao()?

Sim, é possível pois como o método é abstrato, suas classes herdeiras são obrigadas
a implementar o método abstrato, dessa maneira quando houver a chamada do método 
ela se comportará da maneira que foi implementada, e como sua implementação é garantida,
existe uma coerencia de não acontecer um erro por falta do corpo do método.
 */
