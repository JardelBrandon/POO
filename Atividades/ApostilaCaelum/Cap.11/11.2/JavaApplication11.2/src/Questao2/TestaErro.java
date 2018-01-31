/*
2) Adicione um try/catch em volta do for, pegando ArrayIndexOutOfBoundsException. O que o código
imprime?
try {
    for (int i = 0; i <= 15; i++) {
    array[i] = i;
    System.out.println(i);
    }
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("erro: " + e);
}
 */
package Questao2;

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
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: " + e);
        }
        System.out.println("fim do metodo2");
    }
}
    
