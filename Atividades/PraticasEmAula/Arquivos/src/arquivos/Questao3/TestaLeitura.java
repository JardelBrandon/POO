/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos.Questao3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


/**
 *
 * @author ifpb
 */
public class TestaLeitura {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        String linha;
        int contador = 0;
        // Percorrer todos as linhas do arquivo. Fim arquivo é retorna null
        while ((linha = br.readLine()) != null){
        System.out.print(linha); contador++;
        }
        // Fechar o arquivo
        br.close();
        isr.close();
        is.close();
        }
   } 
}
