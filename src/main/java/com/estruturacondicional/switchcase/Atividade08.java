//Receba uma nota de 0 a 10 (apenas inteiros) e use switch para classificar:
//• 10: Excelente
//• 8-9: Muito bom
//• 6-7: Bom
//• 4-5: Regular
//• 0-3: Insuficiente
//Faça os agrupamentos de case para notas semelhantes.
package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite á nota de 0 á 10:");
        int nota = scanner.nextInt();

        switch (nota){
            case 10 :
                System.out.println("Exelente");
                break;
            case 9 , 8 :
                System.out.println("Muito bom");
                break;
            case 7 , 6:
                System.out.println("Bom");
                break;
            case 4 , 5:
                System.out.println("Regular");
                break;
            case 0, 1 , 2 , 3:
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("Nota invalida, Digite um valor de 0 á 10:");

        }
    }
}
