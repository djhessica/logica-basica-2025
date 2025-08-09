package main.java.com.estruturarepeticao;

import java.util.Scanner;

public class Prova03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        int contador = 1;

        while (contador <= numero){
            fatorial = fatorial * contador;
            contador++;
        }
        System.out.println("Fatorial: " + fatorial);
    }

}
