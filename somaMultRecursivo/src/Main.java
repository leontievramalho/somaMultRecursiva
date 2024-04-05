import java.sql.Array;

public class Main {
    public static void main(String[] args){
        int[] numeros = new int[5];
        numeros[0] = 3;
        numeros[1] = 7;
        numeros[2] = -2;
        numeros[3] = 0;
        numeros[4] = 1;

        System.out.println(soma(numeros, numeros.length));
        System.out.println(soma2(numeros, 0));
        System.out.println(multiplicacao(3, 5));
    }

    public static int soma(int vetor[], int tamanho){
        if(tamanho == 1){
            return vetor[0];
        }
        return vetor[tamanho-1] + soma(vetor, tamanho-1);
    }

    public static int soma2(int vetor[], int posInicial){
        if(posInicial == vetor.length-1) {
            return vetor[posInicial];
        }
        return vetor[posInicial] + soma2(vetor, posInicial+ 1);
    }

    public static int multiplicacao(int a, int b){
        if(b == 0 || a == 0){
            return 0;
        }else{
            if (b == 1) {
                return a;
            }
            return a + multiplicacao(a, b - 1);
        }
    }
}
