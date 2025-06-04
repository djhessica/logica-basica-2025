package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor entre 10 e 1000: ");
        int valorPedido = scanner.nextInt();

        if (valorPedido < 10 || valorPedido > 1000) {
            System.out.println("Valor fora do intervalo permitido!");
            return;
        }

        int[] cedulasDisponiveis = {100, 50, 20, 10, 5, 2, 1};
        System.out.println("Quantidade de notas:");

        for (int cedula : cedulasDisponiveis) {
            int quantidade = valorPedido / cedula;
            if (quantidade > 0) {
                System.out.println(quantidade + " nota(s) de " + cedula);
                valorPedido %= cedula;
            }
        }

        scanner.close();
    }
}