package main.java.com.estruturacondicional;//Peça ao usuário seu nome e a temperatura em graus Celsius. Converta para Fahrenheit.
//Fórmula:
//F = C * 9/5 + 32
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite se nome :");
        String nome = scanner.nextLine();

        System.out.println("Digite á temperatura em graus celsius :");
        double temperatura = scanner.nextDouble();

        double fahrenheit = (temperatura * 9 / 5 + 32);

        System.out.println("Á temperatura em Fahrenheit é de :" + fahrenheit );
    }
}
