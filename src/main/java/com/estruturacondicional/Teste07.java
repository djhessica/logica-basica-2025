package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome e idade :");
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();


        if ((idade >= 6) && ( idade <= 10)){
            System.out.println("infantil :");

        } else if ((idade >=11)&&( idade <=17)) {
            System.out.println("juvenil ");

        }else if (idade >= 18){
            System.out.println("Acima de 18");
        }
    }
}
