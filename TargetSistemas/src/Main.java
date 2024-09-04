import desafio.*;
import sistema.Congelamento;
import sistema.Tratamento;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("         --Seja Bem Vindo!--");
        System.out.println("Aqui está a resolução dos desafios da Target");
        boolean exit = false;
        while (!exit) {
            System.out.println("Qual questão você deseja ver?");
            System.out.print("""
                    [1] - Sequencia Fibonacci
                    [2] - Quantidade da letra (A) em palavras
                    [3] - Valor da soma a partir de um trecho de codigo
                    [4] - Descobrir a logica e completar o elemento
                    [5] - Desafio dos interruptores
                    
                    [6] - Sair
                    --> """);
            try {
                int escolha = input.nextInt();
                input.nextLine();
                switch (escolha) {
                    case 1:
                        SequenciaFibonacci.sequenciaFibonacci(input);
                        Congelamento.sleep8();
                        break;
                    case 2:
                        ContaA.contarLetrasA(input);
                        Congelamento.sleep8();
                        break;
                    case 3:
                        ValorDaSoma.trechoDaSoma(input);
                        Congelamento.sleep8();
                        break;
                    case 4:
                        DescubraLogica.descubraLogica(input);
                        Congelamento.sleep8();
                        break;
                    case 5:
                        SalaInterruptor.desafioInterruptor(input);
                        Congelamento.sleep8();
                        break;
                    case 6:
                        exit=true;
                        break;
                    default:
                        Tratamento.opcaoInvalida();
                }
            } catch (Exception e) {
                Tratamento.opcaoInvalida();
                input.nextLine();
            }
        }
        System.out.println("Espero que tenha gostado!");
        System.out.print("Saindo");
        System.out.print(".");
        Congelamento.sleep1();
        System.out.print(".");
        Congelamento.sleep1();
        System.out.print(".");
        Congelamento.sleep1();
        System.exit(0);
    }


}
