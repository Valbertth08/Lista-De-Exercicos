package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex2 {

//Escreva um programa Java para iterar todos os elementos da fila de prioridade.
    public static void main(String[] args) {
        Queue<String> cores= new PriorityQueue<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Preto");

        for (String i: cores){
            System.out.println(cores);
        }
    }
}
