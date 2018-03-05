/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaGerenciadorDeAnimais;


/**
 *
 * @author ifpb
 */
public class TestaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Homem homem = new Homem("José", 22);
        Macaco macaco = new Macaco("Caco", 5);
        Animal cavalo = new Cavalo("Alazão", 16);
        BeijaFlor beijaFlor = new BeijaFlor("PiuPiu", 2);
        
        
        Sistema gerenciador = new Sistema();
        
        gerenciador.adicionaAnimal(cavalo);
        gerenciador.adicionaAnimal(homem);
        gerenciador.adicionaAnimal(macaco);
        gerenciador.adicionaAnimal(beijaFlor);
        
        gerenciador.ListaAnimaisArmazenados();
        
    
        gerenciador.removeAnimal(cavalo);
        gerenciador.removeAnimal(beijaFlor);
        homem.setIdade(20);
        
        gerenciador.ListaAnimaisArmazenados();
        */
        Menu menu = new Menu();
        
        menu.menuPrincipal();
    }
}
