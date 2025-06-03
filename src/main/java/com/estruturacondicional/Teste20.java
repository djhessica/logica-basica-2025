package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite á segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite á terceira nota: ");
        double nota3= scanner.nextDouble();

        double media = ( nota1 + nota2 + nota3 ) / 3;
        if (media < 4){
            System.out.println("Reprovado");
        } else if (media <=4 ) {
            System.out.println("Recuperação");
        } else if (media > 6) {
            System.out.println("Áprovado");
        }
    }
}
