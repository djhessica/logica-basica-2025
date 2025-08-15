package main.java.com.estruturarepeticao;

import java.util.Scanner;

//Atividade 1 – Controle de Estoque
// Crie um programa que leia a quantidade em estoque de 5 produtos e exiba:
// 1. A quantidade total de itens no estoque.
// 2. O produto com a menor quantidade.
// Não utilize funções prontas, apenas laços for e lógica
public class NovaAtividade01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] estoque = new int[5];
            int total = 0;
            int menorQuantidade;
            int produtoMenor;

            for (int i = 0; i < 5; i++) {
                System.out.print("Digite a quantidade em estoque do produto " + (i + 1) + ": ");
                estoque[i] = scanner.nextInt();
                total += estoque[i];
            }

            menorQuantidade = estoque[0];
            produtoMenor = 1;

            for (int i = 1; i < 5; i++) {
                if (estoque[i] < menorQuantidade) {
                    menorQuantidade = estoque[i];
                    produtoMenor = i + 1;
                }
            }
            System.out.println("\nQuantidade total de itens no estoque: " + total);
            System.out.println("Produto com menor quantidade em estoque: Produto " + produtoMenor + " (" + menorQuantidade + " unidades)");
        }
    }


