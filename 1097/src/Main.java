public class Main {
    public static void main(String[] args) {
        //Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
        //
        //Entrada
        //Não há nenhuma entrada neste problema.
        //
        //Saída
        //Imprima a sequencia conforme exemplo abaixo.
        int jota = 8;
        for (int i = 1; i <= 9; i+=2) {
                for (int j = 1; j<=3; j++) {
                    jota--;
                    System.out.printf("I=%d J=%d%n", i, jota);
                }
            jota += 5;
        }
    }
}
