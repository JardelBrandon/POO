/*
6) (Opcional) Crie um método para verificar se um determinado Funcionario se encontra ou não como
funcionário desta empresa:
 */
package Questao6;

/**
 *
 * @author jarde
 */
public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];
        
        for (int i = 0; i < 10; i++){
            Funcionario f = new Funcionario();
            f.salario = 1000 + i * 100;
            empresa.adiciona(f);
        }
        empresa.mostraEmpregados();
        Funcionario novo = new Funcionario();
        System.out.println("Contem: " + empresa.contem(empresa.empregados[1]));
        System.out.println("Contem: " + empresa.contem(novo));
    }
}
