package main.java.com.estruturarepeticao;
//Construa um programa que receba o valor (em reais) pago por 10 clientes em suas compras. O
//programa deverá fornecer: a) o valor médio das compras realizadas; b) a quantidade de clientes
// cujas compras excederam 100,00 reais.
import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int quantidadeClientes = 0;
        double somaCompra = 0;

        while (contador < 10){
            System.out.println("Digite o valor (em reais ) de suas compras: ");
           double valorCompra = scanner.nextDouble();

            if (valorCompra > 100){
               quantidadeClientes++;
            }
            somaCompra = somaCompra + valorCompra;
            contador++;
        }
        double media = somaCompra / contador;
        System.out.println("Á media é :" + media);
        System.out.println("Á quantidade de clientes que excederam o valor de 100: " + quantidadeClientes);

    }
}
