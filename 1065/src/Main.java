import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.
        //
        //Entrada
        //O arquivo de entrada contém 5 valores inteiros quaisquer.
        //
        //Saída
        //Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if ((n % 2) == 0) {
                contador++;
            }
        }
        System.out.printf("%d valores pares%n", contador);
        sc.close();
    }
}
