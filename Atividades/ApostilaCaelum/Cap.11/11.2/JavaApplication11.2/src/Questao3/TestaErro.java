/*
3) Em vez de fazer o try em torno do for inteiro, tente apenas com o bloco de dentro do for:
for (int i = 0; i <= 15; i++) {
    try {
        array[i] = i;
        System.out.println(i);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("erro: " + e);
    }
}
Qual é a diferença?
 */
package Questao3;

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
            try {
                array[i] = i;
                System.out.println(i);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: " + e);
            }
        }
        System.out.println("fim do metodo2");
    }
}
    
