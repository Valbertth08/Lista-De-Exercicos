package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex1 {
    //Escreva um programa Java para criar uma fila de prioridade, adicione algumas cores (strings) e imprima os elementos da fila de prioridade.
    public static void main(String[] args) {

        Queue<String> cores= new PriorityQueue<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Preto");

        System.out.println(cores);

    }
}
