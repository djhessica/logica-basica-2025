//Exercício 1: Sistema de Login com Bloqueio
//Descrição:
//Simule um sistema de login. O programa deve:
//• Solicitar o usuário e a senha.
//• Validar os dados com os valores: usuário = "admin", senha = "1234".
//• Permitir até 3 tentativas.
//Se o usuário errar 3 vezes, exibir: "Conta bloqueada".
//Se acertar antes, exibir: "Login bem-sucedido".
//Requisitos:
//• Uso de Scanner.
//• Controle de tentativas com if e else.
//• Não pode usar switch.

package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuario = "ADMINISTRADOR";
        int senha = 2304;

        System.out.println("Digite o nome de usuario:");
        String nomeDeUsuario = scanner.nextLine();

        System.out.println("Digite sua senha");
        int senhaUsuario = scanner.nextInt();

        if (!((usuario.equals(nomeDeUsuario)) && (senha == senhaUsuario))) {
            return;
        }
        if (senha != 2304){
            System.out.println("acesso negado:");
        }else if (senha == 2304){
            System.out.println("acesso permitido:");
        }


    }
}
