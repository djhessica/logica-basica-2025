package main.java.com.estruturarepeticao;
//Elabore um algoritmo para calcular um valor A elevado a um expoente B, sem utilizar o
//símbolo de exponenciação. Os valores de A e B devem ser inseridos pelo usuário
import java.util.Scanner;
public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base (A): ");
        int base = scanner.nextInt();
        System.out.print("Digite o valor do expoente (B): ");
        int expoente = scanner.nextInt();

        if (expoente < 0) {
            System.out.println("O expoente deve ser um número inteiro não negativo.");
        } else {
            int resultado = 1;
            int contador = 0;

            while (contador < expoente) {
                resultado *= base;
                contador++;
            }

            System.out.println("Resultado: " + base + " elevado a " + expoente + " é " + resultado);
        }

    }
}