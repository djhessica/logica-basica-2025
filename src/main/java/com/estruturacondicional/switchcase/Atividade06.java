//Peça dois números e uma operação:
//• 1: Soma
//• 2: Subtração
//• 3: Multiplicação
//• 4: Divisão
//Use switch para realizar o cálculo correspondente e exibir o resultado.
package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int N1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int N2 = scanner.nextInt();
        System.out.println("Digite a operação desejada:");
        System.out.println("1- soma");
        int soma = scanner.nextInt();
        System.out.println("2- subtração");
        int subtracao = scanner.nextInt();
        System.out.println("3- Multiplicação");
        int multiplicacao = scanner.nextInt();
        System.out.println("4- Divisão");
        int divisao = scanner.nextInt();
        System.out.print("Opção: ");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado da soma: " + (N1 + N2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (N1 - N2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + (N1 * N2));
                break;
            case 4:
                if (N2 != 0) {
                    System.out.println("Resultado da divisão: " + (N1 / N2));
                } else {
                    System.out.println("Erro: divisão por zero não permitida.");
                }
                break;
            default:
                System.out.println("Erro: opção inválida! Escolha entre 1, 2, 3 ou 4.");
                break;
        }

    }
}