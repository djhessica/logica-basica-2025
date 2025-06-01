package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite primeiro numero :");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero :");
        double numero2 = scanner.nextDouble();

        double maior=0.0;

        if (numero1 > numero2) {
            maior = numero1;
        }else {
            maior = numero2;
        }
        System.out.println("Maior : "+ maior);
    }
}
// operador altenado = maior = (numero1 : numero2) ? numero1 : numero2: