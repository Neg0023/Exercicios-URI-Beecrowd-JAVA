import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
        //
        //Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
        //
        //Entrada
        //Quatro números inteiros representando a hora de início e fim do jogo.
        //
        //Saída
        //Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
        Scanner sc = new Scanner(System.in);
        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();
        int horas=0;
        int duracaoMinutos = 0;

        if (horaInicial < horaFinal) {
            horas = horaFinal - horaInicial;
            if (minutoInicial < minutoFinal) {
                duracaoMinutos = minutoFinal - minutoInicial;
            } else if (minutoInicial > minutoFinal) {
                duracaoMinutos = 60 - (minutoInicial - minutoFinal);
                horas -= 1;
            } else {
                duracaoMinutos = 0;
            }

        } else if (horaInicial > horaFinal) {
            horas = 24 - (horaInicial-horaFinal);
            if (minutoInicial < minutoFinal) {
                duracaoMinutos = minutoFinal - minutoInicial;
            } else if (minutoInicial > minutoFinal) {
                duracaoMinutos = 60 - (minutoInicial - minutoFinal);
                horas -= 1;
            } else {
                duracaoMinutos = 0;
            }

        } else {
            horas = 24;
            if (minutoInicial < minutoFinal) {
                horas = 0;
                duracaoMinutos = minutoFinal - minutoInicial;
            } else if (minutoInicial > minutoFinal) {
                duracaoMinutos = 60 - (minutoInicial - minutoFinal);
                horas -= 1;
            } else {
                duracaoMinutos = 0;
            }
        }
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horas, duracaoMinutos);
    }
}
