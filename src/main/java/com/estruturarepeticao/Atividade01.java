package main.java.com.estruturarepeticao;

import java.util.Scanner;

// Desenvolva um algoritmo para capturar o nome de um número não especificado de estudantes.
//Ao término, exiba o total de alunos registrados.
public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String nome = "";
         int quantidadeAluno = 0;
         String sair = "N";

        while (!sair.equals("S") ){
            System.out.println("Digite o nome do estundante:");
            nome = scanner.next();
            quantidadeAluno++;
            System.out.println("Digite S para sair;");
            sair = scanner.next();
        }
        System.out.println("Quantidade " + quantidadeAluno);
    }
}
