package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu salario :");
        double salario = scanner.nextDouble();

        double imposto = 0;

        if (imposto == 22847.76){
            System.out.println("isento");
        } else if (imposto >= 22847.76) {
            System.out.println("7,5%");
        } else if (imposto >= 33919.81) {
            System.out.println("15%");
        } else if (imposto >= 45012.61) {
            System.out.println("22,5%");
        } else if (imposto >= 55976.16) {
            System.out.println("27,5%");
        }
        double valorimposto = salario + imposto;
        System.out.println("Valor do imposto :" + valorimposto);
    }
}
