import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo para ler um valor A e um valor N.
        // Imprimir a soma de A + i para cada i com os valores (0 <= i <= N-1).
        // Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.
        //
        //Entrada
        //A entrada contém somente valores inteiros, podendo ser positivos ou negativos.
        // Todos os valores estão na mesma linha.
        //
        //Saída
        //A saída contém apenas um valor inteiro.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int soma=0;
        while (n <= 0) {
            n = sc.nextInt();
        }
        for (int i = 0; i <= n-1; i++) {
            soma += a + i;
        }
        System.out.println(soma);
        sc.close();
    }
}
