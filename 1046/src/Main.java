import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
        // sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        //
        //Entrada
        //A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
        //
        //Saída
        //Apresente a duração do jogo conforme exemplo abaixo.
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int duracao;

        if (inicio > fim) {
            duracao = 24-(inicio-fim);
            System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
        } else if (inicio < fim) {
            duracao = fim - inicio;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        sc.close();
    }
}
