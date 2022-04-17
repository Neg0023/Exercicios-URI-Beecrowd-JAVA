import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar
        // os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano,
        // quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
        //
        //Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos.
        // Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados,
        // o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.
        //
        //Entrada
        //A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir.
        // Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias
        // utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).
        //
        //Saída
        //Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de
        // cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois
        // dígitos após o ponto.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int r = 0;
        int s = 0;
        int total=0;
        for (int i = 1; i <= n; i++) {

            int qtd = sc.nextInt();
            total+=qtd;
            char cobaia = sc.next().charAt(0);
            switch (cobaia) {
                case 'C':
                    c += qtd;
                    break;
                case 'R':
                    r += qtd;
                    break;
                case 'S':
                    s += qtd;
                    break;
            }
        }
        System.out.printf("Total: %d cobaias%n", total);
        System.out.printf("Total de coelhos: %d%n", c);
        System.out.printf("Total de ratos: %d%n", r);
        System.out.printf("Total de sapos: %d%n", s);
        double percentual = (double) c / total * 100;
        System.out.println("Percentual de coelhos: " + String.format("%.2f",percentual) + " %");
        percentual = (double) r / total * 100;
        System.out.println("Percentual de ratos: " + String.format("%.2f",percentual) + " %");
        percentual = (double) s / total * 100;
        System.out.println("Percentual de sapos: " + String.format("%.2f",percentual) + " %");
        sc.close();
    }
}
