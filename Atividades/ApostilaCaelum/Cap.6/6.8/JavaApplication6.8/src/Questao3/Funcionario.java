/*
3) Modique suas classes que acessam e modicam atributos de um Funcionario para utilizar os getters e
setters recém criados.
Por exemplo, onde você encontra:

f.salario = 100;
System.out.println(f.salario);
passa para:
f.setSalario(100);
System.out.println(f.getSalario());
 */
package Questao3;

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


