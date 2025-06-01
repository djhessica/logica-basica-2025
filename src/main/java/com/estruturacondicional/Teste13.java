package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero :");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero :");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o primeiro numero :");
        int numero3 = scanner.nextInt();

        int menor = 0;
        int meio = 0;
        int maior = 0;

        if ((numero1 <= numero2) && (numero1 <= numero3)) {
            menor = numero1;
            if (numero2 <= numero3) {
                meio = numero2;
                maior = numero3;
            } else {
                meio = numero3;
                maior = numero2;
            }
        } else if ((numero2 <= numero1) && (numero2 <= numero3)) {
            menor = numero2;
        } else if (numero1 <= numero3) {
            meio = numero1;
            maior = numero3;
        } else {
            meio = numero3;
            maior = numero1;
        } if ((numero3 <= numero1) && (numero3 <= numero2)){
            menor = numero3;
            if (numero1 <= numero2){
                meio = numero1;
                maior = numero2;
            }else {
                meio = numero2;
                maior = numero1;
                }

        }
        System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);


    }
}

