import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída serão apresentadas na execução do programa,
        // seguindo a lógica do exemplo abaixo.
        // Para valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.
        //
        //Entrada
        //O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).
        //
        //Saída
        //Imprima a saída conforme o exemplo fornecido.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int somaUm = 0;
            for (int j = 1; j <= 2; j++) {
                System.out.println(i + " " + ((i * i) + somaUm) + " " + ((i * i * i) + somaUm));
                somaUm++;
            }
        }
        sc.close();
    }
}
