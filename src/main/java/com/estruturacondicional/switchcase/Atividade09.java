//Exiba um menu com 5 opções de pratos. O usuário escolhe o prato digitando o número e o
//programa exibe:
//• Nome do prato
//• Preço
//• Tempo médio de preparo
//Use switch para controlar as opções.
package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero do seu prato desejado:");
        System.out.println("1- Macarão á carbonara");
        System.out.println("2- Peixe");
        System.out.println("3- Arroz e Feijão");
        System.out.println("4- Minestra");
        System.out.println("5- Salada");
        int prato = scanner.nextInt();

        switch (prato){
            case 1:
                System.out.println("Macarão á Carbonara:");
                System.out.println("Valor : 72.90");
                System.out.println("Tempo de espera de : 30min");
                break;
            case 2:
                System.out.println("Peixe");
                System.out.println("Valor : 72.90");
                System.out.println("Tempo de espera de : 30min");
                break;
            case 3:
                System.out.println("Arroz e Feijão");
                System.out.println("Valor : 72.90");
                System.out.println("Tempo de espera de : 30min");
                break;
            case 4:
                System.out.println("Minestra");
                System.out.println("Valor : 72.90");
                System.out.println("Tempo de espera de : 30min");
                break;
            case 5:
                System.out.println("Salada");
                System.out.println("Valor : 72.90");
                System.out.println("Tempo de espera de : 30min");
                break;
            default:
                System.out.println("Numero invalido!!");
        }
    }
}
