package main.java.com.estruturacondicional;//faça um algoritimo onde o usuario irá digitar a idade de uma pessoa, e é emitida
//uma mensagem informando se a mesma é maior ou menor de idade (considerando 18 anos como maior idade)


import java.util.Scanner;

public class Teste01 {
    public static final int MAIORIDADE = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade");
        int idade = scanner.nextInt();

        if (idade >= MAIORIDADE ) {
            System.out.println("Maior de idade");

        } else {
            System.out.println("Menor de idade");
        }
    }
}
