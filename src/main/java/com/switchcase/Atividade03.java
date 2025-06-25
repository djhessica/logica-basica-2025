//Elabore um algoritmo que leia 3 valores: X, A e B. Onde X é um valor inteiro positivo, e A e B
//são valores reais e distintos entre si. O algoritmo deve exibir os valores lidos e: a) Se X=1,
//realizar a soma de A e B; b) Se X=2, realizar a divisão de A por B; c) Se X=3, exibir os valores
//A e B em ordem crescente; d) Se X=4, calcular a diferença entre o maior e o menor valor; e) Se
//X=5, calcular a média aritmética de A e B; f) Se X não for 1, 2, 3 ou 4, mostrar uma mensagem de erro.
package main.java.com.switchcase;

import java.util.Scanner;

public class Atividade03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um valor inteiro positivo (X): ");
            int X = scanner.nextInt();

            System.out.print("Digite um valor real distinto (A): ");
            double A = scanner.nextDouble();

            System.out.print("Digite um valor real distinto (B): ");
            double B = scanner.nextDouble();



            switch (X) {
                case 1:
                    System.out.println("Soma de A e B: " + (A + B));
                    break;
                case 2:
                        System.out.println("Divisão de A por B: " + (A / B));
                    break;
                case 3:
                    if (A > B) {
                        System.out.println("Valores em ordem crescente: " + B + ", " + A);
                    } else {
                        System.out.println("Valores em ordem crescente: " + A + ", " + B);
                    }
                    break;
                case 4:
                    if (A > B) {
                        System.out.println("Á diferença: "+ (A - B));
                    } else {
                        System.out.println("Á diferença:" + (B -A));
                    }
                    break;
                case 5:
                    System.out.println("Média aritmética de A e B: " + ((A + B) / 2));
                    break;
                default:
                    System.out.println("Erro: valor de X inválido. Escolha entre 1, 2, 3, 4 ou 5.");
                    break;
            }
        }
    }