import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        //Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido
        //da mensagem “eh o maior”. Utilize a fórmula:
        //
        //
        //
        //Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
        // Um segundo passo, portanto é necessário para chegar no resultado esperado.
        //
        //Entrada
        //O arquivo de entrada contém três valores inteiros.
        //
        //Saída
        //Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
        Scanner sc = new Scanner(System.in);
        int a, b, c, maiorAB;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maiorAB = (a + b + Math.abs(a - b)) / 2;
        maiorAB = (c + maiorAB + Math.abs(maiorAB - c)) / 2;
        System.out.printf("%d eh o maior", maiorAB);
        sc.close();
    }
}
