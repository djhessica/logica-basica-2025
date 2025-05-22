//Desenvolva um algoritmo que solicite ao usuário a entrada de três números inteiros e calcule a média aritmética entre eles.

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero :");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero :");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terçeiro numero :");
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3 ;

        System.out.println("Á medoa aritimetrica é :" + media);


    }
}
