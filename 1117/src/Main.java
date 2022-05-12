import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral.
        // Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]).
        // Cada nota deve ser validada separadamente.
        //
        //Entrada
        //A entrada contém vários valores reais, positivos ou negativos.
        // O programa deve ser encerrado quando forem lidas duas notas válidas.
        //
        //Saída
        //Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
        //Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo.
        // O valor deve ser apresentado com duas casas após o ponto decimal.
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for (int i = 0; i < 2; i++) {
            double nota = sc.nextDouble();
            while (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
                nota = sc.nextDouble();
            }
            soma+=nota;
        }
        double media = soma / 2;
        System.out.printf("media = %.2f%n", media);
        sc.close();
    }
}