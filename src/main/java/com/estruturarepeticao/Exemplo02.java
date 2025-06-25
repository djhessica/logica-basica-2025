package main.java.com.estruturarepeticao;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int N = scanner.nextInt();

        do {
            System.out.println(N);
            N++;
        }while (N <= 5);
    }
}
