package main.java.estruturaderepeticaofor;

import java.util.Scanner;

//Exercício 5: Cálculo de Média
//Solicite quantas notas o aluno vai informar e calcule a média delas
public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite á quantidade de notas ");
        int quantidadedeNotas = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= quantidadedeNotas ; i++){
            System.out.println("Digite á " + i + " nota: ");
           double nota = scanner.nextInt();

            soma = soma + nota;

        }
        double media = soma / quantidadedeNotas;
        System.out.println("Á media é :" + media );

    }
}
