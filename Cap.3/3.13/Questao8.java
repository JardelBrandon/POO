/*
8) (opcional) Imprima a seguinte tabela, usando fors encadeados:
1
2 4
3 6 9
4 8 12 16
n n*2 n*3 .... n*n
 */

class Questao8{
    public static void main(String[] args) {
        int tam = 10;
        for(int linha = 1; linha <= tam; linha++){
            System.out.print(linha + " ");
            for(int coluna = 1; coluna <= tam; coluna++){
                if(linha == coluna && linha != 1){
                    System.out.print(linha * linha + " ");
                }
                else if(coluna > 1 && coluna < linha){
                    System.out.print(linha * coluna + " ");
                }
            }
            System.out.println();
        }
        System.out.println("n n*2 n*3 .... n*n");
    }
}