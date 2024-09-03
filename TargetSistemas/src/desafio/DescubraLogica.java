package desafio;

import java.util.Scanner;

public class DescubraLogica {
    public static void descubraLogica(Scanner input){
        System.out.println("Descubra a lógica e complete o próximo elemento: \n" +
                "a) 1, 3, 5, 7, ___ \n" +
                "b) 2, 4, 8, 16, 32, 64, ____ \n" +
                "c) 0, 1, 4, 9, 16, 25, 36, ____ \n" +
                "d) 4, 16, 36, 64, ____ \n" +
                "e) 1, 1, 2, 3, 5, 8, ____ \n" +
                "f) 2,10, 12, 16, 17, 18, 19, ____\n");

        System.out.println("\nAperte 'enter' para prosseguir");
        input.nextLine();

        System.out.println("a) 1, 3, 5, 7, 9 \n sequencia de numeros impares com diferença de 2");
        System.out.println("b) 2, 4, 8, 16, 32, 64, 128 \n o proximo numero é o dobro do anterior");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, 49 \n eles estão em ao quadrado do numero natural");
        System.out.println("d) 4, 16, 36, 64, 100 \n é a sequencia de numeros pares com diferença de 2, mas estão elevado ao quadrado ");
        System.out.println("e) 1, 1, 2, 3, 5, 8, 13 \n esta é a sequencia de Fibonacci");
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, 20 \n a partir do 4º numero a diferença se torna 1");
    }

}
