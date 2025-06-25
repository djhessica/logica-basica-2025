package main.java.com.estruturarepeticao;

import java.util.Scanner;

//. Crie um algoritmo que colete N números inteiros e, ao final, apresente a média desses valores.
public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int sair= 0;
        int totalNumero =0;
        int contador = 0;

        while (sair != 1){
            System.out.println("Digite uma numero:");
            numero = scanner.nextInt();
            totalNumero = totalNumero + numero;
            contador++;
            System.out.println("Digite '1' para sair:");
            sair= scanner.nextInt();
        }
        double media;
        media = (double) totalNumero / contador;
        System.out.println("Media :" + media);
        //System.out.println(String.format("Á media é &s :" ,media ));
    }
}
