package main.java.com.estruturarepeticao;
//.Formule um algoritmo para registrar o valor das compras realizadas por 5 clientes em uma
//loja e apresentar: a) a compra de maior valor; b) a média dos valores das compras.
import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double maiorCompra = 0;
        double somaCompra = 0;

        while (contador < 5){
            System.out.println("Digite o valor (em reais ) de suas compras: ");
            double valorCompra = scanner.nextDouble();
            if (contador == 0){
                maiorCompra = valorCompra;
            }
            if (valorCompra > maiorCompra){
                maiorCompra = valorCompra;
            }
            somaCompra = somaCompra + valorCompra;
            contador++;
        }
        System.out.println("Maior compra: " + maiorCompra);
        double media = somaCompra / contador;
        System.out.println("Média das compras: " + media) ;

    }
}