/*
4) Faça com que sua classe Funcionario possa receber, opcionalmente, o nome do Funcionario durante a
criação do objeto. Utilize construtores para obter esse resultado.
Dica: utilize um construtor sem argumentos também, para o caso de a pessoa não querer passar o nome
do Funcionario.
Seria algo como:
class Funcionario {
public Funcionario() {
// construtor sem argumentos
}
public Funcionario(String nome) {
// construtor que recebe o nome
}
}
Por que você precisa do construtor sem argumentos para que a passagem do nome seja opcional?
 */
package Questao4;

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
    
    public Funcionario(){
        
    }
    
    public Funcionario(String nome){
        this.nome = nome;
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


