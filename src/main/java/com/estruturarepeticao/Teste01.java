package main.java.com.estruturarepeticao;

import java.util.Scanner;

public class Teste01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;//variavel que inicia
//repete quantas vezes forem nescesaria
        while (numero != 5){ //condição usada
            System.out.println("Digite 5 para sair ");
            numero = scanner.nextInt();// serve para encerrar o laço de repetição
        }
    }
}
