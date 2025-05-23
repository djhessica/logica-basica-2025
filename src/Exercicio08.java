//Desenvolva um algoritmo que solicite ao usuário a entrada de três números inteiros e calcule a média aritmética entre eles.

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero :");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero :");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero :");
        int numero3 = scanner.nextInt();

        int soma = numero1 + numero2 + numero3;
        double media = soma / 3;

        System.out.println("Á media aritimetrica é :" + media);


    }
}
