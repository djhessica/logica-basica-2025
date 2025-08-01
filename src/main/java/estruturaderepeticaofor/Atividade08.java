package main.java.estruturaderepeticaofor;

import java.util.Scanner;

//Exercício 8: Multiplicação com Somas
//Solicite dois números e calcule a multiplicação usando somas sucessivas (ex: 4 * 3 = 4 + 4 + 4)
public class Atividade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        int soma =0;

        for (int i = 0; i < numero2; i++) {
            soma = soma + numero1;

        }
        System.out.println("Resultado da operação: " +soma);
    }
}
