/*
5) Faça o mesmo, retirando o try/catch novamente e colocando em volta da chamada do metodo1. Rode
os códigos, o que acontece?
System.out.println("inicio do main");
try {
    metodo1();
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Erro : "+e);
}
System.out.println("fim do main");
 */
package Questao5;

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
        try {
        metodo1();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e);
        }
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
    
