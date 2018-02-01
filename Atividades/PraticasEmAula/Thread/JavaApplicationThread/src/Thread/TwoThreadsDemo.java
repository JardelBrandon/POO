/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author ifpb
 */
public class TwoThreadsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SimpleThread("Belo Jardim").start();
        new SimpleThread("Campina Grande").start();
    }
    
}
