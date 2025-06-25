package main.java.com.estruturarepeticao;

import java.util.Scanner;

public class Teste02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalNotas = 0.0;
        double nota = 0.0;
        int contador = 0;
        int sair = 0;

        while (sair != 3){
            System.out.println("Informe á nota:");
            nota = scanner.nextDouble();
            totalNotas = scanner.nextDouble();
            totalNotas = totalNotas + nota;
            contador = contador + 1;
            System.out.println("Digite 3 para sair");
            sair = scanner.nextInt();
        }
        double media = totalNotas / contador;
        System.out.println("Á media é: "+ media);

    }
}
