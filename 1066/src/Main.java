import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares,
        // quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos
        // valores digitados foram negativos.
        //
        //Entrada
        //O arquivo de entrada contém 5 valores inteiros quaisquer.
        //
        //Saída
        //Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.
        Scanner sc = new Scanner(System.in);
        int negativos = 0;
        int positivo = 0;
        int par = 0;
        int impar = 0;

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if (n > 0) {
                positivo++;
            } else if (n < 0) {
                negativos++;
            }
            if ((n % 2) == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.printf("%d valor(es) par(es)%n", par);
        System.out.printf("%d valor(es) impar(es)%n", impar);
        System.out.printf("%d valor(es) positivo(s)%n", positivo);
        System.out.printf("%d valor(es) negativo(s)%n", negativos);
        sc.close();
    }
}
