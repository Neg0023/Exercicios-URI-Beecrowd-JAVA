import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo,
        // da esquerda para a direita.
        // Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.
        //
        //
        //
        //Entrada
        //A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima,
        // com todas as letras minúsculas.
        //
        //Saída
        //Imprima o nome do animal correspondente à entrada fornecida.
        Scanner sc = new Scanner(System.in);
        String classe1 = sc.nextLine();
        String classe2 = sc.nextLine();
        String classe3 = sc.nextLine();

        if (classe1.equals("vertebrado")) {
            if (classe2.equals("ave")) {
                if (classe3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (classe3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (classe2.equals("mamifero")) {
                if (classe3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (classe3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }

        } else if (classe1.equals("invertebrado")) {
            if (classe2.equals("inseto")) {
                if (classe3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (classe3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (classe2.equals("anelideo")) {
                if (classe3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (classe3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
        sc.close();
    }
}
