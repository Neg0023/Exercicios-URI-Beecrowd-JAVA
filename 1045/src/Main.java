import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente,
        // de modo que o lado A representa o maior dos 3 lados.
        // A seguir, determine o tipo de triângulo que estes três lados formam,
        // com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
        //se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
        //se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
        //se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
        //se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
        //se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
        //se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
        //Entrada
        //A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).
        //
        //Saída
        //Imprima todas as classificações do triângulo especificado na entrada.

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double troca;

        if (b > a && b >= c) {
            troca = a;
            a = b;
            b = troca;
        } else if (c > a && c >= b) {
            troca = a;
            a = c;
            c = troca;
        }

        if (c > b) {
            troca = b;
            b = c;
            c = troca;
        }


        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if ((a * a) == (b * b) + (c * c)) {
            System.out.println("TRIANGULO RETANGULO");
        } else {
            boolean b1 = (a == b && b != c) || (a != b && b == c);
            if ((a * a) > (b * b) + (c * c)) {
                System.out.println("TRIANGULO OBTUSANGULO");
                if (a == b && b == c) {
                    System.out.println("TRIANGULO EQUILATERO");
                } else if (b1) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            } else if ((a * a) < (b * b) + (c * c)) {
                System.out.println("TRIANGULO ACUTANGULO");
                if (a == b && b == c) {
                    System.out.println("TRIANGULO EQUILATERO");
                }else if (b1) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }
        sc.close();
    }
}
