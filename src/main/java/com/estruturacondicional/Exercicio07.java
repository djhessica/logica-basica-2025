package main.java.com.estruturacondicional;// Crie um algoritmo que receba dois números inteiros e exiba a soma, a subtração, a multiplicação e a divisão desses números. Exiba os valores na mesma linha

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("Soma: " + soma + " | Subtração: " + subtracao + " | Multiplicação: "
                + multiplicacao + " | Divisão: " + divisao);

        scanner.close();
    }
}
