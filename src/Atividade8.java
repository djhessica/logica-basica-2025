//Peça dois valores de distância (em km) até a Terra de dois planetas fictícios. Calcule a
//diferença e a soma das distâncias.
//Fórmulas:
//soma = d1 + d2
//diferenca = d1 - d2 (valor pode ser negativo)

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite á primeira distância da Terra até Jupter :");
        double distancia1 = scanner.nextDouble();

        System.out.println("Digite a segunda distância da Terra até Marte :");
        double distancia2 = scanner.nextDouble();

        double soma = distancia1 + distancia2;
        double diferenca = distancia1 - distancia2;

        System.out.println("Á distância é de :" + soma);
        System.out.println("Á diferença é de : " + diferenca);
    }
}
