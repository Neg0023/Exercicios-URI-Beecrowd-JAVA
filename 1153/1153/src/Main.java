import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ler um valor N. Calcular e escrever seu respectivo fatorial.
        // Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        //
        //Entrada
        //A entrada contém um valor inteiro N (0 < N < 13).
        //
        //Saída
        //A saída contém um valor inteiro, correspondente ao fatorial de N.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
        sc.close();
    }
}
