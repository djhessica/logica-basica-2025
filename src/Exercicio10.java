//Crie um algoritmo que receba a quantidade de dias, horas, minutos e segundos e converta tudo para segundos, exibindo o resultado final.


import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("|Digite as horas :");
        double horas = scanner.nextDouble();

        System.out.println("Digite os dias :");
        double dias = scanner.nextDouble();

        System.out.println("Digite os minutos :");
        double minutos = scanner.nextDouble();

        System.out.println("Digite os segundos :");
        double segundos = scanner.nextDouble();

        double cauculosSegundos = horas * 60 * dias * 60 * minutos * 60 * segundos;

        System.out.println("Os segundos são : " + cauculosSegundos);
    }
}
