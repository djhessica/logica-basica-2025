//Crie um algoritmo que receba dois valores (N1 e N2) e permita ao usuário escolher entre
//realizar uma (A) adição, (S) subtração, (M) multiplicação ou (D) divisão entre N1 e N2.
package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividade02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int N1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int N2 = scanner.nextInt();
        System.out.print("Digite A - Adição, S - Subtração");
        System.out.println("M - Multiplicação, D - Divisão):");
        String opcao = scanner.next();



        switch (opcao) {
            case "A":
                System.out.println("Resultado da adição: " + N1 + N2);
                break;
            case "S":
                System.out.println("Resultado da subtração: " + N1 + N2);
                break;
            case "M":
                System.out.println("Resultado da multiplicação: " + N1 + N2);
                break;
            case "D":
                System.out.println("Divisão:" + (N1 + N2));
                break;
        }

    }
}
