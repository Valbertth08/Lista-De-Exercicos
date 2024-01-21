package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex9 {
    //Escreva um programa Java para recuperar e remover o primeiro elemento.
    public static void main(String[] args) {
        Queue<String> cores= new PriorityQueue<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Preto");
        String cor=  cores.poll();//retorna e romeve da lista o primeiro elemento da lista
        System.out.println(cores);
        System.out.println(cor);
    }
}
