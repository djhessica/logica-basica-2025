package main.java.com.estruturacondicional;//Peça ao usuário o número de casos favoráveis e casos possíveis de um evento. Calcule a
//probabilidade (em %).
//Fórmula:
//probabilidade = (favoraveis * 100) / possiveis

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de casos favoraveis :");
        double favoraveis = scanner.nextDouble();

        System.out.println("Digite o numero de casos possiveis :");
        double possiveis = scanner.nextDouble();

        double probabilidade = (favoraveis * 100 ) / possiveis;

        System.out.println("Á probabilidade é de :" + probabilidade);
    }
}
