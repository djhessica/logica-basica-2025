package main.java.com.estruturarepeticao;
// Formule um algoritmo que solicite uma sequência de 10 números inteiros e determine a soma
//exclusivamente dos números pares.
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contador = 0;


        while (contador < 10) {
            System.out.println("Digite um numero inteiro:");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                soma = soma + numero;
            }
            contador++;
        }
        System.out.println("Á soma dos numeros pares é:"+ soma);;
    }
}
