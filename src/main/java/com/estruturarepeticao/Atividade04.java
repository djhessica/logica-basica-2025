package main.java.com.estruturarepeticao;

import java.util.Scanner;

//. Elabore um algoritmo que analise a idade de diversos colaboradores de uma organização e
//conte quantos deles estão dentro das seguintes faixas etárias: 18 a 25 anos, 26 a 50 anos, 51 a
//65 anos. O algoritmo encerra sua execução quando o usuário optar por não inserir mais idades.
public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int quantidade1825 = 0; // 18 a 25
        int quantidade2650 = 0; // 26 a 50
        int quantidade5165 = 0; // 51 a 65

        System.out.println("Digite as idades dos colaboradores (negativo para encerrar):");

        System.out.print("Idade: ");
        idade = scanner.nextInt();

        while (idade >= 0) {
            if (idade >= 18 && idade <= 25) {
                quantidade1825++;
            } else if (idade >= 26 && idade <= 50) {
                quantidade2650++;
            } else if (idade >= 51 && idade <= 65) {
                quantidade5165++;
            }

            System.out.print("Idade: ");
            idade = scanner.nextInt();
        }

        System.out.println("--- Resultado ---");
        System.out.println("Colaboradores entre 18 e 25 anos: " + quantidade1825);
        System.out.println("Colaboradores entre 26 e 50 anos: " + quantidade2650);
        System.out.println("Colaboradores entre 51 e 65 anos: " + quantidade5165);
    }
}
