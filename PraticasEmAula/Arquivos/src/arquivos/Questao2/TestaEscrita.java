/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos.Questao2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ifpb
 */

public class TestaEscrita {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("saida.txt"); // Passo 1
            OutputStreamWriter osw = new OutputStreamWriter(os); // Passo 2
            BufferedWriter bw = new BufferedWriter(osw); // Passo 3
            bw.write("Jardel Brandon"); // Passo 3
            bw.newLine();
            bw.write("22 Anos"); // Passo 3
            bw.newLine();
            bw.write("Eu robô, Isaac Asimov"); // Passo 3
            bw.newLine();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestaEscrita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Erro na escrita!"); 
            Logger.getLogger(TestaEscrita.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            bw.close();
            osw.close();
            
            try {
                os.close();
                
            } catch (IOException ex) {
                Logger.getLogger(TestaEscrita.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


