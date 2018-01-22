/*
9) (opcional-avançado) Crie um método na classe Data que devolva o valor formatado da data, isto é, devolva
uma String com “dia/mes/ano”. Isso para que o método mostra da classe Funcionario possa ficar assim:

class Funcionario {
    // atributos e metodos

    void mostra() {
        // imprime outros atributos...
        System.out.println("Data de entrada: " + this.dataDeEntrada.formatada());
    }
}
 */
package Questao9;

/**
 *
 * @author jarde
 */
public class Data {
    int dia;
    int mes;
    int ano;
    
    String formatada(){
        String data = "";
        data += this.dia;
        data += '/';
        data += this.mes;
        data += '/';
        data += this.ano;
        
        return data;
    }
}