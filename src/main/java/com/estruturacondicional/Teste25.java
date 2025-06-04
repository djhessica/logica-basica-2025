//Solicite ao usuário um ano.
//Determine e informe se ele é bissexto ou não, usando as seguintes regras:
//• Se for múltiplo de 400 → Bissexto.
//• Se for múltiplo de 100 → Não bissexto.
//• Se for múltiplo de 4 → Bissexto.
//• Senão → Não bissexto.
//Requisitos:
//• Uso de operadores lógicos com if e else.
//• Scanner para entrada.
package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento:");
        int ano = scanner.nextInt();

        int bissexto = 0 / 400;
        int naoBissexto = 0 / 100;
        int bissexto2 = 0;

        if (bissexto >= 0){
            System.out.println("Bissexto");
        } else if (naoBissexto < 0) {
            System.out.println("Não bissexto");
        }else if (bissexto2 == 4){
            System.out.println("bissexto");
        }else {
            System.out.println("Não bissexto");
        }
    }
}
