import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
        // Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
        //
        //Entrada
        //A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante.
        // Pelo menos um destes números será positivo.
        //
        //Saída
        //O primeiro valor de saída é a quantidade de valores positivos.
        // A próxima linha deve mostrar a média dos valores positivos digitados.
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double soma = 0;
        for (int i = 0; i < 6; i++) {
            double n = sc.nextDouble();
            if (n > 0) {
                contador++;
                soma += n;
            }
        }
        double media = soma / contador;
        System.out.printf("%d valores positivos%n", contador);
        System.out.printf("%.1f%n", media);
        sc.close();
    }
}
