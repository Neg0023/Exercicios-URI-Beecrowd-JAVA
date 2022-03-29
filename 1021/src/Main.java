import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
        // A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
        // As notas consideradas são de 100, 50, 20, 10, 5, 2.
        // As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
        // A seguir mostre a relação de notas necessárias.
        //
        //Entrada
        //O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
        //
        //Saída
        //Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
        // conforme exemplo fornecido.
        //
        //Obs: Utilize ponto (.) para separar a parte decimal.
        Scanner sc = new Scanner(System.in);
        double entrada = sc.nextDouble();
        double resto;

        System.out.println("NOTAS:");
        int entradaInteiro = 0;
        entradaInteiro = (int) entrada / 100;
        System.out.printf("%d nota(s) de R$ 100.00%n", entradaInteiro);
        entrada = entrada % 100;

        entradaInteiro = (int) entrada / 50;
        System.out.printf("%d nota(s) de R$ 50.00%n", entradaInteiro);
        entrada = entrada % 50;

        entradaInteiro = (int) entrada / 20;
        System.out.printf("%d nota(s) de R$ 20.00%n", entradaInteiro);
        entrada = entrada % 20;

        entradaInteiro = (int) entrada / 10;
        System.out.printf("%d nota(s) de R$ 10.00%n", entradaInteiro);
        entrada = entrada % 10;

        entradaInteiro = (int) entrada / 5;
        System.out.printf("%d nota(s) de R$ 5.00%n", entradaInteiro);
        entrada = entrada % 5;

        entradaInteiro = (int) entrada / 2;
        System.out.printf("%d nota(s) de R$ 2.00%n", entradaInteiro);
        entrada = entrada % 2;



        System.out.println("MOEDAS:");
        entradaInteiro = (int) entrada;
        System.out.printf("%d moeda(s) de R$ 1.00%n", entradaInteiro);
        entrada = entrada % 1;

        entrada = entrada * 100;

        entradaInteiro = (int) entrada / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", entradaInteiro);
        entrada = entrada % 50;

        entradaInteiro = (int) entrada / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", entradaInteiro);
        entrada = entrada % 25;

        entradaInteiro = (int) entrada / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", entradaInteiro);
        entrada = entrada % 10;

        entradaInteiro = (int) entrada / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n", entradaInteiro);
        entrada = entrada % 5;

        System.out.printf("%.0f moeda(s) de R$ 0.01%n", entrada);


        sc.close();
    }
}
