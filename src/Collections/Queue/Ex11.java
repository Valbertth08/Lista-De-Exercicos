package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex11 {
    //Escreva um programa Java para converter um elemento da Fila Prioritária em representações de string.

    public static void main(String[] args) {
        Queue<String> cores= new PriorityQueue<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Preto");

        String list= cores.toString();  //to pegando o valores como string

        System.out.println(list);
        System.out.println(list);

    }

}
