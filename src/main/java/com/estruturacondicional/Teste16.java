package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite á função do funcionario(a) (1-Analista, 2-Programador, 3-Suporte) ");
        int funcaofuncionario = scanner.nextInt();

        System.out.println("Digite (1-s/superior, 2-c/superior e 3-pós)");
        int grauescolaridade = scanner.nextInt();

        System.out.println("Digite o aumento de cerviço");
        int tempocervico = scanner.nextInt();

        int aumento = 0;

        if (tempocervico <= 5){
            aumento = 2;
        }else if (tempocervico <= 10){
            aumento = 4;
        }else {
            aumento = 6;
        }

        if (funcaofuncionario == 1 ){
            aumento = aumento + 5;
        }else if (funcaofuncionario == 2){
           aumento = aumento + 4;
        } else if (funcaofuncionario == 3) {
            aumento = aumento + 3;
        }

        if (grauescolaridade == 7){
            aumento = 0;
        } else if (grauescolaridade != 1) {
          aumento =  aumento + 7;
        } else if (grauescolaridade == 3) {
          aumento = aumento + 9;
        }
        System.out.println("Á porcentagem recebida é de : " + aumento + "%");


        }
    }
