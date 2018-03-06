/*
1) Para aprendermos os conceitos básicos das exceptions do Java, teste o seguinte código você mesmo:
class TesteErro {
public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        for (int i = 0; i <= 15; i++) {
        array[i] = i;
        System.out.println(i);
    }
        System.out.println("fim do metodo2");
    }
}
 */
package Questao1;

/**
 *
 * @author jarde
 */
public class TestaErro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        for (int i = 0; i <= 15; i++) {
        array[i] = i;
        System.out.println(i);
    }
        System.out.println("fim do metodo2");
    }
}
    
