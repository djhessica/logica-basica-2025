package main.java.estruturaderepeticaofor;
//Exercício 1: Contador Simples
//Solicite um número e exiba todos os números de 1 até o valor digitado.

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }

}
