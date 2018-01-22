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
