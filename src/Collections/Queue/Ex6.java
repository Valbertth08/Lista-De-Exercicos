package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex6 {
    //Escreva um programa Java para contar o número de elementos em uma fila de prioridade.

    public static void main(String[] args) {
        Queue<String> cores= new PriorityQueue<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Preto");

        System.out.println(cores.size());
    }
}
