/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaGerenciadorDeAnimais;


public class Homem extends Mamifero implements Domesticavel, Carnivoro, Herbivoro {

    public Homem(String nome, int idade) {
        super(nome, idade);
    }

}
