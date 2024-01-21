package Collections.Queue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex10 {
    // Escreva um programa Java para converter uma fila de prioridade em um array contendo todos os seus elementos.


    public static void main(String[] args) {
        Queue<String> cores= new PriorityQueue<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Preto");

        ArrayList<String> list= new ArrayList<>(cores);

        System.out.println(list);

    }

}
