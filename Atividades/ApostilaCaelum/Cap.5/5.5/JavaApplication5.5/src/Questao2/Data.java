/*
2) A Empresa deve ter um método adiciona, que recebe uma referência a Funcionario como argumento e
guarda esse funcionário. Algo como:
void adiciona(Funcionario f) {
// algo tipo:
// this.empregados[ ??? ] = f;
// mas que posição colocar?
}
 */
package Questao2;

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