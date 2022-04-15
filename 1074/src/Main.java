import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida.
        // Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD),
        // positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0),
        // embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.
        //
        //Entrada
        //A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste.
        // Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
        //
        //Saída
        //Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo.
        // Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int valor = sc.nextInt();
            if ((valor % 2) == 0 && valor != 0) {
                if (valor > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else if (valor == 0) {
                System.out.println("NULL");
            } else {
                if (valor > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
        sc.close();
    }
}
