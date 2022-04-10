import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
        //
        //
        //Salário	Percentual de Reajuste
        //0 - 400.00                15%
        //400.01 - 800.00           12%
        //800.01 - 1200.00          10%
        //1200.01 - 2000.00         7%
        //Acima de 2000.00          4%

        //Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.
        //
        //Entrada
        //A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
        //
        //Saída
        //Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double reajuste = 0;
        int percentual=0;

        if (salario > 0 && salario <= 400.0) {
            percentual = 15;
            reajuste = salario * percentual / 100;
        } else if (salario <= 800.0) {
            percentual = 12;
            reajuste = salario * percentual / 100;
        } else if (salario <= 1200.0) {
            percentual = 10;
            reajuste = salario * percentual / 100;
        } else if (salario <= 2000.0) {
            percentual = 7;
            reajuste = salario * percentual / 100;
        } else if (salario>2000.0) {
            percentual = 4;
            reajuste = salario * percentual / 100;
        }

        salario += reajuste;
        System.out.printf("Novo salario: %.2f%n", salario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");
        sc.close();
    }
}
