package main.java.estruturaderepeticaofor;
//Exercício 7: Fatorial Simples
//Peça um número inteiro positivo e calcule o seu fatorial usando for
import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um niumero :");
        int numero = scanner.nextInt();
        int soma = 1;

        for (int i = 1 ; i <= numero; i++) {
            soma = soma * i;


        }
        System.out.println("Fatorial: " + soma);
    }
}
