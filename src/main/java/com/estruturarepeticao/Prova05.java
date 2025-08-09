package main.java.com.estruturarepeticao;

import java.util.Scanner;

public class Prova05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int quantidade = 0;

        while (numero >= 0){
            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();
            if (numero >= 0){
                quantidade++;
            }
        }
        System.out.println("Quantidade digitada: " + quantidade);
    }
}

