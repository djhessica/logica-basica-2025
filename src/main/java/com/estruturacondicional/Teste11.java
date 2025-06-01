package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite á quantidade de copias :");
        double quantidade = scanner.nextDouble();


        if (quantidade<=10){
            double valor = quantidade * 0.10;
            System.out.println("valor :" + valor);
        } else if (quantidade<=50) {
            double valor = quantidade * 0.08;
            System.out.println("valor :" + valor);
        } else{
            double valor = quantidade * 0.05;
            System.out.println("valor ;" + valor);

        }

    }
}
