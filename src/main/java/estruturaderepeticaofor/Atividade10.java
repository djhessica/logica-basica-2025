package main.java.estruturaderepeticaofor;

import java.util.Scanner;

//: Verificação de Números Positivos e Negativos
// Peça 5 números ao usuário e conte quantos são positivos e quantos são negativos
public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("\nTotal de números positivos: " + positivos);
        System.out.println("Total de números negativos: " + negativos);
    }
}
