/*
5) (opcional)Emvez demostrar apenas o salário de cada funcionário, você pode chamar ométodo mostra()
de cada Funcionario da sua array.
 */
package Questao5;

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
    }
}
