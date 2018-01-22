/*
3) Crie uma classe TestaEmpresa que possuirá um método main. Dentro dele crie algumas instâncias de
Funcionario e passe para a empresa pelo método adiciona. Repare que antes você vai precisar criar a
array, pois inicialmente o atributo empregados da classe Empresa não referencia lugar nenhum (seu valor
é null):
 */
package Questao3;

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