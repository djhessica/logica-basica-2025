package main.java.com.estruturacondicional;//Crie um algoritmo para calcular a média entre dois números inteiros inseridos pelo usuário.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite á primeira nota :");
        double primeiraNota = scanner.nextDouble();

        System.out.println("Digite á segunda nota :");
        double segundaNota = scanner.nextDouble();

        double nota = primeiraNota + segundaNota;
        double media = nota / 2;

        System.out.println("Sua media final é de :" + media);


    }
}
