/*
1) A sintaxe do uso de interfaces pode parecer muito estranha, à primeira vista.
Vamos começar com um exercício para praticar a sintaxe. Crie um projeto interfaces e crie a interface
AreaCalculavel:
interface AreaCalculavel {
    double calculaArea();
}
Queremos criar algumas classes que são AreaCalculavel:
class Quadrado implements AreaCalculavel {
    private int lado;
    public Quadrado(int lado) {
        this.lado = lado;
    }
    public double calculaArea() {
        return this.lado * this.lado;
    }
}
class Retangulo implements AreaCalculavel {
    private int largura;
    private int altura;
    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
    public double calculaArea() {
        return this.largura * this.altura;
    }
}
Repare que, aqui, se você tivesse usado herança, não iria ganhar muito, já que cada implementação é
totalmente diferente da outra: um Quadrado, um Retangulo e um Circulo têm atributos e métodos bem
diferentes.
Mas,mesmo que eles tivessem atributos em comum, utilizar interfaces é uma maneira muito mais elegante
de modelar suas classes. Elas também trazem vantagens em não acoplar as classes. Uma vez que herança
através de classes traz muito acoplamento, muitos autores renomados dizem que, na maioria dos casos,
herança quebra o encapsulamento, pensamento com o qual a equipe da Caelum concorda plenamente.

Crie a seguinte classe de Teste. Repare no polimorsmo. Poderíamos passar esses objetos como argumento
para alguém que aceitasse AreaCalculavel como argumento:
class Teste {
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3,2);
        System.out.println(a.calculaArea());
    }
}
Opcionalmente, crie a classe Circulo:
class Circulo implements AreaCalculavel {
    // ... atributos (raio) e métodos (calculaArea)
}
Utilize Math.PI * raio * raio para calcular a área.
 */
package Questao1;

/**
 *
 * @author jarde
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3, 2);
        System.out.println(a.calculaArea());
    }
    
}
