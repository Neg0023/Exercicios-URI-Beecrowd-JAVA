import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
        // O último dado, que não entrará nos cálculos, contém o valor de idade negativa.
        // Calcular e imprimir a idade média deste grupo de indivíduos.
        //
        //Entrada
        //A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.
        //
        //Saída
        //A saída contém um valor correspondente à média de idade dos indivíduos.
        //
        //A média deve ser impressa com dois dígitos após o ponto decimal.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soma = 0;
        double media;
        int contador = 0;
        while (n > 0) {
            soma += n;
            n = sc.nextInt();
            contador++;
        }
        media = (double) soma / contador;
        System.out.printf("%.2f%n", media);
        sc.close();
    }
}
