//dados 2 numeros interiros imprima z se ao menos um deles for igual a zero m se tiver o mesmo sinal o se tiverem sinais opostos.

package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Texte14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero");
        int numero1 = scanner.nextInt();

        System.out.println("digite um numero");
        int numero2 = scanner.nextInt();


        if ((numero1==0)||(numero2==0)){
            System.out.println("z");
        }else {
            if (((numero1>0)&&(numero2 < 0)) || ((numero1<0)&&(numero2 > 0))) {
                System.out.println("o");
            } else {
                System.out.println("m");
            }
        }


    }
}
