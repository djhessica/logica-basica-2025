package main.java.com.estruturacondicional;//Implemente um algoritmo que calcule dois números inteiros e efetue
// a divisão entre eles, exibindo o quociente e o resto da ivisão como resultado.


import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite á primeira nota:");
       double primeiraNota = scanner.nextDouble();

        System.out.println("Digite á segunda nota:");
        double segundaNota = scanner.nextDouble();

        double quociente = primeiraNota / segundaNota;


        double resto = primeiraNota % segundaNota ;


        System.out.println("À media é: " + quociente + resto);

    }
}
