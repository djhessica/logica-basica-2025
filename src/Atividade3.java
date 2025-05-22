//Peça ao usuário o preço de um produto e o percentual de desconto. Calcule o valor final
//após o desconto.
//Fórmula:
//valorFinal = preco - (preco * desconto / 100)

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto :");
        double valordoProduto = scanner.nextDouble();

        System.out.println("Digite o desconto :");
        double desconto = scanner.nextDouble();

        double valorFinal = valordoProduto - (valordoProduto * desconto / 100);

        System.out.println("O valor final com desconto é de :" + valorFinal);



    }
}