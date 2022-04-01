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
        int maior;

        if ((valor1 > valor2) && (valor1 > valor3)) {
            maior = valor1;
        } else if (valor2 > valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }
        //nao terminado
    }
}
