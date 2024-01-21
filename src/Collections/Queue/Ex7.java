package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex7 {
    //Escreva um programa Java para comparar duas filas de prioridade.
    public static void main(String[] args) {
        Queue<String> cores= new PriorityQueue<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Preto");
        Queue<String> cores1= new PriorityQueue<>();
        cores1.add("Roxo");
        cores1.add("Cinza");
        cores1.add("Preto");

        for (String i: cores){
            System.out.println(cores1.contains(i));
        }
    }
}
