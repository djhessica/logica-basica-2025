//1. Desenvolva um algoritmo que solicite ao usuário inserir um número que corresponda a um mês
//do ano. Após a entrada, o programa deve exibir por extenso o mês correspondente. Se o número
//inserido estiver fora do intervalo de 1 a 12, uma mensagem de erro será mostrada, alertando
//sobre a entrada incorreta.
package main.java.com.switchcase;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero do mês desejado");
        int mes = scanner.nextInt();

        switch (mes){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Entrada incorreta");
                break;
        }
    }
}
