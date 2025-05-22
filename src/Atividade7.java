//Peça ao usuário três notas e seus respectivos pesos. Calcule a média ponderada.
//Fórmula:
//media = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3)

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota :");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite seua segunda nota :");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite sua terceira nota :");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite seu primeiro peso :");
        double peso1 = scanner.nextDouble();

        System.out.println("Digite seu segundo peso :");
        double peso2 = scanner.nextDouble();

        System.out.println("Digite seu terceiro peso :");
        double peso3 = scanner.nextDouble();

        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3 ) / ( peso1 + peso2 + peso3);

        System.out.println("Á media final é :" + media);
    }
}
