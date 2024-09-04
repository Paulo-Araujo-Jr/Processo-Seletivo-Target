package desafio;

import java.util.Scanner;

public class SalaInterruptor {
    public static void desafioInterruptor(Scanner input){
        System.out.println(" Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes.\n Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser.\n Seu objetivo é descobrir qual interruptor controla qual lâmpada.\n Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?");
        System.out.println("\nAperte 'enter' para prosseguir");
        input.nextLine();

        System.out.println("Tendo em vista que eu estou em uma sala e desta sala não é possível ver as luzes, e tenho apenas 2 idas as salas das lâmpadas, minha solução é a seguinte:");

        System.out.println("""
                Ligo o primeiro interruptor e vou até as salas. Identifico a sala que está com a luz acesa, pois duas estão desligadas, volto e desligo o primeiro interruptor.
                
                Ligo o segundo interruptor e vou até as salas. Identifico a sala que está com a luz acesa, pois duas estão desligadas, e uma delas eu já identifiquei.
                
                Portanto, sem precisar checar as lâmpadas, saberia que o último interruptor ligaria a lâmpada da sala que não foi acesa.
                """);
       }
}
