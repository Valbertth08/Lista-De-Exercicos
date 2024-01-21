package Collections.Set;

import java.util.Collections;
import java.util.TreeSet;

public class Ex16 {
    //Escreva um programa Java para criar uma visão de ordem inversa dos elementos contidos em um determinado conjunto de árvores.
    public static void main(String[] args) {

        TreeSet<String> cores = new TreeSet<>();
        cores.add("Rosa");
        cores.add("Vermelho");
        cores.add("Laranja");

        cores.descendingIterator();
        System.out.println(cores);
    }
}
