package main.java.estruturaderepeticaofor;
//Exercício 6: Contagem Regressiva
//Solicite um número inicial e faça a contagem regressiva até 1
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        /*for (int i = 0; i < numero ; i++){
         System.out.println(i);
        }*/

        for (int i = numero; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

