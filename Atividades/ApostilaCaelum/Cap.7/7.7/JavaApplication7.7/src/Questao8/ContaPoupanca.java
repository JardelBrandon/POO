/*
8) (Opcional)Use a palavra chave super nosmétodos atualiza reescritos, para não ter de refazer o trabalho.
 */
package Questao8;

/**
 *
 * @author jarde
 */
public class ContaPoupanca extends Conta {
    @Override
    public double atualiza(double taxa){
        this.saldo = super.atualiza(taxa * 3);
        return this.saldo;
    }
}
