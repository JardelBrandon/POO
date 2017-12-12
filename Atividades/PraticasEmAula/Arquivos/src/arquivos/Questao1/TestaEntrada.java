/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos.Questao1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
              
/**
 *
 * @author ifpb
 */
public class TestaEntrada {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream("arquivo.txt");
            InputStreamReader isr = new InputStreamReader(is); 
            BufferedReader br = new BufferedReader(isr);
            try {
                String s = br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(TestaEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestaEntrada.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(TestaEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
