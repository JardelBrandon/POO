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


public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public double atualiza(double taxa){
        this.saldo = this.saldo * taxa * 2;
        return this.saldo;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
