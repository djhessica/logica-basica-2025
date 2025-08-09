package main.java.com.estruturarepeticao;

import java.util.Scanner;

public class Prova01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int soma = 0;

        while (numero != 0){
            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();
            if (numero> 0){
                soma = soma + numero;
            }
        }
        System.out.println("Soma total: " + soma);
    }
}
