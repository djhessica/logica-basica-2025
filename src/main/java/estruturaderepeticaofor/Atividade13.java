package main.java.estruturaderepeticaofor;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[6];


                System.out.println("Digite 6 números inteiros:");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }


                int contadorPares = 0;
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] % 2 == 0) {
                        contadorPares++;
                    }
                }


                System.out.println("Quantidade de números pares digitados: " + contadorPares);

    }
}
