//elabore um algoritimo que leia um valor inteiro positivo ou negativo e acaso ele seja negativo transformeo em positivo.

package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();


        if (numero< 0){
            int negativo = numero * -1;
            System.out.println("negativo ");
        }else {
            System.out.println("positivo ");
        }
    }
}
