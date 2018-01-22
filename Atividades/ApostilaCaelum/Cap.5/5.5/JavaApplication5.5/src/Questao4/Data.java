/*
4) Percorra o atributo empregados da sua instância da Empresa e imprima os salários de todos seus funcionários.
Para fazer isso, você pode criar um método chamado mostraEmpregados dentro da classe Empresa:
 */
package Questao4;

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