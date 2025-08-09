package main.java.com.estruturarepeticao;

import java.util.Scanner;

public class Prova04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contadorPares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0){
                contadorPares++;
            }
        }
        System.out.println("quantidade de pares: " + contadorPares);
    }
}
