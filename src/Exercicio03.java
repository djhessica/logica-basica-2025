//Desenvolva um algoritmo para determinar o valor de y na equação y = 3x + 2.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de y :");
        double y = scanner.nextDouble();

        double valorY = 3 * 3 + 2;


        System.out.println("O valor de y é :" + valorY );

    }
}