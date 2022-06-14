import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.
        // Cada caso de teste consiste de dois inteiros X e Y.
        // Você deve apresentar a soma de Y ímpares consecutivos a partir de X inclusive o próprio X se ele for ímpar.
        // Por exemplo:
        //para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
        //para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13
        //
        //Entrada
        //A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir.
        // Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.
        //
        //Saída
        //Imprima a soma dos consecutivos números ímpares a partir do valor X.


        // INCOMPLETO


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;
            for (int j = x; j <= y+x+2; j++) {
                if (j % 2 != 0) {
                    System.out.println(j);
                }
            }
            System.out.println(soma);
        }
        sc.close();
    }

    public static int somaImpares(int x, int y) {

    }
}
