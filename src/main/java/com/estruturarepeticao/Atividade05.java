package main.java.com.estruturarepeticao;
// Construa um algoritmo que compute a média aritmética de múltiplos valores inteiros positivos
//inseridos pelo usuário. A execução do algoritmo é finalizada quando o usuário inserir um valor
// negativo
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contador = 0;

        System.out.println("Digite números inteiros positivos. Digite um número negativo para sair:");

        int numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;
            contador++;
            numero = scanner.nextInt();
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média aritmética dos números digitados é: " + media);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }
    }
}
// while (true){
 //  system.out.println("digite um numero");
  //  int numero = scanner.nextint;
  //  if(numero < 0){
//  break;
  //      }
  //  contador++;
  //  soma = soma + numero;
 //   }
 //   doublemedia = soma / xontador;
  //   system.out.println(" a media é:" + media);