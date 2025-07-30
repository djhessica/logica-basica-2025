//Solicite ao usuário uma nota numérica de 0 a 100.
//Converta para um conceito:
//• 90 a 100: A.
//• 80 a 89: B.
//• 70 a 79: C.
//• 60 a 69: D.
//• Abaixo de 60: F.
//Requisitos:
//• Entrada com Scanner.
//• if e else para decisão.

package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota de (0 á 100)");
        int nota = scanner.nextInt();

        if (nota <= 100){
            System.out.println("a");
        } else if (nota >= 80 ){
            System.out.println("b");
        } else if (nota >= 70) {
            System.out.println("c");
        }else if (nota >= 60){
            System.out.println("d");
        }else if (nota <= 60){
            System.out.println("f");
        }
    }
}
