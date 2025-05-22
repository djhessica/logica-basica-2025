//Peça ao usuário seu nome, salário atual e a porcentagem de aumento. Calcule o novo
//salário.
//Fórmula:
//novoSalario = salario + (salario * percentual / 100)

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome :");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sálario atual :");
        double salario = scanner.nextDouble();

        System.out.println("Digite á porcentagem de almento :");
        double porcentagem = scanner.nextDouble();

        double novoSalario = salario + (salario * porcentagem / 100);

        System.out.println("Seu sálario atual é :" + novoSalario);


    }
}