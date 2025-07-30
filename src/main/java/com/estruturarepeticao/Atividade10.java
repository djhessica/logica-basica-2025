package main.java.com.estruturarepeticao;
//.Receba um número inteiro e exiba os 5 próximos números pares.
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        int contador = 1;

        if (numero < 0){
            System.out.println("Não é permitido número negativo");
            return;
        }
        while (contador <= 10) {
            int proximoNumero = numero + contador;   // so entra no while se eu for repetir o que é pedido(ex digite um numero) ele ira repetir cada vez que eu digitar
            if (proximoNumero % 2 == 0){
                System.out.println(proximoNumero);
            }
            contador++;
        }


    }
}
