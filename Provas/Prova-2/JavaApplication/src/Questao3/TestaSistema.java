/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;


/**
 *
 * @author ifpb
 */
public class TestaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Homem homem = new Homem();
        Macaco macaco = new Macaco();
        Animal cavalo = new Cavalo();
        BeijaFlor beijaFlor = new BeijaFlor();
        
        homem.setNome("João");
        macaco.setNome("Caco");
        cavalo.setNome("Ha");
        beijaFlor.setNome("piu");
        
        Sistema gerenciador = new Sistema();
        
        gerenciador.adicionaAnimal(cavalo);
        gerenciador.adicionaAnimal(homem);
        gerenciador.adicionaAnimal(cavalo);
        gerenciador.adicionaAnimal(beijaFlor);
        
        gerenciador.ListaAnimaisArmazenados();
        
        /*
        gerenciador.removeAnimal(cavalo);
        gerenciador.removeAnimal(beijaFlor);
        
        gerenciador.ListaAnimaisArmazenados();
*/
    }
    
}
