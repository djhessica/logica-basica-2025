package main.java.com.estruturarepeticao;

import java.util.Scanner;

public class Atividade14Simplificada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base (A): ");
        int base = scanner.nextInt();
        System.out.print("Digite o valor do expoente (B): ");
        int expoente = scanner.nextInt();
        int soma =1;

        while (expoente --> 0) soma *= base;
        System.out.println("A exponenciação de A por B é: " + soma);
    }
}
