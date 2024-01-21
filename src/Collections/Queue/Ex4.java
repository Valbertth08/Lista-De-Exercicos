package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex4 {
    //Escreva um programa Java para inserir um determinado elemento em uma fila de prioridade.
    public static void main(String[] args) {
        Queue<String> cores= new PriorityQueue<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Preto");

        cores.offer("Marrom");//o offter adiciona um elemento no começo da fila, e caso por algum motivo isso não for possivel ele retorna false, se de certo retorna true
        System.out.println(cores);
    }
}
