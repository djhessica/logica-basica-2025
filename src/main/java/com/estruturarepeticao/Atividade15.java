package main.java.com.estruturarepeticao;
//.Crie um algoritmo para capturar uma sequência de 10 números inteiros e determinar o maior e
// o menor número inseridos pelo usuário
import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menor =0;
        int maior = 0;
        int contador = 0;

        while (contador < 4) {
            System.out.println("Digite uma numero:");
            int numero = scanner.nextInt();
            if (contador == 0) {
                menor = numero;
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }

            contador++;
        }
            System.out.println("maior :" + maior);
            System.out.println("menor :" + menor);



    }
}
// menor = numero < menor ? numero : menor;
// maior = numero > maior ? numero : maior;