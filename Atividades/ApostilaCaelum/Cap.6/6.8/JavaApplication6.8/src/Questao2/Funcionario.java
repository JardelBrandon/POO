/*
2) Crie os getters e setters necessários da sua classe Funcionario. Por exemplo:
class Funcionario {
    private double salario;
    // ...
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
Não copie e cole! Aproveite para praticar sintaxe. Logo passaremos a usar o Eclipse e aí sim teremos
procedimentos mais simples para este tipo de tarefa.
Repare que ométodo calculaGanhoAnual parece também um getter. Aliás, seria comum alguém nomeálo
de getGanhoAnual. Getters não precisam apenas retornar atributos. Eles podem trabalhar com esses dados
 */
package Questao2;

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


