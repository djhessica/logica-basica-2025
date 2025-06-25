//• Temperatura (em graus)
//• Tipo de conversão:
//o 1: Celsius → Fahrenheit
//o 2: Celsius → Kelvin
//o 3: Fahrenheit → Celsius
//o 4: Kelvin → Celsius
//Use switch para calcular e exibir o resultado da conversão.
package main.java.com.switchcase;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo da converção");
        System.out.println("1- Celsius para Fahrenheit ");
        System.out.println("2-Fahrenheit para Celsius ");
        System.out.println("3-Celsius para Kelvin    ");
        System.out.println("4-Kelvin para Celsius ");
        System.out.println("Digite á temperatura em graus");
        double temperatura = scanner.nextDouble();
        System.out.println("Digite o numero da opção");
        int opcao= scanner.nextInt();


        switch (opcao){
            case 1:
                System .out.println((temperatura * 9 / 5)+ 32);
                System.out.println("temperatura de Celsius para fahrenheit " + temperatura);
                break;
            case 2:
                System.out.println((temperatura - 32)* 9 / 5);
                System.out.println("temperatura de fahrenheit para Celsius " + temperatura);
                break;
            case 3:
                System.out.println(temperatura + 275.15);
                System.out.println("temperatura de Celsiusem para kelvin" + temperatura);
                break;
            case 4:
                System.out.println(temperatura - 275.15);
                System.out.println("temperatura de kelvin para Celsius " + temperatura);
                break;
            default:
                System.out.println("opção invalida");

        }

    }
}
