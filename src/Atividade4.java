//Peça ao usuário o nome, peso (kg) e altura (m). Calcule o IMC.
//Fórmula:
//IMC = peso / (altura * altura)

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome :");
        String nome = scanner.nextLine();

        System.out.println("Digite seu peso :");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura :");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu imc é de :" + imc);
    }
}