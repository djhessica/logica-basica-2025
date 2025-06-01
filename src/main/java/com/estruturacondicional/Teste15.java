//Faça um algoritimo para ler o peso de uma encomenda,
// o tipo da entrega e a região onde sera entregue a encomenda. o algoritimo deve calcular o valor a ser paga, conforme a tabela.

package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo da sua entrega (sedex/sedex10)");
        String tipoEntrega = scanner.nextLine();

        System.out.println("Digite a região da sua entrega (Norte/Nordeste/Centro-Oeste/Suldeste/Sul");
        String regiao = scanner.nextLine();

        System.out.println("Digite o peso da encomenda");
        double peso = scanner.nextDouble();

        double valorpeso;
        if (peso <= 1 ){
             valorpeso = 5.0;
        } else if (peso <= 5) {
            valorpeso = 10.00;
        }else {
            valorpeso = 15.00;
        }
        double valorentrega = 0;
        if (tipoEntrega.equals("sedex")){
            valorentrega = 9.0;
        } else if (tipoEntrega.equals("sedex10")) {
            valorentrega = 11.00;
        } else {
            System.out.println("Tipo de entrega invalido");
        }
       double valorregiao;
        if (regiao.equals("Norte")){
            valorregiao = 4;
        } else if (regiao.equals("Nordeste")) {
            valorregiao = 2;
        } else if (regiao.equals("Centro-Oeste")) {
            valorregiao = 5;
        } else if (regiao.equals("Suldeste")) {
            valorregiao = 2;
        }else {
            valorregiao = 3;
        }
        double soma = valorregiao + valorentrega + valorpeso;
        System.out.println("valor é de : " + soma);


    }

}
