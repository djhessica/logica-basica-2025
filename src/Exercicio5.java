import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Cálculo das operações
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (numero2 != 0) ? (double) numero1 / numero2 : Double.POSITIVE_INFINITY;

        System.out.println("Soma: " + soma + " | Subtração: " + subtracao + " | Multiplicação: "  + multiplicacao + " | Divisão: " + divisao);

        scanner.close();
    }
}
