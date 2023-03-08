
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        Scanner sc = new Scanner(System.in);
        int x,y;

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.printf("X = %d%n", soma(x, y));

        sc.close();
    }

    public static Integer soma(int x,int y) {
        return x + y;
    }
}
