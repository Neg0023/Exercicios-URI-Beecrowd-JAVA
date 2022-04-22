public class Main {
    public static void main(String[] args) {
        //Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
        //
        //Entrada
        //Não há nenhuma entrada neste problema.
        //
        //Saída
        //Imprima a sequencia conforme exemplo abaixo
        for (int i = 1; i <= 9; i++) {
            if ((i % 2) != 0) {
                for (int j = 7; j >=5; j--) {
                    System.out.printf("I=%d J=%d%n", i, j);
                }
            }
        }
    }
}
