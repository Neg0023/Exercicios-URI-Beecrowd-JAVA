import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero).
        // Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).
        //
        //Entrada
        //O arquivo de entrada contém um número não determinado de valores M e N.
        // A última linha de entrada vai conter um número nulo ou negativo.
        //
        //Saída
        //Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        while (m > 0 && n > 0) {
            int sum = 0;
            if (m < n) {
                int troca = m;
                m = n;
                n = troca;
            }
            for (int i = n; i <= m; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.printf("Sum=%d%n", sum);
            m = sc.nextInt();
            n = sc.nextInt();
        }
        sc.close();
    }

    public void maior(int x, int y) {

    }
}
