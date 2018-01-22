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
public class Empresa {
    String nome;
    String cnpj;
    Funcionario[] empregados;
    
    void adiciona(Funcionario f) {
        int posicaoFuncionaio = 0;
        this.empregados[posicaoFuncionaio] = f;
        posicaoFuncionaio++;
    }
}
