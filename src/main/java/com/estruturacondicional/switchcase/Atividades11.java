//Permita que o usuário:
//• 1: Ver saldo
//• 2: Sacar dinheiro
//• 3: Depositar dinheiro
//• 4: Sair
//Use switch e simule o saldo com uma variável inicial.
package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividades11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a opção desejada:");
        System.out.println("1- Ver saldo");
        System.out.println("2- Sacar dinheiro");
        System.out.println("3- Depositar dinheiro");
        System.out.println("4- Sair");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Saldo disponivel: 1.345");
                break;
            case 2:
                System.out.println("Digite valor desejado para saque:");
                break;
            case 3:
                System.out.println("Deposito");
                break;
            case 4:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
