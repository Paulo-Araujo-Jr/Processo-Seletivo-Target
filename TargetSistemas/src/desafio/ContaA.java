package desafio;

import java.util.Scanner;

public class ContaA {
    public static void contarLetrasA(Scanner input) {
        System.out.println("Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.");
        System.out.println("\nAperte 'enter' para prosseguir'");
        input.nextLine();

        System.out.println("Digite algo para contar quantas letras 'A' (ou 'a') ela contém:");
        String frase = input.nextLine();

        int quantidade = contarA(frase);

        if (quantidade==0) System.out.println("A letra 'A' Não ocorre nesta frase");
        else if (quantidade!=0) System.out.println("A letra 'A' ocorre " + quantidade + " vezes nesta frase");


    }

    public static int contarA(String frase) {
        int quantidade = 0;
        frase = frase.toLowerCase();

        for (char a : frase.toCharArray()) {
            if (a == 'a') {
                quantidade++;
            }
        }
        return quantidade;
    }
}
