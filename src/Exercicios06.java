//Considerando o nome, o preço de compra e o preço de venda de uma mercadoria,
// elabore um algoritmo que apresente o nome da mercadoria e o lucro obtido com a sua venda.

import java.util.Scanner;

public class Exercicios06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da compra :");
        String nomeCompra = scanner.nextLine();

        System.out.println("Digite o preço da compra :");
        double precoCompra = scanner.nextDouble();

        System.out.println("Digite o preço de venda :");
        double precoVenda = scanner.nextDouble();

        double lucroObtido = (precoCompra + precoVenda) / precoCompra * 100;

        System.out.println("O lucro obitido é de :" + lucroObtido);
    }
}