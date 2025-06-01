package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite á função do funcionario(a) (1 para Analista, 2 Programador, 3 Suporte) ");
        int funcaofuncionario = scanner.nextInt();

        System.out.println("Digite (1 s/superior, 2 c/superior e 3 pós)");
        int grauescolaridade = scanner.nextInt();

        System.out.println("Digite o tempo de cerviço");
        double tempocervico = scanner.nextDouble();

        double tempo = 0;
        if (tempocervico<=5){
            tempo = 2;
        } else if (tempocervico>=6) {
            tempo = 4;
        }else if (tempocervico>=10){
            tempo = 6;
        }
        double funcao = 0;
        if (funcaofuncionario !=0 ){
            funcao = 5;
        }else if (funcaofuncionario != 1){
            funcao = 4;
        } else if (funcaofuncionario != 2) {
            funcao = 3;
        }
        double escolaridade = 0;
        if (grauescolaridade != 0){
            escolaridade = 0;
        } else if (grauescolaridade != 1) {
            escolaridade = 7;
        } else if (grauescolaridade != 2) {
            escolaridade = 9;
        }
        double soma = escolaridade + funcao + tempo;

        System.out.println("Á porcentagem recebida é de : " + soma + "%");


        }
    }
