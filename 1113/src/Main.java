import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
        // Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.
        //
        //Entrada
        //A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y.
        // A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.
        //
        //Saída
        //Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente,
        // caso contrário imprima a mensagem “Decrescente”.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y) {
            System.out.println((x > y) ? "Decrescente" : "Crescente");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
