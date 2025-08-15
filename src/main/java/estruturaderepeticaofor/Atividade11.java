package main.java.estruturaderepeticaofor;

import java.util.Scanner;

public class Atividade11 {
        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);

            int[] numeros = new int[5];

            System.out.println("Digite 5 números inteiros:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }


            int soma = 0;
            for (int i = 0; i < numeros.length; i++) {
                soma += numeros[i];
            }

            System.out.println("A soma dos números digitados é: " + soma);

        }
}



