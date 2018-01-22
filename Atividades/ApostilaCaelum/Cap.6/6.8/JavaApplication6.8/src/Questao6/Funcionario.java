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
public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataDeEntrada;
    private String rg;
    private static int identificador;
    
    public Funcionario(){
        Funcionario.identificador++;
    }
    
    public Funcionario(String nome){
        this.nome = nome;
        Funcionario.identificador++;
    }
    
    public int getIdentificador(){
        return Funcionario.identificador;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getDataDeEntrada(){
        return this.dataDeEntrada;
    }
    
    public void setDataDeEntrada(String dataDeEntrada){
        this.dataDeEntrada = dataDeEntrada;
    }
    
    public String getRg(){
        return this.rg;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    void recebeAumento(double valor){
        this.salario += valor;
    }
    
    double calculaGanhoAnual(){
        return this.salario * 12;
    }
    
    void mostra(){
        System.out.println("Salário atual:" + this.salario);
        System.out.println("Ganho anual:" + this.calculaGanhoAnual());
        System.out.println("Data de Entrada do funcionário:" + this.dataDeEntrada);
        System.out.println("RG do funcionário:" + this.rg);
    }
}


