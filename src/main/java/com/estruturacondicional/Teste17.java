package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua refeição desejada, (1 vegetariano, 2 peixe, 3 frango, 4 carne:");
        int refeicao = scanner.nextInt();

        System.out.println("Digite sua sobremesa desejada, (1 abacaxi, 2 sorvete, 3 mousse:");
        int sobremesa = scanner.nextInt();

        System.out.println("Digite sua bebida desejada, (1 suco, 2 refri:");
        int bebida = scanner.nextInt();

        int caloria1 = 0;
        if (refeicao <= 1){
            caloria1 = 180;
        } else if (refeicao <= 2) {
            caloria1 = 130;
        } else if (refeicao <= 3) {
            caloria1 = 250;
        } else if (refeicao <= 4) {
            caloria1 = 350;
        }
        int caloria2 = 0;
        if (sobremesa <= 1){
            caloria2 = 75;
        } else if (sobremesa <= 2) {
            caloria2 = 110;
        } else if (sobremesa <= 3) {
            caloria2 = 200;
        }
        int caloria3;
        if (bebida <= 1 ){
            caloria3 = 80;
        } else {
            caloria3 = 200;
        }
        int soma = caloria1 + caloria2 + caloria3;
        System.out.println("Total de calorias por refeição escolhida é de : " + soma + "cal");
    }
}
