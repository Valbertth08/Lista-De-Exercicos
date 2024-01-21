package Collections.Set;

import java.util.TreeSet;

public class Ex14 {
//Escreva um programa Java para iterar todos os elementos de um conjunto de árvore.
    public static void main(String[] args) {
        TreeSet<String> cores = new TreeSet<>();
        cores.add("Rosa");
        cores.add("Vermelho");
        cores.add("Laranja");

        for(String i : cores){
            System.out.println(cores);
        }
    }
}
