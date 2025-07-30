package main.java.estruturaderepeticaofor;

import java.util.Scanner;

//Exercício 2: Tabuada
//Solicite um número e mostre a tabuada de multiplicação de 1 a 10.
public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

}
