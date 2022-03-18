import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
        // e informe-o expresso no formato horas:minutos:segundos.
        //
        //Entrada
        //O arquivo de entrada contém um valor inteiro N.
        //
        //Saída
        //Imprima o tempo lido no arquivo de entrada (segundos),
        // convertido para horas:minutos:segundos, conforme exemplo fornecido.
        Scanner sc = new Scanner(System.in);
        int duracao = sc.nextInt();
        int resto, hora, minuto, segundos;

        hora = duracao / 3600;
        resto = duracao % 3600;
        minuto = resto / 60;
        segundos = resto % 60;

        System.out.printf("%d:%d:%d%n", hora, minuto, segundos);
        sc.close();
    }
}
