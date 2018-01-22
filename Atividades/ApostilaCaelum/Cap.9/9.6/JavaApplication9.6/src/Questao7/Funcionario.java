/*
7) (opcional) Posso chamar um método abstrato de dentro de um outro método da própria classe abstrata?
Um exemplo: o mostra do Funcionario pode invocar this.getBonificacao()?
 */
package Questao7;

/**
 *
 * @author jarde
 */
public abstract class Funcionario {
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
    
    public abstract double getBonificacao();
    
    void mostra(){
        System.out.println("Salário atual:" + this.salario);
        System.out.println("Ganho anual:" + this.calculaGanhoAnual());
        System.out.println("Data de Entrada do funcionário:" + this.dataDeEntrada);
        System.out.println("RG do funcionário:" + this.rg);
        System.out.println("Bonificação: " + this.getBonificacao());
    }
}


