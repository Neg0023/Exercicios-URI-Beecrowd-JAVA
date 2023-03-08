import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
        //
        //- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
        //
        //Entrada
        //A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
        //
        //Saída
        //Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal.
        // Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
        // caso contrário, você receberá "Presentation Error".

        Scanner sc = new Scanner(System.in);

        //Lê o valor do raio da circunderencia
        double raio = sc.nextDouble();

        //Exibe a area da circunferencia com 4 casas decimais
        System.out.printf("A=%.4f%n", areaCircunferencia(raio));
    }

    //Calcula a area da circunferencia
    public static Double areaCircunferencia(double raio) {
        double pi = 3.14159;
        return pi * Math.pow(raio, 2);
    }
}
