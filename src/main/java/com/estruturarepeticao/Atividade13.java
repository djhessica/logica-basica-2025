package main.java.com.estruturarepeticao;

//.Construa um algoritmo para calcular a progressão geométrica de um número inteiro positivo e
// exibir até dez números subsequentes nessa progressão geométrica.
import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o termo da PG (inteiro): ");
        int termo = scanner.nextInt();
        System.out.print("Digite a razão da PG (inteiro): ");
        int razao = scanner.nextInt();
        int contador = 0;

            while (contador < 10) {
                System.out.print("PG" + termo );
                termo *= razao;
                contador++;
            }
        }
    }