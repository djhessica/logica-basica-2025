//Crie um programa que converta um valor em reais para:
//• 1: Dólar
//• 2: Euro
//• 3: Libra
//• 4: Peso argentino
//Use switch para realizar a conversão com base na escolha do usuário. O valor em reais deve
//ser digitado
package main.java.com.switchcase;

import java.util.Scanner;

public class Atividade05{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor em reais (R$): ");
            double reais = scanner.nextDouble();

            System.out.println("Escolha a moeda para conversão:");
            int escolha = scanner.nextInt();
            System.out.println("1 - Dólar");
            double taxaDolar = 5.00;
            System.out.println("2 - Euro");
            double taxaEuro = 5.40;
            System.out.println("3 - Libra");
            double taxaLibra = 6.30;
            System.out.println("4 - Peso argentino");
            double taxaPesoArgentino = 0.025;

            switch (escolha) {
                case 1:
                    System.out.printf("Valor em Dólar: $%.2f%n", (reais / taxaDolar));
                    break;
                case 2:
                    System.out.printf("Valor em Euro: €%.2f%n", (reais / taxaEuro));
                    break;
                case 3:
                    System.out.printf("Valor em Libra: £%.2f%n", (reais / taxaLibra));
                    break;
                case 4:
                    System.out.printf("Valor em Peso Argentino: ARS %.2f%n", (reais / taxaPesoArgentino));
                    break;
                default:
                    System.out.println("Erro: Opção inválida! Escolha entre 1, 2, 3 ou 4.");
                    break;
            }
        }
    }