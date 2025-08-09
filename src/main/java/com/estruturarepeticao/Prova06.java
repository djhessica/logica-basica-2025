package main.java.com.estruturarepeticao;

import java.util.Scanner;

public class Prova06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a nota: " + i + " :");
            double nota = scanner.nextDouble();
            soma+= nota;
        }
        double media = soma / 3;
        System.out.println("quantidade de pares: " + media);
    }
    }


