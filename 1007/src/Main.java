import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        //Leia quatro valores inteiros A, B, C e D.
        // A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
        // segundo a fórmula: DIFERENCA = (A * B - C * D).
        //
        //Entrada
        //O arquivo de entrada contém 4 valores inteiros.
        //
        //Saída
        //Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo,
        // com um espaço em branco antes e depois da igualdade.

        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diferenca;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        System.out.printf("DIFERENCA = %d%n", diferenca(a, b, c, d));

        sc.close();
    }

    public static Integer diferenca(int a, int b, int c, int d) {
        return ((a*b) - (c*d));
    }
}
