import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.
        // Cada caso de teste consiste de dois inteiros X e Y.
        // Você deve apresentar a soma de todos os ímpares existentes entre X e Y.
        //
        //Entrada
        //A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir.
        // Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.
        //
        //Saída
        //Imprima a soma de todos valores ímpares entre X e Y.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;
            if (x > y) {
                int troca = x;
                x = y;
                y = troca;
            }
            for (int j = x+1; j < y; j++) {
                if ((j % 2) != 0) {
                    soma += j;
                }
            }
            System.out.println(soma);
        }
        sc.close();
    }
}
