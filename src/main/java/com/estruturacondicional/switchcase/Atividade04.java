//Em uma loja de livros online, cada livro é categorizado com um código numérico. Os códigos
//de categoria são os seguintes:
//• 1: Ficção
//• 2: Não Ficção
//• 3: Romance
//• 4: Terror
//• 5: Mistério
//O programa deve solicitar ao usuário que insira o código do livro que deseja comprar e, em
//seguida, exibir uma mensagem informando a categoria do livro com base no código inserido.
//Caso o código não corresponda a nenhuma das categorias listadas, o programa deve exibir uma
//mensagem de erro.
//Por exemplo:
//Digite o código do livro que deseja comprar:
//1
//O livro pertence à categoria de Ficção
package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o codigo do livro desejado");
        int codigo = scanner.nextInt();

        switch (codigo){
            case 1:
                System.out.println("Ficção");
                break;
            case 2:
                System.out.println("Não Ficção");
                break;
            case 3:
                System.out.println("Romance");
                break;
            case 4:
                System.out.println("Terror");
                break;
            case 5:
                System.out.println("Mistério");
                break;
            default:
                System.out.println("Erro");
                break;
        }

    }
}
