public class Main {
    public static void main(String[] args) {
        //Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
        //S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?
        //
        //Entrada
        //Não há nenhuma entrada neste problema.
        //
        //Saída
        //A saída contém um valor correspondente ao valor de S.
        //O valor deve ser impresso com dois dígitos após o ponto decimal.
        double s=1;
        double numrador=1;
        double denominador=1;

        while (numrador <= 39) {
            numrador += 2;
            denominador = denominador * 2;
            s += numrador / denominador;
        }
        System.out.printf("%.2f%n", s);
    }
}
