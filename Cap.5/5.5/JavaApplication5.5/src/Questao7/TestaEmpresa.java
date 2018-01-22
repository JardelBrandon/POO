/*
7) (Opcional) Caso a array já esteja cheia no momento de adicionar um outro funcionário, criar uma nova
maior e copiar os valores. Isto é, fazer a realocação já que java não tem isso: uma array nasce emorre com
o mesmo length.
 */
package Questao7;

/**
 *
 * @author jarde
 */
public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];
        
        for (int i = 0; i < 37; i++){
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
