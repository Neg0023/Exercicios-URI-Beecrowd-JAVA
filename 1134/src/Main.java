import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
        // Escreva um algoritmo para ler o tipo de combustível abastecido
        // (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
        // Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código
        // (até que seja válido). O programa será encerrado quando o código informado for o número 4.
        //
        //Entrada
        //A entrada contém apenas valores inteiros e positivos.
        //
        //Saída
        //Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de
        // combustível, conforme exemplo.
        Scanner sc = new Scanner(System.in);
        int codigo = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        do {
            codigo = sc.nextInt();
            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        } while (codigo != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);
        sc.close();
    }
}
