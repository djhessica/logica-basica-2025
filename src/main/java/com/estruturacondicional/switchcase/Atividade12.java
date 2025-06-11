//Peça ao usuário o número do mês de nascimento (1 a 12) e informe o signo correspondente:
//• 1: Capricórnio/Aquário
//• 2: Aquário/Peixes
//... e assim por diante.
package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero do mês do seu nascimento:");
        int mes = scanner.nextInt();

        switch (mes){
            case 1:
                System.out.println("Capricórnio / Aquário");
                break;
            case 2:
                System.out.println("Aquário / Peixes");
                break;
            case 3:
                System.out.println("Peixes / Àries");
                break;
            case 4:
                System.out.println("Àries / Touro");
                break;
            case 5:
                System.out.println("Touro / Gêmeos");
                break;
            case 6:
                System.out.println("Gêmeos / Câncer");
                break;
            case 7:
                System.out.println("Câncer / Leão");
                break;
            case 8:
                System.out.println("Leão / Virgem");
                break;
            case 9:
                System.out.println("Virgem / Libra");
                break;
            case 10:
                System.out.println("Libra / Escorpião");
                break;
            case 11:
                System.out.println("Escorpião / Sagitário");
                break;
            case 12:
                System.out.println("Sagitário / Capricórnio");
                break;
            default:
                System.out.println("Numero não coresponde a nenhum mês:");
        }
    }
}
