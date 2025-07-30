package main.java.estruturaderepeticaofor;

import java.util.Scanner;

//Exercício 3: Soma de Números
//Solicite a quantidade de números a serem digitados e calcule a soma total desses números
public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você quer somar? ");
        int quantidade = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma total é: " + soma);
    }

}
