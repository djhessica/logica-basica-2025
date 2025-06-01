//Calcule a velocidade média.
//Fórmula:
//velocidadeMedia = distancia / tempo

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Digite o nome do motorista :");
        String nomeMotorista = scanner.nextLine();

        System.out.println("Digige a distância percorrida :");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o tempo percorrido :");
        double tempo = scanner.nextDouble();


        double velocidadeMdia = (distancia / tempo);
        System.out.println("Á velocidade media é :" + velocidadeMdia);

    }


}