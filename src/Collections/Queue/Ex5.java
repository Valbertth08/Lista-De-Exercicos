package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex5 {
    // Escreva um programa Java para remover todos os elementos de uma fila de prioridade.

    public static void main(String[] args) {
        Queue<String> cores= new PriorityQueue<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Preto");

        cores.removeAll(cores);
        System.out.println(cores);
    }
}
