package main.java.com.estruturarepeticao;
//Crie um programa para ler um valor X e calcular Y = X+2X+3X+4X+5X+…+20X.
import java.util.Scanner;

public class Atividade12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor de X: ");
            int x = scanner.nextInt();

            int contador = 1;
            int y = 0;

            while (contador <= 20) {
                y += contador * x;
                contador++;
            }

            System.out.println("O valor de Y é: " + y);

        }
    }
