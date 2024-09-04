package desafio;

import java.util.Scanner;

public class ValorDaSoma {
    public static void trechoDaSoma(Scanner input){
        System.out.println("Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA); \n" +
                "Ao final do processamento, qual será o valor da variável SOMA? ");
        System.out.println("\nAperte 'enter' para prosseguir");
        input.nextLine();

        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        System.out.println("INDICE =  12 + \n SOMA =  0 + \n K = 1"  );

        System.out.println("Enquanto K = 1 < INDICE = 12 ");
        while (K <INDICE){
            K = K +1;
            SOMA = SOMA + K;
        }
        System.out.println("O valor de SOMA = " +SOMA);

    }
}
