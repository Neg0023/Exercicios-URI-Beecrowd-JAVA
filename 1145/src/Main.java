import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y,
        // passando para a próxima linha a cada X números.
        //
        //Entrada
        //O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).
        //
        //Saída
        //Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número,
        // conforme exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        int contador = 1;
        while (contador <= y) {
            for (int i = 1; i <= x; i++) {
                if (contador<=y) {
                    System.out.print((i == x) ? contador : contador + " ");
                    contador++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
