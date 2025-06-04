package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Texte12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero :");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero :");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero :");
        int numero3 = scanner.nextInt();

        if ((numero1 > numero2) && (numero1 > numero3)){
            System.out.println("o maior numero é :" + numero1);
        }else if ((numero2>numero1)&&(numero2>numero3)){
            System.out.println("maior numero :" + numero2);
        } else if ((numero3>numero2)&&(numero3>numero1)) {
            System.out.println("maior numero é :" + numero3);
        }
    }
}
