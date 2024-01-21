package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex8 {

    //Escreva um programa Java para recuperar o primeiro elemento da fila de prioridade.
    public static void main(String[] args) {
        Queue<String> cores= new PriorityQueue<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Preto");
    }
}
