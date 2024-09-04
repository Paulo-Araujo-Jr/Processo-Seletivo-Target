package desafio;

import java.util.Scanner;

public class SequenciaFibonacci {

    public static void sequenciaFibonacci(Scanner input) {
        System.out.println("Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.");
        System.out.println("\nAperte 'enter' para prosseguir");
        input.nextLine();

        System.out.println("Digite um valor para verificar se ele está presente na sequencia de Fibonacci");
        int valor = input.nextInt();
        input.nextLine();

        if (pertenceFibonacci(valor)) {
            System.out.println(valor + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(valor + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int valor) {
        int a = 0;
        int b = 1;

        if (valor < 0) {
            return false;
        }

        if (valor == a || valor == b) {
            return true;
        }

        int c = a + b;
        while (c <= valor) {
            if (c == valor) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }
}
