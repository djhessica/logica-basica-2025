//Desenvolvaum algoritmo que solicite ao usuário a entrada de três números inteiros e
// calcule a média aritmética entre eles.


import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite á primeira nota:");
        double primeiraNota = scanner.nextDouble();

        System.out.println("Digite á segunda nota:");
        double segundaNota = scanner.nextDouble();

        System.out.println("Digite á segunda nota:");
        double terceriraNota = scanner.nextDouble();

        double soma = primeiraNota + segundaNota + terceriraNota;
        double media = soma / 3;

        System.out.println("À media é: ");
        System.out.println(media);
    }
}
