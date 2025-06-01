//faça um algoritimo que leia dois valores (A e B) e calcule
//separadamente a soma,subtraçao,multiplicaçao e divisao entre A e B
package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de 'A' ");
        double A = scanner.nextDouble();

        System.out.println("Digite o valor de 'B' ");
        double B = scanner.nextDouble();

        double soma = A + B;

        double divisao = A / B;

        double multiplicacao = A * B;

        double subtracao = A - B;

        System.out.println("Á soma :" + soma +" Á divisão :" + divisao +" Á multiplicação :" + multiplicacao + " Á subtração :" + subtracao);

    }
}
