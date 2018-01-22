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
public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];
        
        for (int i = 0; i < 7; i++){
            Funcionario f = new Funcionario();
            f.salario = 1000 + 1 * 100;
            empresa.adiciona(f);
        }
    }
}
