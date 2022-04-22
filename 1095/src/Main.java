public class Main {
    public static void main(String[] args) {
        //Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
        //
        //Entrada
        //Não há nenhuma entrada neste problema.
        //
        //Saída
        //Imprima a sequencia conforme exemplo abaixo
        int i = 1;
        for (int j = 60; j >= 0; j -= 5) {
            System.out.printf("I=%d J=%d%n", i, j);
            i += 3;
        }
    }
}
