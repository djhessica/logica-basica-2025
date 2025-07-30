package main.java.com.estruturarepeticao;
//.Receba como entrada um número inteiro e exiba os 10 próximos números ímpares.
import java.util.Scanner;

public class Atividades17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        int contador = 0;
        Integer numeroOriginal = null;

        while (contador <= 20) {

            if (!(numero % 2 == 0)){
                System.out.println(numero);
            }
            numero++;
            contador++;
        }


    }
}
