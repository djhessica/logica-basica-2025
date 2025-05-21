import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de b:");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de c:");
        double c = scanner.nextDouble();

        double resultado = ((b * b) - 4 * a * c) / (2 * a);
    }
}
