package main.java.estruturaderepeticaofor;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[8];


                System.out.println("Digite 8 números inteiros:");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }


                int maior = numeros[0];
                for (int i = 1; i < numeros.length; i++) {
                    if (numeros[i] > maior) {
                        maior = numeros[i];
                    }
                }


                System.out.println("O maior número digitado foi: " + maior);
    }
}

