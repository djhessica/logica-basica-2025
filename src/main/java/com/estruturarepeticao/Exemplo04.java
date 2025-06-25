package main.java.com.estruturarepeticao;

import java.util.Scanner;
//Escreva um aplicativo em Java mostra todos os números ímpares de 1 até 100.
public class Exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();

        while (numero < 100) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
