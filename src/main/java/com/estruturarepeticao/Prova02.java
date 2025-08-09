package main.java.com.estruturarepeticao;

import java.util.Scanner;

public class Prova02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[5];
        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota " + (i+1) + ": ");
            notas[i] = scanner.nextInt();
        }
        System.out.println("Notas na ordem digitada: ");
        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i] + " ");
        }
        System.out.println();
        System.out.println("Notas na ordem inversa; ");
        for (int i = notas.length - 1; i >= 0; i--){
            System.out.println(notas[i] + " ");
        }
    }
}
