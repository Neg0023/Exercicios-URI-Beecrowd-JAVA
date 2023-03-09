import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
        // Em seguida, calcule e mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.
        //Entrada
        //O arquivo de entrada contém três valores com um dígito após o ponto decimal.
        //
        //Saída
        //O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
        // sempre com mensagem correspondente e um espaço entre os dois pontos e o valor.
        // O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", triangulo(a,c));
        System.out.printf("CIRCULO: %.3f%n", circulo(c));
        System.out.printf("TRAPEZIO: %.3f%n", trapezio(a, b, c));
        System.out.printf("QUADRADO: %.3f%n", quadrado(b));
        System.out.printf("RETANGULO: %.3f%n", retangulo(a, b));
        sc.close();
    }

    public static Double triangulo(double a, double c) {
        return (a*c)/2;
    }
    public static Double circulo(double c) {
        return Math.PI * Math.pow(c, 2);
    }
    public static Double trapezio(double a, double b, double c) {
        return ((a + b) * c) / 2;
    }
    public static Double quadrado(double b) {
        return Math.pow(b, 2);
    }
    public static Double retangulo(double a, double b) {
        return a * b;
    }
}
