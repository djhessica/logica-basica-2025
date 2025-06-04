//Solicite ao usuário:
//• Valor do empréstimo.
//• Número de parcelas (até 24).
//• Salário mensal.
//Condições para aprovação:
//• O valor de cada parcela não pode ultrapassar 30% do salário.
//• O número de parcelas deve ser entre 1 e 24.
//Responda:
//• Se aprovado: exiba o valor da parcela e "Empréstimo aprovado".
//• Se reprovado: exiba o motivo ("Parcela muito alta" ou "Número de parcelas inválido").
//Requisitos:
//• Uso exclusivo de if e else.
//• Scanner para entrada.

package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do emprestimo :");
        double valorEmprestimo = scanner.nextDouble();

        System.out.println("Digite em quantas parcelas gostaria sendo o maximo (24x)");
        int numeroParcelas = scanner.nextInt();

        System.out.println("Digite o valor mensal do seu salario :");
        int salarioMensal = scanner.nextInt();

        double valorParcela = valorEmprestimo / numeroParcelas;

        if (numeroParcelas < 1 || numeroParcelas > 24) {
            System.out.println("Número de parcelas inválido.");
        } else if (valorParcela > salarioMensal * 0.30) {
            System.out.println("Parcela muito alta.");
        } else {
            System.out.printf("Valor da parcela: R$ %.2f\n", valorParcela);
            System.out.println("Empréstimo aprovado.");
        }
    }
}

