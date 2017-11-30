/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ifpb
 */
public class TesteErro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    static void metodo1 {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    static void metodo2{
        System.out.println("Inicio do metodo2");
         int[] array = new int[10];
         for (int i = 0; i <= 15; i++){
             array[i] = i;
             System.out.println(i);
         }
         System.out.println("Fim do metodo2")
    }
}
