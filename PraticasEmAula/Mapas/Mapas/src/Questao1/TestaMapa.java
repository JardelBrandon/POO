/*
1. Crie	um	programa	em	Java	para	executar	o	trecho	de	código	do	slide	20	(isto	
inclui	você	criar	a	classe	Carro).
 */
package Questao1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ifpb
 */
public class TestaMapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Carro> mapa = new HashMap<String, Carro>();
        mapa.put("XYZ-1234", new Carro("Gol", "Ano 2010", "48000Km"));
        mapa.put("XYZ-1235", new Carro("Corsa","Ano 2015","3000km"));
        mapa.put("XYZ-1232", new Carro("Corsa","Ano 2015","3000km"));
        mapa.put("XYZ-1238", new Carro("Corsa","Ano 2015","3000km"));
        
        for(Map.Entry<String, Carro> umElemento : mapa.entrySet()){
            Carro c = umElemento.getValue();
            System.out.println(umElemento.getKey());
            System.out.println(c.getNome());
        }
    }
    
}
