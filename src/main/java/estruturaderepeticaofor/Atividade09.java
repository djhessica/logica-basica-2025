package main.java.estruturaderepeticaofor;

import java.util.Scanner;

//Exercício 9: Exibir Letras do Nome
//Solicite um nome e exiba cada letra em uma linha separada usando for
public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.split("")[i]);
           // System.out.println(nome.charAt(i));

        }
    }
}
