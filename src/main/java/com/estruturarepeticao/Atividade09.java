package main.java.com.estruturarepeticao;
//Receba um número inteiro e apresente os 5 números seguintes.
import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        int contador = 1;

        if (numero < 0){
            System.out.println("Não é permitido número negativo");
            return;
        }
        while (contador <= 5) {
            System.out.println(numero + contador);   // so entra no while se eu for repetir o que é pedido(ex digite um numero) ele ira repetir cada vez que eu digitar
            contador++;
        }
    }
}

