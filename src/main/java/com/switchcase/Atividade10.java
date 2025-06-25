//O usuário escolhe a região de destino:
//• 1: Sudeste
//• 2: Sul
//• 3: Centro-Oeste
//• 4: Norte
//• 5: Nordeste
//Com base na opção, exiba o valor do frete e o prazo de entrega estimado.
package main.java.com.switchcase;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero corespondente á Região desejada:");
        System.out.println("1- Sudeste");
        System.out.println("2- Sul");
        System.out.println("3- Centro-Oeste");
        System.out.println("4- Norte");
        System.out.println("5- Nordeste");
        int regiao = scanner.nextInt();

        switch (regiao){
            case 1:
                System.out.println("Valor frete:$= 15.00");
                System.out.println("Prazo de entrega: 7 dias uteis");
                break;
            case 2:
                System.out.println("Valor frete:$= 10.00");
                System.out.println("Prazo de entrega: 3 dias uteis");
                break;
            case 3:
                System.out.println("Valor frete:$= 19.00");
                System.out.println("Prazo de entrega: 13 dias uteis");
                break;
            case 4:
                System.out.println("Valor frete:$= 20.00");
                System.out.println("Prazo de entrega: 8 dias uteis");
                break;
            case 5:
                System.out.println("Valor frete:$= 11.00");
                System.out.println("Prazo de entrega: 9 dias uteis");
                break;
            default:
                System.out.println("Região invalida");
        }
    }
}
