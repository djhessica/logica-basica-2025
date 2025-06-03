package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero :");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero :");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero :");
        int numero3 = scanner.nextInt();

        if ((numero1 < 0 ) || ( numero2 < 0) || (numero3 < 0)) {
            System.out.println("Não forma um triangulo");
        }
            if ((numero1 == numero2) && (numero2 == numero3)) {
                System.out.println("Equilátero");
            } else if ((numero1 == numero2) && (numero2 != numero3)) {
                System.out.println("Isósceles");
            } else if ((numero1 != numero2) && (numero2 != numero3)) {
                System.out.println("Escaleno");
                System.out.println("Não forma um triangulo");
            }



    }
}
