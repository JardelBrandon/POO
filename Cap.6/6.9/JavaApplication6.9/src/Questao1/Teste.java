package Questao1;

/*
1) Porque esse código não compila?
class Teste {
    int x = 37;
    public static void main(String [] args) {
        System.out.println(x);
    }
}

Porque dessa maneira a variável x pertence a classe de Teste
e o metódo main não pode referencia-lá, a não ser que a variável x
se torne uma variável "global" adicionando o static na sua declaração.
 */

/**
 *
 * @author jarde
 */
public class Teste {
    int x = 37;
    public static void main(String [] args) {
        //System.out.println(x); Causa o erro
    }
}
