import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo
        // resto da divisão dele por 5 for igual a 2 ou igual a 3.
        //
        //Entrada
        //O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem crescente.
        //
        //Saída
        //Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > y) {
            int troca = x;
            x = y;
            y = troca;
        }

        for (int i = x+1; i < y; i++) {
            int resto = i % 5;
            if (resto == 2 || resto == 3) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}