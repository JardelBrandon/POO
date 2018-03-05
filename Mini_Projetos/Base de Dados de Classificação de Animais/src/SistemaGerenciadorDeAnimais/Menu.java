/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaGerenciadorDeAnimais;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jarde
 */
public class Menu {
    Scanner ler = new Scanner(System.in);
    Sistema sistema = new Sistema();
    
    public void menuPrincipal() {
                File arquivo = new File("GerenciadorAnimais.txt");
        try {
            if (!arquivo.exists()) {
                //cria um arquivo (vazio)
                arquivo.createNewFile();
                System.out.println("Criando arquivo para armazenar os animais cadastrados!");
            }
            else {
                try {
                    System.out.println("Lendo animais cadastrados no arquivo!");
                    ObjectInputStream obj = new ObjectInputStream(new FileInputStream("GerenciadorAnimais.txt"));
                    sistema.setAnimais((HashMap<String, Animal>)obj.readObject()); 
                    if (sistema.getAnimais().isEmpty()) {
                        System.out.println("Arquivo encontra-se vázio!");
                    }
                    else {
                        for(Animal animal : sistema.getAnimais().values())
                            System.out.println(animal.toString());
                    }
                    } catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        while (true) {
            System.out.println("Selecione o número correspondente a opção que deseja realizar:\n");
            System.out.println("1 - Adicionar animal;");
            System.out.println("2 - Remover animal);");
            System.out.println("3 - Atualizar animal;");
            System.out.println("4 - Listar animais armazenados;");
            System.out.println("5 - Encecerrar o programa.");
        

            String operacao = ler.next();
            
            switch (operacao) {
                case "1":
                    boolean invalido = true;
                    while (invalido) {
                        invalido = false;
                        String tipoDoAnimal = this.classeDoAnimal();
                        switch (tipoDoAnimal) {
                            case "1":
                                Homem novoHomem = new Homem(this.receberNome(), this.receberIdade());
                                sistema.adicionaAnimal(novoHomem);
                                novoHomem = null;
                                break;

                            case "2":
                                Cavalo novoCavalo = new Cavalo(this.receberNome(), this.receberIdade());
                                sistema.adicionaAnimal(novoCavalo);
                                novoCavalo = null;
                                break;

                            case "3":
                                Macaco novoMacaco = new Macaco(this.receberNome(), this.receberIdade());
                                sistema.adicionaAnimal(novoMacaco);
                                novoMacaco = null;
                                break;

                            case "4":
                                BeijaFlor novoBeijaFlor = new BeijaFlor(this.receberNome(), this.receberIdade());
                                sistema.adicionaAnimal(novoBeijaFlor);
                                novoBeijaFlor = null;
                                break;

                            case "5":
                                Reptil novoReptil = new Reptil(this.receberNome(), this.receberIdade());
                                sistema.adicionaAnimal(novoReptil);
                                novoReptil = null;
                                break;

                            case "6":
                                Mamifero novoMamifero = new Mamifero(this.receberNome(), this.receberIdade());
                                sistema.adicionaAnimal(novoMamifero);
                                novoMamifero = null;
                                break;

                            case "7":
                                Aves novaAve = new Aves(this.receberNome(), this.receberIdade());
                                sistema.adicionaAnimal(novaAve);
                                novaAve = null;
                                break;

                            case "8":
                                Anfibios novoAnfibio = new Anfibios(this.receberNome(), this.receberIdade());
                                sistema.adicionaAnimal(novoAnfibio);
                                novoAnfibio = null;
                                break;

                            case "9":
                                break;

                            default:
                                System.out.println("Por favor digite uma opção válida!");
                                invalido = true;
                                
                        }
                    }
                break;              
                case "2":
                    if (sistema.getAnimais().isEmpty()) {
                        System.out.println("Nenhum animal está cadastrado!\nVoltando ao menu anterior");
                    }
                    else {
                        while (true) {
                            System.out.println("Digite o nome do animal que deseja remover: ");
                            String nomeDoAnimal = ler.next();

                            Animal animal = sistema.localizaAnimal(nomeDoAnimal);
                            if (animal != null) {
                                sistema.removeAnimal(animal);
                                break;
                            }
                            else {
                                System.out.println("Por favor digite um nome contido no cadastro!");
                                sistema.listaAnimaisArmazenados();
                            }
                        }
                    }
                    break;
                
                case "3":
                    if (sistema.getAnimais().isEmpty()) {
                        System.out.println("Nenhum animal está cadastrado!\nVoltando ao menu anterior");
                    }
                    else {
                        while (true) {
                            System.out.println("Digite o nome do animal que deseja atualizar: ");
                            String nomeDoAnimal = ler.next();

                            Animal animal = sistema.localizaAnimal(nomeDoAnimal);
                            if (animal != null) {
                                System.out.println("Digite a nova idade de " + animal.getNome() + ":");
                                int novaIdade = ler.nextInt();
                                animal.setIdade(novaIdade);
                                sistema.atualizaAnimal(animal);
                                break;
                            }
                            else {
                                System.out.println("Por favor digite um nome contido no cadastro!");
                                sistema.listaAnimaisArmazenados();
                            }
                        }
                    }
                    break;
                    
                case "4":
                    sistema.listaAnimaisArmazenados();
                    break;
                
                case "5":
                    System.out.println("Salvando cadastro no arquivo...\nEncerrando o Programa!");
                    try { 
                    ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("GerenciadorAnimais.txt"));
                    obj.writeObject(sistema.getAnimais());
                    obj.close();
                    } catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.exit(0);
                }
            }            
        }
    
    public String classeDoAnimal() {
        System.out.println("Selecione o número correspondente ao tipo de classe que deseja adicionar:\n");
        System.out.println("1 - Homem;");
        System.out.println("2 - Cavalo;");
        System.out.println("3 - Macaco;");
        System.out.println("4 - Beija Flor;");
        System.out.println("5 - Reptil;");
        System.out.println("6 - Mamifero;");
        System.out.println("7 - Ave;");
        System.out.println("8 - Anfibio.");
        System.out.println("9 - Voltar ao menu anterior");
        
        String operacao = ler.next();
        return operacao;
    }

    public String receberNome() {
        System.out.println("Digite o nome do animal:");
        String nome = ler.next();
        return nome;
    }
    
    public int receberIdade() {
        System.out.println("Digite a idade do animal:");
        int idade = ler.nextInt();
        return idade;
    }
}