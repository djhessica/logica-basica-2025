package main.java.com.switchcase;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número");
        System.out.println("1 para cadastrar usuario");
        System.out.println("2 para deletar usuario");
        System.out.println("3 para atualizar usuario");
        System.out.println("4 para sair ");
        int menu = scanner.nextInt();

        switch (menu){
            case 1:
                System.out.println("Cadastrar Usuario");
                break;
            case 2:
                System.out.println("Deletar Usuario");
                break;
            case 3:
                System.out.println("Atualizar Usuario");
                break;
            case 4:
                System.out.println("Sair");
        }
    }
}
