/*
7) (opcional) Declare a classe ValorInvalidoException como filha direta de Exception em vez de
RuntimeException. Ela passa a ser checked. O que isso resulta?
Você vai precisar avisar que o seu método deposita() throws ValorInvalidoException, pois ela é uma
checked exception. Além disso, quem chama essemétodo vai precisar tomar uma decisão entre try-catch
ou throws. Faça uso do quick fix do Eclipse novamente!
Depois, retorne a exception para unchecked, isto é, para ser filha de RuntimeException, pois utilizaremos
ela assim em exercícios dos capítulos posteriores.
*/
package Questao7;

/**
 *
 * @author jarde
 */
public abstract class Conta {
    protected double saldo;
    
    public void deposita(double valor) throws ValorInvalidoException{
        if (valor < 0){
            throw new ValorInvalidoException(valor);
        }
        else{
            this.saldo += valor;
        }
    }
    
    public void saca(double valor){
        this.saldo -= valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public abstract double atualiza(double taxa);
}
