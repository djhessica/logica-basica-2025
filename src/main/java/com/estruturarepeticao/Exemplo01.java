package main.java.com.estruturarepeticao;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int N = scanner.nextInt();

        while (N <= 0){
            System.out.println(N);
            N++;
        }
    }
}
