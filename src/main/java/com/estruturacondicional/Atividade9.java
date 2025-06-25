package main.java.com.estruturacondicional;//Peça ao usuário a distância (em km) e a velocidade média (km/h). Calcule o tempo de
//viagem (em horas).
//Fórmula:
//tempo = distancia / veloci
// dade

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite á distancia :");
        double distancia = scanner.nextDouble();

        System.out.println("Digite á velocidade media :");
        double velocidade = scanner.nextDouble();

        double tempo = distancia / velocidade;

        System.out.println("O tempo de viagem é de :" + tempo);
    }
}
