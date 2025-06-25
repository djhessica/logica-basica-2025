//O usuário digita a moeda e o programa devolve a cotação
//• Dólar – cotação 6 dólares
//• Peso –  cotação 0.25565 pesos
//• Euro – Cotação 7 euros
//• Libra – 5.50 libras
//• Real – 5.00 reais
package main.java.com.switchcase;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite á moeda");
        String moeda = scanner.nextLine();


        switch (moeda){
            case "DÒLAR":
                System.out.println("Cotação = 6 Dólares");
                break;
            case "PESO":
                System.out.println("Cotação = 0.25565 Pesos");
                break;
            case "EURO":
                System.out.println("Cotação = 7 Euros");
                break;
            case "LIBRA":
                System.out.println("5.50 Libras");
                break;
            case "REAL":
                System.out.println("5.00 Reais");
                break;
            default:
                System.out.println("Moeda invalida");
        }
    }
}
