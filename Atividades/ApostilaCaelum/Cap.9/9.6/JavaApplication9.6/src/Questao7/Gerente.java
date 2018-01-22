/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao7;

/**
 *
 * @author jarde
 */
public class Gerente extends Funcionario{

    @Override
    public double getBonificacao() {
        return super.getSalario() + 1000;
    }
    
}
