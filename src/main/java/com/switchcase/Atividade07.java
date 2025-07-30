//Solicite ao usuário um número de 1 a 7 e exiba o nome do dia correspondente:
//• 1: Domingo
//• 2: Segunda-feira
//...
//• 7: Sábado
//Use switch para retornar o nome do dia.
package main.java.com.switchcase;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        System.out.println("De 1 á 7");
        int numero = scanner.nextInt();


        switch (numero){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Este numero não coresponde a nenhum mes");
        }
    }
}
