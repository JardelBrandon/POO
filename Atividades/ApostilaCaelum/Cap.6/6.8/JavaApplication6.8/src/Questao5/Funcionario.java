/*
5) (opcional) Adicione um atributo na classe Funcionario de tipo int que se chama identificador. Esse
identificador deve ter um valor único para cada instância do tipo Funcionario. O primeiro Funcionario
instanciado tem identificador 1, o segundo 2, e assim por diante. Você deve utilizar os recursos aprendidos
aqui para resolver esse problema.
Crie um getter para o identificador. Devemos ter um setter?
 */
package Questao5;

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


