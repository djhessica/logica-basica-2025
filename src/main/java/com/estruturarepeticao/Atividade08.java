package main.java.com.estruturarepeticao;
// Dadas as temperaturas de 5 cidades, determine: a) a temperatura média da região; b) a
//quantidade de cidades com temperatura abaixo de 10ºC.
import java.util.Scanner;

public class Atividade08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int contador = 0;
            double soma = 0;
            int abaixoDeDez = 0;

            while (contador < 5) {
                System.out.print("Digite a temperatura da cidade " + (contador + 1) + ": ");
                double temp = scanner.nextDouble();
                soma += temp;

                if (temp < 10.0) {
                    abaixoDeDez++;
                }

                contador++;
            }

            double media = soma / 5;
            System.out.println("\nTemperatura média da região: " + media + "°C");
            System.out.println("Número de cidades com temperatura abaixo de 10°C: " + abaixoDeDez);

            scanner.close();
        }
    }
