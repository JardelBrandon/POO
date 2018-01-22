/*
7) (opcional) Na classe Empresa, em vez de criar um array de tamanho fixo, receba como parâmetro no
construtor o tamanho do array de Funcionario.
Com esse construtor, o que acontece se tentarmos dar new Empresa() sem passar argumento algum? Por
quê?
 */
package Questao7;

/**
 *
 * @author jarde
 */
public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(10);
        
        for (int i = 0; i < 10; i++){
            Funcionario f = new Funcionario();
            f.setSalario(1000 + i * 100); 
            empresa.adiciona(f);
        }
        empresa.mostraEmpregados();
        Funcionario funcionario1 = empresa.getFuncionario(1);
        funcionario1.setNome("Jardel");
        funcionario1.setRg("387.945.957");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Rg: " + funcionario1.getRg());
    }
}
