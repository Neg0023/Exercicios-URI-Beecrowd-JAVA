import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.
        //
        //Entrada
        //Seis valores, negativos e/ou positivos.
        //
        //Saída
        //Imprima uma mensagem dizendo quantos valores positivos foram lidos.
        Scanner sc = new Scanner(System.in);
        int contador=0;
        for (int i = 0; i < 6; i++) {
            double valores = sc.nextDouble();
            if (valores > 0) {
                contador++;
            }
        }
        System.out.printf("%d valores positivos%n", contador);
        sc.close();
    }
}
