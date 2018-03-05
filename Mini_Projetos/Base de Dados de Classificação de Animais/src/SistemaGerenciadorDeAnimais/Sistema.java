/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaGerenciadorDeAnimais;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ifpb
 */
public class Sistema {
    private HashMap<String, Animal> animais = new HashMap();
    private Scanner ler = new Scanner(System.in);

    
    void adicionaAnimal(Animal novoAnimal) {
        animais.put(novoAnimal.getNome(), novoAnimal);
    }
    
    Animal localizaAnimal(String nome) {
        if (animais.containsKey(nome)) {
            return animais.get(nome);
        }
        else{
            System.out.println("Animal não contido no cadastro");
            return null;
        }
    }
    
    
    void removeAnimal(Animal animal){
        this.animais.remove(animal.getNome());
    }
    
    void atualizaAnimal(Animal animal){
        animais.put(animal.getNome(), animal);
    }
    
    void listaAnimaisArmazenados() {
        for(Map.Entry<String, Animal> animal : animais.entrySet()){
            System.out.println("{Nome:" + animal.getValue().getNome() + 
                        ", Idade: " + animal.getValue().getIdade() + "}" +
                        animal.getValue().getClass());
            
        }
    }

    public HashMap<String, Animal> getAnimais() {
        return animais;
    }
    
}
