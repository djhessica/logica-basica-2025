package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua Nacionalidade (BRASILEIRO ou BRASILEIRA): ");
        String nacionalidade = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        String nacionalidadeH = "BRASILEIRO";
        String nacionalidadeM = "BRASILEIRA";
        String nacionalidadesl = "";

        nacionalidade = nacionalidade.toUpperCase();

        if (!((nacionalidade.equals(nacionalidadeH)) || (nacionalidade.equals(nacionalidadeM)))) {
            return;
        }

        if (idade < 16) {
            System.out.println("não poderá votar :");
        } else if ((idade <= 17) || (idade > 70)) {
            System.out.println("voto facultativo:");
        } else if ((idade >= 18) || (idade <= 7)) {
            System.out.println("obrigatorio:");
        } else if (nacionalidade.equals(nacionalidadesl)) {
            System.out.println("Não apto para voto");

        }

    }
}