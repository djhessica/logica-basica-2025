package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da sua disciplina: ");
        String disciplina = scanner.nextLine();
        System.out.println("Digite seu nome :");
        String nome = scanner.nextLine();
        System.out.println("Digite sua primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite sua segunda nota :");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite sua terçeira nota :");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media>= 7 ) {
            System.out.println("aprovado");
            System.out.println("materia "+ disciplina);
            System.out.println("aluno "+ nome);

        }else{
            System.out.println("reprovado");
            System.out.println("materia "+ disciplina);
            System.out.println("aluno "+ nome);
        }
    }
}
