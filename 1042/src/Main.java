import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia 3 valores inteiros e ordene-os em ordem crescente.
        // No final, mostre os valores em ordem crescente, uma linha em branco e em seguida,
        // os valores na sequência como foram lidos.
        //
        //Entrada
        //A entrada contem três números inteiros.
        //
        //Saída
        //Imprima a saída conforme foi especificado.
        Scanner sc = new Scanner(System.in);
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        int troca;

        int entrada1 = valor1;
        int entrada2 = valor2;
        int entrada3 = valor3;


        if (valor2 > valor1 && valor2 >= valor3) {
            troca = valor1;
            valor1 = valor2;
            valor2 = troca;
        } else if (valor3 > valor1 && valor3 >= valor2) {
            troca = valor1;
            valor1 = valor3;
            valor3 = troca;
        }

        if (valor3 > valor2) {
            troca = valor2;
            valor2 = valor3;
            valor3 = troca;
        }

        System.out.println(valor3);
        System.out.println(valor2);
        System.out.println(valor1);
        System.out.println();
        System.out.println(entrada1);
        System.out.println(entrada2);
        System.out.println(entrada3);
    }
}
