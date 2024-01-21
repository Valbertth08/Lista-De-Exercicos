package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex3 {
    //Escreva um programa Java para adicionar todos os elementos de uma fila prioritária a outra fila prioritária.
    public static void main(String[] args) {
        Queue<String> cores= new PriorityQueue<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Preto");
        Queue<String> cores1= new PriorityQueue<>();
        cores1.add("Roxo");
        cores1.add("Cinza");
        cores1.add("Verde");

        cores.addAll(cores1);
        System.out.println(cores);

    }
}
