public class Main {
    public static void main(String[] args) {
        //Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
        //
        //Entrada
        //Não há nenhuma entrada neste problema.
        //
        //Saída
        //Imprima a sequencia conforme exemplo abaixo.

        for (double i = 0; i <= 2; i+=0.2) {
            for (double j = 1; j<=3; j++) {
                System.out.printf("I=%.1f J=%.1f%n", i, j+i);
            }

        }
    }
}
