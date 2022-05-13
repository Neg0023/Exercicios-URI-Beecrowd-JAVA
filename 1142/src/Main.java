import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um programa que leia um valor inteiro N.
        // Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.
        //
        //Entrada
        //O arquivo de entrada contém um número inteiro positivo N.
        //
        //Saída
        //Imprima a saída conforme o exemplo fornecido.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 1;
        for (int i = 1; i <= n; i++) {
            while (j%4!=0) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println("PUM");
            j++;
        }
        sc.close();
    }
}
