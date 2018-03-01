/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaGerenciadorDeAnimais;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ifpb
 */
public class Sistema {
    HashMap<String, Animal> animais = new HashMap();

    void adicionaAnimal(Animal novoAnimal) {
        animais.put(novoAnimal.getNome(), novoAnimal);
    }
    
    void removeAnimal(Animal animal){
        if (animais.containsKey(animal.getNome())){
            animais.remove(animal.getNome());
            System.out.println("Animal " + animal.getNome() + " removido!");
        }
        else{
            System.out.println("Animal não contido no cadastro");
        }
    }
    
    void atualizaAnimal(Animal animal){
    }
    
    void ListaAnimaisArmazenados() {
        System.out.println(this.animais.values());
        
        for(Map.Entry<String, Animal> animal : animais.entrySet()){
            System.out.println(animal.getValue());
        }
    }
}
