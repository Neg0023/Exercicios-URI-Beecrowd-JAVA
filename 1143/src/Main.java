import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um programa que leia um valor inteiro N (1 < N < 1000).
        // Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.
        //
        //Entrada
        //O arquivo de entrada contém um número inteiro positivo N.
        //
        //Saída
        //Imprima a saída conforme o exemplo fornecido.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int resultado = 1;
            resultado = resultado * i;
            System.out.print(resultado + " ");
            resultado = resultado * i;
            System.out.print(resultado + " ");
            resultado = resultado * i;
            System.out.print(resultado);
            System.out.println();
        }
        sc.close();
    }
}
