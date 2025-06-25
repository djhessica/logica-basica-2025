package main.java.com.estruturarepeticao;
//Desenvolva um algoritmo para calcular a progressão aritmética de um número inteiro positivo
//e mostrar até dez números subsequentes na progressão aritmética
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        while (numero >= 0){
            soma += numero;
            contador++;
            numero = scanner.nextInt();
        }
        if (numero > 0 ){
            int media = (int) soma + contador;
            System.out.println();
        }
    }
}
