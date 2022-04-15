import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X,
        // um valor por linha, inclusive o X ser for o caso.
        //
        //Entrada
        //A entrada será um valor inteiro positivo.
        //
        //Saída
        //A saída será uma sequência de seis números ímpares.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = x; i < (x + 12); i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
