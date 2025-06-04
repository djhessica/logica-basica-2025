//Solicite ao usuário:
//• Idade.
//• Informe se é estudante (S/N).
//Regras de tarifa:
//• Menores de 6 anos ou maiores de 65: Isentos.
//• Estudantes de até 25 anos: 50% de desconto.
//• Todos os demais: Tarifa cheia de R$ 4,00.
//Exiba:
//• Valor a pagar.
//Requisitos:
//• Scanner para entrada.
//• Apenas if e else.

package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("você é estudante ( 1 sim , 2 não):");
        int estudante = scanner.nextInt();

        int soma = 50 / 1;

        if ((idade <= 6) || ( idade >= 65)){
            System.out.println("insentos :");

        } else if (idade <= 25) {
            System.out.println("Desconto de : " + soma + "%");

        }else{
            System.out.println("Tarifa 4,0 reais");
        }
        if (estudante == 1){
            System.out.println("estudante");
        } else {
            System.out.println("Não é estudante");
        }
    }
}
