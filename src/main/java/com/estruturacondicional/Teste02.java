package main.java.com.estruturacondicional;//elabore um algoritimo que receba um numero n digitado pelo usuário
// e descubra se este numero é par ou impar.


import java.util.Scanner;

public class Teste02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero :");
        int numero = scanner.nextInt();

        int resto = numero%2;

      if (resto==0){
          System.out.println("par");
      }else {
          System.out.println("impar");
      }
    }
}
