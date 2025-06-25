package main.java.com.estruturacondicional;//Elabore um algoritmo para solicitar a entrada da base e da altura de um triângulo.
// Em seguida, calcule e exiba a área do triângulo conforme a fórmula: Área = (Base * Altura) / 2.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite á base: ");
        double base = scanner.nextDouble();

        System.out.println("Digite á altura:");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("Á area do triangulo:");
        System.out.println(area);

    }
}