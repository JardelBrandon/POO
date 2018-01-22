/*
6) (opcional) Crie os getters e setters da sua classe Empresa e coloque seus atributos como private. Lembrese
de que não necessariamente todos os atributos devem ter getters e setters.
Por exemplo, na classe Empresa, seria interessante ter um setter e getter para a sua array de funcionários?
Não seria mais interessante ter um método como este?
class Empresa {
// ...
    public Funcionario getFuncionario (int posicao) {
        return this.empregados[posicao];
    }
}
 */
package Questao6;

/**
 *
 * @author jarde
 */
public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Funcionario[] empregados = new Funcionario[10];
        empresa.setEmpregados(empregados);
        
        for (int i = 0; i < 10; i++){
            Funcionario f = new Funcionario();
            f.setSalario(1000 + i * 100); 
            empresa.adiciona(f);
        }
        empresa.mostraEmpregados();
        Funcionario funcionario1 = empresa.getFuncionario(1);
        funcionario1.setNome("Jardel");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: " + funcionario1.getSalario());
    }
}
