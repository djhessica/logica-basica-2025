package main.java.estruturaderepeticaofor;

import java.util.Scanner;

//Exercício 4: Imprimir Números Pares
//Peça um número e mostre todos os números pares de 1 até esse número
public class Atividede04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        for (int i = 1;i <= numero ;i++ ){

            if (i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
