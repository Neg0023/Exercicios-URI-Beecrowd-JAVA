import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia um valor inteiro. A seguir,
        // calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
        // As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
        // A seguir mostre o valor lido e a relação de notas necessárias.
        //
        //Entrada
        //O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
        //
        //Saída
        //Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias,
        // conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha,
        // caso contrário seu programa apresentará a mensagem: “Presentation Error”.
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        int nota100, nota50, nota20, nota10, nota5, nota2, nota1, resto;

        nota100 = entrada / 100;
        resto = entrada % 100;
        nota50 = resto / 50;
        resto = resto % 50;
        nota20 = resto / 20;
        resto = resto % 20;
        nota10 = resto / 10;
        resto = resto % 10;
        nota5 = resto / 5;
        resto = resto % 5;
        nota2 = resto / 2;
        resto = resto % 2;
        nota1 = resto;

        System.out.println(entrada);
        System.out.printf("%d nota(s) de R$ 100,00%n", nota100);
        System.out.printf("%d nota(s) de R$ 50,00%n", nota50);
        System.out.printf("%d nota(s) de R$ 20,00%n", nota20);
        System.out.printf("%d nota(s) de R$ 10,00%n", nota10);
        System.out.printf("%d nota(s) de R$ 5,00%n", nota5);
        System.out.printf("%d nota(s) de R$ 2,00%n", nota2);
        System.out.printf("%d nota(s) de R$ 1,00%n", nota1);
        sc.close();
    }
}
