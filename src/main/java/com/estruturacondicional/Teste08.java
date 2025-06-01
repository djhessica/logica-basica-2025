package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero :");
        int numero = scanner.nextInt();

        if (numero < 0) {
            numero = numero * -1;
        }
        if (numero < 10){
            System.out.println("Unidade :");

        } else if (numero < 100) {
            System.out.println("Dezena: ");

        }else if (numero < 1000){
            System.out.println("Centena:");
        }
    }
}
