import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
        // A seguir, calcule e mostre o valor da conta a pagar.
        //
        //Entrada
        //O arquivo de entrada contém dois valores inteiros correspondentes a
        // o código e à quantidade de um item conforme tabela acima.
        //
        //Saída
        //O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago,
        // com 2 casas após o ponto decimal.
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int qtd = sc.nextInt();
        double total = 0;
        switch (codigo) {
            case 1:
                total = qtd * 4.0;
                break;
            case 2:
                total = qtd * 4.5;
                break;
            case 3:
                total = qtd * 5.0;
                break;
            case 4:
                total = qtd * 2.0;
                break;
            case 5:
                total = qtd * 1.5;
                break;
        }
        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}
