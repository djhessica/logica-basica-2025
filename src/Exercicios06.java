//Considerando o nome, o preço de compra e o preço de venda de uma mercadoria,
// elabore um algoritmo que apresente o nome da mercadoria e o lucro obtido com a sua venda.

import java.util.Scanner;

public class Exercicios06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome da mercadoria: ");
        String nomeMercadoria = scanner.nextLine();

        System.out.print("Digite o preço de compra: ");
        double precoCompra = scanner.nextDouble();

        System.out.print("Digite o preço de venda: ");
        double precoVenda = scanner.nextDouble();

        // Cálculo do lucro
        double lucro = precoVenda - precoCompra;

        // Exibição do resultado
        System.out.println("\nNome da mercadoria: " + nomeMercadoria);
        System.out.println("Lucro obtido: R$ " + lucro);

        scanner.close();
    }
}