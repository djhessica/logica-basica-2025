package main.java.com.estruturacondicional;//Peça ao usuário o valor total da conta e o número de amigos. Calcule quanto cada um deve
//pagar.
//Fórmula:
//valorPorPessoa = total / numeroAmigos

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da conta :");
        double valor = scanner.nextDouble();

        System.out.println("Digite o numero de amigos :");
        double numeroAmigos = scanner.nextDouble();

        double valorPorPessoa = valor / numeroAmigos;

        System.out.println("O valor total para cada um é de :" + valorPorPessoa);

    }
}
