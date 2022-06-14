import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ler um número inteiro N e calcular todos os seus divisores.
        //
        //Entrada
        //O arquivo de entrada contém um valor inteiro.
        //
        //Saída
        //Escreva todos os divisores positivos de N, um valor por linha.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
