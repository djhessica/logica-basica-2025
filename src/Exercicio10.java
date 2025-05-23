//Crie um algoritmo que receba a quantidade de dias, horas, minutos e segundos e converta tudo para segundos, exibindo o resultado final.


import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("|Digite as horas :");
        int horas = scanner.nextInt();

        System.out.println("Digite os dias :");
        int dias = scanner.nextInt();

        System.out.println("Digite os minutos :");
        int minutos = scanner.nextInt();

        System.out.println("Digite os segundos :");
        int segundos = scanner.nextInt();

        int diasSegundos = dias * 24 * 60 * 60;
        int horasSegundos = horas * 60 * 60;
        int minutosSegundos = minutos * 60;

        int totalDeSegundos = diasSegundos + horasSegundos + minutosSegundos +segundos;

        System.out.println("Os segundos são : " + totalDeSegundos);
    }
}
